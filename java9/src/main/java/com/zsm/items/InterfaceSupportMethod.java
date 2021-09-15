package com.zsm.items;

/**
 * @program: features
 * @description:  1.8 支持 default 方法，但是是可以被覆盖逻辑的，
 * 9增加的 私有方法
 * @author: zhangsm
 * @create: 2021-09-14 17:00
 **/
public interface InterfaceSupportMethod {

    default String getName(){
       return method()+"ss";
    }
    private String method(){
        return "method";
    }
}
