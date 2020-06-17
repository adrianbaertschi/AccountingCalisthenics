package com.anura.accounting;

public class Withdrawal implements Transaction {
    private final Amount amount;
    private TransactionStatus status = TransactionStatus.OK;

    public Withdrawal(Amount amount) {
        this.amount = amount;
    }

    @Override
    public Balance execute(Balance balance) {
        Amount negativeAmount = amount.negate();
        return balance.add(negativeAmount);
    }

    @Override
    public void print(Printer printer) {
        printer.print(new Line("---------------Withdraw " + amount + " : " + status + "----------------"));
    }

    public void failed() {
        status = TransactionStatus.FAIL;
    }

    public void verifyWithdrawalFrom(Amount balance) {
        amount.ifGreaterThan(balance, this::failed);
    }
}
