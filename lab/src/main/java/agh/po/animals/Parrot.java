package agh.po.animals;

public class Parrot extends Animal {
    @Override
    public String getDescription() {
        return "I am parrot";
    }

    public Parrot(){
        legs = 2;
    }
}
