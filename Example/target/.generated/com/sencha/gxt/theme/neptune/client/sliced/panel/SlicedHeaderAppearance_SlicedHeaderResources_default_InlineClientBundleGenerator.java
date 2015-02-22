package com.sencha.gxt.theme.neptune.client.sliced.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class SlicedHeaderAppearance_SlicedHeaderResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.sliced.panel.SlicedHeaderAppearance.SlicedHeaderResources {
  private static SlicedHeaderAppearance_SlicedHeaderResources_default_InlineClientBundleGenerator _instance0 = new SlicedHeaderAppearance_SlicedHeaderResources_default_InlineClientBundleGenerator();
  private void headerBackgroundInitializer() {
    headerBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "headerBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 800, false, false
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
    style = new com.sencha.gxt.theme.neptune.client.sliced.panel.SlicedHeaderAppearance.SlicedHeaderStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJE5YCFCMLD{padding:" + ("4px"+ " " +"5px"+ " " +"2px"+ " " +"3px")  + ";position:" + ("relative")  + ";padding:" + ("0")  + ";height:" + ((SlicedHeaderAppearance_SlicedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedHeaderAppearance_SlicedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getSafeUri().asString() + "\") -" + (SlicedHeaderAppearance_SlicedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getLeft() + "px -" + (SlicedHeaderAppearance_SlicedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getTop() + "px  repeat-x")  + ";padding:" + (theme().framedPanel().headerPadding().toString() + "")  + ";height:" + ("auto")  + ";}.GJE5YCFCPLD{float:" + ("right")  + ";}.GJE5YCFCOLD .GJE5YCFCPLD{width:" + ("18px")  + ";}.GJE5YCFCOLD .GJE5YCFCAMD{right:") + (("20px")  + ";}.GJE5YCFCAMD{font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";line-height:" + ("15px")  + ";color:" + (theme().framedPanel().font().color() + "")  + ";font-size:" + (theme().framedPanel().font().size() + "")  + ";font-weight:" + (theme().framedPanel().font().weight() + "")  + ";font-family:" + (theme().framedPanel().font().family() + "")  + ";line-height:" + ("15px")  + ";text-transform:" + ("none") ) + (";color:" + (theme().framedPanel().font().color() + "")  + ";font-size:" + (theme().framedPanel().font().size() + "")  + ";font-weight:" + (theme().framedPanel().font().weight() + "")  + ";font-family:" + (theme().framedPanel().font().family() + "")  + ";line-height:" + ("15px")  + ";text-transform:" + ("none")  + ";}.GJE5YCFCNLD{float:" + ("left")  + ";}")) : ((".GJE5YCFCMLD{padding:" + ("4px"+ " " +"3px"+ " " +"2px"+ " " +"5px")  + ";position:" + ("relative")  + ";padding:" + ("0")  + ";height:" + ((SlicedHeaderAppearance_SlicedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedHeaderAppearance_SlicedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getSafeUri().asString() + "\") -" + (SlicedHeaderAppearance_SlicedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getLeft() + "px -" + (SlicedHeaderAppearance_SlicedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getTop() + "px  repeat-x")  + ";padding:" + (theme().framedPanel().headerPadding().toString() + "")  + ";height:" + ("auto")  + ";}.GJE5YCFCPLD{float:" + ("left")  + ";}.GJE5YCFCOLD .GJE5YCFCPLD{width:" + ("18px")  + ";}.GJE5YCFCOLD .GJE5YCFCAMD{left:") + (("20px")  + ";}.GJE5YCFCAMD{font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";line-height:" + ("15px")  + ";color:" + (theme().framedPanel().font().color() + "")  + ";font-size:" + (theme().framedPanel().font().size() + "")  + ";font-weight:" + (theme().framedPanel().font().weight() + "")  + ";font-family:" + (theme().framedPanel().font().family() + "")  + ";line-height:" + ("15px")  + ";text-transform:" + ("none") ) + (";color:" + (theme().framedPanel().font().color() + "")  + ";font-size:" + (theme().framedPanel().font().size() + "")  + ";font-weight:" + (theme().framedPanel().font().weight() + "")  + ";font-family:" + (theme().framedPanel().font().family() + "")  + ";line-height:" + ("15px")  + ";text-transform:" + ("none")  + ";}.GJE5YCFCNLD{float:" + ("right")  + ";}"));
      }
      public java.lang.String header() {
        return "GJE5YCFCMLD";
      }
      public java.lang.String headerBar() {
        return "GJE5YCFCNLD";
      }
      public java.lang.String headerHasIcon() {
        return "GJE5YCFCOLD";
      }
      public java.lang.String headerIcon() {
        return "GJE5YCFCPLD";
      }
      public java.lang.String headerText() {
        return "GJE5YCFCAMD";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.sliced.panel.SlicedHeaderAppearance.SlicedHeaderStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.sliced.panel.SlicedHeaderAppearance.SlicedHeaderStyle style() {
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
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAMgCAYAAADiDQiHAAAAI0lEQVR42u3EMQEAAAgDoJUwrwXtpDF84CDVs5EkSZIkSZ8dCK5pSmx6U3wAAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource headerBackground;
  private static com.sencha.gxt.theme.neptune.client.sliced.panel.SlicedHeaderAppearance.SlicedHeaderStyle style;
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
      case 'headerBackground': return this.@com.sencha.gxt.theme.neptune.client.sliced.panel.SlicedHeaderAppearance.SlicedHeaderResources::headerBackground()();
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.sliced.panel.SlicedHeaderAppearance.SlicedHeaderResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.panel.Css3HeaderAppearance.Css3HeaderResources::theme()();
    }
    return null;
  }-*/;
}
