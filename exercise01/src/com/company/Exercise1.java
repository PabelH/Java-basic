package com.company;

public class Exercise1 {
    public static void main(String[] args) {
        // numbers
        byte number1 = 1; // 1 byte
        short number2 = 10; // 2 bytes
        int number3 = 50; // 4 bytes
        long number4 = 100; // 8 bytes

        System.out.println("Numbers: " + number1 + " - " + number2 + " - " + number3 + " - " + number4);

        // decimals
        float decimal1 = 4.9f;
        double decimal2 = 9.99d;

        System.out.println("Decimals: " + decimal1 + " - " + decimal2);

        // cadena de texto
        String name = "Pabelon";
        String lastName = "Pimpon";

        // character
        char ch = 'a';

        System.out.println("Text: " + name + " " + lastName + "Character: " + ch);

        //booleans
        boolean b1 = true;
        boolean b0 = false;
        System.out.println("Boolean: " + b1 + " - " + b0 );
    }
}
