package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Lotto {


    public static void main(String[] args){
        Random random = new Random();
        int dlugoscListy = 6;
        ArrayList<Integer> randomArray = new ArrayList<>();
        ArrayList<Integer> guessedArray = new ArrayList<>();
        int counter = 0;
        int differentRandomCounter = 0;
        boolean notGuessed = true;
        boolean flag = true;

        while(flag) {
            int myRandom = random.nextInt(1, 50);

            if (!randomArray.contains(myRandom)) {
                randomArray.add(myRandom);
                differentRandomCounter += 1;
            }
            if (differentRandomCounter == dlugoscListy) {
                flag = false;
            }
        }

        for(int i = 0; i < dlugoscListy; i++){
            int actual = Integer.parseInt(args[i]);
            guessedArray.add(actual);
        }


        Collections.sort(guessedArray);
        Collections.sort(randomArray);


        System.out.println(guessedArray);
        System.out.println(randomArray);

//        boolean AllMatched = true;
//        while(notGuessed){
//            for(int i = 0; i < 6; i++) {
//                if (guessedArray.get(i) != randomArray.get(i)) {
//                    counter +=1;
//                    AllMatched = false;
//                    break;
//                }
//            }





//        System.out.println("Twoja tabela" + " " + listaZgadnieta);
//        System.out.println("Liczba trafien: " + counter);
    }
}
