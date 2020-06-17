package com.bilgin.accounting;

import java.util.Objects;

public class Line {
    private final String value;

    public Line(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Line{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        String lineValue = line.value;
        return value.equals(lineValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
