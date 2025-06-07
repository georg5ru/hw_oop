package hogwarts;

public class Ravenclaw extends Hogwarts {
    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance,
                     int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public void printStudentInfo() {
        super.printStudentInfo();
        System.out.println("Факультет: Когтевран");
        System.out.println("Ум: " + intelligence);
        System.out.println("Мудрость: " + wisdom);
        System.out.println("Остроумие: " + wit);
        System.out.println("Творчество: " + creativity);
    }

    public void compareRavenclawStudents(Ravenclaw other) {
        int thisTotal = this.intelligence + this.wisdom + this.wit + this.creativity;
        int otherTotal = other.intelligence + other.wisdom + other.wit + other.creativity;

        if (thisTotal > otherTotal) {
            System.out.println(getName() + " лучший Когтевранец, чем " + other.getName());
        } else if (thisTotal < otherTotal) {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + getName());
        } else {
            System.out.println(getName() + " и " + other.getName() + " равны по качествам Когтеврана");
        }
    }
}