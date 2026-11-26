package agh.po.symulator;

public class Clutch extends Component{
    private boolean isPressed = false;

    public void press(){
        System.out.println("sprzeglo wcisniete");
        isPressed = true;
    }

    public void release(){
        System.out.println("sprzeglo nie wcisniete");
        isPressed = false;
    }

    public boolean getClutchState(){
        return isPressed;
    }

}
