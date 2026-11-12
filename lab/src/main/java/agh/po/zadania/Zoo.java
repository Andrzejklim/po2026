package agh.po;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

import java.util.Random;

public class Zoo {
    Random random = new Random();
    Animal[] animals = new Animal[100];

    public Zoo(){
        int losowa;
        for(int i = 0; i < animals.length; i++){
            losowa = random.nextInt(3);

            if(losowa == 0){
                animals[i] = new Dog();
            } else if (losowa == 1) {
                animals[i] = new Parrot();
            } else{
                animals[i] = new Snake();
            }
        }
    }

    public int sumLegs(){
        int sum = 0;
        for(int i = 0; i < animals.length; i++){
            sum += animals[i].getLegs();
        }
        return sum;
    }

    public static void main(String[] args){
        Zoo zoo = new Zoo();
        System.out.println("Suma nog: " + zoo.sumLegs());
    }

}
