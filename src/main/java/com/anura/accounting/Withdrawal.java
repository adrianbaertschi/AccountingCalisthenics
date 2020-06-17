package com.anura.accounting;

public class Withdrawal implements Transaction {
    private final Amount amount;

    public Withdrawal(Amount amount) {
        this.amount = amount;
    }

    @Override
    public Amount execute(Amount balance) {
        Amount negativeAmount = amount.negate();
        return balance.add(negativeAmount);
    }
}
