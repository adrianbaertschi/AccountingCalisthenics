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


    public Amount getBalance() {
        Amount finalAmount = new Amount(0);
        for (Transaction transaction : transactions) {
            finalAmount = transaction.execute(finalAmount);
        }
        return finalAmount;
    }
}