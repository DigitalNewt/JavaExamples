package com.sencha.gxt.theme.neptune.client.sliced.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.sliced.menu.SlicedMenuAppearance.SlicedMenuResources {
  private static SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator _instance0 = new SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator();
  private void backgroundInitializer() {
    background = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "background",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 800, 1, false, false
    );
  }
  private static class backgroundInitializer {
    static {
      _instance0.backgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return background;
    }
  }
  public com.google.gwt.resources.client.ImageResource background() {
    return backgroundInitializer.get();
  }
  private void miniBottomInitializer() {
    miniBottom = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "miniBottom",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
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
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
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
    style = new com.sencha.gxt.theme.neptune.client.sliced.menu.SlicedMenuAppearance.SlicedMenuStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJE5YCFCIID{width:" + ((SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.background()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.background()).getSafeUri().asString() + "\") -" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.background()).getLeft() + "px -" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.background()).getTop() + "px  repeat-y")  + ";outline:" + ("0"+ " " +"none")  + ";width:" + ("auto")  + ";background-color:" + (theme().menu().lastGradientColor() + "")  + ";border-color:" + (theme().menu().border().color() + "")  + ";border-width:" + (theme().menu().border().toString() + "")  + ";border-style:" + (theme().menu().border().style() + "")  + ";}.GJE5YCFCIID a{text-decoration:" + ("none")  + " !important;}.GJE5YCFCJID{padding:") + ((theme().menu().padding().toString() + "")  + ";background:" + ("transparent")  + ";border:" + ("0"+ " " +"none")  + ";overflow:" + ("hidden")  + ";overflow-y:" + ("hidden")  + ";}.GJE5YCFCHID{padding:" + ("0")  + " !important;}.GJE5YCFCHID .GJE5YCFCJID{padding:" + ("0")  + ";}.GJE5YCFCMID{background-repeat:" + ("no-repeat")  + ";height:" + ("8px")  + ";line-height:" + ("8px")  + ";cursor:" + ("pointer") ) + (";padding:" + ("0")  + ";border-width:" + ("1px"+ " " +"0")  + ";}.GJE5YCFCNID{height:" + ("6px")  + ";line-height:" + ("6px")  + ";}.GJE5YCFCKID{padding-right:" + ("27px")  + " !important;}.GJE5YCFCAJD{background-image:" + ("none")  + ";}.GJE5YCFCBJD{background-color:" + ("#fff")  + " !important;}.GJE5YCFCPID{height:" + ((SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniTop()).getHeight() + "px")  + ";width:" + ((SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniTop()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:") + (("url(\"" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniTop()).getSafeUri().asString() + "\") -" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniTop()).getLeft() + "px -" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniTop()).getTop() + "px  no-repeat")  + ";}.GJE5YCFCOID{height:" + ((SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniBottom()).getHeight() + "px")  + ";width:" + ((SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniBottom()).getSafeUri().asString() + "\") -" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniBottom()).getLeft() + "px -" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniBottom()).getTop() + "px  no-repeat")  + ";}.GJE5YCFCMID{margin:" + ("0")  + ";width:" + ("100%")  + ";background-position:" + ("center")  + ";}")) : ((".GJE5YCFCIID{width:" + ((SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.background()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.background()).getSafeUri().asString() + "\") -" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.background()).getLeft() + "px -" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.background()).getTop() + "px  repeat-y")  + ";outline:" + ("0"+ " " +"none")  + ";width:" + ("auto")  + ";background-color:" + (theme().menu().lastGradientColor() + "")  + ";border-color:" + (theme().menu().border().color() + "")  + ";border-width:" + (theme().menu().border().toString() + "")  + ";border-style:" + (theme().menu().border().style() + "")  + ";}.GJE5YCFCIID a{text-decoration:" + ("none")  + " !important;}.GJE5YCFCJID{padding:") + ((theme().menu().padding().toString() + "")  + ";background:" + ("transparent")  + ";border:" + ("0"+ " " +"none")  + ";overflow:" + ("hidden")  + ";overflow-y:" + ("hidden")  + ";}.GJE5YCFCHID{padding:" + ("0")  + " !important;}.GJE5YCFCHID .GJE5YCFCJID{padding:" + ("0")  + ";}.GJE5YCFCMID{background-repeat:" + ("no-repeat")  + ";height:" + ("8px")  + ";line-height:" + ("8px")  + ";cursor:" + ("pointer") ) + (";padding:" + ("0")  + ";border-width:" + ("1px"+ " " +"0")  + ";}.GJE5YCFCNID{height:" + ("6px")  + ";line-height:" + ("6px")  + ";}.GJE5YCFCKID{padding-left:" + ("27px")  + " !important;}.GJE5YCFCAJD{background-image:" + ("none")  + ";}.GJE5YCFCBJD{background-color:" + ("#fff")  + " !important;}.GJE5YCFCPID{height:" + ((SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniTop()).getHeight() + "px")  + ";width:" + ((SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniTop()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:") + (("url(\"" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniTop()).getSafeUri().asString() + "\") -" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniTop()).getLeft() + "px -" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniTop()).getTop() + "px  no-repeat")  + ";}.GJE5YCFCOID{height:" + ((SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniBottom()).getHeight() + "px")  + ";width:" + ((SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniBottom()).getSafeUri().asString() + "\") -" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniBottom()).getLeft() + "px -" + (SlicedMenuAppearance_SlicedMenuResources_safari_default_InlineClientBundleGenerator.this.miniBottom()).getTop() + "px  no-repeat")  + ";}.GJE5YCFCMID{margin:" + ("0")  + ";width:" + ("100%")  + ";background-position:" + ("center")  + ";}"));
      }
      public java.lang.String dateMenu() {
        return "GJE5YCFCHID";
      }
      public java.lang.String menu() {
        return "GJE5YCFCIID";
      }
      public java.lang.String menuList() {
        return "GJE5YCFCJID";
      }
      public java.lang.String menuListItemIndent() {
        return "GJE5YCFCKID";
      }
      public java.lang.String menuRadioGroup() {
        return "GJE5YCFCLID";
      }
      public java.lang.String menuScroller() {
        return "GJE5YCFCMID";
      }
      public java.lang.String menuScrollerActive() {
        return "GJE5YCFCNID";
      }
      public java.lang.String menuScrollerBottom() {
        return "GJE5YCFCOID";
      }
      public java.lang.String menuScrollerTop() {
        return "GJE5YCFCPID";
      }
      public java.lang.String noSeparator() {
        return "GJE5YCFCAJD";
      }
      public java.lang.String plain() {
        return "GJE5YCFCBJD";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.sliced.menu.SlicedMenuAppearance.SlicedMenuStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.sliced.menu.SlicedMenuAppearance.SlicedMenuStyle style() {
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
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAyAAAAABCAYAAAAmaMpmAAAAGklEQVR42u3BIQEAAAACIP+f1hcmIAUAADgZtiV0NVhBkW0AAAAASUVORK5CYII=";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAs0lEQVR42mNgGAUMXfuf7e/Z/0yDVH2d+59YdO1/uhlowNP/QPwdKFBcv/8/CyGN9ftf8QDV9gP1/Abi+zADYPh81/4nBjht3ffEGaQJST2GAf+hJrfX77/PAdPYv/++AFBsPha197GZCsPXu/c/duja9ywYyH6NRR7hWjR//SeAcYcXJGSfXMat+dn+9v2PVQiE8n+W7v1P69Fc8757/5N0kuIZlDaAGo+D4hroMplhnBUAOtH9P6ictaQAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAxklEQVR42mNgGAU4Qc/+ZyKd+58u797/dHL9/lc8JGnu3P8kvmv/09dA/B+K73fve+JNUGP7/ucKQMWbkTSi4/kgl2ForN//nwUomQ107mc8mmEY5LJwZL9qAAWOY1H4HuQVIC4Gsr9jkd8MlJNhwCbZvf/Z6q79ryQQXnus0rX/2X5sljCgCTzu3vfUH1cYAb2YDNKErAfZgNn9++8LEBFDMkC16+EGAE293b3/sQOp6aRr37NgoAHPgTFwn4PcxEaMi2kPAKK6/dI/uNkQAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource background;
  private static com.google.gwt.resources.client.ImageResource miniBottom;
  private static com.google.gwt.resources.client.ImageResource miniTop;
  private static com.sencha.gxt.theme.neptune.client.sliced.menu.SlicedMenuAppearance.SlicedMenuStyle style;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      background(), 
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
        resourceMap.put("background", background());
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
      case 'background': return this.@com.sencha.gxt.theme.neptune.client.sliced.menu.SlicedMenuAppearance.SlicedMenuResources::background()();
      case 'miniBottom': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuAppearance.Css3MenuResources::miniBottom()();
      case 'miniTop': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuAppearance.Css3MenuResources::miniTop()();
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.sliced.menu.SlicedMenuAppearance.SlicedMenuResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuAppearance.Css3MenuResources::theme()();
    }
    return null;
  }-*/;
}
