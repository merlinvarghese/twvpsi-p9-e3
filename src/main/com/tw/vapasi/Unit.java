package com.tw.vapasi;

public enum Unit {
    CM(1),
    M(100),
    KM(100000);

    private final double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return this.conversionFactor;
    }
}
