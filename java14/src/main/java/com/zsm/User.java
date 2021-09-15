package com.zsm;

/**
 * @program: features
 * @description: 用户
 * @author: zhangsm
 * @create: 2021-09-15 17:37
 **/
public record User(int userId,int age,String name) {
    boolean isOld(){
        return this.age>50;
    }
}
