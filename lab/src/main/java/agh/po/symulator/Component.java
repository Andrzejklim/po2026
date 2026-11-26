package agh.po.symulator;

public class Component {
    private String manufacter;
    private String model;
    private double price;

    protected String getProducent(){
        return this.manufacter;
    }

    protected String getModel(){
        return this.model;
    }

    protected double getPrice(){
        return price;
    }
}
