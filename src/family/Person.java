package family;

public class Person {
    private String name;
    private final int birthYear;
    private Person mom;
    private Person dad;


    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void printFamilyTreeMother() {
        System.out.println(name+" -nek az anyja: ");

        if (mom != null) {
            System.out.println(mom.getName());
            mom.printFamilyTreeMother();
        }
    }
    public void printFamilyTreeFather() {
        System.out.println(name+" -nek az apja: ");

        if (dad != null) {
            System.out.println(dad.getName());
            dad.printFamilyTreeFather();
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Person getMom() {
        return mom;
    }

    public void setMom(Person mom) {
        this.mom = mom;
    }

    public Person getDad() {
        return dad;
    }

    public void setDad(Person dad) {
        this.dad = dad;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", mom=" + mom +
                ", dad=" + dad +
                '}';
    }
}
