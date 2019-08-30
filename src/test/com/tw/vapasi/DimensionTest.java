package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DimensionTest {
    @Test
    void expect100CmAnd1MeterAreEqual() {
        Dimension centimeter = new Dimension(100, "cm");
        Dimension meter = new Dimension(1, "m");

        boolean areEqual = centimeter.equals(meter);

        assertTrue(areEqual);
    }

    @Test
    void expect1KmAnd100MeterAreNotEqual() {
        Dimension kilometer = new Dimension(1, "km");
        Dimension meter = new Dimension(100, "m");

        boolean areEqual = kilometer.equals(meter);

        assertFalse(areEqual);
    }

}
