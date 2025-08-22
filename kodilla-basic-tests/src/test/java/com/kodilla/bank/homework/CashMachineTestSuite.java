package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    private CashMachine cashMachine;

    @BeforeEach
    public void setup() {
        cashMachine = new CashMachine();
        cashMachine.addTransaction(550);
        cashMachine.addTransaction(-320);
        cashMachine.addTransaction(1360);
        cashMachine.addTransaction(0);
    }

    @Test
    public void shouldAddTransactionsCorrectly() {
        assertEquals(550, cashMachine.getTransactions()[0], 0.001);
        assertEquals(-320, cashMachine.getTransactions()[1], 0.001);
        assertEquals(1360, cashMachine.getTransactions()[2], 0.001);
        assertEquals(0, cashMachine.getTransactions()[3], 0.001);
    }

    @Test
    public void shouldCalculateCorrectSaldo() {
        assertEquals(1590, cashMachine.sumSaldo(), 0.001);
    }

    @Test
    public void shouldCountWithdrawalsCorrectly() {
        assertEquals(1, cashMachine.getWithdrawals());
    }

    @Test
    public void shouldCountDepositsCorrectly() {
        assertEquals(2, cashMachine.getDeposits());
    }

    @Test
    public void shouldReturnCorrectNumberOfTransactions() {
        assertEquals(4, cashMachine.numberOfTransactions());
    }

    @Test
    public void shouldReturnSumOfDeposits() {
        assertEquals(1910, cashMachine.getSumOfDeposit(), 0.001);
    }

    @Test
    public void shouldReturnSumOfWithdrawals() {
           assertEquals(-320, cashMachine.getSumOfWithdrawal(), 0.001);
    }
}