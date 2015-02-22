package com.sencha.gxt.theme.neptune.client.base.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3MenuItemAppearance_Css3MenuItemResources_chrome_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuItemAppearance.Css3MenuItemResources {
  private static Css3MenuItemAppearance_Css3MenuItemResources_chrome_safari_default_InlineClientBundleGenerator _instance0 = new Css3MenuItemAppearance_Css3MenuItemResources_chrome_safari_default_InlineClientBundleGenerator();
  private void menuParentInitializer() {
    menuParent = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "menuParent",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
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
    style = new com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuItemAppearance.Css3MenuItemStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJE5YCFCGSC{display:" + ("block")  + ";outline-style:" + ("none")  + ";outline-width:" + ("0")  + ";padding:" + ("0"+ " " +"27px"+ " " +"0"+ " " +"21px")  + ";position:" + ("relative")  + ";text-decoration:" + ("none")  + ";white-space:" + ("nowrap")  + ";}.GJE5YCFCJSC{white-space:" + ("nowrap")  + ";display:" + ("block")  + ";padding:" + (theme().menu().activeItemBorder().toString() + "")  + ";margin:") + ((theme().menu().itemPadding().toString() + "")  + ";cursor:" + ("pointer")  + ";font-size:" + (theme().menu().itemText().size() + "")  + ";font-family:" + (theme().menu().itemText().family() + "")  + ";font-weight:" + (theme().menu().itemText().weight() + "")  + ";line-height:" + (theme().menu().itemLineHeight() + "")  + ";color:" + (theme().menu().itemText().color() + "")  + ";}.GJE5YCFCISC{border:" + ("0"+ " " +"none")  + ";height:" + ("16px")  + ";padding:" + ("0")  + ";vertical-align:" + ("top") ) + (";width:" + ("16px")  + ";position:" + ("absolute")  + ";right:" + ("3px")  + ";top:" + ("3px")  + ";margin:" + ("0")  + ";background-position:" + ("center")  + ";}.GJE5YCFCHSC{height:" + ((Css3MenuItemAppearance_Css3MenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getHeight() + "px")  + ";width:" + ((Css3MenuItemAppearance_Css3MenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3MenuItemAppearance_Css3MenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getSafeUri().asString() + "\") -" + (Css3MenuItemAppearance_Css3MenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getLeft() + "px -" + (Css3MenuItemAppearance_Css3MenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getTop() + "px  no-repeat")  + ";height:") + (("auto")  + ";width:" + ("auto")  + ";background-position:" + ("left")  + ";background-repeat:" + ("no-repeat")  + ";}.GJE5YCFCFSC{background:" + ("-webkit-linear-gradient(" + "left"+ ","+ " " +theme().menu().activeItemGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "left"+ ","+ " " +theme().menu().activeItemGradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "left"+ ","+ " " +theme().menu().activeItemGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"right"+ ","+ " " +theme().menu().activeItemGradient() + "" + ")")  + ";border-color:" + (theme().menu().activeItemBorder().color() + "")  + ";border-width:" + (theme().menu().activeItemBorder().toString() + "")  + ";border-style:" + (theme().menu().activeItemBorder().style() + "") ) + (";padding:" + ("0")  + " !important;}")) : ((".GJE5YCFCGSC{display:" + ("block")  + ";outline-style:" + ("none")  + ";outline-width:" + ("0")  + ";padding:" + ("0"+ " " +"21px"+ " " +"0"+ " " +"27px")  + ";position:" + ("relative")  + ";text-decoration:" + ("none")  + ";white-space:" + ("nowrap")  + ";}.GJE5YCFCJSC{white-space:" + ("nowrap")  + ";display:" + ("block")  + ";padding:" + (theme().menu().activeItemBorder().toString() + "")  + ";margin:") + ((theme().menu().itemPadding().toString() + "")  + ";cursor:" + ("pointer")  + ";font-size:" + (theme().menu().itemText().size() + "")  + ";font-family:" + (theme().menu().itemText().family() + "")  + ";font-weight:" + (theme().menu().itemText().weight() + "")  + ";line-height:" + (theme().menu().itemLineHeight() + "")  + ";color:" + (theme().menu().itemText().color() + "")  + ";}.GJE5YCFCISC{border:" + ("0"+ " " +"none")  + ";height:" + ("16px")  + ";padding:" + ("0")  + ";vertical-align:" + ("top") ) + (";width:" + ("16px")  + ";position:" + ("absolute")  + ";left:" + ("3px")  + ";top:" + ("3px")  + ";margin:" + ("0")  + ";background-position:" + ("center")  + ";}.GJE5YCFCHSC{height:" + ((Css3MenuItemAppearance_Css3MenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getHeight() + "px")  + ";width:" + ((Css3MenuItemAppearance_Css3MenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3MenuItemAppearance_Css3MenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getSafeUri().asString() + "\") -" + (Css3MenuItemAppearance_Css3MenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getLeft() + "px -" + (Css3MenuItemAppearance_Css3MenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getTop() + "px  no-repeat")  + ";height:") + (("auto")  + ";width:" + ("auto")  + ";background-position:" + ("right")  + ";background-repeat:" + ("no-repeat")  + ";}.GJE5YCFCFSC{background:" + ("-webkit-linear-gradient(" + "left"+ ","+ " " +theme().menu().activeItemGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "left"+ ","+ " " +theme().menu().activeItemGradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "left"+ ","+ " " +theme().menu().activeItemGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"right"+ ","+ " " +theme().menu().activeItemGradient() + "" + ")")  + ";border-color:" + (theme().menu().activeItemBorder().color() + "")  + ";border-width:" + (theme().menu().activeItemBorder().toString() + "")  + ";border-style:" + (theme().menu().activeItemBorder().style() + "") ) + (";padding:" + ("0")  + " !important;}"));
      }
      public java.lang.String active() {
        return "GJE5YCFCFSC";
      }
      public java.lang.String menuItem() {
        return "GJE5YCFCGSC";
      }
      public java.lang.String menuItemArrow() {
        return "GJE5YCFCHSC";
      }
      public java.lang.String menuItemIcon() {
        return "GJE5YCFCISC";
      }
      public java.lang.String menuListItem() {
        return "GJE5YCFCJSC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuItemAppearance.Css3MenuItemStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuItemAppearance.Css3MenuItemStyle style() {
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
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAwAAAAMCAYAAABWdVznAAAAYUlEQVR42mNgIBV07X8lQaKGp9fb9z9WIUXDfyB+3r3/hQ4pGv5373/6uWP/UxuiNUDx7659z4JJ0fC/c/+TYmI1/O7c/yyaKCeB3b/vmTuxnn4OdIYF0cHas/+ZBgMtAQCuJVdGQOIbQAAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource menuParent;
  private static com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuItemAppearance.Css3MenuItemStyle style;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
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
        resourceMap.put("menuParent", menuParent());
        resourceMap.put("style", style());
        resourceMap.put("theme", theme());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'menuParent': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuItemAppearance.Css3MenuItemResources::menuParent()();
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuItemAppearance.Css3MenuItemResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3MenuItemAppearance.Css3MenuItemResources::theme()();
    }
    return null;
  }-*/;
}
