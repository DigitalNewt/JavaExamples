package com.sencha.gxt.theme.neptune.client.base.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuAppearance.Css3MenuResources {
  private static Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator _instance0 = new Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator();
  private void miniBottomInitializer() {
    miniBottom = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "miniBottom",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 16, 16, false, false
    );
  }
  private static class miniBottomInitializer {
    static {
      _instance0.miniBottomInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return miniBottom;
    }
  }
  public com.google.gwt.resources.client.ImageResource miniBottom() {
    return miniBottomInitializer.get();
  }
  private void miniTopInitializer() {
    miniTop = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "miniTop",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 16, 16, false, false
    );
  }
  private static class miniTopInitializer {
    static {
      _instance0.miniTopInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return miniTop;
    }
  }
  public com.google.gwt.resources.client.ImageResource miniTop() {
    return miniTopInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuAppearance.Css3MenuStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJE5YCFCHRC{outline:" + ("0"+ " " +"none")  + ";background:" + ("-webkit-linear-gradient(" + "left"+ ","+ " " +theme().menu().gradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "left"+ ","+ " " +theme().menu().gradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "left"+ ","+ " " +theme().menu().gradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"right"+ ","+ " " +theme().menu().gradient() + "" + ")")  + ";border-color:" + (theme().menu().border().color() + "")  + ";border-width:" + (theme().menu().border().toString() + "")  + ";border-style:" + (theme().menu().border().style() + "")  + ";}.GJE5YCFCHRC a{text-decoration:" + ("none")  + " !important;}.GJE5YCFCIRC{padding:" + (theme().menu().padding().toString() + "")  + ";background:") + (("transparent")  + ";border:" + ("0"+ " " +"none")  + ";overflow:" + ("hidden")  + ";overflow-y:" + ("hidden")  + ";}.GJE5YCFCGRC{padding:" + ("0")  + " !important;}.GJE5YCFCGRC .GJE5YCFCIRC{padding:" + ("0")  + ";}.GJE5YCFCJRC{padding-right:" + ("27px")  + " !important;}.GJE5YCFCPRC{background-image:" + ("none")  + ";}.GJE5YCFCASC{background-color:" + ("#fff")  + " !important;}.GJE5YCFCORC{height:" + ((Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniTop()).getHeight() + "px")  + ";width:" + ((Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniTop()).getWidth() + "px") ) + (";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniTop()).getSafeUri().asString() + "\") -" + (Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniTop()).getLeft() + "px -" + (Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniTop()).getTop() + "px  no-repeat")  + ";}.GJE5YCFCNRC{height:" + ((Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniBottom()).getHeight() + "px")  + ";width:" + ((Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniBottom()).getSafeUri().asString() + "\") -" + (Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniBottom()).getLeft() + "px -" + (Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniBottom()).getTop() + "px  no-repeat")  + ";}.GJE5YCFCLRC{margin:" + ("0")  + ";width:" + ("100%")  + ";background-position:" + ("center")  + ";height:" + ("8px")  + ";line-height:") + (("8px")  + ";cursor:" + ("pointer")  + ";padding:" + ("0")  + ";border-width:" + ("1px"+ " " +"0")  + ";}.GJE5YCFCMRC{height:" + ("6px")  + ";line-height:" + ("6px")  + ";}")) : ((".GJE5YCFCHRC{outline:" + ("0"+ " " +"none")  + ";background:" + ("-webkit-linear-gradient(" + "left"+ ","+ " " +theme().menu().gradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "left"+ ","+ " " +theme().menu().gradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "left"+ ","+ " " +theme().menu().gradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"right"+ ","+ " " +theme().menu().gradient() + "" + ")")  + ";border-color:" + (theme().menu().border().color() + "")  + ";border-width:" + (theme().menu().border().toString() + "")  + ";border-style:" + (theme().menu().border().style() + "")  + ";}.GJE5YCFCHRC a{text-decoration:" + ("none")  + " !important;}.GJE5YCFCIRC{padding:" + (theme().menu().padding().toString() + "")  + ";background:") + (("transparent")  + ";border:" + ("0"+ " " +"none")  + ";overflow:" + ("hidden")  + ";overflow-y:" + ("hidden")  + ";}.GJE5YCFCGRC{padding:" + ("0")  + " !important;}.GJE5YCFCGRC .GJE5YCFCIRC{padding:" + ("0")  + ";}.GJE5YCFCJRC{padding-left:" + ("27px")  + " !important;}.GJE5YCFCPRC{background-image:" + ("none")  + ";}.GJE5YCFCASC{background-color:" + ("#fff")  + " !important;}.GJE5YCFCORC{height:" + ((Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniTop()).getHeight() + "px")  + ";width:" + ((Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniTop()).getWidth() + "px") ) + (";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniTop()).getSafeUri().asString() + "\") -" + (Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniTop()).getLeft() + "px -" + (Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniTop()).getTop() + "px  no-repeat")  + ";}.GJE5YCFCNRC{height:" + ((Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniBottom()).getHeight() + "px")  + ";width:" + ((Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniBottom()).getSafeUri().asString() + "\") -" + (Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniBottom()).getLeft() + "px -" + (Css3MenuAppearance_Css3MenuResources_ie10_default_InlineClientBundleGenerator.this.miniBottom()).getTop() + "px  no-repeat")  + ";}.GJE5YCFCLRC{margin:" + ("0")  + ";width:" + ("100%")  + ";background-position:" + ("center")  + ";height:" + ("8px")  + ";line-height:") + (("8px")  + ";cursor:" + ("pointer")  + ";padding:" + ("0")  + ";border-width:" + ("1px"+ " " +"0")  + ";}.GJE5YCFCMRC{height:" + ("6px")  + ";line-height:" + ("6px")  + ";}"));
      }
      public java.lang.String dateMenu() {
        return "GJE5YCFCGRC";
      }
      public java.lang.String menu() {
        return "GJE5YCFCHRC";
      }
      public java.lang.String menuList() {
        return "GJE5YCFCIRC";
      }
      public java.lang.String menuListItemIndent() {
        return "GJE5YCFCJRC";
      }
      public java.lang.String menuRadioGroup() {
        return "GJE5YCFCKRC";
      }
      public java.lang.String menuScroller() {
        return "GJE5YCFCLRC";
      }
      public java.lang.String menuScrollerActive() {
        return "GJE5YCFCMRC";
      }
      public java.lang.String menuScrollerBottom() {
        return "GJE5YCFCNRC";
      }
      public java.lang.String menuScrollerTop() {
        return "GJE5YCFCORC";
      }
      public java.lang.String noSeparator() {
        return "GJE5YCFCPRC";
      }
      public java.lang.String plain() {
        return "GJE5YCFCASC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuAppearance.Css3MenuStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuAppearance.Css3MenuStyle style() {
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
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAs0lEQVR42mNgGAUMXfuf7e/Z/0yDVH2d+59YdO1/uhlowNP/QPwdKFBcv/8/CyGN9ftf8QDV9gP1/Abi+zADYPh81/4nBjht3ffEGaQJST2GAf+hJrfX77/PAdPYv/++AFBsPha197GZCsPXu/c/duja9ywYyH6NRR7hWjR//SeAcYcXJGSfXMat+dn+9v2PVQiE8n+W7v1P69Fc8757/5N0kuIZlDaAGo+D4hroMplhnBUAOtH9P6ictaQAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAxklEQVR42mNgGAU4Qc/+ZyKd+58u797/dHL9/lc8JGnu3P8kvmv/09dA/B+K73fve+JNUGP7/ucKQMWbkTSi4/kgl2ForN//nwUomQ107mc8mmEY5LJwZL9qAAWOY1H4HuQVIC4Gsr9jkd8MlJNhwCbZvf/Z6q79ryQQXnus0rX/2X5sljCgCTzu3vfUH1cYAb2YDNKErAfZgNn9++8LEBFDMkC16+EGAE293b3/sQOp6aRr37NgoAHPgTFwn4PcxEaMi2kPAKK6/dI/uNkQAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource miniBottom;
  private static com.google.gwt.resources.client.ImageResource miniTop;
  private static com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuAppearance.Css3MenuStyle style;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      miniBottom(), 
      miniTop(), 
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
        resourceMap.put("miniBottom", miniBottom());
        resourceMap.put("miniTop", miniTop());
        resourceMap.put("style", style());
        resourceMap.put("theme", theme());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'miniBottom': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuAppearance.Css3MenuResources::miniBottom()();
      case 'miniTop': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuAppearance.Css3MenuResources::miniTop()();
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuAppearance.Css3MenuResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuAppearance.Css3MenuResources::theme()();
    }
    return null;
  }-*/;
}
