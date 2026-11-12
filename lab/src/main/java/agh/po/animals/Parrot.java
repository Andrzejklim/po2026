package agh.po.lab4.animals;

public class Parrot extends Animal {
    @Override
    public String getDescription() {
        return "I am parrot";
    }

    public Parrot(){
        legs = 2;
    }
}
