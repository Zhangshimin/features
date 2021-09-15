package com.zsm;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @program: features
 * @description: stream 支持var
 * @author: zhangsm
 * @create: 2021-09-15 14:45
 **/
public class Demo1 {
    public static void main(String[] args) {
        List<String> stringList = Lists.newArrayList("aaaa","bbbb");
        stringList.stream().forEach((var o)->{
            System.out.println(o);
        });
    }
}
