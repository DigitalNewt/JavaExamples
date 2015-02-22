package com.sencha.gxt.theme.neptune.client.base.container;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3HBoxLayoutContainerAppearance_Css3HBoxLayoutContainerResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.container.Css3HBoxLayoutContainerAppearance.Css3HBoxLayoutContainerResources {
  private static Css3HBoxLayoutContainerAppearance_Css3HBoxLayoutContainerResources_default_InlineClientBundleGenerator _instance0 = new Css3HBoxLayoutContainerAppearance_Css3HBoxLayoutContainerResources_default_InlineClientBundleGenerator();
  private void moreIconInitializer() {
    moreIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "moreIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
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
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
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
    style = new com.sencha.gxt.theme.base.client.container.HBoxLayoutDefaultAppearance.HBoxLayoutStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJE5YCFCMP{overflow:" + ("hidden")  + ";}.GJE5YCFCNP{overflow:" + ("hidden")  + ";zoom:" + ("1")  + ";position:" + ("relative")  + ";right:" + ("0")  + ";top:" + ("0")  + ";}.x-toolbar-mark .GJE5YCFCOP img{background:" + ("url("+ " " +moreIconToolBar().getSafeUri().asString() + ")")  + " !important;}")) : ((".GJE5YCFCMP{overflow:" + ("hidden")  + ";}.GJE5YCFCNP{overflow:" + ("hidden")  + ";zoom:" + ("1")  + ";position:" + ("relative")  + ";left:" + ("0")  + ";top:" + ("0")  + ";}.x-toolbar-mark .GJE5YCFCOP img{background:" + ("url("+ " " +moreIconToolBar().getSafeUri().asString() + ")")  + " !important;}"));
      }
      public java.lang.String container() {
        return "GJE5YCFCMP";
      }
      public java.lang.String inner() {
        return "GJE5YCFCNP";
      }
      public java.lang.String moreIcon() {
        return "GJE5YCFCOP";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.container.HBoxLayoutDefaultAppearance.HBoxLayoutStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.container.HBoxLayoutDefaultAppearance.HBoxLayoutStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAwAAAAQCAYAAAAiYZ4HAAAAcElEQVR42mNgGCbg////NkC8H4ibsfFxaVr+HwLCsfGxaeAB4ttA/BmIVdD5uDQZAPF3ID4PxBzofFya9kOd4oCNj644HyrZj42PrtgEiH8D8WkgZkHnoysWAOL7QPweiBXQ+dhMlwG5ERYa6PxBDgCifdkjzY3f7wAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAwAAAAQCAYAAAAiYZ4HAAAAi0lEQVR42mNgGCYgLS3NJjU1dT8QN2Pj49K0HIj/p6enh2PjY4CsrCweoILbQPw5OTlZBZ2PVRPQCQZABd+B+HxCQgIHOh+Xpv0gp2RkZDhg46MrzgdJAnE/Nj4KAHrOBCjxG4hP19fXs6DzURQD3ScAlLgPxO+BViug8zFMT0lJkQG5ERYa6PxBDgAlLWpBa3/PRAAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource moreIcon;
  private static com.google.gwt.resources.client.ImageResource moreIconToolBar;
  private static com.sencha.gxt.theme.base.client.container.HBoxLayoutDefaultAppearance.HBoxLayoutStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      moreIcon(), 
      moreIconToolBar(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("moreIcon", moreIcon());
        resourceMap.put("moreIconToolBar", moreIconToolBar());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'moreIcon': return this.@com.sencha.gxt.theme.neptune.client.base.container.Css3HBoxLayoutContainerAppearance.Css3HBoxLayoutContainerResources::moreIcon()();
      case 'moreIconToolBar': return this.@com.sencha.gxt.theme.neptune.client.base.container.Css3HBoxLayoutContainerAppearance.Css3HBoxLayoutContainerResources::moreIconToolBar()();
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.base.container.Css3HBoxLayoutContainerAppearance.Css3HBoxLayoutContainerResources::style()();
    }
    return null;
  }-*/;
}
