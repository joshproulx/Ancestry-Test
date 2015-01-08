package com.ancestry.developertest;

public class Calculator extends CalculatorAbstract implements AdderInterface, SubtractorInterface, MultiplierInterface {

    public int add(int numberA, int numberB) {
        return numberA + numberB;
    }

    public int subtract(int numberA, int numberB) {
        return numberA - numberB;
    }

    public int multiply(int numberA, int numberB) {
        return numberA * numberB;
    }

}
