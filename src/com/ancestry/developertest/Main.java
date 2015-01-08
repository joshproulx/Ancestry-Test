package com.ancestry.developertest;

public class Main {

    public static void main(String[] args) {
	    // Hello World
        System.out.println("Hello World!");

        Calculator calculator = new Calculator();

        System.out.println("Adding 5 + 6 = "+ calculator.toString(calculator.add(5, 6)));
        System.out.println("Subtracting 10 - 2 = "+ calculator.toString(calculator.subtract(10, 2)));
        System.out.println("Multiplying 20 * 6 = "+ calculator.toString(calculator.multiply(20, 6)));
    }
}
