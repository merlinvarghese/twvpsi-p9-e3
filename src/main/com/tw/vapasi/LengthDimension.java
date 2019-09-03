package com.tw.vapasi;

import java.util.Objects;

//Understands measurement of a particular kind.
public class LengthDimension {
    private static final int CM_EQUIVALENT_FOR_M = 100;
    private static final int CM_EQUIVALENT_FOR_KM = 100000;

    private final int value;
    private final Unit unit;

    public enum Unit {
        KM,
        M,
        CM
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        LengthDimension otherLengthDimension = (LengthDimension)obj;
        return this.convert() == otherLengthDimension.convert();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.unit.hashCode() + this.value);
    }

    private int convert() {
        switch (unit) {
            case M:
                return value * CM_EQUIVALENT_FOR_M;

            case KM:
                return value * CM_EQUIVALENT_FOR_KM;
        }

        return value;
    }

    private LengthDimension(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    static LengthDimension centimeter(int value) {
        return new LengthDimension(value, Unit.CM);
    }

    static LengthDimension meter(int value) {
        return new LengthDimension(value, Unit.M);
    }

    static LengthDimension kilometer(int value) {
        return new LengthDimension(value, Unit.KM);
    }
}