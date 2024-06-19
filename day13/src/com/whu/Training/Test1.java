package com.whu.Training;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        /*
            Define an array and store some girlfriend objects, using the sort method in Arrays to sort them.
            Requirement 1: Attributes include name, age, height.
            Requirement 2: Sort according to the age, the same as the age, sort by height, and the same as the height, sort by the alphabetical order of the name.
        * */
        Girlfriend gf1 = new Girlfriend("xiaoshishi", 18, 1.67);
        Girlfriend gf2 = new Girlfriend("xiaodandan", 19, 1.78);
        Girlfriend gf3 = new Girlfriend("aiaohuihui", 19, 1.78);

        Girlfriend[] gfs = {gf1, gf2, gf3};

//        Arrays.sort(gfs, (o1, o2) -> {
//            if (o1.getAge() != o2.getAge()) {
//                return o1.getAge() - o2.getAge();
//            } else {
//                if (o1.getHeight() != o2.getHeight()) {
//                    return (int) (o1.getHeight() - o2.getHeight());
//                } else {
//                 return o1.getName().compareTo(o2.getName());
//                }
//            }
//        });

        Arrays.sort(gfs, (o1, o2) -> {
            double temp = o1.getAge() - o2.getAge();
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
            if (temp > 0) return 1;
            if (temp < 0) return -1;
            return 0;
        });
        System.out.println(Arrays.toString(gfs));
    }
}
