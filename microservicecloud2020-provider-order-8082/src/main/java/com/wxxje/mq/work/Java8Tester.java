package com.wxxje.mq.work;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Java8Tester
{
    public static void main(String[] args)
    {
        // 获取当前的日期时间
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间"+ currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1:"+ date1);

        Month month = Month.of(10);
        System.out.println(month.minLength());
        System.out.println("月份"+month);
    }
}
