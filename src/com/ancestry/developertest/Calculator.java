package com.ancestry.developertest;

public class Calculator {

    private Calculation calculation;

    public Calculator(Calculation calculation) {
        this.calculation = calculation;
    }

    public int executeCalculation(int numberA, int numberB) {
        return this.calculation.calculation(numberA, numberB);
    }

}
