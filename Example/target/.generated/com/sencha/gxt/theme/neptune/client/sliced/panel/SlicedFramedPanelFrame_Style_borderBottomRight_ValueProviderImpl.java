package com.sencha.gxt.theme.neptune.client.sliced.panel;

public class SlicedFramedPanelFrame_Style_borderBottomRight_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.neptune.client.sliced.panel.SlicedFramedPanelFrame.Style, java.lang.String> {
  public static final SlicedFramedPanelFrame_Style_borderBottomRight_ValueProviderImpl INSTANCE = new SlicedFramedPanelFrame_Style_borderBottomRight_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.neptune.client.sliced.panel.SlicedFramedPanelFrame.Style object) {
    return object.borderBottomRight();
  }
  public void setValue(com.sencha.gxt.theme.neptune.client.sliced.panel.SlicedFramedPanelFrame.Style object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "borderBottomRight";
  }
}
