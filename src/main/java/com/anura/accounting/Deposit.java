package com.anura.accounting;

public class Deposit implements Transaction {

    private final Amount amount;

    public Deposit(Amount amount) {
        this.amount = amount;
    }

    @Override
    public Balance execute(Balance balance) {
        return balance.add(amount);
    }

    @Override
    public void print(Printer printer) {
        printer.print(new Line("---------------Deposit " + amount + " : OK----------------"));
    }
}
