package com.anura.accounting;

import java.util.Objects;

public class Amount {
    private final Integer cents;

    public Amount(Integer cents) {
        this.cents = cents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amount)) return false;
        Amount amount = (Amount) o;
        Integer otherCents = amount.cents;
        return cents.equals(otherCents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cents);
    }

    @Override
    public String toString() {
        return String.valueOf(cents / 100);
    }

    public Amount add(Amount amount) {
        return new Amount(cents + amount.cents);
    }
}
