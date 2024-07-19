package com.whu.ExceptionDemo;
//自己处理异常

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        如果我们需要捕获多个异常,而且异常中存在父子关系的话,那么父类一定要写在下面

        try {
            System.out.println(arr[10]); //ArrayIndexOutOfBoundsException
            System.out.println(2 / 0); //ArithmeticException
            String s = null;
            System.out.println(s.equals("abc"));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界了");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println("看看我执行了吗?");


    }
}
