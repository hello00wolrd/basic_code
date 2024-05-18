package com.cug.PolymorphismDemo3;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("老王", 18);
        Animal d = new Dog(12,"black");
        Animal c = new Cat(1,"white");
        p.keepPet(d, "骨头");
        p.keepPet(c, "🐟");
    }
}
