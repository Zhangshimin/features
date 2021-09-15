package com.zsm;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @program: features
 * @description: switch 语法优化
 * @author: zhangsm
 * @create: 2021-09-15 16:56
 **/
public class Demo1 {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String typeOfDay = "";
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                typeOfDay = "Working Day";
                break;
            case SATURDAY:
            case SUNDAY:
                typeOfDay = "Day Off";
        }
        System.out.println(typeOfDay);

        // 12
        String typeOfDay2 = switch (dayOfWeek) {
            case MONDAY, THURSDAY, WEDNESDAY, TUESDAY, FRIDAY -> "wroking Day";
            case SUNDAY, SATURDAY -> "ss";
        };

        switch (dayOfWeek){
            case SATURDAY -> {
                System.out.println("test");
                System.out.println("test");
                System.out.println("test");
                System.out.println("test");

            }
            default -> System.out.println("default");
        }
    }
}
