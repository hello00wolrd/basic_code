package com.whu.zipStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
//代码可行

public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
//        创建File对象表示要被压缩的文件夹
        File src = new File("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\zipStreamDemo\\whu");
//创建压缩包所放到地方
        File destParent = src.getParentFile();
//        创建file对象表示压缩包的路径
        File dest = new File(destParent, "out.zip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
//        获取src中的每一个文件,变成zipEntry对象,放入到压缩包内
        toZip(src, zos, src.getName());
//        释放资源
        zos.close();
    }

    private static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                ZipEntry entry = new ZipEntry(name + "/" + file.getName());
                zos.putNextEntry(entry);
                FileInputStream fis = new FileInputStream(file);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = fis.read(buffer)) != -1) {
                    zos.write(buffer, 0, length);
                }
                fis.close();
                zos.closeEntry();
            } else {
                toZip(file, zos, file.getName());
            }
        }
    }

}
