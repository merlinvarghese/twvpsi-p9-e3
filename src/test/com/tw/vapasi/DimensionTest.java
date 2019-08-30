package com.tw.vapasi;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings("ALL")
class DimensionTest {
    @Nested
    class BasicEqualsTest {
        @Test
        void expectTrueWhenBothDimensionsAreSame() {
            Dimension centimeter100 = new Dimension(100, "cm");

            boolean areEqual = centimeter100.equals(centimeter100);

            assertTrue(areEqual);
        }

        @Test
        void expectFalseWhenSecondDimensionIsNull() {
            Dimension centimeter100 = new Dimension(100, "cm");

            boolean areEqual = centimeter100.equals(null);

            assertFalse(areEqual);
        }

        @Test
        void expectFalseWhenBothDimensionAreOfDifferentType() {
            Dimension centimeter100 = new Dimension(100, "cm");

            boolean areEqual = centimeter100.equals(new String());

            assertFalse(areEqual);
        }
    }

    @Test
    void expect100CmAnd1MeterAreEqual() {
        Dimension centimeter100 = new Dimension(100, "cm");
        Dimension meter1 = new Dimension(1, "m");

        boolean areEqual = centimeter100.equals(meter1);

        assertTrue(areEqual);
    }

    @Test
    void expect1KmAnd100MeterAreNotEqual() {
        Dimension kilometer1 = new Dimension(1, "km");
        Dimension meter100 = new Dimension(100, "m");

        boolean areEqual = kilometer1.equals(meter100);

        assertFalse(areEqual);
    }

    @Test
    void expect1KmAnd100000CentiMeterAreEqual() {
        Dimension kilometer1 = new Dimension(1, "km");
        Dimension centimeter100000 = new Dimension(100000, "cm");

        boolean areEqual = kilometer1.equals(centimeter100000);

        assertTrue(areEqual);
    }

    @Test
    void expect100000CentimeterAnd1KmAreEqual() {
        Dimension centimeter100000 = new Dimension(100000, "cm");
        Dimension kilometer1 = new Dimension(1, "km");

        boolean areEqual = centimeter100000.equals(kilometer1);

        assertTrue(areEqual);
    }

    @Test
    void expect100CentimeterAnd100CentimeterAreEqual() {
        Dimension firstCentimeter100 = new Dimension(100, "cm");
        Dimension secondCentimeter100 = new Dimension(100, "cm");

        boolean areEqual = firstCentimeter100.equals(secondCentimeter100);

        assertTrue(areEqual);
    }
}