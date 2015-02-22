package com.landisgyr.randomnumbertracker.server;

import com.landisgyr.randomnumbertracker.client.FirstDigitCount;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * User: Brent Baker
 * Date: 2/20/15
 * Time: 10:34 PM
 */
public class TestRandomNumberTracker {
    @Test
    public void testGetRandomNumber() {
        RandomNumberTrackerServiceImpl numberTracker = new RandomNumberTrackerServiceImpl();
        double number = numberTracker.getRandomNumber();
        assertNotNull(number);

    }

    @Test
    public void testGetFirstDigit() {
        RandomNumberTrackerServiceImpl numberTracker = new RandomNumberTrackerServiceImpl();
        assertEquals(0, numberTracker.getFirstDigit(1.0));
        assertEquals(1, numberTracker.getFirstDigit(0.1));
        assertEquals(2, numberTracker.getFirstDigit(0.2));
        assertEquals(9, numberTracker.getFirstDigit(0.9));
        assertEquals(0, numberTracker.getFirstDigit(0.0));
    }

    @Test
    public void testGenerateRandomNumbers() {
        RandomNumberTrackerServiceImpl numberTracker = new RandomNumberTrackerServiceImpl();
        int[] numberCountList = numberTracker.getFirstDigitNumberCounts(10);
        assertTrue(numberCountList.length == 10);
    }

    @Test
    public void testFirstDigitNumberReport() {
        RandomNumberTrackerServiceImpl numberTracker = new RandomNumberTrackerServiceImpl();
        List<FirstDigitCount> report = numberTracker.getFirstDigitCountReport(0);
        assertTrue(report.size() == 0);
        report = numberTracker.getFirstDigitCountReport(1);
        assertTrue(report.size() > 0);

    }
}
