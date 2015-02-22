package com.landisgyr.randomnumbertracker.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import java.util.ArrayList;


/**
 * User: Brent Baker
 * Date: 2/21/15
 * Time: 12:39 AM
 */
public interface RandomNumberTrackerServiceAsync {
    void getFirstDigitCountReport(int numbersToGenerate, AsyncCallback<ArrayList<FirstDigitCount>> callback);
}
