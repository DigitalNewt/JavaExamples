package com.landisgyr.randomnumbertracker.client;

import com.google.gwt.user.client.rpc.IsSerializable;
/**
 * User: Brent Baker
 * Date: 2/20/15
 * Time: 10:32 PM
 */
public class FirstDigitCount implements IsSerializable {
    private int firstDigitNumber;
    private int firstDigitCount;

    public int getFirstDigitNumber() {
        return firstDigitNumber;
    }

    public void setFirstDigitNumber(int firstDigitNumber) {
        this.firstDigitNumber = firstDigitNumber;
    }

    public int getFirstDigitCount() {
        return firstDigitCount;
    }

    public void setFirstDigitCount(int firstDigitCount) {
        this.firstDigitCount = firstDigitCount;
    }
}
