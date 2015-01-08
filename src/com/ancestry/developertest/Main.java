package com.ancestry.developertest;

public class Main implements AdderInterface {

    public int add(int numberA, int numberB) {
        return numberA + numberB;
    }

    public static void main(String[] args) {
	    // Hello World
        System.out.println("Hello World!");

        Main main = new Main();

        System.out.println("Adding 5 + 6 = "+main.add(5, 6));
    }
}
