package com.anura.accounting;

import java.util.Objects;

public class Balance {
    final private int balance;

    public Balance(int amount) {
        this.balance = amount;
    }

    public void verifyTransaction(Withdrawal withdrawal) {
        withdrawal.verifyWithdrawalFrom(new Amount(balance));
    }

    public Balance add(Amount amount) {
        Amount current = new Amount(balance);
        current = current.add(amount);
        return current.toBalance();
    }

    @Override
    public String toString() {
        return new Amount(balance).toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Balance balance1 = (Balance) o;
        return balance == balance1.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance);
    }
}
