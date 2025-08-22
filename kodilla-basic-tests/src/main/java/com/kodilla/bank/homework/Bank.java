package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] allCashMachines;

    public Bank() {
        this.allCashMachines = new CashMachine[]{
                new CashMachine(),
                new CashMachine(),
                new CashMachine()};
    }

    public double sumCashMachinesBilans() {
        double bilans = 0;
        for (int i = 0; i < allCashMachines.length; i++) {
            bilans += allCashMachines[i].sumSaldo();
        }
        return bilans;
    }

    public int sumOfWithdrawals() {
        int withdrawals = 0;
        for (int i = 0; i < allCashMachines.length; i++) {
            withdrawals += allCashMachines[i].getWithdrawals();
        }
        return withdrawals;
    }

    public int sumOfDeposits() {
        int deposits = 0;
        for (int i = 0; i < allCashMachines.length; i++) {
            deposits += allCashMachines[i].getDeposits();
        }
        return deposits;
    }

    public double AverageWithdrawal() {
        double sumOfWithdrawals = 0;
        int totalWithdrawals = 0;
        for (int i = 0; i < allCashMachines.length; i++) {
            sumOfWithdrawals += allCashMachines[i].getSumOfWithdrawal();
            totalWithdrawals += allCashMachines[i].getWithdrawals();
        }
        if (totalWithdrawals > 0) {
            return sumOfWithdrawals / (double) totalWithdrawals;
        } else {
            return 0;
        }
    }

    public double AverageDeposit() {
        double sumOfDeposits = 0;
        int totalDeposits = 0;
        for (int i = 0; i < allCashMachines.length; i++) {
            sumOfDeposits += allCashMachines[i].getSumOfDeposit();
            totalDeposits += allCashMachines[i].getDeposits();
        }
        if (totalDeposits > 0) {
            return sumOfDeposits / (double) totalDeposits;
        } else {
            return 0;
        }
    }

    public void addTransactionToMachine(int machineIndex, double amount) {
        if (machineIndex >= 0 && machineIndex < allCashMachines.length) {
            allCashMachines[machineIndex].addTransaction(amount);
        }
    }
}
