package com.anura.accounting;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private final Printer printer;
    private final List<Transaction> transactions = new ArrayList<>();

    public Account(Printer printer) {
        this.printer = printer;
    }

    public void depositMoney(Deposit deposit) {
        transactions.add(deposit);
    }

    public void withdrawMoney(Withdrawal withdrawal) {
        transactions.add(withdrawal);
    }

    public Amount getBalance() {
        Amount finalAmount = new Amount(0);
        for (Transaction transaction : transactions) {
            finalAmount = transaction.execute(finalAmount);
        }
        return finalAmount;
    }

    public void printBalance() {
        printer.print(new Line("---------------Total Balance----------------"));
        printer.print(new Line("Amount: $" + getBalance()));
    }

    public void printTransactions() {
        printer.print(new Line("---------------Transactions----------------"));
        for (Transaction transaction : transactions) {
            transaction.print(printer);
        }
    }
}
