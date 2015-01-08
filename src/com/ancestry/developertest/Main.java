package com.ancestry.developertest;

public class Main {

    public static void main(String[] args) {
	    // Hello World
        System.out.println("Hello World!");

        Calculator adderCalculator = new Calculator(new Adder());
        Calculator subtractorCalculator = new Calculator(new Subtractor());
        Calculator multiplierCalculator = new Calculator(new Multiplier());

        System.out.println("Adding 5 + 6 = "+ adderCalculator.executeCalculation(5, 6));
        System.out.println("Subtracting 10 - 2 = "+ subtractorCalculator.executeCalculation(10, 2));
        System.out.println("Multiplying 20 * 6 = "+ multiplierCalculator.executeCalculation(20, 6));
    }
}
