package com.anura.accounting;

public interface Transaction {

    Amount execute(Amount balance);

    void print(Printer printer);
}
