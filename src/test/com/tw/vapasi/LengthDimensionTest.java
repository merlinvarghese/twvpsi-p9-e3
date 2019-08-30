package com.tw.vapasi;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings("ALL")
class LengthDimensionTest {
    @Nested
    class BasicEqualsTest {
        @Test
        void expectTrueWhenBothDimensionsAreSame() {
            LengthDimension centimeter100 = new LengthDimension(100, "cm");

            boolean areEqual = centimeter100.equals(centimeter100);

            assertTrue(areEqual);
        }

        @Test
        void expectFalseWhenSecondDimensionIsNull() {
            LengthDimension centimeter100 = new LengthDimension(100, "cm");

            boolean areEqual = centimeter100.equals(null);

            assertFalse(areEqual);
        }

        @Test
        void expectFalseWhenBothDimensionAreOfDifferentType() {
            LengthDimension centimeter100 = new LengthDimension(100, "cm");

            boolean areEqual = centimeter100.equals(new String());

            assertFalse(areEqual);
        }
    }

    @Nested
    class DimensionsComparisonTest {
        @Test
        void expect100CmAnd1MeterAreEqual() {
            LengthDimension centimeter100 = new LengthDimension(100, "cm");
            LengthDimension meter1 = new LengthDimension(1, "m");

            boolean areEqual = centimeter100.equals(meter1);

            assertTrue(areEqual);
        }

        @Test
        void expect1KmAnd100MeterAreNotEqual() {
            LengthDimension kilometer1 = new LengthDimension(1, "km");
            LengthDimension meter100 = new LengthDimension(100, "m");

            boolean areEqual = kilometer1.equals(meter100);

            assertFalse(areEqual);
        }

        @Test
        void expect2KmAnd2000MeterAreEqual() {
            LengthDimension kilometer2 = new LengthDimension(2, "km");
            LengthDimension meter2000 = new LengthDimension(2000, "m");

            boolean areEqual = kilometer2.equals(meter2000);

            assertTrue(areEqual);
        }

        @Test
        void expect1KmAnd100000CentiMeterAreEqual() {
            LengthDimension kilometer1 = new LengthDimension(1, "km");
            LengthDimension centimeter100000 = new LengthDimension(100000, "cm");

            boolean areEqual = kilometer1.equals(centimeter100000);

            assertTrue(areEqual);
        }

        @Test
        void expect100000CentimeterAnd1KmAreEqual() {
            LengthDimension centimeter100000 = new LengthDimension(100000, "cm");
            LengthDimension kilometer1 = new LengthDimension(1, "km");

            boolean areEqual = centimeter100000.equals(kilometer1);

            assertTrue(areEqual);
        }

        @Test
        void expect100CentimeterAnd100CentimeterAreEqual() {
            LengthDimension firstCentimeter100 = new LengthDimension(100, "cm");
            LengthDimension secondCentimeter100 = new LengthDimension(100, "cm");

            boolean areEqual = firstCentimeter100.equals(secondCentimeter100);

            assertTrue(areEqual);
        }
    }
}