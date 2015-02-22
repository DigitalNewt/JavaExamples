package com.landisgyr.randomnumbertracker.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import java.util.ArrayList;

/**
 * User: Brent Baker
 * Date: 2/21/15
 * Time: 12:36 AM
 * The client side stub for the RPC service.
 */

@RemoteServiceRelativePath("RandomNumberService")
public interface RandomNumberTrackerService extends RemoteService {

    ArrayList<FirstDigitCount> getFirstDigitCountReport(int numbersToGenerate);
}
