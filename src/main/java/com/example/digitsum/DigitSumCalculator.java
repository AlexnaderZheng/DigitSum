package com.example.digitsum;

import org.springframework.stereotype.Service;

@Service
public class DigitSumCalculator {
    private int usageCount = 0;

    public int calculateDigitSum(int num) {
        usageCount++;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }


    public int getUsageCount() {
        return usageCount;
    }
}


