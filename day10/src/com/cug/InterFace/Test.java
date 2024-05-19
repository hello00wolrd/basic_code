package com.cug.InterFace;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小青", 1);
        f.eat();
        f.swim();

        Rabbit r = new Rabbit("小白兔", 2);
        r.eat();
    }
}
