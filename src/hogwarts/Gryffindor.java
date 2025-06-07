package hogwarts;

public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance,
                      int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public void printStudentInfo() {
        super.printStudentInfo();
        System.out.println("Факультет: Гриффиндор");
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
    }

    public void compareGryffindorStudents(Gryffindor other) {
        int thisTotal = this.nobility + this.honor + this.bravery;
        int otherTotal = other.nobility + other.honor + other.bravery;

        if (thisTotal > otherTotal) {
            System.out.println(getName() + " лучший Гриффиндорец, чем " + other.getName());
        } else if (thisTotal < otherTotal) {
            System.out.println(other.getName() + " лучший Гриффиндорец, чем " + getName());
        } else {
            System.out.println(getName() + " и " + other.getName() + " равны по качествам Гриффиндора");
        }
    }
}