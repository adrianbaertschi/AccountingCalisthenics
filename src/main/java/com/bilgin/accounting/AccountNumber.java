package com.bilgin.accounting;

public class AccountNumber {
    private final String accountNumber;

    public AccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "AccountNumber{" +
                "accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
