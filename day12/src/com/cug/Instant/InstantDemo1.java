package com.cug.Instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo1 {
    public static void main(String[] args) {
//        获取当前的时间,(标准时间)
        Instant now1 = Instant.now();
        System.out.println(now1);
//        根据(秒/毫秒/纳秒)来获取时间
        Instant is1 = Instant.ofEpochMilli(0L);
        System.out.println(is1);

        Instant is2 = Instant.ofEpochSecond(1L);
        System.out.println(is2);

        Instant is3 = Instant.ofEpochSecond(1L, 100000000L);
        System.out.println(is3);
//        指定时区
        ZonedDateTime zdt = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zdt);
//        isXXX判断
        Instant result1 = Instant.ofEpochMilli(0L);
        Instant result2 = Instant.ofEpochSecond(1L);
        System.out.println(result1.isBefore(result2));//true
        System.out.println(result1.isAfter(result2));//false

        Instant is4 = Instant.ofEpochSecond(20);
        System.out.println(is4.minusSeconds(10));
        System.out.println(is4);
        System.out.println(is4.plusSeconds(20));
    }
}
