package agh.po.symulator;

public class GearBox extends Component {
    private int numOfGears = 6;
    private int currentGear;
    private int currentGearRatio;
    private Clutch clutch;

    public int getCurrentGear(){
        return this.currentGear;
    }

    public int getCurrentGearRatio(){
        return this.currentGearRatio;
    }

    public void upShift(){
        // moge zmienic bieg tylko jesli jest wcisniete sprzeglo
        if (clutch.getClutchState()) { // isPressed false || true
            // zmiana biegu o 1
            if (currentGear < numOfGears){
                currentGear += 1;
            }
        }
    }

    public void downShift(){
        // moge zmienic bieg tylko jesli jest wcisniete sprzeglo
        if (clutch.getClutchState()) { // isPressed false || true
            //zmiana biegu
            if (currentGear > 0){
                currentGear -= 1;
            }
        }
    }

    public GearBox(int currentGear, Clutch clutch){
        this.currentGear = currentGear;
        this.clutch = clutch;
    }
}
// V = obroty * przelozenie * stalajakas