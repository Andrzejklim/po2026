package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

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

    public static void setArgsNumArray(ArrayList<Integer> numbers, int size, String[] args) {
        for(int i = 0; i < size; i++){
            int actual = Integer.parseInt(args[i]);
            numbers.add(actual);
        }
    }

    public static void singleDraw(ArrayList<Integer> randomArray, ArrayList<Integer> guessedArray ,int size){
        setRandomUniqueArray(randomArray, size);
        Collections.sort(randomArray);
        int counter = 0;

        for (int i = 0; i < size; i++) {
            if (guessedArray.contains(randomArray.get(i))) {
                counter += 1;
            }
        }
        System.out.println("Twoje typy: " + guessedArray);
        System.out.println("Wylosowane liczby: " + randomArray);
        System.out.println("Liczba trafień: " + counter);
    }

    public static void mainDrawing(ArrayList<Integer> randomArray, ArrayList<Integer> guessedArray ,int size) {
        int counter = 0;
        boolean notGuessed = true;

        long startTime = System.currentTimeMillis();
        randomArray.clear();

        while(notGuessed) {
            setRandomUniqueArray(randomArray, size);
            Collections.sort(randomArray);
            if(randomArray.equals(guessedArray)){
                notGuessed = false;
                System.out.println("Congratulations! Machine guessed all the numbers in the array.");
                System.out.println("it took " + counter + " guesses." );

                long endTime = System.currentTimeMillis();
                long totalTimeMs = endTime - startTime;

                System.out.println("Czas wykonania: " + totalTimeMs + " ms");
                System.out.println("Czas w sekundach: " + (totalTimeMs / 1000.0) + " s");
            }
            else{
                randomArray.clear();
                counter += 1;
            }
        }
    }

    public static void main(String[] args){


        int listLength = 6;
        ArrayList<Integer> randomArray = new ArrayList<>();
        ArrayList<Integer> guessedArray = new ArrayList<>();

        setArgsNumArray(guessedArray, listLength, args);
        Collections.sort(guessedArray);

        singleDraw(randomArray, guessedArray, listLength);
        mainDrawing(randomArray, guessedArray, listLength);
    }
}
