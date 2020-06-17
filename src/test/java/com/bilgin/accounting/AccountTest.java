package com.bilgin.accounting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    @Test
    public void testDepositCanBeDoneForAnAccount() {
        TestingPrinter printer = new TestingPrinter();
        Deposit deposit = new Deposit(new Amount(1200));
        Account account = new Account(printer);
        account.depositMoney(deposit);
        assertEquals(new Amount(1200), account.getBalance());
    }
}