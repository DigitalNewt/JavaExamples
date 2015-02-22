package com.sencha.gxt.theme.neptune.client.sliced.mask;

public class SlicedMaskAppearance_SlicedMaskStyles_text_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.neptune.client.sliced.mask.SlicedMaskAppearance.SlicedMaskStyles, java.lang.String> {
  public static final SlicedMaskAppearance_SlicedMaskStyles_text_ValueProviderImpl INSTANCE = new SlicedMaskAppearance_SlicedMaskStyles_text_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.neptune.client.sliced.mask.SlicedMaskAppearance.SlicedMaskStyles object) {
    return object.text();
  }
  public void setValue(com.sencha.gxt.theme.neptune.client.sliced.mask.SlicedMaskAppearance.SlicedMaskStyles object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "text";
  }
}
