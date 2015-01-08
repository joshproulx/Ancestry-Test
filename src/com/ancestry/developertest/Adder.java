package com.ancestry.developertest;

public class Adder extends CalculatorAbstract implements Calculation {

    public int calculation(int numberA, int numberB) {
        return numberA + numberB;
    }

}
