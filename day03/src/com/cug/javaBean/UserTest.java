package com.cug.javaBean;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = user1;
//        两者指向同一内存堆空间
        user1.setAge(20);
        System.out.println(user2);
        System.out.println(user1);
//        com.cug.javaBean.User@3b9a45b3
//        com.cug.javaBean.User@3b9a45b3
//        user1 = null;
        System.out.println(user1);
        System.out.println(user2);
//        user2 = null;
//      此时没有指针指向堆空间中开辟的对象区域，
//      此时对象空间被当成垃圾回收。
        System.out.println(user2);
        user1.setUsername("张三");
        System.out.printf("%s是user1", user1.getUsername());
        //注意是printf
    }
}
