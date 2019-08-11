package com.sda.javarzw7.programowanie1.day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @DisplayName("Test abs")
    @Test

    void testCalcAbs(){
        Assertions.assertEquals(MathUtils.calcAbs(-100),100);
    }

    @DisplayName("Test Factorial")
    @Test
    void zadanie2(){
        Assertions.assertThrows(WrongNumberException.class, ()->MathUtils.calcFactorial(-30));
        Assertions.assertEquals(MathUtils.calcFactorial(0),1);
        Assertions.assertEquals(MathUtils.calcFactorial(10),3628800);
    }

    @DisplayName("Test isPrimary")
    @Test
    void zadanie3(){
        Assertions.assertThrows(WrongNumberException.class, ()->MathUtils.isPrimary(1));

        Assertions.assertEquals(MathUtils.isPrimary(10),false);
    }

}