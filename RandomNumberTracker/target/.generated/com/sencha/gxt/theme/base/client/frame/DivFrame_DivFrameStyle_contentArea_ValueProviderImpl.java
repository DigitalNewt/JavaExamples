package com.sencha.gxt.theme.base.client.frame;

public class DivFrame_DivFrameStyle_contentArea_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.frame.DivFrame.DivFrameStyle, java.lang.String> {
  public static final DivFrame_DivFrameStyle_contentArea_ValueProviderImpl INSTANCE = new DivFrame_DivFrameStyle_contentArea_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.frame.DivFrame.DivFrameStyle object) {
    return object.contentArea();
  }
  public void setValue(com.sencha.gxt.theme.base.client.frame.DivFrame.DivFrameStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "contentArea";
  }
}
