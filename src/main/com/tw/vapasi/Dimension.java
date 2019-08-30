package com.tw.vapasi;

import java.util.Objects;

//Understands measurement of a particular kind.
public class Dimension {
    private static final int CENTIMETER_EQUIVALENT_FOR_METER = 100;
    private static final int CENTIMETER_EQUIVALENT_FOR_KILOMETER = 100000;
    private static final String METER = "m";
    private static final String KILOMETER = "km";

    private final int value;
    private final String unit;

    Dimension(int value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        return compare((Dimension) obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value);
    }

    private Boolean compare(Dimension other) {
        int currentUnitInCms = convert(this.unit, this.value);

        int otherUnitInCms = convert(other.unit, other.value);

        return currentUnitInCms == otherUnitInCms;
    }

    private int convert(String unit, int value) {
        switch (unit) {
            case METER:
                return value * CENTIMETER_EQUIVALENT_FOR_METER;

            case KILOMETER:
                return value * CENTIMETER_EQUIVALENT_FOR_KILOMETER;
        }
        
        return value;
    }
}