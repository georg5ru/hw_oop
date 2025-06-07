package hogwarts;

public class Hogwarts {
    private final String name;
    private final int magicPower;
    private final int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void printStudentInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Расстояние трансгрессии: " + transgressionDistance);
    }

    public void compareStudents(Hogwarts other) {
        int thisTotal = this.magicPower + this.transgressionDistance;
        int otherTotal = other.magicPower + other.transgressionDistance;

        if (thisTotal > otherTotal) {
            System.out.println(this.name + " обладает большей мощностью магии, чем " + other.name);
        } else if (thisTotal < otherTotal) {
            System.out.println(other.name + " обладает большей мощностью магии, чем " + this.name);
        } else {
            System.out.println(this.name + " и " + other.name + " обладают равной мощностью магии");
        }
    }
}