package com.tw.vapasi;

class LengthUnit {
    static final LengthUnit CM = new LengthUnit(1);
    static final LengthUnit M = new LengthUnit(100);
    static final LengthUnit KM = new LengthUnit(100000);
    static final LengthUnit INCH = new LengthUnit(2.5);
    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
    double convertToBase(double magnitude) {
        return magnitude * this.conversionFactor;
    }
}
