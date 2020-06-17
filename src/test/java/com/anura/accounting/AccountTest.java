package com.anura.accounting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    @Test
    public void testDepositCanBeDoneForAnAccount() {
        Account account = new Account(new TestingPrinter());

        account.depositMoney(new Deposit(new Amount(1200)));

        assertEquals(new Amount(1200), account.getBalance());
    }

    @Test
    public void testAddTwoDepositsForAnAccount() {
        Account account = new Account(new TestingPrinter());

        account.depositMoney(new Deposit(new Amount(1200)));
        account.depositMoney(new Deposit(new Amount(700)));

        assertEquals(new Amount(1900), account.getBalance());
    }

    @Test
    public void testPrintsBalance() {
        TestingPrinter printer = new TestingPrinter();
        Deposit deposit = new Deposit(new Amount(1200));
        Account account = new Account(printer);

        account.depositMoney(deposit);
        account.printBalance();

        printer.assertHasLines(new Lines(
                "---------------Total Balance----------------\n" +
                        "Amount: $12"));
    }

    @Test
    public void testWithdrawalCanBeDoneForAnAccount() {
        Account account = new Account(new TestingPrinter());

        account.depositMoney(new Deposit(new Amount(1200)));
        account.depositMoney(new Deposit(new Amount(700)));
        account.withdrawMoney(new Withdrawal(new Amount(400)));

        assertEquals(new Amount(1500), account.getBalance());
    }

    @Test
    public void testprintTransactions() {
        TestingPrinter printer = new TestingPrinter();
        Account account = new Account(printer);

        account.depositMoney(new Deposit(new Amount(1200)));
        account.depositMoney(new Deposit(new Amount(700)));
        account.withdrawMoney(new Withdrawal(new Amount(400)));
        account.printTransactions();

        printer.assertHasLines(new Lines(
                        "---------------Transactions----------------\n" +
                        "---------------Deposit 12 : OK----------------\n" +
                        "---------------Deposit 7 : OK----------------\n" +
                        "---------------Withdraw 4 : OK----------------\n"));
    }
}