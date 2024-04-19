package com.cug.homework;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[10];
        Goods g1 = new Goods(1, "HuaWei", 5999.0, 100);
        Goods g2 = new Goods(2, "保温杯", 600.0, 200);
        Goods g3 = new Goods(3, "nigger", 250.0, 444);
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        for (int i = 0; i < 3; i++) {
            Goods temp = arr[i];
            System.out.println(temp.getId() + "," + temp.getName() + "," + temp.getPrice() + "," + temp.getCount());
        }
    }
}
