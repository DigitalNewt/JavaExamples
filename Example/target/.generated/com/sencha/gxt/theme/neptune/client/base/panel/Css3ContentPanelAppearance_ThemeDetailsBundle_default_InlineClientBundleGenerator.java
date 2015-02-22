package com.sencha.gxt.theme.neptune.client.base.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3ContentPanelAppearance_ThemeDetailsBundle_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.panel.Css3ContentPanelAppearance.ThemeDetailsBundle {
  private static Css3ContentPanelAppearance_ThemeDetailsBundle_default_InlineClientBundleGenerator _instance0 = new Css3ContentPanelAppearance_ThemeDetailsBundle_default_InlineClientBundleGenerator();
  private void themeInitializer() {
    theme = com.google.gwt.core.client.GWT.create(com.sencha.gxt.theme.neptune.client.ThemeDetails.class);
  }
  private static class themeInitializer {
    static {
      _instance0.themeInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.ThemeDetails get() {
      return theme;
    }
  }
  public com.sencha.gxt.theme.neptune.client.ThemeDetails theme() {
    return themeInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      theme(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("theme", theme());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.panel.Css3ContentPanelAppearance.ThemeDetailsBundle::theme()();
    }
    return null;
  }-*/;
}
