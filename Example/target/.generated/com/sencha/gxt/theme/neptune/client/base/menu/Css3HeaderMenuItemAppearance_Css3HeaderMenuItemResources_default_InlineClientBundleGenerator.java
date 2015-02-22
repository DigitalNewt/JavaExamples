package com.sencha.gxt.theme.neptune.client.base.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3HeaderMenuItemAppearance_Css3HeaderMenuItemResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.menu.Css3HeaderMenuItemAppearance.Css3HeaderMenuItemResources {
  private static Css3HeaderMenuItemAppearance_Css3HeaderMenuItemResources_default_InlineClientBundleGenerator _instance0 = new Css3HeaderMenuItemAppearance_Css3HeaderMenuItemResources_default_InlineClientBundleGenerator();
  private void headerStyleInitializer() {
    headerStyle = new com.sencha.gxt.theme.neptune.client.base.menu.Css3HeaderMenuItemAppearance.Css3HeaderMenuItemStyle() {
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
        return "headerStyle";
      }
      public String getText() {
        return (".GJE5YCFCFRC{border-color:" + (theme().menu().header().border().color() + "")  + ";border-style:" + (theme().menu().header().border().style() + "")  + ";border-width:" + (theme().menu().header().border().toString() + "")  + ";background-color:" + (theme().menu().header().backgroundColor() + "")  + ";font-family:" + (theme().menu().header().itemText().family() + "")  + ";font-size:" + (theme().menu().header().itemText().size() + "")  + ";font-weight:" + (theme().menu().header().itemText().weight() + "")  + ";color:" + (theme().menu().header().itemText().color() + "")  + ";display:" + ("block")  + ";padding:" + (theme().menu().header().itemPadding().toString() + "")  + ";}");
      }
      public java.lang.String menuText() {
        return "GJE5YCFCFRC";
      }
    }
    ;
  }
  private static class headerStyleInitializer {
    static {
      _instance0.headerStyleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.base.menu.Css3HeaderMenuItemAppearance.Css3HeaderMenuItemStyle get() {
      return headerStyle;
    }
  }
  public com.sencha.gxt.theme.neptune.client.base.menu.Css3HeaderMenuItemAppearance.Css3HeaderMenuItemStyle headerStyle() {
    return headerStyleInitializer.get();
  }
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
  private static com.sencha.gxt.theme.neptune.client.base.menu.Css3HeaderMenuItemAppearance.Css3HeaderMenuItemStyle headerStyle;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      headerStyle(), 
      theme(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("headerStyle", headerStyle());
        resourceMap.put("theme", theme());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'headerStyle': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3HeaderMenuItemAppearance.Css3HeaderMenuItemResources::headerStyle()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3HeaderMenuItemAppearance.Css3HeaderMenuItemResources::theme()();
    }
    return null;
  }-*/;
}
