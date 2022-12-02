package com.example.classes;

public class Main {
    public static void main(String[] args) {
SmartDevice.SmartPhone smartPhone = new SmartDevice.SmartPhone("Sony", "Xperia", "Black",
        8, "Android");

        SmartDevice.SmartWatch smartWatch = new SmartDevice.SmartWatch("Xiaomi", "X6", "White",
                3.5, "Bluetooth");

        System.out.println("The smartphone is: " + smartPhone + "\nThe smartwatch is: " + smartWatch);
    }
}