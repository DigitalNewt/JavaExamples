package com.sencha.gxt.theme.neptune.client.base.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3HeaderAppearance_Css3HeaderResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.panel.Css3HeaderAppearance.Css3HeaderResources {
  private static Css3HeaderAppearance_Css3HeaderResources_default_InlineClientBundleGenerator _instance0 = new Css3HeaderAppearance_Css3HeaderResources_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.neptune.client.base.panel.Css3HeaderAppearance.Css3HeaderStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJE5YCFCHTC{padding:" + ("4px"+ " " +"5px"+ " " +"2px"+ " " +"3px")  + ";position:" + ("relative")  + ";padding:" + ("0")  + ";}.GJE5YCFCKTC{float:" + ("right")  + ";}.GJE5YCFCJTC .GJE5YCFCKTC{width:" + ("18px")  + ";}.GJE5YCFCJTC .GJE5YCFCLTC{right:" + ("20px")  + ";}.GJE5YCFCLTC{font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";line-height:" + ("15px")  + ";color:") + ((theme().panel().font().color() + "")  + ";font-size:" + (theme().panel().font().size() + "")  + ";font-weight:" + (theme().panel().font().weight() + "")  + ";font-family:" + (theme().panel().font().family() + "")  + ";line-height:" + ("15px")  + ";text-transform:" + ("none")  + ";}.GJE5YCFCITC{float:" + ("left")  + ";}")) : ((".GJE5YCFCHTC{padding:" + ("4px"+ " " +"3px"+ " " +"2px"+ " " +"5px")  + ";position:" + ("relative")  + ";padding:" + ("0")  + ";}.GJE5YCFCKTC{float:" + ("left")  + ";}.GJE5YCFCJTC .GJE5YCFCKTC{width:" + ("18px")  + ";}.GJE5YCFCJTC .GJE5YCFCLTC{left:" + ("20px")  + ";}.GJE5YCFCLTC{font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";line-height:" + ("15px")  + ";color:") + ((theme().panel().font().color() + "")  + ";font-size:" + (theme().panel().font().size() + "")  + ";font-weight:" + (theme().panel().font().weight() + "")  + ";font-family:" + (theme().panel().font().family() + "")  + ";line-height:" + ("15px")  + ";text-transform:" + ("none")  + ";}.GJE5YCFCITC{float:" + ("right")  + ";}"));
      }
      public java.lang.String header() {
        return "GJE5YCFCHTC";
      }
      public java.lang.String headerBar() {
        return "GJE5YCFCITC";
      }
      public java.lang.String headerHasIcon() {
        return "GJE5YCFCJTC";
      }
      public java.lang.String headerIcon() {
        return "GJE5YCFCKTC";
      }
      public java.lang.String headerText() {
        return "GJE5YCFCLTC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.base.panel.Css3HeaderAppearance.Css3HeaderStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.base.panel.Css3HeaderAppearance.Css3HeaderStyle style() {
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
  private static com.sencha.gxt.theme.neptune.client.base.panel.Css3HeaderAppearance.Css3HeaderStyle style;
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
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.base.panel.Css3HeaderAppearance.Css3HeaderResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.panel.Css3HeaderAppearance.Css3HeaderResources::theme()();
    }
    return null;
  }-*/;
}
