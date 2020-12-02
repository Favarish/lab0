package com.example.lab0;

import junit.framework.TestCase;

import org.junit.Assert;

public class MainActivityTest extends TestCase {

    public void testMin() {
        int a = 10;
        int b = 2;

        int result = MainActivity.min(a, b);
        Assert.assertEquals(2, result);
    }

    public void testMin2() {
        int a = -2;
        int b = 100;

        assertFalse(false);
        int result = MainActivity.min(a, b);
        Assert.assertEquals(-2, result);
    }

    public void testMin3() {
        int a = -1;
        int b = -10;

        int result = MainActivity.min(a, b);
        Assert.assertEquals(-10, result);
    }

    public void testMin4() {
        int a = 0;
        int b = 0;

        int result = MainActivity.min(a, b);
        Assert.assertEquals(0, result);
    }

    public void testMax() {
        int a = 10;
        int b = 2;

        int result = MainActivity.max(a, b);
        Assert.assertEquals(10, result);
    }

    public void testMax2() {
        int a = 0;
        int b = 2;

        int result = MainActivity.max(a, b);
        Assert.assertEquals(2, result);
    }

    public void testMax3() {
        int a = -123;
        int b = -120;

        int result = MainActivity.max(a, b);
        Assert.assertEquals(-120, result);
    }

    public void testMax4() {
        int a = 0;
        int b = 0;

        int result = MainActivity.max(a, b);
        Assert.assertEquals(0, result);
    }
}