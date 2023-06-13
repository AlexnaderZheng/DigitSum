package com.example.digitsum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigitSumController {
    private final DigitSumCalculator digitSumCalculator;

    @Autowired
    public DigitSumController(DigitSumCalculator digitSumCalculator){
        this.digitSumCalculator = digitSumCalculator;
    }

    @RequestMapping("/digitSum")
    public int digitSum(int number){
        return digitSumCalculator.calculateDigitSum(number);
    }

    @RequestMapping("/usageCount")
    public int usageCount() {
        return digitSumCalculator.getUsageCount();
    }
}
