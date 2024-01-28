package org.ddiachenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    SumCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        calculator = new SumCalculator();
    }

    @Test
    void sum1Return1Test() {
        Assertions.assertEquals(1, calculator.sum(1));
    }

    @Test
    void sum3Return6Test() {
        Assertions.assertEquals(6, calculator.sum(3));
    }

    @Test
    void sum0ThrowsException(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> calculator.sum(0), "Assertion wasn't throw");
    }
}