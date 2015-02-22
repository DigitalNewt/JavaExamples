package com.gwt.example.server;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * User: Brent Baker
 * Date: 2/20/15
 * Time: 6:51 PM
 */
public class RandomNumberTracker {

    private final int max = 10;
    private final int min = 0;

    /**
     * Generate a random floating point number with one decimal between min and max.
     * @return double
     */
     double getRandomNumber() {
        double randomNumber = (Math.random() * (max - min) + min) / 10;
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        String decimal = decimalFormat.format(randomNumber);
        return Double.valueOf(decimal);
    }

    /**
     * Get First Digit from random number generated
     * @param randomNumber floating point number
     * @return Integer of first digit
     */
     int getFirstDigit(double randomNumber) {
        int number;
        if (randomNumber == 1.0) {
            number =  0;
        } else {
            number = (int) Math.round(randomNumber * 10);
        }
        return number;
    }

    /**
     * Generate random numbers and count the number of times the number in the first digit is used.
     * @param numbersToGenerate  total random number to generate
     * @return int array of counts the number in the first digit accrued.
     */
     int[] getFirstDigitNumberCounts(int numbersToGenerate) {
        int[] firstDigitCount = new int[max];
        int i = 0;

        while(i < numbersToGenerate) {
            Integer firstDigit = getFirstDigit(getRandomNumber());
            firstDigitCount[firstDigit] = firstDigitCount[firstDigit] + 1;
            i++;
        }

        return firstDigitCount;
    }

    /**
     * Generate a report of first digit numbers used
     * @param numbersToGenerate total random number to generate
     * @return list of FirstDigitCount
     */
    public List<FirstDigitCount> getFirstDigitCountReport(int numbersToGenerate) {
        List<FirstDigitCount> firstDigitCountList = new ArrayList<>();
        int number = 0;
        for (int count : getFirstDigitNumberCounts(numbersToGenerate)) {
            if (count > 0) {
                FirstDigitCount firstDigitCount = new FirstDigitCount();
                firstDigitCount.setFirstDigitNumber(number);
                firstDigitCount.setFirstDigitCount(count);
                firstDigitCountList.add(firstDigitCount);
            }
            number++;
        }
        return firstDigitCountList;
    }
}
