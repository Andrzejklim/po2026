package agh.po.symulator;

public class Silnik extends Komponent {
    private int obroty;
    private int maxObroty = 500;

    public void zwiekszObroty(int zwiekszenie){
        if (this.obroty + zwiekszenie > this.maxObroty) {
            this.obroty = this.maxObroty;
            System.out.printf("Obroty osiagnieto maksymalne");
        }else {
            this.obroty += zwiekszenie;
        }
    }

    public void zmniejszObroty(int zmniejszenie){
        if (this.obroty - zmniejszenie < 0) {
            this.obroty = 0;
            System.out.printf("Osiagnieto wczesniej minimalne obroty, nie da sie wiecej zmniejszyc");
        }else {
            this.obroty -= zmniejszenie;
        }
    }

    public void uruchom(){
        this.obroty = 0;
    }

    public void zatrzymaj(){
        this.obroty = 0;
        // zerowanie biegu
    }

}
