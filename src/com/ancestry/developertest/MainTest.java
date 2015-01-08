package com.ancestry.developertest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class MainTest {
    Calculator adderCalculator;
    Calculator subtractorCalculator;
    Calculator multiplierCalculator;

    @Before
    public void setUp() throws Exception {
        adderCalculator = new Calculator(new Adder());
        subtractorCalculator = new Calculator(new Subtractor());
        multiplierCalculator = new Calculator(new Multiplier());
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {
        // Simple base case
        Assert.assertTrue("5+6=11", (adderCalculator.executeCalculation(5, 6)==11));

        // Randomly test 100 number pairs between -32768 and +32768 being added together
        // We'll assume our adder is only valid for two byte signed integers
        for (int i=0; (i<100); i++) {
            Random rn = new Random();
            int rand1 = rn.nextInt(65536)-32768;
            int rand2 = rn.nextInt(65536)-32768;
            Assert.assertTrue("Adder Test("+i+"): "+rand1+"+"+rand2+"="+(rand1+rand2), (adderCalculator.executeCalculation(rand1, rand2)==(rand1+rand2)));
        }
    }

    @Test
    public void testSubtractor() throws Exception {
        // Simple base case
        Assert.assertTrue("10-2=8", (subtractorCalculator.executeCalculation(10, 2)==8));

        // Randomly test 100 number pairs between -16384 and +16384 being added together
        // We'll assume our adder is only valid for two byte signed integers
        for (int i=0; (i<100); i++) {
            Random rn = new Random();
            int rand1 = rn.nextInt(32768)-16384;
            int rand2 = rn.nextInt(32768)-16384;
            Assert.assertTrue("Subtractor Test("+i+"): "+rand1+"-"+rand2+"="+(rand1-rand2), (subtractorCalculator.executeCalculation(rand1, rand2)==(rand1-rand2)));
        }
    }

    @Test
    public void testMultiplier() throws Exception {
        // Simple base case
        Assert.assertTrue("20*6=120", (multiplierCalculator.executeCalculation(20, 6)==120));

        // Randomly test 100 number pairs between -181 and +181 being added together
        // We'll assume our adder is only valid for two byte signed integers
        for (int i=0; (i<100); i++) {
            Random rn = new Random();
            int rand1 = rn.nextInt(362)-181;
            int rand2 = rn.nextInt(362)-181;
            Assert.assertTrue("Subtractor Test("+i+"): "+rand1+"*"+rand2+"="+(rand1*rand2), (multiplierCalculator.executeCalculation(rand1, rand2)==(rand1*rand2)));
        }
    }

}