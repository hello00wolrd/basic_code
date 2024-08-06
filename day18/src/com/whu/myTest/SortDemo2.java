package com.whu.myTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class SortDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day18/src/com/whu/myTest/Test.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        String str = sb.toString();
        Integer[] result = Arrays.stream(str.split("-")).map(Integer::parseInt).sorted((o1, o2) -> o1 - o2).toArray(Integer[]::new);
        String text1 = Arrays.toString(result)
                .replace(", ", "-");
        String text2 = text1.substring(1, text1.length() - 1);
        System.out.println(text2);
        FileWriter fw = new FileWriter("day18/src/com/whu/myTest/Test.txt");
        fw.write(text2);
        fw.close();
        fr.close();

    }
}
