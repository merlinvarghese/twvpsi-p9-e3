package com.tw.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthLengthUnitTest {
    @Test
    void expectUnitsToBeEqual(){
        double result = LengthUnit.KM.convertToBase(1);
        Assertions.assertEquals(100000, result);
    }

    @Test
    void expectKMToBaseToBeEqual() {
        double result = LengthUnit.M.convertToBase(1);
        Assertions.assertEquals(100, result);
    }
    @Test
    void expectINCHToBaseToBeEqual() {
        double result = LengthUnit.INCH.convertToBase(1);
        Assertions.assertEquals(2.5, result);
    }
    @Test
    void expectKGToGMBeNotEqual() {
        double result = LengthUnit.KG.convertToBase(1);
        Assertions.assertEquals(1000, result);
    }
    @Test
    void expectKGToCMBeNotEqual() {
        double result = LengthUnit.KG.convertToBase(1);
        Assertions.assertNotEquals(100, result);
    }
    @Test
    void expectGMToCMBeNotEqual() {
        double result = LengthUnit.CM.convertToBase(1);
        Assertions.assertNotEquals(1, result);
    }


}
