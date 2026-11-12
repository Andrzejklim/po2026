package agh.po.animals;

public class Dog extends Animal {
    @Override
    public String getDescription() {
        return "Jestem psem";
    }

    public Dog(){
        legs = 4;
    }
}
