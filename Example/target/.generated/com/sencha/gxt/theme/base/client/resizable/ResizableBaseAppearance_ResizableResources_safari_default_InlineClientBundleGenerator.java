package com.sencha.gxt.theme.base.client.resizable;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ResizableBaseAppearance_ResizableResources_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.resizable.ResizableBaseAppearance.ResizableResources {
  private static ResizableBaseAppearance_ResizableResources_safari_default_InlineClientBundleGenerator _instance0 = new ResizableBaseAppearance_ResizableResources_safari_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.base.client.resizable.ResizableBaseAppearance.ResizableStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJE5YCFCODB{position:" + ("absolute")  + ";z-index:" + ("100")  + ";font-size:" + ("1px")  + ";line-height:" + ("6px")  + ";overflow:" + ("hidden")  + ";opacity:" + ("0")  + ";}.GJE5YCFCPDB{width:" + ("6px")  + ";cursor:" + ("w-resize")  + ";left:" + ("0")  + ";top:" + ("0")  + ";height:") + (("100%")  + ";}.GJE5YCFCDEB{width:" + ("100%")  + ";cursor:" + ("s-resize")  + ";right:" + ("0")  + ";bottom:" + ("0")  + ";height:" + ("6px")  + ";}.GJE5YCFCGEB{width:" + ("6px")  + ";cursor:" + ("e-resize")  + ";right:" + ("0")  + ";top:" + ("0")  + ";height:" + ("100%") ) + (";}.GJE5YCFCAEB{width:" + ("100%")  + ";cursor:" + ("n-resize")  + ";right:" + ("0")  + ";top:" + ("0")  + ";height:" + ("6px")  + ";}.GJE5YCFCEEB{width:" + ("6px")  + ";cursor:" + ("sw-resize")  + ";left:" + ("0")  + ";bottom:" + ("0")  + ";height:" + ("6px")  + ";z-index:") + (("101")  + ";}.GJE5YCFCCEB{width:" + ("6px")  + ";cursor:" + ("ne-resize")  + ";right:" + ("0")  + ";top:" + ("0")  + ";height:" + ("6px")  + ";z-index:" + ("101")  + ";}.GJE5YCFCBEB{width:" + ("6px")  + ";cursor:" + ("nw-resize")  + ";left:" + ("0")  + ";top:" + ("0") ) + (";height:" + ("6px")  + ";z-index:" + ("101")  + ";}.GJE5YCFCFEB{width:" + ("6px")  + ";cursor:" + ("se-resize")  + ";right:" + ("0")  + ";bottom:" + ("0")  + ";height:" + ("6px")  + ";z-index:" + ("101")  + ";}.GJE5YCFCHEB .GJE5YCFCODB,.GJE5YCFCJEB .GJE5YCFCODB{opacity:" + ("1")  + ";}.GJE5YCFCHEB .GJE5YCFCPDB,.GJE5YCFCJEB .GJE5YCFCPDB,.GJE5YCFCHEB .GJE5YCFCGEB,.GJE5YCFCJEB .GJE5YCFCGEB{background-position:" + ("right")  + ";}.GJE5YCFCHEB .GJE5YCFCDEB,.GJE5YCFCJEB .GJE5YCFCDEB,.GJE5YCFCHEB .GJE5YCFCAEB,.GJE5YCFCJEB .GJE5YCFCAEB{background-position:") + (("top")  + ";}.GJE5YCFCHEB .GJE5YCFCEEB,.GJE5YCFCJEB .GJE5YCFCEEB{background-position:" + ("top"+ " " +"right")  + ";}.GJE5YCFCHEB .GJE5YCFCCEB,.GJE5YCFCJEB .GJE5YCFCCEB{background-position:" + ("bottom"+ " " +"left")  + ";}.GJE5YCFCHEB .GJE5YCFCBEB,.GJE5YCFCJEB .GJE5YCFCBEB{background-position:" + ("bottom"+ " " +"right")  + ";}.GJE5YCFCHEB .GJE5YCFCFEB,.GJE5YCFCJEB .GJE5YCFCFEB{background-position:" + ("top"+ " " +"left")  + ";}.GJE5YCFCKEB{border:" + ("1px"+ " " +"dashed")  + ";position:" + ("absolute")  + ";overflow:" + ("hidden")  + ";display:" + ("none")  + ";right:" + ("0")  + ";top:" + ("0") ) + (";z-index:" + ("50000")  + ";}.GJE5YCFCIEB{width:" + ("100%")  + ";height:" + ("100%")  + ";display:" + ("none")  + ";position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("200000")  + ";}.GJE5YCFCODB{opacity:" + ("0")  + ";background-color:" + ("#fff")  + ";}")) : ((".GJE5YCFCODB{position:" + ("absolute")  + ";z-index:" + ("100")  + ";font-size:" + ("1px")  + ";line-height:" + ("6px")  + ";overflow:" + ("hidden")  + ";opacity:" + ("0")  + ";}.GJE5YCFCPDB{width:" + ("6px")  + ";cursor:" + ("e-resize")  + ";right:" + ("0")  + ";top:" + ("0")  + ";height:") + (("100%")  + ";}.GJE5YCFCDEB{width:" + ("100%")  + ";cursor:" + ("s-resize")  + ";left:" + ("0")  + ";bottom:" + ("0")  + ";height:" + ("6px")  + ";}.GJE5YCFCGEB{width:" + ("6px")  + ";cursor:" + ("w-resize")  + ";left:" + ("0")  + ";top:" + ("0")  + ";height:" + ("100%") ) + (";}.GJE5YCFCAEB{width:" + ("100%")  + ";cursor:" + ("n-resize")  + ";left:" + ("0")  + ";top:" + ("0")  + ";height:" + ("6px")  + ";}.GJE5YCFCEEB{width:" + ("6px")  + ";cursor:" + ("se-resize")  + ";right:" + ("0")  + ";bottom:" + ("0")  + ";height:" + ("6px")  + ";z-index:") + (("101")  + ";}.GJE5YCFCCEB{width:" + ("6px")  + ";cursor:" + ("nw-resize")  + ";left:" + ("0")  + ";top:" + ("0")  + ";height:" + ("6px")  + ";z-index:" + ("101")  + ";}.GJE5YCFCBEB{width:" + ("6px")  + ";cursor:" + ("ne-resize")  + ";right:" + ("0")  + ";top:" + ("0") ) + (";height:" + ("6px")  + ";z-index:" + ("101")  + ";}.GJE5YCFCFEB{width:" + ("6px")  + ";cursor:" + ("sw-resize")  + ";left:" + ("0")  + ";bottom:" + ("0")  + ";height:" + ("6px")  + ";z-index:" + ("101")  + ";}.GJE5YCFCHEB .GJE5YCFCODB,.GJE5YCFCJEB .GJE5YCFCODB{opacity:" + ("1")  + ";}.GJE5YCFCHEB .GJE5YCFCPDB,.GJE5YCFCJEB .GJE5YCFCPDB,.GJE5YCFCHEB .GJE5YCFCGEB,.GJE5YCFCJEB .GJE5YCFCGEB{background-position:" + ("left")  + ";}.GJE5YCFCHEB .GJE5YCFCDEB,.GJE5YCFCJEB .GJE5YCFCDEB,.GJE5YCFCHEB .GJE5YCFCAEB,.GJE5YCFCJEB .GJE5YCFCAEB{background-position:") + (("top")  + ";}.GJE5YCFCHEB .GJE5YCFCEEB,.GJE5YCFCJEB .GJE5YCFCEEB{background-position:" + ("top"+ " " +"left")  + ";}.GJE5YCFCHEB .GJE5YCFCCEB,.GJE5YCFCJEB .GJE5YCFCCEB{background-position:" + ("bottom"+ " " +"right")  + ";}.GJE5YCFCHEB .GJE5YCFCBEB,.GJE5YCFCJEB .GJE5YCFCBEB{background-position:" + ("bottom"+ " " +"left")  + ";}.GJE5YCFCHEB .GJE5YCFCFEB,.GJE5YCFCJEB .GJE5YCFCFEB{background-position:" + ("top"+ " " +"right")  + ";}.GJE5YCFCKEB{border:" + ("1px"+ " " +"dashed")  + ";position:" + ("absolute")  + ";overflow:" + ("hidden")  + ";display:" + ("none")  + ";left:" + ("0")  + ";top:" + ("0") ) + (";z-index:" + ("50000")  + ";}.GJE5YCFCIEB{width:" + ("100%")  + ";height:" + ("100%")  + ";display:" + ("none")  + ";position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("200000")  + ";}.GJE5YCFCODB{opacity:" + ("0")  + ";background-color:" + ("#fff")  + ";}"));
      }
      public java.lang.String handle() {
        return "GJE5YCFCODB";
      }
      public java.lang.String handleEast() {
        return "GJE5YCFCPDB";
      }
      public java.lang.String handleNorth() {
        return "GJE5YCFCAEB";
      }
      public java.lang.String handleNortheast() {
        return "GJE5YCFCBEB";
      }
      public java.lang.String handleNorthwest() {
        return "GJE5YCFCCEB";
      }
      public java.lang.String handleSouth() {
        return "GJE5YCFCDEB";
      }
      public java.lang.String handleSoutheast() {
        return "GJE5YCFCEEB";
      }
      public java.lang.String handleSouthwest() {
        return "GJE5YCFCFEB";
      }
      public java.lang.String handleWest() {
        return "GJE5YCFCGEB";
      }
      public java.lang.String over() {
        return "GJE5YCFCHEB";
      }
      public java.lang.String overlay() {
        return "GJE5YCFCIEB";
      }
      public java.lang.String pinned() {
        return "GJE5YCFCJEB";
      }
      public java.lang.String proxy() {
        return "GJE5YCFCKEB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.resizable.ResizableBaseAppearance.ResizableStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.resizable.ResizableBaseAppearance.ResizableStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.base.client.resizable.ResizableBaseAppearance.ResizableStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.sencha.gxt.theme.base.client.resizable.ResizableBaseAppearance.ResizableResources::style()();
    }
    return null;
  }-*/;
}
