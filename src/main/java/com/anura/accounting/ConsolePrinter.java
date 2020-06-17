package com.anura.accounting;

public class ConsolePrinter implements Printer {
    @Override
    public void print(AccountNumber accountNumber) {
        System.out.println(accountNumber.toString());;
    }
}
