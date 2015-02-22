package com.gwt.example.client;

import com.google.gwt.junit.client.GWTTestCase;

public class CompileGwtTest extends GWTTestCase {
  
  @Override
  public String getModuleName() {
    return "com.gwt.example.Example";
  }

  public void testSandbox() {
    assertTrue(true);
  }
  
}
