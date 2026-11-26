package agh.po.symulator;

public class Position {
    private double x;
    private double y;

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void ShowPosition(){
        System.out.println("X: " + this.x );
        System.out.println("Y: " + this.y );

    }

    public void moveBy(double deltaX, double deltaY){
        this.x += deltaX;
        this.y += deltaY;
    }

    public Position(){
        this(0, 0);
    }

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

}
