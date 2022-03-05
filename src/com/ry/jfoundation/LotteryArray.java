package com.ry.jfoundation;

public class LotteryArray {
    public static void main(String[] args) {
        final int NMAX = 10;

        //allocate triangular array
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++)
            odds[n] = new int[n + 1];

        //fill triangular array
        for (int n = 0; n < odds.length; n++)
            for (int k = 0;k < odds[n].length; k++){
                /*
                compute binomial coefficient n*(n-1)*(n-2)...(n-k+1)/(1*2*3*...*k)
                 */
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;

                odds[n][k] = lotteryOdds;
            }

        //print triangular array
        for (int[] row : odds){
            for (int odd : row)
                System.out.printf("%4d", odd);
            System.out.println();
        }

        //练习
        test test = new test();
        test.test();
    }

    public static class test{
        void test(){
            final int NMAX = 3;

            int[][] odds = new int[NMAX][];
            for (int i = 0; i < NMAX; i++)
                odds[i] = new int[i + 1];
//
            for (int n = 0; n < odds.length; n++){
                for (int j = 0; j < odds[n].length; j++){
                    int lotteryOdds = 1;
                    for (int i = 1; i <= j; i++)
                        lotteryOdds = lotteryOdds * (n - i + 1) / i;

                    odds[n][j] = lotteryOdds;
                }
            }

            for (int[] row : odds){
                for (int odd : row)
                    System.out.printf("%4d", odd);
                System.out.println();
            }
        }
    }
}
