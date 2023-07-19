package animal;

public class SeaLion extends Animal{

    public SeaLion(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("SeaLion hang");

    }
}