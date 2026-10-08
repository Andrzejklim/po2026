import java.util.Random;
import java.util.ArrayList;

class Losowa {

    public int liczba;
    public Losowa(int l){
        this.liczba = l;
    }


}


public class Lotto {
    public static void main(String[] args){
        System.out.println("Lotto");
        Random random = new Random();

        ArrayList<Losowa> lista = new ArrayList<Losowa>();

        for(int i = 0; i < 10; i++){
            int wylosowana = random.nextInt(49) + 1;
            lista.add(new Losowa(wylosowana));
        }

        for(Losowa element: lista){
            System.out.println(element.liczba);
        }

    }
}
