package com.sencha.gxt.theme.neptune.client.sliced.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.sliced.menu.SlicedMenuItemAppearance.SlicedMenuItemResources {
  private static SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator _instance0 = new SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator();
  private void itemOverInitializer() {
    itemOver = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "itemOver",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 800, false, false
    );
  }
  private static class itemOverInitializer {
    static {
      _instance0.itemOverInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return itemOver;
    }
  }
  public com.google.gwt.resources.client.ImageResource itemOver() {
    return itemOverInitializer.get();
  }
  private void menuParentInitializer() {
    menuParent = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "menuParent",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 12, 12, false, false
    );
  }
  private static class menuParentInitializer {
    static {
      _instance0.menuParentInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return menuParent;
    }
  }
  public com.google.gwt.resources.client.ImageResource menuParent() {
    return menuParentInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.neptune.client.sliced.menu.SlicedMenuItemAppearance.SlicedMenuItemStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJE5YCFCHJD{display:" + ("block")  + ";outline-style:" + ("none")  + ";outline-width:" + ("0")  + ";padding:" + ("0"+ " " +"27px"+ " " +"0"+ " " +"21px")  + ";text-decoration:" + ("none")  + ";white-space:" + ("nowrap")  + ";}.GJE5YCFCKJD{white-space:" + ("nowrap")  + ";display:" + ("block")  + ";padding:" + (theme().menu().activeItemBorder().toString() + "")  + ";margin:" + (theme().menu().itemPadding().toString() + "")  + ";cursor:") + (("pointer")  + ";font-size:" + (theme().menu().itemText().size() + "")  + ";font-family:" + (theme().menu().itemText().family() + "")  + ";font-weight:" + (theme().menu().itemText().weight() + "")  + ";line-height:" + (theme().menu().itemLineHeight() + "")  + ";color:" + (theme().menu().itemText().color() + "")  + ";}.GJE5YCFCJJD{border:" + ("0"+ " " +"none")  + ";height:" + ("16px")  + ";padding:" + ("0")  + ";vertical-align:" + ("top")  + ";width:" + ("16px") ) + (";position:" + ("absolute")  + ";right:" + ("3px")  + ";margin:" + ("3px"+ " " +"0"+ " " +"0")  + ";}.GJE5YCFCIJD{height:" + ((SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.menuParent()).getHeight() + "px")  + ";width:" + ((SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.menuParent()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.menuParent()).getSafeUri().asString() + "\") -" + (SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.menuParent()).getLeft() + "px -" + (SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.menuParent()).getTop() + "px  no-repeat")  + ";height:" + ("auto")  + ";width:" + ("auto")  + ";background-position:" + ("left")  + ";background-repeat:") + (("no-repeat")  + ";}.GJE5YCFCGJD{height:" + ((SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.itemOver()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.itemOver()).getSafeUri().asString() + "\") -" + (SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.itemOver()).getLeft() + "px -" + (SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.itemOver()).getTop() + "px  repeat-x")  + ";height:" + ("auto")  + ";border-color:" + (theme().menu().activeItemBorder().color() + "")  + ";border-width:" + (theme().menu().activeItemBorder().toString() + "")  + ";border-style:" + (theme().menu().activeItemBorder().style() + "")  + ";padding:" + ("0")  + " !important;}")) : ((".GJE5YCFCHJD{display:" + ("block")  + ";outline-style:" + ("none")  + ";outline-width:" + ("0")  + ";padding:" + ("0"+ " " +"21px"+ " " +"0"+ " " +"27px")  + ";text-decoration:" + ("none")  + ";white-space:" + ("nowrap")  + ";}.GJE5YCFCKJD{white-space:" + ("nowrap")  + ";display:" + ("block")  + ";padding:" + (theme().menu().activeItemBorder().toString() + "")  + ";margin:" + (theme().menu().itemPadding().toString() + "")  + ";cursor:") + (("pointer")  + ";font-size:" + (theme().menu().itemText().size() + "")  + ";font-family:" + (theme().menu().itemText().family() + "")  + ";font-weight:" + (theme().menu().itemText().weight() + "")  + ";line-height:" + (theme().menu().itemLineHeight() + "")  + ";color:" + (theme().menu().itemText().color() + "")  + ";}.GJE5YCFCJJD{border:" + ("0"+ " " +"none")  + ";height:" + ("16px")  + ";padding:" + ("0")  + ";vertical-align:" + ("top")  + ";width:" + ("16px") ) + (";position:" + ("absolute")  + ";left:" + ("3px")  + ";margin:" + ("3px"+ " " +"0"+ " " +"0")  + ";}.GJE5YCFCIJD{height:" + ((SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.menuParent()).getHeight() + "px")  + ";width:" + ((SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.menuParent()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.menuParent()).getSafeUri().asString() + "\") -" + (SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.menuParent()).getLeft() + "px -" + (SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.menuParent()).getTop() + "px  no-repeat")  + ";height:" + ("auto")  + ";width:" + ("auto")  + ";background-position:" + ("right")  + ";background-repeat:") + (("no-repeat")  + ";}.GJE5YCFCGJD{height:" + ((SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.itemOver()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.itemOver()).getSafeUri().asString() + "\") -" + (SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.itemOver()).getLeft() + "px -" + (SlicedMenuItemAppearance_SlicedMenuItemResources_safari3_safari_default_InlineClientBundleGenerator.this.itemOver()).getTop() + "px  repeat-x")  + ";height:" + ("auto")  + ";border-color:" + (theme().menu().activeItemBorder().color() + "")  + ";border-width:" + (theme().menu().activeItemBorder().toString() + "")  + ";border-style:" + (theme().menu().activeItemBorder().style() + "")  + ";padding:" + ("0")  + " !important;}"));
      }
      public java.lang.String active() {
        return "GJE5YCFCGJD";
      }
      public java.lang.String menuItem() {
        return "GJE5YCFCHJD";
      }
      public java.lang.String menuItemArrow() {
        return "GJE5YCFCIJD";
      }
      public java.lang.String menuItemIcon() {
        return "GJE5YCFCJJD";
      }
      public java.lang.String menuListItem() {
        return "GJE5YCFCKJD";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.sliced.menu.SlicedMenuItemAppearance.SlicedMenuItemStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.sliced.menu.SlicedMenuItemAppearance.SlicedMenuItemStyle style() {
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
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAMgCAMAAADV0/i1AAAAA1BMVEXW6PbsB1qVAAAAFUlEQVR42mNgGAWjYBSMglEwCkgHAAZAAAGx2S2jAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAwAAAAMCAYAAABWdVznAAAAYUlEQVR42mNgIBV07X8lQaKGp9fb9z9WIUXDfyB+3r3/hQ4pGv5373/6uWP/UxuiNUDx7659z4JJ0fC/c/+TYmI1/O7c/yyaKCeB3b/vmTuxnn4OdIYF0cHas/+ZBgMtAQCuJVdGQOIbQAAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource itemOver;
  private static com.google.gwt.resources.client.ImageResource menuParent;
  private static com.sencha.gxt.theme.neptune.client.sliced.menu.SlicedMenuItemAppearance.SlicedMenuItemStyle style;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      itemOver(), 
      menuParent(), 
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
        resourceMap.put("itemOver", itemOver());
        resourceMap.put("menuParent", menuParent());
        resourceMap.put("style", style());
        resourceMap.put("theme", theme());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'itemOver': return this.@com.sencha.gxt.theme.neptune.client.sliced.menu.SlicedMenuItemAppearance.SlicedMenuItemResources::itemOver()();
      case 'menuParent': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuItemAppearance.Css3MenuItemResources::menuParent()();
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.sliced.menu.SlicedMenuItemAppearance.SlicedMenuItemResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuItemAppearance.Css3MenuItemResources::theme()();
    }
    return null;
  }-*/;
}
