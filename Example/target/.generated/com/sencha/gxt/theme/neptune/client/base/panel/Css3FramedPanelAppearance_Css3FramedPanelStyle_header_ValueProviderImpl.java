package com.sencha.gxt.theme.neptune.client.base.panel;

public class Css3FramedPanelAppearance_Css3FramedPanelStyle_header_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.neptune.client.base.panel.Css3FramedPanelAppearance.Css3FramedPanelStyle, java.lang.String> {
  public static final Css3FramedPanelAppearance_Css3FramedPanelStyle_header_ValueProviderImpl INSTANCE = new Css3FramedPanelAppearance_Css3FramedPanelStyle_header_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.neptune.client.base.panel.Css3FramedPanelAppearance.Css3FramedPanelStyle object) {
    return object.header();
  }
  public void setValue(com.sencha.gxt.theme.neptune.client.base.panel.Css3FramedPanelAppearance.Css3FramedPanelStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "header";
  }
}
