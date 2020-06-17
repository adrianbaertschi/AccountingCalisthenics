package com.bilgin.accounting;

import java.util.ArrayList;
import java.util.List;

public class TestingPrinter implements Printer {

    private final List<Line> lines = new ArrayList<>();

    @Override
    public void print(AccountNumber accountNumber) {
        Line line = new Line(accountNumber.toString());
        lines.add(line);
    }

    public Line lineOne() {
        return lines.get(0);
    }
}
