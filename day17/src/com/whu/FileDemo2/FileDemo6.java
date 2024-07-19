package com.whu.FileDemo2;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        File f1 = new File("E:\\java_code\\basic_code\\day17\\src\\com\\whu\\test\\ccc");
        deleteALL(f1);
    }

    public static void deleteALL(File file) {
        boolean flag = false;
        File[] arr = file.listFiles();
        if (arr != null) {
            for (File f : arr) {
                if (f.isFile()) {
//                    如果是文件则删除
                    f.delete();
                } else {
//                    如果是文件夹则递归
                    deleteALL(f);
                    //                记得删除本身
                    f.delete();
                }
            }
        }
        file.delete();
    }
}
