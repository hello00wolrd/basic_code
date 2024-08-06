package com.whu.myTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class convertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\myTest\\gbkfile.txt", Charset.forName("GBK"));
        int ch;
        FileWriter fw = new FileWriter("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\myTest\\utf8file.txt", Charset.forName("UTF-8"));
        while ((ch = fr.read()) != -1) {
//            System.out.print((char) ch);
            fw.write(ch);
        }
        fw.close();
        fr.close();
    }
}
