package com.sencha.gxt.theme.neptune.client.base.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3SeparatorMenuItemAppearance_Css3SeparatorMenuItemResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.menu.Css3SeparatorMenuItemAppearance.Css3SeparatorMenuItemResources {
  private static Css3SeparatorMenuItemAppearance_Css3SeparatorMenuItemResources_default_InlineClientBundleGenerator _instance0 = new Css3SeparatorMenuItemAppearance_Css3SeparatorMenuItemResources_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.neptune.client.base.menu.Css3SeparatorMenuItemAppearance.Css3SeparatorMenuItemStyle() {
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
        return "style";
      }
      public String getText() {
        return (".GJE5YCFCLSC{display:" + ("block")  + ";overflow:" + ("hidden")  + ";line-height:" + (theme().menu().separator().height() + "px")  + ";margin:" + (theme().menu().separator().margin() + "")  + ";background-color:" + (theme().menu().separator().color() + "")  + ";}");
      }
      public java.lang.String active() {
        return "GJE5YCFCKSC";
      }
      public java.lang.String menuSep() {
        return "GJE5YCFCLSC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.base.menu.Css3SeparatorMenuItemAppearance.Css3SeparatorMenuItemStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.base.menu.Css3SeparatorMenuItemAppearance.Css3SeparatorMenuItemStyle style() {
    return styleInitializer.get();
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
  private static com.sencha.gxt.theme.neptune.client.base.menu.Css3SeparatorMenuItemAppearance.Css3SeparatorMenuItemStyle style;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
      theme(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
        resourceMap.put("theme", theme());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3SeparatorMenuItemAppearance.Css3SeparatorMenuItemResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3SeparatorMenuItemAppearance.Css3SeparatorMenuItemResources::theme()();
    }
    return null;
  }-*/;
}
