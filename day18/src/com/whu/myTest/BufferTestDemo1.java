package com.whu.myTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class BufferTestDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\myTest\\csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\myTest\\result.txt"));
        String s;
//        已知共9行
        ArrayList<String> list = new ArrayList<>();
        while ((s = br.readLine()) != null) {
//            System.out.println(s);
            list.add(s);
        }
//        System.out.println(list);
        Collections.sort(list, (o1, o2) -> {
            int i = Integer.parseInt(o1.split("\\.")[0]);
            int j = Integer.parseInt(o2.split("\\.")[0]);
//            up sorted
            return i - j;
        });
//        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i));
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
