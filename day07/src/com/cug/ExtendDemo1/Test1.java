package com.cug.ExtendDemo1;

public class Test1 {
    public static void main(String[] args) {
        Manage mg = new Manage("aaaa1", "LIsi", 98.1, 67.1);
        System.out.println(mg + "Bonus=" + Double.toString(mg.getBonus()));
        mg.work();
        mg.Eat();
        Cooker ck = new Cooker("ddasd", "dasdaw", 123091.23);
        System.out.println(ck);
        ck.work();
        ck.Eat();
    }
}
