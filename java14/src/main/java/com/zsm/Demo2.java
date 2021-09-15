package com.zsm;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: features
 * @description: 空指针
 * @author: zhangsm
 * @create: 2021-09-15 17:42
 **/
public class Demo2 {
    public static void main(String[] args) {
        Map<String, Map<String,Boolean>> wrapMap = new HashMap<>();
        HashMap<String, Boolean> stringBooleanHashMap = new HashMap<>();
        wrapMap.put("innerMap", stringBooleanHashMap);
        boolean effected = wrapMap.get("innerMap").get("effected");
    }
}
