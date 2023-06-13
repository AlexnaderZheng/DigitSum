package com.example.digitsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitSumCalculatorTest {
        DigitSumCalculator calculator = new DigitSumCalculator();
        @Test
        public void digitSumTest(){
            int tc1 = 1234;
            double expect1 = 10;
            double res1 = calculator.calculateDigitSum(tc1);
            assertEquals(expect1, res1);

            int tc2 = 123;
            double expect2 = 6;
            double res2 = calculator.calculateDigitSum(tc2);
            assertEquals(expect2, res2);
        }
}
