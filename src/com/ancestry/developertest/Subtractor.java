package com.ancestry.developertest;

public class Subtractor extends CalculatorAbstract implements Calculation {

    public int calculation(int numberA, int numberB) {
        return numberA - numberB;
    }

}
