package com.tw.vapasi;

import java.util.Objects;

//Understands measurable extent of a particular kind.
public class Dimension {
    private final int value;
    private final String unit;

    public Dimension(int value, String unit) {
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

        Dimension other = (Dimension)obj;
        switch(unit) {
            case "cm":
                if (!other.unit.equals("m"))
                    return false;

                if (value == 100 && other.value == 1)
                    return true;

            case "km":
                if (!other.unit.equals("m"))
                    return false;

                if (value == 1 && other.value == 1000)
                    return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
