package com.ry.jfoundation.synch.one;

import com.ry.jfoundation.threads.BankInThread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A bank with a number of bank accounts that uses lacks for serializing assess
 */
public class BankInSynchOne extends BankInThread {

    private final Lock bankLock;
    private final Condition sufficientFunds;

    /**
     * Constructs the bank
     * @param n              the number of accounts
     * @param initialBalance the initial balance for each account
     */

    public BankInSynchOne(int n, double initialBalance) {
        super(n, initialBalance);
        bankLock = new ReentrantLock();
        sufficientFunds = bankLock.newCondition();
    }

    public void transfer(int from, int to, double amount) throws InterruptedException{
        bankLock.lock();
        try {
            while(accounts[from] < amount){
                sufficientFunds.await();
            }
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            System.out.printf(" Total Balance: %10.2%n", getTotalBalace());
            sufficientFunds.signalAll();
        }finally {
            bankLock.unlock();
        }
    }

    /**
     * Gets the sum of all account balances
     * @return
     */
    private double getTotalBalace() {
        bankLock.lock();
        try {
            double sum = 0;

            for (double a : accounts){
                sum += a;
            }
            return sum;
        }finally {
            bankLock.unlock();
        }
    }

    /**
     * Gets the number of accounts in the bank.
     * @return
     */
    public int size(){
        return accounts.length;
    }
}
