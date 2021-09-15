package com.zsm.items;

import java.io.*;

/**
 * @program: features
 * @description: try catch resources  自动关闭资源
 * @author: zhangsm
 * @create: 2021-09-15 14:23
 **/
public class Demo3 {
    public static void main(String[] args) throws IOException {
        //1.7

        try(InputStream resourceAsStream = Demo3.class.getClassLoader().getResourceAsStream("a.json"))
        {
         System.out.println(new String(resourceAsStream.readAllBytes()));
        }
        //9
        InputStream resourceAsStream = Demo3.class.getClassLoader().getResourceAsStream("a.json");
        try(resourceAsStream)
        {
            System.out.println(new String(resourceAsStream.readAllBytes()));
        }
        try {
            System.out.println(new String(resourceAsStream.readAllBytes()));
        }catch (Exception e){
          System.out.println(e);
        }
    }
}
