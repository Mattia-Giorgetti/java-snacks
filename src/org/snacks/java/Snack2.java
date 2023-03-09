package org.snacks.java;

public class Snack2 {
    public static void main(String[] args) {

        String [] firstNames = {"Marco", "Luca", "Simone", "Luigi", "Pietro", "Giulio", "Chiara", "Lucia", "Filippo", "Tommaso", "Giulia", "Mattia", "Matteo"};
        String [] lastNames = {"Rossi", "Bianchi", "Verdi", "Neri", "Gialli", "Celesti", "Grigi", "Belli", "Brutti", "Alti", "Bassi"};
        String [] namesList = new String[10];

        for (int i = 0; i < namesList.length; i++) {
            double randomNameIndex = Math.floor(Math.random() * firstNames.length);
            double randomSurnameIndex = Math.floor(Math.random() * lastNames.length);

            String randomFirstName = firstNames[(int) randomNameIndex];
            String randomLastName = lastNames[(int) randomSurnameIndex];

            System.out.println(randomFirstName + " " + randomLastName);
        }
    }
}
