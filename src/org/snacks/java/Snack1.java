package org.snacks.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");
        int userNum = Integer.parseInt(scan.nextLine());

        System.out.println(userNum % 2 == 0 ? userNum : userNum + 1);
        scan.close();
    }
}
