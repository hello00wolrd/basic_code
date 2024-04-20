package com.cug.StringDemo;

import java.util.Locale;

//replace 练习
public class StringDemo3 {
    public static void main(String[] args) {
        String talk = "你能不能别玩了,TMD,CNM,mlgb";
        talk = talk.toUpperCase(Locale.ROOT);
        String result = talk.replace("TMD", "***");
        System.out.println(result);

        String[] arr = {"TMD", "CNM", "SB", "MLGB"};
        for (String s : arr) {
            talk = talk.replace(s, "***");
        }
        System.out.println(talk);
    }
}
