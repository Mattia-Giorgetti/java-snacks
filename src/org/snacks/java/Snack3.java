package org.snacks.java;

import java.util.Arrays;

public class Snack3 {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = (int) Math.floor(Math.random() * numbers.length);
        }
        int sum = 0;

        for (int i = 1; i < numbers.length; i+=2){
            sum += numbers[i];
        }
        System.out.print("L' Array creato è: ");
        System.out.println(Arrays.toString(numbers));
        System.out.println("La somma dei numeri in posizione dispari è: " + sum);
    }
}
