package com.sencha.gxt.widget.core.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ModalPanel_ModalPanelDefaultAppearance_ModalPanelResources_ie10_default_InlineClientBundleGenerator implements com.sencha.gxt.widget.core.client.ModalPanel.ModalPanelDefaultAppearance.ModalPanelResources {
  private static ModalPanel_ModalPanelDefaultAppearance_ModalPanelResources_ie10_default_InlineClientBundleGenerator _instance0 = new ModalPanel_ModalPanelDefaultAppearance_ModalPanelResources_ie10_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.sencha.gxt.widget.core.client.ModalPanel.ModalPanelDefaultAppearance.ModalPanelStyle() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "css";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJE5YCFCHUD{position:" + ("absolute")  + ";z-index:" + ("10")  + ";right:" + ("0")  + ";top:" + ("0")  + ";background-color:" + ("black")  + ";opacity:" + ("0.2")  + ";}")) : ((".GJE5YCFCHUD{position:" + ("absolute")  + ";z-index:" + ("10")  + ";left:" + ("0")  + ";top:" + ("0")  + ";background-color:" + ("black")  + ";opacity:" + ("0.2")  + ";}"));
      }
      public java.lang.String panel() {
        return "GJE5YCFCHUD";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.widget.core.client.ModalPanel.ModalPanelDefaultAppearance.ModalPanelStyle get() {
      return css;
    }
  }
  public com.sencha.gxt.widget.core.client.ModalPanel.ModalPanelDefaultAppearance.ModalPanelStyle css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.widget.core.client.ModalPanel.ModalPanelDefaultAppearance.ModalPanelStyle css;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.sencha.gxt.widget.core.client.ModalPanel.ModalPanelDefaultAppearance.ModalPanelResources::css()();
    }
    return null;
  }-*/;
}
