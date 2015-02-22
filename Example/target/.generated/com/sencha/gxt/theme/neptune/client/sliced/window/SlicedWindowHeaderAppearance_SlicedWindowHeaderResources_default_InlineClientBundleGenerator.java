package com.sencha.gxt.theme.neptune.client.sliced.window;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class SlicedWindowHeaderAppearance_SlicedWindowHeaderResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.sliced.window.SlicedWindowHeaderAppearance.SlicedWindowHeaderResources {
  private static SlicedWindowHeaderAppearance_SlicedWindowHeaderResources_default_InlineClientBundleGenerator _instance0 = new SlicedWindowHeaderAppearance_SlicedWindowHeaderResources_default_InlineClientBundleGenerator();
  private void headerBackgroundInitializer() {
    headerBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "headerBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 31, false, false
    );
  }
  private static class headerBackgroundInitializer {
    static {
      _instance0.headerBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return headerBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource headerBackground() {
    return headerBackgroundInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.neptune.client.sliced.window.SlicedWindowHeaderAppearance.SlicedWindowHeaderStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJE5YCFCCUD{padding:" + ("4px"+ " " +"5px"+ " " +"2px"+ " " +"3px")  + ";position:" + ("relative")  + ";padding:" + ("0")  + ";height:" + ((SlicedWindowHeaderAppearance_SlicedWindowHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedWindowHeaderAppearance_SlicedWindowHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getSafeUri().asString() + "\") -" + (SlicedWindowHeaderAppearance_SlicedWindowHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getLeft() + "px -" + (SlicedWindowHeaderAppearance_SlicedWindowHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getTop() + "px  repeat-x")  + ";padding:" + (theme().framedPanel().headerPadding().toString() + "")  + ";height:" + ("auto")  + ";}.GJE5YCFCFUD{float:" + ("right")  + ";}.GJE5YCFCEUD .GJE5YCFCFUD{width:" + ("18px")  + ";}.GJE5YCFCEUD .GJE5YCFCGUD{right:") + (("20px")  + ";}.GJE5YCFCGUD{font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";line-height:" + ("15px")  + ";color:" + (theme().framedPanel().font().color() + "")  + ";font-size:" + (theme().framedPanel().font().size() + "")  + ";font-weight:" + (theme().framedPanel().font().weight() + "")  + ";font-family:" + (theme().framedPanel().font().family() + "")  + ";line-height:" + ("15px")  + ";text-transform:" + ("none") ) + (";color:" + (theme().framedPanel().font().color() + "")  + ";font-size:" + (theme().framedPanel().font().size() + "")  + ";font-weight:" + (theme().framedPanel().font().weight() + "")  + ";font-family:" + (theme().framedPanel().font().family() + "")  + ";line-height:" + ("15px")  + ";text-transform:" + ("none")  + ";}.GJE5YCFCDUD{float:" + ("left")  + ";}")) : ((".GJE5YCFCCUD{padding:" + ("4px"+ " " +"3px"+ " " +"2px"+ " " +"5px")  + ";position:" + ("relative")  + ";padding:" + ("0")  + ";height:" + ((SlicedWindowHeaderAppearance_SlicedWindowHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedWindowHeaderAppearance_SlicedWindowHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getSafeUri().asString() + "\") -" + (SlicedWindowHeaderAppearance_SlicedWindowHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getLeft() + "px -" + (SlicedWindowHeaderAppearance_SlicedWindowHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getTop() + "px  repeat-x")  + ";padding:" + (theme().framedPanel().headerPadding().toString() + "")  + ";height:" + ("auto")  + ";}.GJE5YCFCFUD{float:" + ("left")  + ";}.GJE5YCFCEUD .GJE5YCFCFUD{width:" + ("18px")  + ";}.GJE5YCFCEUD .GJE5YCFCGUD{left:") + (("20px")  + ";}.GJE5YCFCGUD{font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";line-height:" + ("15px")  + ";color:" + (theme().framedPanel().font().color() + "")  + ";font-size:" + (theme().framedPanel().font().size() + "")  + ";font-weight:" + (theme().framedPanel().font().weight() + "")  + ";font-family:" + (theme().framedPanel().font().family() + "")  + ";line-height:" + ("15px")  + ";text-transform:" + ("none") ) + (";color:" + (theme().framedPanel().font().color() + "")  + ";font-size:" + (theme().framedPanel().font().size() + "")  + ";font-weight:" + (theme().framedPanel().font().weight() + "")  + ";font-family:" + (theme().framedPanel().font().family() + "")  + ";line-height:" + ("15px")  + ";text-transform:" + ("none")  + ";}.GJE5YCFCDUD{float:" + ("right")  + ";}"));
      }
      public java.lang.String header() {
        return "GJE5YCFCCUD";
      }
      public java.lang.String headerBar() {
        return "GJE5YCFCDUD";
      }
      public java.lang.String headerHasIcon() {
        return "GJE5YCFCEUD";
      }
      public java.lang.String headerIcon() {
        return "GJE5YCFCFUD";
      }
      public java.lang.String headerText() {
        return "GJE5YCFCGUD";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.sliced.window.SlicedWindowHeaderAppearance.SlicedWindowHeaderStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.sliced.window.SlicedWindowHeaderAppearance.SlicedWindowHeaderStyle style() {
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
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAAfCAYAAAAmyadiAAAAEElEQVR42mMwmnjtP8OgJAAwFVBpTKGxdwAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource headerBackground;
  private static com.sencha.gxt.theme.neptune.client.sliced.window.SlicedWindowHeaderAppearance.SlicedWindowHeaderStyle style;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      headerBackground(), 
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
        resourceMap.put("headerBackground", headerBackground());
        resourceMap.put("style", style());
        resourceMap.put("theme", theme());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'headerBackground': return this.@com.sencha.gxt.theme.neptune.client.sliced.window.SlicedWindowHeaderAppearance.SlicedWindowHeaderResources::headerBackground()();
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.sliced.window.SlicedWindowHeaderAppearance.SlicedWindowHeaderResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.panel.Css3HeaderAppearance.Css3HeaderResources::theme()();
    }
    return null;
  }-*/;
}
