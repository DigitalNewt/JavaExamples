package com.gwt.example.server;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * User: Brent Baker
 * Date: 2/20/15
 * Time: 6:57 PM
 */
public class TestRandomNumberTracker {

    @Test
    public void testGetRandomNumber() {
        RandomNumberTracker numberTracker = new RandomNumberTracker();
        double number = numberTracker.getRandomNumber();
        assertNotNull(number);

    }

    @Test
    public void testGetFirstDigit() {
        RandomNumberTracker numberTracker = new RandomNumberTracker();
        assertEquals(0, numberTracker.getFirstDigit(1.0));
        assertEquals(1, numberTracker.getFirstDigit(0.1));
        assertEquals(2, numberTracker.getFirstDigit(0.2));
        assertEquals(9, numberTracker.getFirstDigit(0.9));
        assertEquals(0, numberTracker.getFirstDigit(0.0));
    }

    @Test
    public void testGenerateRandomNumbers() {
        RandomNumberTracker numberTracker = new RandomNumberTracker();
        int[] numberCountList = numberTracker.getFirstDigitNumberCounts(10);
        assertTrue(numberCountList.length == 10);
    }

    @Test
    public void testFirstDigitNumberReport() {
        RandomNumberTracker numberTracker = new RandomNumberTracker();
        List<FirstDigitCount> report = numberTracker.getFirstDigitCountReport(0);
        assertTrue(report.size() == 0);
        report = numberTracker.getFirstDigitCountReport(1);
        assertTrue(report.size() > 0);

    }
}
