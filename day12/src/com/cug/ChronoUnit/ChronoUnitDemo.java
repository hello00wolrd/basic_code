package com.cug.ChronoUnit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDateTime birthday = LocalDateTime.of(1970, 1, 1, 0, 0, 0);
        System.out.println(birthday);

//        前面减去后面
        System.out.println(ChronoUnit.YEARS.between(birthday, ldt));
        System.out.println(ChronoUnit.DAYS.between(birthday, ldt));
        System.out.println(ChronoUnit.HOURS.between(birthday, ldt));
    }
}
