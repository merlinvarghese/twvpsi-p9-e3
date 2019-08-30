package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DimensionTest {
    @Test
    void expect100CmAnd1MeterAreEqual() {
        Dimension centimeter = new Dimension(100, "cm");
        Dimension meter = new Dimension(1, "m");

        boolean areEqual = centimeter.equals(meter);

        assertTrue(areEqual);
    }
}
