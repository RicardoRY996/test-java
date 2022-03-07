package com.ry.jfoundation.compound.interest;

public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        //set interest rates to 10 ... 15%
        //设置五个不一样的利率
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++ )
            interestRate[j] = (STARTRATE + j) / 100.0;
        double[][] balances = new double[NYEARS][NRATES];

        //set initial balances to 10000
        //设置初始金额
        for (int j = 0; j < balances[0].length; j++)
            balances[0][j] = 10000;

        //compute interest for future years
        //计算
        for (int i = 1; i<balances.length; i++){
            for (int j = 0; j < balances[i].length; j++){
                //get last year's balances from previous row
                double oldBalance = balances[i - 1][j];

                //compute interest
                double interest = oldBalance * interestRate[j];

                //compute this year's balances
                balances[i][j] = oldBalance + interest;
            }
        }

        //print one row of interest rates
        for (int j = 0; j < interestRate.length; j++)
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        System.out.println();

        //print one row of interest rates
        //打印
        for (double[] row : balances){
            //print table row
            for (double b : row)
                System.out.printf("%10.2f",b);

            System.out.println();
        }

        //练习
        test test = new test();
        test.test();
    }
    public static class test{
        void test(){
            final int L = 5;
            final int H = 10;
            final double R = 10;

            double[][] number = new double[H][L];
            double[] rate = new double[L];

            for (int i = 0; i < rate.length; i++) {
                rate[i] = (R + i) / 100.0;
                System.out.printf("%9.0f%%",rate[i] * 100);
            }
            System.out.println();

            for (int m = 0; m < L; m++)
                number[0][m] = 10000.0;

            for (int i = 0; i < H-1; i++)
                for (int j = 0; j < L; j++){
                    number[i+1][j] = number[i][j] + number[i][j] * rate[j];
                }

            for (int i = 0; i < H; i++){
                for (int j = 0; j < L; j++){
                    System.out.printf("%10.2f",number[i][j]);

                }
            System.out.println();
            }




        }
    }

}
