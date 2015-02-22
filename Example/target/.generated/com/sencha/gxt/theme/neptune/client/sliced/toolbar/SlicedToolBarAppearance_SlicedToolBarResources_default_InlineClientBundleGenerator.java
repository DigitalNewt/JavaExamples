package com.sencha.gxt.theme.neptune.client.sliced.toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class SlicedToolBarAppearance_SlicedToolBarResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.sliced.toolbar.SlicedToolBarAppearance.SlicedToolBarResources {
  private static SlicedToolBarAppearance_SlicedToolBarResources_default_InlineClientBundleGenerator _instance0 = new SlicedToolBarAppearance_SlicedToolBarResources_default_InlineClientBundleGenerator();
  private void backgroundInitializer() {
    background = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "background",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 800, false, false
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
  private void moreIconInitializer() {
    moreIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "moreIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 12, 16, false, false
    );
  }
  private static class moreIconInitializer {
    static {
      _instance0.moreIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return moreIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource moreIcon() {
    return moreIconInitializer.get();
  }
  private void moreIconToolBarInitializer() {
    moreIconToolBar = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "moreIconToolBar",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 12, 16, false, false
    );
  }
  private static class moreIconToolBarInitializer {
    static {
      _instance0.moreIconToolBarInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return moreIconToolBar;
    }
  }
  public com.google.gwt.resources.client.ImageResource moreIconToolBar() {
    return moreIconToolBarInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.neptune.client.base.toolbar.Css3ToolBarAppearance.Css3ToolBarStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJE5YCFCE2C{overflow:" + ("hidden")  + ";}.GJE5YCFCF2C{overflow:" + ("hidden")  + ";zoom:" + ("1")  + ";position:" + ("relative")  + ";right:" + ("0")  + ";top:" + ("0")  + ";}.x-toolbar-mark .GJE5YCFCG2C img{background:" + ("url("+ " " +moreIconToolBar().getSafeUri().asString() + ")")  + " !important;}.GJE5YCFCH2C{height:" + ((SlicedToolBarAppearance_SlicedToolBarResources_default_InlineClientBundleGenerator.this.background()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedToolBarAppearance_SlicedToolBarResources_default_InlineClientBundleGenerator.this.background()).getSafeUri().asString() + "\") -" + (SlicedToolBarAppearance_SlicedToolBarResources_default_InlineClientBundleGenerator.this.background()).getLeft() + "px -" + (SlicedToolBarAppearance_SlicedToolBarResources_default_InlineClientBundleGenerator.this.background()).getTop() + "px  repeat-x")  + ";width:") + (("auto")  + ";height:" + ("auto")  + ";padding:" + (theme().toolbar().padding().toString() + "")  + ";border-style:" + (theme().toolbar().border().style() + "")  + ";border-color:" + (theme().toolbar().border().color() + "")  + ";border-width:" + (theme().toolbar().border().toString() + "")  + ";display:" + ("block")  + ";position:" + ("relative")  + ";right:" + ("0")  + ";top:" + ("0")  + ";zoom:" + ("1") ) + (";overflow:" + ("hidden")  + ";}")) : ((".GJE5YCFCE2C{overflow:" + ("hidden")  + ";}.GJE5YCFCF2C{overflow:" + ("hidden")  + ";zoom:" + ("1")  + ";position:" + ("relative")  + ";left:" + ("0")  + ";top:" + ("0")  + ";}.x-toolbar-mark .GJE5YCFCG2C img{background:" + ("url("+ " " +moreIconToolBar().getSafeUri().asString() + ")")  + " !important;}.GJE5YCFCH2C{height:" + ((SlicedToolBarAppearance_SlicedToolBarResources_default_InlineClientBundleGenerator.this.background()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedToolBarAppearance_SlicedToolBarResources_default_InlineClientBundleGenerator.this.background()).getSafeUri().asString() + "\") -" + (SlicedToolBarAppearance_SlicedToolBarResources_default_InlineClientBundleGenerator.this.background()).getLeft() + "px -" + (SlicedToolBarAppearance_SlicedToolBarResources_default_InlineClientBundleGenerator.this.background()).getTop() + "px  repeat-x")  + ";width:") + (("auto")  + ";height:" + ("auto")  + ";padding:" + (theme().toolbar().padding().toString() + "")  + ";border-style:" + (theme().toolbar().border().style() + "")  + ";border-color:" + (theme().toolbar().border().color() + "")  + ";border-width:" + (theme().toolbar().border().toString() + "")  + ";display:" + ("block")  + ";position:" + ("relative")  + ";left:" + ("0")  + ";top:" + ("0")  + ";zoom:" + ("1") ) + (";overflow:" + ("hidden")  + ";}"));
      }
      public java.lang.String container() {
        return "GJE5YCFCE2C";
      }
      public java.lang.String inner() {
        return "GJE5YCFCF2C";
      }
      public java.lang.String moreIcon() {
        return "GJE5YCFCG2C";
      }
      public java.lang.String toolBar() {
        return "GJE5YCFCH2C";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.base.toolbar.Css3ToolBarAppearance.Css3ToolBarStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.base.toolbar.Css3ToolBarAppearance.Css3ToolBarStyle style() {
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
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAMgCAYAAADiDQiHAAAAH0lEQVR42u3EMQEAAAwCIPuX1rXYAwfpiSRJkiRJ+mwbFHQ1Chfn/gAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAwAAAAQCAYAAAAiYZ4HAAAAcElEQVR42mNgGCbg////NkC8H4ibsfFxaVr+HwLCsfGxaeAB4ttA/BmIVdD5uDQZAPF3ID4PxBzofFya9kOd4oCNj644HyrZj42PrtgEiH8D8WkgZkHnoysWAOL7QPweiBXQ+dhMlwG5ERYa6PxBDgCifdkjzY3f7wAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAwAAAAQCAYAAAAiYZ4HAAAAi0lEQVR42mNgGCYgLS3NJjU1dT8QN2Pj49K0HIj/p6enh2PjY4CsrCweoILbQPw5OTlZBZ2PVRPQCQZABd+B+HxCQgIHOh+Xpv0gp2RkZDhg46MrzgdJAnE/Nj4KAHrOBCjxG4hP19fXs6DzURQD3ScAlLgPxO+BViug8zFMT0lJkQG5ERYa6PxBDgAlLWpBa3/PRAAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource background;
  private static com.google.gwt.resources.client.ImageResource moreIcon;
  private static com.google.gwt.resources.client.ImageResource moreIconToolBar;
  private static com.sencha.gxt.theme.neptune.client.base.toolbar.Css3ToolBarAppearance.Css3ToolBarStyle style;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      background(), 
      moreIcon(), 
      moreIconToolBar(), 
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
        resourceMap.put("moreIcon", moreIcon());
        resourceMap.put("moreIconToolBar", moreIconToolBar());
        resourceMap.put("style", style());
        resourceMap.put("theme", theme());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'background': return this.@com.sencha.gxt.theme.neptune.client.sliced.toolbar.SlicedToolBarAppearance.SlicedToolBarResources::background()();
      case 'moreIcon': return this.@com.sencha.gxt.theme.neptune.client.base.container.Css3HBoxLayoutContainerAppearance.Css3HBoxLayoutContainerResources::moreIcon()();
      case 'moreIconToolBar': return this.@com.sencha.gxt.theme.neptune.client.base.container.Css3HBoxLayoutContainerAppearance.Css3HBoxLayoutContainerResources::moreIconToolBar()();
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.sliced.toolbar.SlicedToolBarAppearance.SlicedToolBarResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.toolbar.Css3ToolBarAppearance.Css3ToolBarResources::theme()();
    }
    return null;
  }-*/;
}
