package com.whu.CommonsDemo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsDemo1 {
    public static void main(String[] args) throws IOException {
      /*  File src = new File("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\zipStreamDemo\\whu");
        FileUtils.deleteDirectory(src);*/
        FileUtils.delete(new File("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\zipStreamDemo\\a.txt"));
    }
}
