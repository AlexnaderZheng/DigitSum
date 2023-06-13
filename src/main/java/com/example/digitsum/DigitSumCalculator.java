package com.example.digitsum;

import org.springframework.stereotype.Service;

@Service
public class DigitSumCalculator {
    public int calculateDigitSum(int num){
        int sum = 0;
        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}


