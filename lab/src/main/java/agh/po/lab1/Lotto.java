import java.util.Random;
import java.util.ArrayList;


public class Lotto {

    private static final Random random = new Random();

    public static void setRandomUniqueArray(ArrayList<Integer> numbers, int size) {
        boolean flag = true;
        int differentRandomCounter = 0;

        if(numbers.size() == 0){
            while(flag) {
                int myRandom = random.nextInt(1, 50);

                if (!numbers.contains(myRandom)) {
                    numbers.add(myRandom);
                    differentRandomCounter += 1;
                }
                if (differentRandomCounter == size) {
                    flag = false;
                }
            }
        }
    }


    public static void main(String[] args){
        System.out.println("Lotto");

        ArrayList<Integer> lista = new ArrayList<Integer>();

        setRandomUniqueArray(lista, 6);

        System.out.println(lista);
    }
}
