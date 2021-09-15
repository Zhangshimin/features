package com.zsm;

/**
 * @program: features
 * @description: instanceof  强制类型转换
 * @author: zhangsm
 * @create: 2021-09-15 17:19
 **/
public class Demo2 {
    public static void main(String[] args) {
        //
        Object ss = "ss";
        if (ss instanceof String){
            String s = (String) ss;
            System.out.println(s);
        }
        if (ss instanceof String s){
            System.out.println(s);
        }
    }
}
