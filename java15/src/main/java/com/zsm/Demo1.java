package com.zsm;

/**
 * @program: features
 * @description:
 * @author: zhangsm
 * @create: 2021-09-15 18:06
 **/
public class Demo1 {
}
sealed interface II permits I1, I2, I3, I4 {

}
final class I4 implements II{

}
final class I1 implements II{

}
final class I2 implements II{

}
final class I3 implements II{

}