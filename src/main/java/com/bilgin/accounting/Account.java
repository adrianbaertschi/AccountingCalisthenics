package com.bilgin.accounting;

public class Account {
    private final AccountNumber accountNumber;
    private final Printer printer;

    public Account(AccountNumber accountNumber, Printer printer) {
        this.accountNumber = accountNumber;
        this.printer = printer;
    }

    public void printAccountNumber() {
        printer.print(accountNumber);
    }
}
