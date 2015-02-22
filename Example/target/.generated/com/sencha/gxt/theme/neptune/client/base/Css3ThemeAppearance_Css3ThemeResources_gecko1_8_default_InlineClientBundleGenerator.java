package com.sencha.gxt.theme.neptune.client.base;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3ThemeAppearance_Css3ThemeResources_gecko1_8_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.Css3ThemeAppearance.Css3ThemeResources {
  private static Css3ThemeAppearance_Css3ThemeResources_gecko1_8_default_InlineClientBundleGenerator _instance0 = new Css3ThemeAppearance_Css3ThemeResources_gecko1_8_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.neptune.client.base.Css3ThemeAppearance.Css3ThemeStyles() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJE5YCFCJBC{border:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GJE5YCFCLBC{border:" + ("none")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GJE5YCFCMBC{border:" + ("none")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GJE5YCFCNBC{border:" + ("none")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GJE5YCFCKBC{border:" + ("none")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GJE5YCFCOBC{color:" + (theme().disabledTextColor() + "")  + " !important;cursor:") + (("default")  + " !important;opacity:" + (theme().disabledOpacity() + "")  + ";}.GJE5YCFCOBC *{cursor:" + ("default")  + " !important;}")) : ((".GJE5YCFCJBC{border:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GJE5YCFCLBC{border:" + ("none")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GJE5YCFCMBC{border:" + ("none")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GJE5YCFCNBC{border:" + ("none")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GJE5YCFCKBC{border:" + ("none")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +theme().borderColor() + "")  + " !important;}.GJE5YCFCOBC{color:" + (theme().disabledTextColor() + "")  + " !important;cursor:") + (("default")  + " !important;opacity:" + (theme().disabledOpacity() + "")  + ";}.GJE5YCFCOBC *{cursor:" + ("default")  + " !important;}"));
      }
      public java.lang.String border() {
        return "GJE5YCFCJBC";
      }
      public java.lang.String borderBottom() {
        return "GJE5YCFCKBC";
      }
      public java.lang.String borderLeft() {
        return "GJE5YCFCLBC";
      }
      public java.lang.String borderRight() {
        return "GJE5YCFCMBC";
      }
      public java.lang.String borderTop() {
        return "GJE5YCFCNBC";
      }
      public java.lang.String disabled() {
        return "GJE5YCFCOBC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.base.Css3ThemeAppearance.Css3ThemeStyles get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.base.Css3ThemeAppearance.Css3ThemeStyles style() {
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
  private static com.sencha.gxt.theme.neptune.client.base.Css3ThemeAppearance.Css3ThemeStyles style;
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
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.base.Css3ThemeAppearance.Css3ThemeResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.Css3ThemeAppearance.Css3ThemeResources::theme()();
    }
    return null;
  }-*/;
}
