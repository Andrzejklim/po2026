package agh.po.lab4.animals;

public class Snake extends Animal{

    @Override
    public String getDescription() {
        return "Jestem wezem";
    }

    public Snake(){
        legs = 0;
    }
}
