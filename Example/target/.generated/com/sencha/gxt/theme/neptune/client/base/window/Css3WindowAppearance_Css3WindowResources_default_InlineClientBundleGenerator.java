package com.sencha.gxt.theme.neptune.client.base.window;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3WindowAppearance_Css3WindowResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.window.Css3WindowAppearance.Css3WindowResources {
  private static Css3WindowAppearance_Css3WindowResources_default_InlineClientBundleGenerator _instance0 = new Css3WindowAppearance_Css3WindowResources_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.neptune.client.base.window.Css3WindowAppearance.Css3WindowStyle() {
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
        return (".GJE5YCFCOAD{border-radius:" + (theme().window().borderRadius() + "px")  + ";border-width:" + (theme().window().border() + "")  + ";border-style:" + (theme().window().border().style() + "")  + ";background-color:" + (theme().window().backgroundColor() + "")  + ";border-color:" + (theme().window().border().color() + "")  + ";outline:" + ("none")  + ";padding:" + ("0")  + ";overflow:" + ("hidden")  + ";}.GJE5YCFCIAD{border:" + ("none")  + ";}.GJE5YCFCMAD{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().window().headerGradient() + "" + ")")  + ";background:") + (("-o-linear-gradient(" + "top"+ ","+ " " +theme().window().headerGradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().window().headerGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().window().headerGradient() + "" + ")")  + ";padding:" + (theme().window().headerPadding().toString() + "")  + ";}.GJE5YCFCKAD{clear:" + ("both")  + ";}.GJE5YCFCJAD{position:" + ("relative")  + ";}.GJE5YCFCLAD ul{background-color:" + ("#cdd9e8")  + ";border-color:" + ("#90a4c4")  + ";}");
      }
      public java.lang.String body() {
        return "GJE5YCFCIAD";
      }
      public java.lang.String bodyWrap() {
        return "GJE5YCFCJAD";
      }
      public java.lang.String footer() {
        return "GJE5YCFCKAD";
      }
      public java.lang.String ghost() {
        return "GJE5YCFCLAD";
      }
      public java.lang.String header() {
        return "GJE5YCFCMAD";
      }
      public java.lang.String noHeader() {
        return "GJE5YCFCNAD";
      }
      public java.lang.String panel() {
        return "GJE5YCFCOAD";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.base.window.Css3WindowAppearance.Css3WindowStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.base.window.Css3WindowAppearance.Css3WindowStyle style() {
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
  private static com.sencha.gxt.theme.neptune.client.base.window.Css3WindowAppearance.Css3WindowStyle style;
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
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.base.window.Css3WindowAppearance.Css3WindowResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.panel.Css3FramedPanelAppearance.Css3FramedPanelResources::theme()();
    }
    return null;
  }-*/;
}
