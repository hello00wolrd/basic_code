package com.whu.myTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SortDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day18/src/com/whu/myTest/Test.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        String str = sb.toString();
        String[] arrStr = str.split("-");
        ArrayList<Integer> arr = new ArrayList<>();
        for (String s : arrStr) {
            arr.add(Integer.parseInt(s));
        }
//        sort/Collection.sort
        arr.sort((o1, o2) -> o1 - o2);
        System.out.println(arr.toString());
        FileWriter fw = new FileWriter("day18/src/com/whu/myTest/Test.txt");
        for (int i = 0; i < arr.size() - 1; i++) {
            fw.write(arr.get(i) + "-");
        }
        fw.write(arr.get(arr.size() - 1).toString());
//        fw.flush();
        fr.close();
        fw.close();
    }
}
