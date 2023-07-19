package animal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Animal {
    private final String name;
    private Set<String> shortName= new HashSet<>();

    private static int population =0;


    public Animal(String name) {
        population++;
        this.name = name;
    }

    public static int getPopulation() {
        return population;
    }

    public abstract void makeSound();

    public void addShortName(String shortName){
        this.shortName.add(shortName);
    }

    public String getName() {
        return name;
    }

    public Set<String> getShortName() {
        return shortName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", shortName=" + shortName +
                '}';
    }
}