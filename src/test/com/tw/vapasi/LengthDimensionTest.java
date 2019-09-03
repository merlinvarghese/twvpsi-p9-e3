package com.tw.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.tw.vapasi.LengthDimension.centimeter;
import static com.tw.vapasi.LengthDimension.kilometer;
import static com.tw.vapasi.LengthDimension.meter;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SuppressWarnings("ALL")
class LengthDimensionTest {
    @Nested
    class BasicEqualsTest {
        @Test
        void expect100CmsAnd100CmsAreEqual() {
            assertEquals(centimeter(100), centimeter(100));
        }

        @Test
        void expect100CmsAndNullNotEqual() {
            assertNotEquals(centimeter(100), null);
        }

        @Test
        void expect100CmsAndAnotherObjectOfDifferentTypeAreNotEqual() {
            assertNotEquals(centimeter(100), new String());
        }
    }

    @Nested
    class DimensionsComparisonTest {
        @Test
        void expect100CmAnd1MeterAreEqual() {
            assertEquals(centimeter(100), meter(1));
        }

        @Test
        void expect1KmAnd100MeterAreNotEqual() {
            assertNotEquals(kilometer(1), meter(100));
        }

        @Test
        void expect2KmAnd2000MeterAreEqual() {
            assertEquals(kilometer(2), meter(2000));
        }

        @Test
        void expect1KmAnd100000CentiMeterAreEqual() {
            assertEquals(kilometer(1), centimeter(100000));
        }

        @Test
        void expect100000CentimeterAnd1KmAreEqual() {
            assertEquals(centimeter(100000), kilometer(1));
        }

        @Test
        void expect100CentimeterAnd100CentimeterAreEqual() {
            assertEquals(centimeter(100), centimeter(100));
        }



    }
}