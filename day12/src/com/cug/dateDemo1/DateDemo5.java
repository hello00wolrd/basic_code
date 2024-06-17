package com.cug.dateDemo1;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateDemo5 {
    public static void main(String[] args) {
//        获取时间对象
//        ZonedDateTime zdt = ZonedDateTime.now();
//        System.out.println(zdt);
        ZonedDateTime zdt = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zdt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        System.out.println(zdt.format(dtf));
    }
}
