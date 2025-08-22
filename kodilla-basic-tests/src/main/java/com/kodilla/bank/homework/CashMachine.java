package com.kodilla.bank.homework;

public class CashMachine {

    private double[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new double[0];
    }

    public void addTransaction(double value) {
        size++;
        double[] newTab = new double[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = value;
        this.transactions = newTab;
    }

    public double[] getTransactions() {
        return transactions;
    }

    public double sumSaldo() {
        double saldo = 0;
        for (int i = 0; i < transactions.length; i++) {
            saldo += transactions[i];
        }
        return saldo;
    }

    public int numberOfTransactions() {
        return transactions.length;
    }

    public int getWithdrawals() {
        int numberOfWithdrawals = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                numberOfWithdrawals++;
            }
        }
        return numberOfWithdrawals;
    }

    public int getDeposits() {
        int numberOfDeposits = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                numberOfDeposits++;
            }
        }
        return numberOfDeposits;
    }

    public double getSumOfWithdrawal() {
        double sumOfWithdrawals = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                sumOfWithdrawals += transactions[i];
            }
        }
        return sumOfWithdrawals;
    }

    public double getSumOfDeposit() {
        double sumOfDeposits = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                sumOfDeposits += transactions[i];
            }
        }
        return sumOfDeposits;
    }
}
