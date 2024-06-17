package com.cug.ZoneIdDemo;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo1 {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);
//        获得当前系统的默认时区
        ZoneId zoneid = ZoneId.systemDefault();
        System.out.println(zoneid);
//        自己指定一个时区
        ZoneId zoneid1 = ZoneId.of("Asia/Aden");
        System.out.println(zoneid1);
    }
}
