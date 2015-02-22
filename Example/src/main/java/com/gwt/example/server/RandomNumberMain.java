package com.gwt.example.server;

import java.util.List;
import java.util.Scanner;

/**
 * User: Brent Baker
 * Date: 2/20/15
 * Time: 9:55 PM
 */
public class RandomNumberMain {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("How may numbers to you want to generate?");

        if (userInput.hasNextLine()) {
            String totalNumbers = userInput.nextLine();
            RandomNumberTracker numberTracker = new RandomNumberTracker();
            if (isInteger(totalNumbers)) {
                List<FirstDigitCount> report = numberTracker.getFirstDigitCountReport(Integer.valueOf(totalNumbers));
                System.out.print("First Digit    Count\n");
                for( FirstDigitCount firstDigitCount : report) {
                    System.out.print("     " + firstDigitCount.getFirstDigitNumber() + "            " + firstDigitCount.getFirstDigitCount() + "\n");
                }
            } else {
                System.out.print("Please enter an integer.");
            }


        }
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
}
