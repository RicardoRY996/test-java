package com.ry.jfoundation.synch.tow;

import com.ry.jfoundation.threads.BankInThread;

/**
 * A bank with a number of bank accounts that uses synchronization primitives
 */
public class BankInSynchTow extends BankInThread {


    /**
     * Constructs the bank
     *
     * @param n              the number of accounts
     * @param initialBalance the initial balance for each account
     */
    public BankInSynchTow(int n, double initialBalance) {
        super(n, initialBalance);
    }

    /**
     * Transfers money from one account to another.
     * @param from the account to transfer from
     * @param to the account to transfer to
     * @param amount the amount to transfer
     * @throws InterruptedException
     */
    public synchronized void transfer(int from, int to, double amount) throws InterruptedException {
        while (accounts[from] < amount){
            wait();
        }
        System.out.print(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
        notifyAll();
    }

    /**
     * Gets the sum of all account balances
     * @return
     */
    public synchronized double getTotalBalance(){
        double sum = 0;

        for (double a : accounts){
            sum += a;
        }
        return sum;
    }

    /**
     * Gets the number of accounts in the bank.
     * @return the number of accounts
     */
    @Override
    public int size() {
        return super.size();
    }
}
