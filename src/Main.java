import hogwarts.*;

public class Main {
    public static void main(String[] args) {
        // Создаем студентов Гриффиндора
        Gryffindor harry = new Gryffindor("Гарри Поттер", 90, 80, 85, 90, 95);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 95, 85, 90, 95, 90);
        Gryffindor ron = new Gryffindor("Рон Уизли", 85, 75, 80, 85, 85);

        // Создаем студентов Слизерина
        Slytherin draco = new Slytherin("Драко Малфой", 85, 80, 90, 85, 95, 90, 85);
        Slytherin montague = new Slytherin("Грэхэм Монтегю", 80, 75, 85, 80, 90, 85, 80);
        Slytherin goyle = new Slytherin("Грегори Гойл", 75, 70, 80, 75, 85, 80, 75);

        // Создаем студентов Пуффендуя
        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 80, 75, 85, 90, 85);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 90, 85, 95, 90, 90);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 75, 70, 80, 85, 80);

        // Создаем студентов Когтеврана
        Ravenclaw cho = new Ravenclaw("Чжоу Чанг", 85, 80, 90, 85, 90, 85);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 80, 75, 85, 80, 85, 80);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 75, 70, 80, 75, 80, 75);

        // Выводим информацию о студентах
        System.out.println("=== Информация о студентах ===");
        harry.printStudentInfo();
        System.out.println();
        draco.printStudentInfo();
        System.out.println();
        cedric.printStudentInfo();
        System.out.println();
        cho.printStudentInfo();
        System.out.println();

        System.out.println("=== Сравнение студентов Гриффиндора ===");
        hermione.compareGryffindorStudents(ron);

        System.out.println("\n=== Сравнение студентов Слизерина ===");
        draco.compareSlytherinStudents(goyle);

        System.out.println("\n=== Сравнение студентов Пуффендуя ===");
        cedric.compareHufflepuffStudents(zacharias);

        System.out.println("\n=== Сравнение студентов Когтеврана ===");
        cho.compareRavenclawStudents(marcus);

        System.out.println("\n=== Сравнение студентов разных факультетов ===");
        harry.compareStudents(draco);
        hermione.compareStudents(cedric);
        ron.compareStudents(cho);
    }
} 