package com.ancestry.developertest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {
        Main main = new Main();
        Assert.assertTrue("5+6=11", (main.add(5, 6)==11));

        // Randomly test 100 number pairs between -32768 and +32768 being added together
        // We'll assume our adder is only valid for two byte signed integers
        for (int i=0; (i<100); i++) {
            Random rn = new Random();
            int rand1 = rn.nextInt(65536)-32768;
            int rand2 = rn.nextInt(65536)-32768;
            Assert.assertTrue("Test("+i+"): "+rand1+"+"+rand2+"="+(rand1+rand2), (main.add(rand1, rand2)==(rand1+rand2)));
        }
    }
}