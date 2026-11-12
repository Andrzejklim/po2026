package agh.po.lab4.animals;

public class Dog extends Animal {
    @Override
    public String getDescription() {
        return "Jestem psem";
    }

    public Dog(){
        legs = 4;
    }
}
