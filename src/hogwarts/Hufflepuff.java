package hogwarts;

public class Hufflepuff extends Hogwarts {
    private final int hardworking;
    private final int loyal;
    private final int honest;

    public Hufflepuff(String name, int magicPower, int transgressionDistance,
                      int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public void printStudentInfo() {
        super.printStudentInfo();
        System.out.println("Факультет: Пуффендуй");
        System.out.println("Трудолюбие: " + hardworking);
        System.out.println("Верность: " + loyal);
        System.out.println("Честность: " + honest);
    }

    public void compareHufflepuffStudents(Hufflepuff other) {
        int thisTotal = this.hardworking + this.loyal + this.honest;
        int otherTotal = other.hardworking + other.loyal + other.honest;

        if (thisTotal > otherTotal) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + other.getName());
        } else if (thisTotal < otherTotal) {
            System.out.println(other.getName() + " лучший Пуффендуец, чем " + getName());
        } else {
            System.out.println(getName() + " и " + other.getName() + " равны по качествам Пуффендуя");
        }
    }
}