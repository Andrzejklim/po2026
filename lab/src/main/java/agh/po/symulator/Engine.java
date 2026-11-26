package agh.po.symulator;

public class Engine extends Component {
    private int revs;
    private final int maxRevs;

    public void increaseRevs(int increment){
        if (this.revs + increment > this.maxRevs) {
            this.revs = this.maxRevs;
            System.out.printf("Obroty osiagnieto maksymalne");
        }else {
            this.revs += increment;
        }
    }

    public void decreaseRevs(int decrement){
        if (this.revs - decrement < 0) {
            this.revs = 0;
            System.out.printf("Osiagnieto wczesniej minimalne obroty, nie da sie wiecej zmniejszyc");
        }else {
            this.revs -= decrement;
        }
    }

    public void startEngine(){
        this.revs = 100;
    }

    public void stopEngine(){
        this.revs = 0;
        // zerowanie biegu
    }

    public void showRevs(){
        System.out.println("Aktualne obroty: " + revs);
    }

    public Engine(){
        this(500);
    }

    public Engine(int maxRevs){
        this.maxRevs = maxRevs;
    }
}
