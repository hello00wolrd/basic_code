package com.cug.ExtendDemo1;

public class Manage extends Employee {
    private double bonus;

    @Override
    public void work() {
        System.out.println("管理其他人");
    }

    public Manage(double bonus) {
        this.bonus = bonus;
    }

    public Manage(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
