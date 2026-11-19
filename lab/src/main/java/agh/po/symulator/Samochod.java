package agh.po.symulator;

public class Samochod {
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;

    public void wlacz(){
        this.silnik.uruchom();
    }

    public void wylacz(){
        this.silnik.zatrzymaj();
    }
}
