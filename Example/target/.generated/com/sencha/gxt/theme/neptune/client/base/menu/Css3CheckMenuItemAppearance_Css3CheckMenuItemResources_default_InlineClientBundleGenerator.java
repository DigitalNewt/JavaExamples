package com.sencha.gxt.theme.neptune.client.base.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3CheckMenuItemAppearance_Css3CheckMenuItemResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.menu.Css3CheckMenuItemAppearance.Css3CheckMenuItemResources {
  private static Css3CheckMenuItemAppearance_Css3CheckMenuItemResources_default_InlineClientBundleGenerator _instance0 = new Css3CheckMenuItemAppearance_Css3CheckMenuItemResources_default_InlineClientBundleGenerator();
  private void checkedInitializer() {
    checked = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "checked",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 16, 16, false, false
    );
  }
  private static class checkedInitializer {
    static {
      _instance0.checkedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return checked;
    }
  }
  public com.google.gwt.resources.client.ImageResource checked() {
    return checkedInitializer.get();
  }
  private void groupCheckedInitializer() {
    groupChecked = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "groupChecked",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 16, 16, false, false
    );
  }
  private static class groupCheckedInitializer {
    static {
      _instance0.groupCheckedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return groupChecked;
    }
  }
  public com.google.gwt.resources.client.ImageResource groupChecked() {
    return groupCheckedInitializer.get();
  }
  private void uncheckedInitializer() {
    unchecked = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "unchecked",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 16, 16, false, false
    );
  }
  private static class uncheckedInitializer {
    static {
      _instance0.uncheckedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return unchecked;
    }
  }
  public com.google.gwt.resources.client.ImageResource unchecked() {
    return uncheckedInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAmElEQVR42mNgGBSga//T/6Ti+v2veFAMIAb8/PPv/7Jzr6GGPNtPkgGomoF437Ngog1A1txzAGIARhi8/fr7/8Yr78CK8Wm++eo7dgOmH3sBlgAphhmCTTMIYDUAJAlzHkjTl59/sWrGaQAIIBvSd/AZVs14DUA3BJtmggbADAG5AJtmogwAAVAY4AJEGYAPYDWAVEy1jAgAo65oIEUsyq4AAAAASUVORK5CYII=";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAbUlEQVR42mNgGHKgfv9/lq79z6b37H+mQZbm7v3PVnftf/ofiJ+373+uQK7m/yA2SIx6moES4fX7X/GQqflZPkTy6WFkQ4h2duf+J/0IRRBDSPYzuiFkBRiyIWSFNqZLSNSMbAjZmpFjYGhkLgDI7cz3yt3HDgAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAIklEQVR42mNgGBSga//T/6RiDANIAaMGjBowiA2gKC9QAgB5XXqr4P/OZAAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource checked;
  private static com.google.gwt.resources.client.ImageResource groupChecked;
  private static com.google.gwt.resources.client.ImageResource unchecked;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      checked(), 
      groupChecked(), 
      unchecked(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("checked", checked());
        resourceMap.put("groupChecked", groupChecked());
        resourceMap.put("unchecked", unchecked());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'checked': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3CheckMenuItemAppearance.Css3CheckMenuItemResources::checked()();
      case 'groupChecked': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3CheckMenuItemAppearance.Css3CheckMenuItemResources::groupChecked()();
      case 'unchecked': return this.@com.sencha.gxt.theme.neptune.client.base.menu.Css3CheckMenuItemAppearance.Css3CheckMenuItemResources::unchecked()();
    }
    return null;
  }-*/;
}
