package com.zsm;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @program: features
 * @description: switch 增强
 * yield 只会跳出当前的语句块
 * @author: zhangsm
 * @create: 2021-09-15 17:22
 **/
public class Demo1 {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String typeOfDay = "";
        typeOfDay = switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                // do sth...
                System.out.println("tests");
                yield "Working Day";
            }
            case SATURDAY, SUNDAY -> "Day Off";
        };
    }
}
