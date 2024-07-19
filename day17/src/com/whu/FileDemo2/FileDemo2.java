package com.whu.FileDemo2;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File f = new File("E:\\java_code\\basic_code\\day17\\src\\com\\whu\\test");
        File[] f2 = f.listFiles();

        for (File fTemp : f2) {
            if (fTemp.isFile() && fTemp.getName().endsWith("txt")) {
                System.out.println(fTemp.getAbsolutePath());
            }
        }
    }
}
