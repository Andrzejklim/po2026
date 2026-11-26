package agh.po.symulator;

public class Car{
    private Engine engine;
    private GearBox gearBox;
    private Position carPosition;

    public void turnOn(){
        this.engine.startEngine();
    }

    public void turnOff(){
        this.engine.stopEngine();
    }

    public void upShift(){
        gearBox.upShift();
    }

    public void downShift(){
        gearBox.downShift();
    }




    public Car(Engine engine, GearBox gearBox, Position position){
        this.engine = engine;
        this.gearBox = gearBox;
        this.carPosition = position;
    }

    public static void main(String[] args){
        // obiekty potrzebne do stworzenia ferrari
        Clutch clutchFerrari = new Clutch();
        Engine engineFerrari = new Engine(7000);
        GearBox gearBoxFerrari = new GearBox(0,clutchFerrari);
        Position positionFerrari = new Position(0,0);

        //utworzenie obiektu
        Car myCar = new Car(engineFerrari, gearBoxFerrari, positionFerrari);
        myCar.turnOn();
        engineFerrari.showRevs();
        for(int i = 0; i < 1000; i+=200){
            engineFerrari.increaseRevs(200);
            engineFerrari.showRevs();
        }

        clutchFerrari.press();
        myCar.upShift();
        System.out.println("aktualny bieg: " + gearBoxFerrari.getCurrentGear());
        clutchFerrari.release();
        myCar.turnOff();

        myCar.carPosition.moveBy(0.1, 20, new double []{5,6});
    }

}

