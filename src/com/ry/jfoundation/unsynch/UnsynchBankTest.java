package com.ry.jfoundation.unsynch;

import com.ry.jfoundation.threads.BankInThread;

public class UnsynchBankTest {
    private static final int NACCOUNTS = 100;
    private static final double INITIAL_BALANCE = 1000;
    private static final double MAX_AMOUNT = 1000;
    private static final int DELAY = 10;

    public static void main(String[] args) {
        var bank = new BankInThread(NACCOUNTS, INITIAL_BALANCE);
        for (int i = 0; i < NACCOUNTS; i++){
            int fromAccount = i;
            Runnable r = () -> {
                try {
                    while (true){
                        int toAccount = (int) (bank.size() * Math.random());
                        double amount = MAX_AMOUNT * Math.random();
                        bank.transfer(fromAccount, toAccount, amount);
                        Thread.sleep((int) (DELAY * Math.random()));
                    }
                } catch (InterruptedException e) {
                }
            };
            var t = new Thread(r);
            t.start();
        }
    }
}
