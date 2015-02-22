package com.landisgyr.randomnumbertracker.client;

import com.google.gwt.junit.client.GWTTestCase;

public class CompileGwtTest extends GWTTestCase {
  
  @Override
  public String getModuleName() {
    return "com.landisgyr.randomnumbertracker.randomnumbertracker";
  }

  public void testSandbox() {
    assertTrue(true);
  }
  
}
