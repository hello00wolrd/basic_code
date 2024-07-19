package com.whu.a03Test;

public class NameFormatException extends RuntimeException {
    //    自定义一个异常
/*
* 自定义异常
①定义异常类
②写继承关系
③空参构造
④带参构造
*/
    public NameFormatException(String message) {
        super(message);
    }

    public NameFormatException() {
    }
}
