package com.anura.accounting;

public interface Transaction {

    Balance execute(Balance balance);

    void print(Printer printer);
}
