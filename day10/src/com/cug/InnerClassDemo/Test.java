package com.cug.InnerClassDemo;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.carAge = 12;
        c.carColor = "black";
        c.carName = "BMW";
        c.show();
        Outer.Inner o = new Outer(1).new Inner();
        o.show();
    }
}
