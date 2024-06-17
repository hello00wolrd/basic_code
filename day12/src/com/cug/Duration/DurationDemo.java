package com.cug.Duration;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationDemo {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDateTime birthday = LocalDateTime.of(2002,1,1,23,59,59,59);
        System.out.println(birthday);
//        第二个参数减去第一个参数
        Duration dt = Duration.between(birthday,ldt);
        System.out.println(dt);
        System.out.println(dt.toDays()+" days");
        System.out.println(dt.toHours()+" hours");
        System.out.println(dt.toMinutes()+" minutes");
        System.out.println(dt.toSeconds()+" seconds");
        System.out.println(dt.toMillis()+" millis");
        System.out.println(dt.toNanos()+" nanos");
    }
}
