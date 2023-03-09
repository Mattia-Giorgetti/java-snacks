package org.snacks.java;

import java.util.Arrays;
import java.util.Random;

public class Snack4 {
    public static void main(String[] args) {
        Random randomNum = new Random();

        int[] arrayOne = new int[randomNum.nextInt(15) + 1];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = 1;
        }

        int[] arrayTwo = new int[randomNum.nextInt(7) + 1];
        for (int i = 0; i < arrayTwo.length ; i++) {
            arrayTwo[i] = 2;
        }
        int minLen = Math.min(arrayOne.length, arrayTwo.length);
        int maxLen = Math.max(arrayOne.length, arrayTwo.length);
        int lenDiff = maxLen - minLen;


        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.print(lenDiff == 0 ?  "Gli array hanno la stessa lunghezza" : "");

        for (int i = 0; i < lenDiff; i++) {
            System.out.print((randomNum.nextInt(10) + 1) + "  ");
        }
    }
}
