package com.whu.MyIOTestDemo;

import cn.hutool.http.HttpUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//可以使用hutool包进行改写
public class IOTestDemo1 {
    public static void main(String[] args) throws IOException {
        /*
获取姓氏：https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d
获取男生名字：http://www.haoming8.cn/baobao/10881.html
获取女生名字：http://www.haoming8.cn/baobao/7641.html
        * */
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";

//        String familyString = webCrawler(familyNameNet);
        ArrayList<String> familyTempList = getData(familyNameNet, "([^a-z]{4})(，|。)", 1);
//        List<String> familyTempList = ReUtil.findAll("([^a-z]{4})(，|。)", HttpUtil.get(familyNameNet), 1);
        ArrayList<String> boyNameTempList = getData(boyNameNet, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> girlNameTempList = getData(girlNameNet, "(.. ){4}(..)", 0);
//        System.out.println(girlNameTempList);

//        deal the family
        ArrayList<String> familyList = new ArrayList<>();
//        for(String temp : familyTempList) {}
        for (String temp : familyTempList) {
            for (int i = 0; i < temp.length(); i++) {
                familyList.add(temp.charAt(i) + "");
            }
        }

//        deal the BoyName:Remove duplicate elements
        ArrayList<String> boyNameList = new ArrayList<>();
        for (String temp : boyNameTempList) {
            if (!boyNameList.contains(temp)) {
                boyNameList.add(temp);
            }
        }
//    deal with the GirlName
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String s : girlNameTempList) {
            String[] name = s.split(" ");
            for (int i = 0; i < name.length; i++) {
                girlNameList.add(name[i]);
            }
        }
        ArrayList<String> infos = getInfos(familyList, boyNameList, girlNameList, 20, 30);
        Collections.shuffle(infos);

//        write in file
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\java_code\\basic_code\\day18\\src\\com\\whu\\MyIOTestDemo\\name.txt"));
        for (String info : infos) {
            bw.write(info);
            bw.newLine();
        }
        bw.close();
//        System.out.println(infos);
    }

    /*
Role: Get information about boys and girls: Zhang San-Male-23
Parameters:
Parameter 1: Collection with last name
Parameter 2: A collection of boys 'names
Parameter 3: A collection of girls 'names
Parameter 4: Number of boys
Parameter 5: Number of girls

    * */
    private static ArrayList<String> getInfos(ArrayList<String> familyList, ArrayList<String> boyList,
                                              ArrayList<String> girlList, int boyCount, int girlCount) {

        HashSet<String> boyHs = new HashSet<>();
        while (true) {
            if (boyHs.size() >= boyCount) {
                break;
            }
//            This breaks the order of the two collections.
            Collections.shuffle(familyList);
            Collections.shuffle(boyList);
            boyHs.add(familyList.get(0) + boyList.get(0));
        }

        HashSet<String> girlHs = new HashSet<>();
        while (true) {
            if (girlHs.size() >= girlCount) {
                break;
            }
//            This breaks the order of the two collections.
            Collections.shuffle(familyList);
            Collections.shuffle(girlList);
            girlHs.add(familyList.get(0) + girlList.get(0));
        }

//        get the result
        ArrayList<String> result = new ArrayList<>();
        for (String boyName : boyHs) {
            Random r = new Random();
//            [18-66]
            int age = r.nextInt(49) + 18;
            result.add(boyName + "-男-" + age);
        }
        for (String girlName : girlHs) {
            Random r = new Random();
            int age = r.nextInt(49) + 18;
            result.add(girlName + "-女-" + age);
        }
        return result;
    }

    private static ArrayList<String> getData(String url, String regex, int index) throws IOException {
        /*    index:group[index] (0:all)*/
//        String str = webCrawler(url);
        String str = HttpUtil.get(url);//hutool type
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }
        return list;
    }

    private static String webCrawler(String net) throws IOException {
        URL url = new URL(net);
        StringBuilder sb = new StringBuilder();
        URLConnection conn = url.openConnection();
//        create a char stream
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        isr.close();
        return sb.toString();
    }
}
