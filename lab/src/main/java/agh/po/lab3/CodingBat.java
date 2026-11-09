package agh.po.lab3;

import java.time.chrono.MinguoDate;
import java.util.HashMap;
import java.util.Map;

public class CodingBat {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation ){
            return true;
        }else{
            return false;
        }
    }

    public boolean icyHot(int temp1, int temp2) {
        if((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)){
            return true;
        } else{
            return false;
        }
    }

    public boolean haveThree(int[] nums) {
        int counter = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 3){
                counter += 1;
                if(i > 0 && nums[i-1] == 3){
                    return false;
                }
            }
        }
        return counter == 3;
    }

    public String lastTwo(String str) {
        int lengthOfSt = str.length();
        String newStr;
        if(lengthOfSt >= 2){
            int index = lengthOfSt - 2;
            char[] myCharArrays = str.toCharArray();
            char a = myCharArrays[index];
            char b = myCharArrays[index + 1];
            myCharArrays[index] = b;
            myCharArrays[index + 1] = a;
            newStr = new String(myCharArrays);
            return newStr;

        }
        return str;
    }

    public static void main(String[] args){
        CodingBat obiekt1 = new CodingBat();

        //  Dodaj metodę main z wywołaniami testowymi dla każdej funkcji
        System.out.println(obiekt1.sleepIn(false, true));
        System.out.println(obiekt1.icyHot(-1, 90));
        System.out.println(obiekt1.lastTwo("cat"));
        System.out.println(obiekt1.haveThree(new int[]{1,3,2}));
    }

    // mapAB4
    public Map<String, String> mapAB4(Map<String, String> map) {


        if (map.containsKey("a") && map.containsKey("b")) {
            int lengthA = map.get("a").length();
            int lengthB = map.get("b").length();

            if(lengthA > lengthB){
                map.put("c", map.get("a"));
            } else if (lengthB > lengthA) {
                map.put("c", map.get("b"));
            } else{
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    // pairs
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> myMap = new HashMap<>();

        for(int i = 0; i < strings.length; i++){
            if (strings[i].length() > 0) {
                myMap.put(String.valueOf(strings[i].charAt(0)) , String.valueOf(strings[i].charAt(strings[i].length()-1)));
            }

        }
        return myMap;
    }
}
