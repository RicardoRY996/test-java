package com.ry.jfoundation.biginteger.test;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        /*
        compute binomial coefficient n*(n-1)*(n-2)...(1*2*3...*k)
         */
        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - 1 + 1)).divide(
                    BigInteger.valueOf(i)
            );

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");

    }
}
