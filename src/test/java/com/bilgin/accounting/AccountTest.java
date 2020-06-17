package com.bilgin.accounting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    @Test
    public void accountCreatedHasAccountNumber() {
        TestingPrinter printer = new TestingPrinter();
        Account account = new Account(new AccountNumber("123"), printer);
        account.printAccountNumber();

        assertEquals("Account 123", printer.lineOne().toString());
    }

}