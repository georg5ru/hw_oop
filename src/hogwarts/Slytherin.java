package hogwarts;

public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance,
                     int cunning, int determination, int ambition,
                     int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public void printStudentInfo() {
        super.printStudentInfo();
        System.out.println("Факультет: Слизерин");
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбициозность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Жажда власти: " + lustForPower);
    }

    public void compareSlytherinStudents(Slytherin other) {
        int thisTotal = this.cunning + this.determination + this.ambition +
                this.resourcefulness + this.lustForPower;
        int otherTotal = other.cunning + other.determination + other.ambition +
                other.resourcefulness + other.lustForPower;

        if (thisTotal > otherTotal) {
            System.out.println(getName() + " лучший Слизеринец, чем " + other.getName());
        } else if (thisTotal < otherTotal) {
            System.out.println(other.getName() + " лучший Слизеринец, чем " + getName());
        } else {
            System.out.println(getName() + " и " + other.getName() + " равны по качествам Слизерина");
        }
    }
}