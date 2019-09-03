package com.tw.vapasi;

import java.util.Objects;

//Understands measurement of a particular kind.
public class LengthDimension {
    private final int value;
    private final LengthUnit unit;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        LengthDimension otherLengthDimension = (LengthDimension)obj;
        if(this.unit.equals(LengthUnit.KG) &&  !otherLengthDimension.unit.equals(LengthUnit.GM)) {
            return false;
        }
        return this.convertToBaseUnit() == otherLengthDimension.convertToBaseUnit();
    }

    private double convertToBaseUnit() {
        return this.unit.convertToBase(this.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.unit.hashCode() + this.value);
    }

    private LengthDimension(int value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    static LengthDimension centimeter(int value) {
        return new LengthDimension(value, LengthUnit.CM);
    }

    static LengthDimension meter(int value) {
        return new LengthDimension(value, LengthUnit.M);
    }

    static LengthDimension kilometer(int value) {
        return new LengthDimension(value, LengthUnit.KM);
    }
    static LengthDimension inch(int value) {
        return new LengthDimension(value, LengthUnit.INCH);
    }
    static LengthDimension kilogram(int value) {
        return new LengthDimension(value, LengthUnit.KG);
    }
    static LengthDimension gram(int value) {
        return new LengthDimension(value, LengthUnit.GM);
    }
}