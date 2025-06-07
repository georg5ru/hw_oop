package ru.netology.calculator.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) Integer num1, 
                      @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Параметры num1 и num2 обязательны");
        }
        int result = calculatorService.plus(num1, num2);
        return String.format("%d + %d = %d", num1, num2, result);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) Integer num1, 
                       @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Параметры num1 и num2 обязательны");
        }
        int result = calculatorService.minus(num1, num2);
        return String.format("%d - %d = %d", num1, num2, result);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) Integer num1, 
                          @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Параметры num1 и num2 обязательны");
        }
        int result = calculatorService.multiply(num1, num2);
        return String.format("%d * %d = %d", num1, num2, result);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = false) Integer num1, 
                        @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Параметры num1 и num2 обязательны");
        }
        double result = calculatorService.divide(num1, num2);
        return String.format("%d / %d = %.1f", num1, num2, result);
    }
} 
