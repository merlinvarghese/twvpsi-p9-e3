package com.tw.vapasi;

//Understands measurable extent of a particular kind.
public class Dimension {
    private final int value;
    private final String unit;

    public Dimension(int value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;

        if (other == null)
            return false;

        if (getClass() != other.getClass())
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
