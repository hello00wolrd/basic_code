package com.whu.zipStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class zipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        练习解压缩包
        * */
        String dest = "E:\\java_code\\basic_code\\day18\\src\\com\\whu\\zipStreamDemo";
        ZipInputStream zis = new ZipInputStream(new FileInputStream("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\zipStreamDemo\\whu.zip"));
        ZipEntry zip;
        while ((zip = zis.getNextEntry()) != null) {
//            System.out.println(zip);
            if (zip.isDirectory()) {
                File file = new File(dest, zip.getName());
                file.mkdirs();
            } else {
                FileOutputStream fos = new FileOutputStream(dest + "\\" + zip.getName());
                byte[] buffer = new byte[1024];
                int len;
                while ((len = zis.read(buffer)) != -1) {
                    fos.write(buffer, 0, len);
                }
                fos.close();
                zis.closeEntry();
            }
        }
        zis.close();
    }
}
