package com.gwt.example.client;

import com.google.gwt.i18n.client.Constants;

/**
 * User: Brent Baker
 * Date: 2/19/15
 * Time: 9:21 PM
 */
public interface ClientConstants extends Constants  {

    @DefaultStringValue("Sign In")
    String signIn();

    @DefaultStringValue("User Id")
    String userId();
}
