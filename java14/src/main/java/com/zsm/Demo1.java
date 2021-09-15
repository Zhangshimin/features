package com.zsm;

/**
 * @program: features
 * @description: record
 * @author: zhangsm
 * @create: 2021-09-15 17:36
 **/
public class Demo1 {
    public static void main(String[] args) {
        User user = new User(1000,100,"zsm");
        if (user.isOld())
            System.out.println(user);
    }
}
