package com.anura.accounting;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestingPrinter implements Printer {

    private final List<Line> lines = new ArrayList<>();

    @Override
    public void print(Line line) {
        lines.add(line);
    }

    public void assertHasLines(Lines lines) {
        assertEquals(lines, new Lines(this.lines));
    }
}
