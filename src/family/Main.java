package family;

public class Main {

    public static void main(String[] args) {

        Person hugo = new Person("Hugo", 0);
        Person ivo = new Person("Ivó", 0);
        Person sanyi = new Person("Sanyi", 0);
        Person bela = new Person("Béla", 0);

        Person alma = new Person("Alma", 0);
        Person eszter = new Person("Eszter", 0);
        Person judit = new Person("Judit", 0);

        hugo.setDad(ivo);
        hugo.setMom(alma);

        alma.setMom(eszter);
        alma.setDad(sanyi);

        eszter.setDad(bela);
        eszter.setMom(judit);
        ivo.setDad(sanyi);
        sanyi.setDad(bela);
        hugo.printFamilyTreeMother();
        hugo.printFamilyTreeFather();

    }
}
