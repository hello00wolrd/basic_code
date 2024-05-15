package com.cug.ExtendDemo1;

public class Cooker extends Employee {
    @Override
    public void work() {
        System.out.println("炒菜");
    }

    public Cooker() {
    }

    public Cooker(String id, String name, double salary) {
        super(id, name, salary);
    }
}
