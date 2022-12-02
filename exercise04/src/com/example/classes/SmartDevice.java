package com.example.classes;

public class SmartDevice {
    String brand;
    String model;
    String color;

    public SmartDevice() {

    }

    public SmartDevice(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
//***********aqui me quede ALV (alavado sea el señor)
    public static class SmartPhone extends SmartDevice {
        int ram;
        String system;

        public SmartPhone() {
        }

        public SmartPhone(String brand, String model, String color, int ram, String system) {
            super(brand, model, color);
            this.ram = ram;
            this.system = system;

        }


        public String toString() {
            return "brand=" + brand +
                    ", model=" + model +
                    ", color=" + color +
                    ", ram=" + ram +
                    ", system=" + system;
        }
    }

    public static class SmartWatch extends SmartDevice {
        double inches;
        String Connection;

        public SmartWatch() {
            super();
        }

        public SmartWatch(String brand, String model, String color, double inches, String Connection) {
            super(brand, model, color);
            this.inches = inches;
            this.Connection = Connection;
        }

        public String toString() {
            return "brand=" + brand +
                    ", model=" + model +
                    ", color=" + color +
                    ", inches=" + inches +
                    ", Connection=" + Connection;
        }
    }




}
