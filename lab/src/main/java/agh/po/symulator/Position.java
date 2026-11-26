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
//        System.out.printf("X: %.2f Y:%.2f \n", this.x, this.y);
        System.out.println("x: " + this.x + " y: " + this.y);
    }

    public void moveBy(double dt, double V, double[] dest){
        double actualPosition[] = {getX(), getY()};
        double time = 0;

        double x; // zmienna do petli

        // niech pozycja docelowa to (x2, y2)
        double x2 = dest[0];
        double y2 = dest[1];

        double x1 = actualPosition[0];
        double y1 = actualPosition[1];

        double a = (y2 - y1) / (x2 - x1);
        double b = y1 - a * x1;

        // jak jestem w cwiartce I i II to zwikszam dy i obliczam x
        int kroki = (int) Math.round((y2 - y1) / 0.1);

        for(int i = 0; i <= kroki; i++){
            double y = y1 + i * 0.1;
            x = (y - b) / a; // poprawiony wzór
            this.x = x;
            this.y = y;
            this.ShowPosition();
            time = i * dt;
        }

        System.out.println("Zajelo to: "+ time);
    }

    public Position(){
        this(0, 0);
    }

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

}
