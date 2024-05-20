package com.cug.InnerClassDemo;

public class Car {
    String carName;
    String carColor;
    int carAge;

    public void show(Car this) {
        System.out.println(this.carName);
        Engine e = new Engine();
        System.out.println(e.engineName);
    }

    private class Engine {
        String engineName;
        int engineAge;

        public void show() {
            System.out.println("Car Name: " + carName);
            System.out.println("Car Color: " + carColor);
            System.out.println("Car Age: " + carAge);
            System.out.println("Engine Name: " + engineName);
            System.out.println("Engine Age: " + engineAge);
        }
    }

    public Car() {
    }

    public Car(String carName, String carColor, int carAge) {
        this.carName = carName;
        this.carColor = carColor;
        this.carAge = carAge;
    }
}
