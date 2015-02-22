package com.sencha.gxt.theme.neptune.client.sliced.window;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class SlicedWindowAppearance_SlicedWindowResources_ie9_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.sliced.window.SlicedWindowAppearance.SlicedWindowResources {
  private static SlicedWindowAppearance_SlicedWindowResources_ie9_default_InlineClientBundleGenerator _instance0 = new SlicedWindowAppearance_SlicedWindowResources_ie9_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.neptune.client.sliced.window.SlicedWindowAppearance.SlicedWindowStyle() {
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
        return (".GJE5YCFCBUD{background-color:" + (theme().window().backgroundColor() + "")  + ";border-style:" + ("solid")  + ";border-width:" + ("0")  + ";outline:" + ("none")  + ";}.GJE5YCFCPTD{position:" + ("relative")  + ";}.GJE5YCFCLTD{border-width:" + ("0")  + ";overflow:" + ("hidden")  + ";position:" + ("relative")  + ";background-color:" + (theme().window().backgroundColor() + "")  + ";}.GJE5YCFCNTD{position:" + ("relative")  + ";background-color:") + ((theme().window().backgroundColor() + "")  + ";}.GJE5YCFCOTD ul{background-color:" + ("#cdd9e8")  + ";border-color:" + ("#90a4c4")  + ";}");
      }
      public java.lang.String body() {
        return "GJE5YCFCLTD";
      }
      public java.lang.String bodyWrap() {
        return "GJE5YCFCMTD";
      }
      public java.lang.String footer() {
        return "GJE5YCFCNTD";
      }
      public java.lang.String ghost() {
        return "GJE5YCFCOTD";
      }
      public java.lang.String header() {
        return "GJE5YCFCPTD";
      }
      public java.lang.String noHeader() {
        return "GJE5YCFCAUD";
      }
      public java.lang.String panel() {
        return "GJE5YCFCBUD";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.sliced.window.SlicedWindowAppearance.SlicedWindowStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.sliced.window.SlicedWindowAppearance.SlicedWindowStyle style() {
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
  private static com.sencha.gxt.theme.neptune.client.sliced.window.SlicedWindowAppearance.SlicedWindowStyle style;
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
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.sliced.window.SlicedWindowAppearance.SlicedWindowResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.sliced.panel.SlicedFramedPanelAppearance.SlicedFramePanelResources::theme()();
    }
    return null;
  }-*/;
}
