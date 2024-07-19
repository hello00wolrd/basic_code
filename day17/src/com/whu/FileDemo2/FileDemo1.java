package com.whu.FileDemo2;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo1 {
    public static void main(String[] args) {
        /*
public static File[] listRoots()  列出可用的文件系统根
public String[] list()   获取当前该路径下所有内容
public String[] list(FilenameFilter filter)   利用文件名过滤器获取当前该路径下所有内容
（掌握）public File[] listFiles()   获取当前该路径下所有内容
public File[] listFiles(FileFilter filter)   利用文件名过滤器获取当前该路径下所有内容
public File[] listFiles(FilenameFilter filter)   利用文件名过滤器获取当前该路径下所有内容
        * */


/*        File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------");
//list 获取名字
        File f1 = new File("E:\\");
        String[] arr2 = f1.list();
        for (String s : arr2) {
            System.out.println(s);
        }
        System.out.println("----------------------------");*/

        File f2 = new File("E:\\java_code\\basic_code\\day17\\src\\com\\whu\\test");
        String[] arr3 = f2.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
//                仅过滤后缀名为txt的文件
                return src.isFile() && src.getName().endsWith(".txt");
            }
        });
        for (String s : arr3) {
            System.out.println(s);
        }
    }
}
