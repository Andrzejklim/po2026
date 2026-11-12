package agh.po.lab4.animals;

public abstract class Animal {
    protected String name;
    protected int legs;

    public abstract String getDescription();

    public int getLegs(){
        return legs;
    }
}
