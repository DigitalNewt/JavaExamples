package com.sencha.gxt.theme.base.client.container;

public class MessageBoxDefaultAppearance_MessageBoxBaseStyle_icon_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.container.MessageBoxDefaultAppearance.MessageBoxBaseStyle, java.lang.String> {
  public static final MessageBoxDefaultAppearance_MessageBoxBaseStyle_icon_ValueProviderImpl INSTANCE = new MessageBoxDefaultAppearance_MessageBoxBaseStyle_icon_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.container.MessageBoxDefaultAppearance.MessageBoxBaseStyle object) {
    return object.icon();
  }
  public void setValue(com.sencha.gxt.theme.base.client.container.MessageBoxDefaultAppearance.MessageBoxBaseStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "icon";
  }
}
