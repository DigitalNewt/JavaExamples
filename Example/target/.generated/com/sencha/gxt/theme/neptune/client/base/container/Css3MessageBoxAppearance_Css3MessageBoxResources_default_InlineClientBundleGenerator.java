package com.sencha.gxt.theme.neptune.client.base.container;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3MessageBoxAppearance_Css3MessageBoxResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.container.Css3MessageBoxAppearance.Css3MessageBoxResources {
  private static Css3MessageBoxAppearance_Css3MessageBoxResources_default_InlineClientBundleGenerator _instance0 = new Css3MessageBoxAppearance_Css3MessageBoxResources_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.neptune.client.base.container.Css3MessageBoxAppearance.Css3MessageBoxStyles() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJE5YCFCIEC{float:" + ("right")  + ";width:" + ("47px")  + ";height:" + ("32px")  + ";display:" + ("none")  + ";padding:" + (theme().messagebox().iconPadding() + "")  + ";}.GJE5YCFCJEC{color:" + (theme().messagebox().text().color() + "")  + ";font-family:" + (theme().messagebox().text().family() + "")  + ";font-size:" + (theme().messagebox().text().size() + "")  + ";font-weight:" + (theme().messagebox().text().weight() + "")  + ";padding:" + (theme().messagebox().messagePadding() + "")  + ";}.GJE5YCFCHEC{padding:") + ((theme().messagebox().bodyPadding() + "")  + ";}")) : ((".GJE5YCFCIEC{float:" + ("left")  + ";width:" + ("47px")  + ";height:" + ("32px")  + ";display:" + ("none")  + ";padding:" + (theme().messagebox().iconPadding() + "")  + ";}.GJE5YCFCJEC{color:" + (theme().messagebox().text().color() + "")  + ";font-family:" + (theme().messagebox().text().family() + "")  + ";font-size:" + (theme().messagebox().text().size() + "")  + ";font-weight:" + (theme().messagebox().text().weight() + "")  + ";padding:" + (theme().messagebox().messagePadding() + "")  + ";}.GJE5YCFCHEC{padding:") + ((theme().messagebox().bodyPadding() + "")  + ";}"));
      }
      public java.lang.String content() {
        return "GJE5YCFCHEC";
      }
      public java.lang.String icon() {
        return "GJE5YCFCIEC";
      }
      public java.lang.String message() {
        return "GJE5YCFCJEC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.base.container.Css3MessageBoxAppearance.Css3MessageBoxStyles get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.base.container.Css3MessageBoxAppearance.Css3MessageBoxStyles style() {
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
  private static com.sencha.gxt.theme.neptune.client.base.container.Css3MessageBoxAppearance.Css3MessageBoxStyles style;
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
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.base.container.Css3MessageBoxAppearance.Css3MessageBoxResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.container.Css3MessageBoxAppearance.Css3MessageBoxResources::theme()();
    }
    return null;
  }-*/;
}
