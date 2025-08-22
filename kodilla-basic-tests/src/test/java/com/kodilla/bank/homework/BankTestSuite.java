package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    private Bank bank;

    @BeforeEach
    public void setup() {
        bank = new Bank();
        bank.addTransactionToMachine(0, 100);
        bank.addTransactionToMachine(0, -50);
        bank.addTransactionToMachine(1, 500);
        bank.addTransactionToMachine(1, 0);
        bank.addTransactionToMachine(2, 2250);
        bank.addTransactionToMachine(2, -800);
    }

    @Test
    public void shouldSumBilansCorrectly() {
        assertEquals(2000, bank.sumCashMachinesBilans(), 0.001);
    }

    @Test
    public void shouldSumWithdrawalsCorrectly() {
        assertEquals(2, bank.sumOfWithdrawals(), 0.001);
    }

    @Test
    public void shouldSumDepositsCorrectly() {
        assertEquals(3, bank.sumOfDeposits(), 0.001);
    }

    @Test
    public void shouldCountAverageWithdrawalCorrectly() {
        assertEquals(-425, bank.AverageWithdrawal(), 0.001);
    }

    @Test
    public void shouldCountAverageDepositCorrectly() {
        assertEquals(950, bank.AverageDeposit(), 0.001);
    }
}
