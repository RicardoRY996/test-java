package com.ry.jfoundation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();//当前时间
        int month = date.getMonthValue();//当前月份
        int today = date.getDayOfMonth();//当前日期

        date = date.minusDays(today - 1);//set to start of month
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();//1 = monday,...,7 = sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print("    ");
        while(date.getMonthValue() == month){
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();


        test test = new test();
        test.test();
    }

    public static class test{
        void test(){
            LocalDate date = LocalDate.now();
            int dayOfMonth = date.getDayOfMonth();
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            date = date.minusDays(dayOfMonth - 1);//当前月份的开始日期是周几
            int month = date.getMonthValue();

            System.out.println("Mon Tus Wen Thu Fri Sat Sun");
            System.out.print("    ");

            while (month == date.getMonthValue() ){
                System.out.printf("%3d",date.getDayOfMonth());
                if (date.getDayOfMonth() == dayOfMonth)
                    System.out.print("*");
                else
                    System.out.print(" ");
                date = date.plusDays(1);
                if (date.getDayOfWeek().getValue() == 1) System.out.println();
            }
            if (date.getDayOfWeek().getValue() != 1 ) System.out.println();

        }
    }

}
