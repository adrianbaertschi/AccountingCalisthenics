package com.bilgin.accounting;

public class Deposit implements Transaction {

    private final Amount amount;

    public Deposit(Amount amount) {
        this.amount = amount;
    }

    @Override
    public Amount execute(Amount balance) {
        return amount.add(balance);
    }
}
