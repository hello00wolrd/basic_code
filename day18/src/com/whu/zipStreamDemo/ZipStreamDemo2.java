package com.whu.zipStreamDemo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\zipStreamDemo\\a.txt");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\zipStreamDemo\\a.zip"));
        ZipEntry zip = new ZipEntry("a.txt");
        zos.putNextEntry(zip);
        FileInputStream fis = new FileInputStream(file);
        byte[] buf = new byte[1024];
        int len;
        while ((len = fis.read(buf)) != -1) {
            zos.write(buf, 0, len);
        }
        fis.close();
        zos.closeEntry();
        zos.close();
    }
}
