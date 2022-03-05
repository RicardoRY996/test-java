package com.ry.jfoundation;

import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        //read input
        Scanner in = new Scanner(System.in);
        System.out.println("How much money do you need to retire?");
        double goal = in.nextDouble();

        System.out.println("How much money will you contribute every year?");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        //update account balance while goal isn't reached
        while(balance < goal){
            //add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("You can retire in " + years + " years.");

        //练习
        test test = new test();
        test.test();

    }

    public static class test{
        void test(){
            Scanner in = new Scanner(System.in);
            System.out.println("How much money retire?");
            double goal = in.nextDouble();

            System.out.println("How much money you make every year?");
            double make_money_year = in.nextDouble();

            System.out.println("Rate by year?");
            double rate_year = in.nextDouble();

            double balance = 0;
            int year = 0;

            while (balance < goal){
                balance = balance + make_money_year;
                double year_rate_money = balance * rate_year / 100;
                balance = balance + year_rate_money;
                year++;
                System.out.println("第"+year+"年"+ "you get "+ balance+"$");
            }
            System.out.println("now your balance is 0,but after " + year + " years, you have " + balance + "$");

        }
    }
}
