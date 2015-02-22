package com.sencha.gxt.theme.neptune.client.sliced.button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellResources {
  private static SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator _instance0 = new SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator();
  private void arrowInitializer() {
    arrow = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "arrow",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 10, 10, false, false
    );
  }
  private static class arrowInitializer {
    static {
      _instance0.arrowInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return arrow;
    }
  }
  public com.google.gwt.resources.client.ImageResource arrow() {
    return arrowInitializer.get();
  }
  private void arrowBottomInitializer() {
    arrowBottom = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "arrowBottom",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 200, 14, false, false
    );
  }
  private static class arrowBottomInitializer {
    static {
      _instance0.arrowBottomInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return arrowBottom;
    }
  }
  public com.google.gwt.resources.client.ImageResource arrowBottom() {
    return arrowBottomInitializer.get();
  }
  private void splitInitializer() {
    split = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "split",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 14, 72, false, false
    );
  }
  private static class splitInitializer {
    static {
      _instance0.splitInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return split;
    }
  }
  public com.google.gwt.resources.client.ImageResource split() {
    return splitInitializer.get();
  }
  private void splitBottomInitializer() {
    splitBottom = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "splitBottom",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 200, 14, false, false
    );
  }
  private static class splitBottomInitializer {
    static {
      _instance0.splitBottomInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return splitBottom;
    }
  }
  public com.google.gwt.resources.client.ImageResource splitBottom() {
    return splitBottomInitializer.get();
  }
  private void toolBarArrowInitializer() {
    toolBarArrow = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "toolBarArrow",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage3),
      0, 0, 10, 10, false, false
    );
  }
  private static class toolBarArrowInitializer {
    static {
      _instance0.toolBarArrowInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return toolBarArrow;
    }
  }
  public com.google.gwt.resources.client.ImageResource toolBarArrow() {
    return toolBarArrowInitializer.get();
  }
  private void toolBarArrowBottomInitializer() {
    toolBarArrowBottom = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "toolBarArrowBottom",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage4),
      0, 0, 200, 14, false, false
    );
  }
  private static class toolBarArrowBottomInitializer {
    static {
      _instance0.toolBarArrowBottomInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return toolBarArrowBottom;
    }
  }
  public com.google.gwt.resources.client.ImageResource toolBarArrowBottom() {
    return toolBarArrowBottomInitializer.get();
  }
  private void toolBarSplitInitializer() {
    toolBarSplit = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "toolBarSplit",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage5),
      0, 0, 14, 72, false, false
    );
  }
  private static class toolBarSplitInitializer {
    static {
      _instance0.toolBarSplitInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return toolBarSplit;
    }
  }
  public com.google.gwt.resources.client.ImageResource toolBarSplit() {
    return toolBarSplitInitializer.get();
  }
  private void toolBarSplitBottomInitializer() {
    toolBarSplitBottom = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "toolBarSplitBottom",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage6),
      0, 0, 200, 14, false, false
    );
  }
  private static class toolBarSplitBottomInitializer {
    static {
      _instance0.toolBarSplitBottomInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return toolBarSplitBottom;
    }
  }
  public com.google.gwt.resources.client.ImageResource toolBarSplitBottom() {
    return toolBarSplitBottomInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.neptune.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJE5YCFCBBD{cursor:" + ("pointer")  + ";white-space:" + ("nowrap")  + ";}.GJE5YCFCCBD .GJE5YCFCJBD{width:" + ("100%")  + ";}.GJE5YCFCBBD td{text-align:" + ("center")  + ";}.GJE5YCFCBBD td img{float:" + ("right")  + ";}.GJE5YCFCGBD td img,.GJE5YCFCDBD td img{float:" + ("none")  + ";}.GJE5YCFCHBD{padding:" + ("0"+ " " +"2px")  + ";}.GJE5YCFCACD{padding:" + ("0"+ " " +"2px")  + ";font-family:" + ("Tahoma"+ ","+ " " +"Arial"+ ","+ " " +"Verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:") + (("normal")  + ";text-align:" + ("center")  + ";cursor:" + ("pointer")  + ";white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";}.GJE5YCFCHBD div{font-size:" + ("1px")  + ";}.GJE5YCFCNBD .GJE5YCFCEBD td,.GJE5YCFCNBD .GJE5YCFCFBD td,.GJE5YCFCNBD .GJE5YCFCLBD td{line-height:" + ("18px")  + ";}.GJE5YCFCKBD .GJE5YCFCGBD .GJE5YCFCHBD div,.GJE5YCFCKBD .GJE5YCFCDBD .GJE5YCFCHBD div{height:" + ("20px")  + ";}.GJE5YCFCKBD .GJE5YCFCEBD td,.GJE5YCFCKBD .GJE5YCFCFBD td,.GJE5YCFCKBD .GJE5YCFCLBD td{line-height:" + ("24px")  + ";}.GJE5YCFCKBD .GJE5YCFCGBD .GJE5YCFCHBD div,.GJE5YCFCKBD .GJE5YCFCDBD .GJE5YCFCHBD div{height:" + ("26px")  + ";}.GJE5YCFCIBD .GJE5YCFCEBD td,.GJE5YCFCIBD .GJE5YCFCFBD td,.GJE5YCFCIBD .GJE5YCFCLBD td,.GJE5YCFCIBD .GJE5YCFCHBD div{line-height:" + ("32px") ) + (";}.GJE5YCFCIBD .GJE5YCFCGBD .GJE5YCFCHBD div,.GJE5YCFCIBD .GJE5YCFCDBD .GJE5YCFCHBD div{height:" + ("34px")  + ";}.GJE5YCFCOBD{height:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.split()).getHeight() + "px")  + ";width:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.split()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.split()).getSafeUri().asString() + "\") -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.split()).getLeft() + "px -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.split()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("left"+ " " +"center")  + ";padding-left:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.GJE5YCFCPBD{height:") + (((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.splitBottom()).getHeight() + "px")  + ";width:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.splitBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.splitBottom()).getSafeUri().asString() + "\") -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.splitBottom()).getLeft() + "px -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.splitBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";gwt-image:" + ("\"splitBottom\"")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.GJE5YCFCPAD{height:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrow()).getHeight() + "px") ) + (";width:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrow()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrow()).getSafeUri().asString() + "\") -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrow()).getLeft() + "px -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrow()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-left:" + ("10px")  + ";background-position:" + ("left"+ " " +"center")  + ";background-repeat:" + ("no-repeat")  + ";}.GJE5YCFCABD{height:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrowBottom()).getHeight() + "px")  + ";width:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrowBottom()).getWidth() + "px")  + ";overflow:") + (("hidden")  + ";background:" + ("url(\"" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrowBottom()).getSafeUri().asString() + "\") -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrowBottom()).getLeft() + "px -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrowBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.GJE5YCFCACD{padding:" + (theme().button().padding().toString() + "")  + ";text-align:" + ("center")  + ";font-size:" + (theme().button().font().size() + "")  + ";color:" + (theme().button().font().color() + "") ) + (";font-weight:" + (theme().button().font().weight() + "")  + ";font-family:" + (theme().button().font().family() + "")  + ";}.GJE5YCFCNBD .GJE5YCFCACD{line-height:" + (theme().button().smallLineHeight() + "px")  + ";font-size:" + (theme().button().smallFontSize() + "px")  + ";}.GJE5YCFCKBD .GJE5YCFCACD{line-height:" + (theme().button().mediumLineHeight() + "px")  + ";font-size:" + (theme().button().mediumFontSize() + "px")  + ";}.GJE5YCFCIBD .GJE5YCFCACD{line-height:" + (theme().button().largeLineHeight() + "px")  + ";font-size:" + (theme().button().largeFontSize() + "px")  + ";}.GJE5YCFCHBD{padding:" + ("0")  + ";}.x-toolbar-mark .GJE5YCFCACD{padding:" + (theme().toolbar().buttonOverride().padding().toString() + "")  + ";text-align:") + (("center")  + ";font-size:" + (theme().toolbar().buttonOverride().font().size() + "")  + ";color:" + (theme().toolbar().buttonOverride().font().color() + "")  + ";font-weight:" + (theme().toolbar().buttonOverride().font().weight() + "")  + ";font-family:" + (theme().toolbar().buttonOverride().font().family() + "")  + ";}.x-toolbar-mark .GJE5YCFCNBD .GJE5YCFCACD{line-height:" + (theme().toolbar().buttonOverride().smallLineHeight() + "px")  + ";font-size:" + (theme().toolbar().buttonOverride().smallFontSize() + "px")  + ";}.x-toolbar-mark .GJE5YCFCKBD .GJE5YCFCACD{line-height:" + (theme().toolbar().buttonOverride().mediumLineHeight() + "px")  + ";font-size:" + (theme().toolbar().buttonOverride().mediumFontSize() + "px")  + ";}.x-toolbar-mark .GJE5YCFCIBD .GJE5YCFCACD{line-height:" + (theme().toolbar().buttonOverride().largeLineHeight() + "px")  + ";font-size:" + (theme().toolbar().buttonOverride().largeFontSize() + "px") ) + (";}.x-toolbar-mark .GJE5YCFCOBD{height:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplit()).getHeight() + "px")  + ";width:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplit()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplit()).getSafeUri().asString() + "\") -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplit()).getLeft() + "px -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplit()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("left"+ " " +"center")  + ";padding-left:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GJE5YCFCPBD{height:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getHeight() + "px")  + ";width:") + (((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getSafeUri().asString() + "\") -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getLeft() + "px -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GJE5YCFCPAD{height:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrow()).getHeight() + "px")  + ";width:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrow()).getWidth() + "px")  + ";overflow:" + ("hidden") ) + (";background:" + ("url(\"" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrow()).getSafeUri().asString() + "\") -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrow()).getLeft() + "px -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrow()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-left:" + ("10px")  + ";background-position:" + ("left"+ " " +"center")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GJE5YCFCABD{height:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getHeight() + "px")  + ";width:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getSafeUri().asString() + "\") -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getLeft() + "px -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getTop() + "px  no-repeat")  + ";width:") + (("auto")  + ";height:" + ("auto")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}")) : ((".GJE5YCFCBBD{cursor:" + ("pointer")  + ";white-space:" + ("nowrap")  + ";}.GJE5YCFCCBD .GJE5YCFCJBD{width:" + ("100%")  + ";}.GJE5YCFCBBD td{text-align:" + ("center")  + ";}.GJE5YCFCBBD td img{float:" + ("left")  + ";}.GJE5YCFCGBD td img,.GJE5YCFCDBD td img{float:" + ("none")  + ";}.GJE5YCFCHBD{padding:" + ("0"+ " " +"2px")  + ";}.GJE5YCFCACD{padding:" + ("0"+ " " +"2px")  + ";font-family:" + ("Tahoma"+ ","+ " " +"Arial"+ ","+ " " +"Verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:") + (("normal")  + ";text-align:" + ("center")  + ";cursor:" + ("pointer")  + ";white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";}.GJE5YCFCHBD div{font-size:" + ("1px")  + ";}.GJE5YCFCNBD .GJE5YCFCEBD td,.GJE5YCFCNBD .GJE5YCFCFBD td,.GJE5YCFCNBD .GJE5YCFCLBD td{line-height:" + ("18px")  + ";}.GJE5YCFCKBD .GJE5YCFCGBD .GJE5YCFCHBD div,.GJE5YCFCKBD .GJE5YCFCDBD .GJE5YCFCHBD div{height:" + ("20px")  + ";}.GJE5YCFCKBD .GJE5YCFCEBD td,.GJE5YCFCKBD .GJE5YCFCFBD td,.GJE5YCFCKBD .GJE5YCFCLBD td{line-height:" + ("24px")  + ";}.GJE5YCFCKBD .GJE5YCFCGBD .GJE5YCFCHBD div,.GJE5YCFCKBD .GJE5YCFCDBD .GJE5YCFCHBD div{height:" + ("26px")  + ";}.GJE5YCFCIBD .GJE5YCFCEBD td,.GJE5YCFCIBD .GJE5YCFCFBD td,.GJE5YCFCIBD .GJE5YCFCLBD td,.GJE5YCFCIBD .GJE5YCFCHBD div{line-height:" + ("32px") ) + (";}.GJE5YCFCIBD .GJE5YCFCGBD .GJE5YCFCHBD div,.GJE5YCFCIBD .GJE5YCFCDBD .GJE5YCFCHBD div{height:" + ("34px")  + ";}.GJE5YCFCOBD{height:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.split()).getHeight() + "px")  + ";width:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.split()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.split()).getSafeUri().asString() + "\") -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.split()).getLeft() + "px -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.split()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("right"+ " " +"center")  + ";padding-right:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.GJE5YCFCPBD{height:") + (((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.splitBottom()).getHeight() + "px")  + ";width:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.splitBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.splitBottom()).getSafeUri().asString() + "\") -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.splitBottom()).getLeft() + "px -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.splitBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";gwt-image:" + ("\"splitBottom\"")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.GJE5YCFCPAD{height:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrow()).getHeight() + "px") ) + (";width:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrow()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrow()).getSafeUri().asString() + "\") -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrow()).getLeft() + "px -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrow()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-right:" + ("10px")  + ";background-position:" + ("right"+ " " +"center")  + ";background-repeat:" + ("no-repeat")  + ";}.GJE5YCFCABD{height:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrowBottom()).getHeight() + "px")  + ";width:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrowBottom()).getWidth() + "px")  + ";overflow:") + (("hidden")  + ";background:" + ("url(\"" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrowBottom()).getSafeUri().asString() + "\") -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrowBottom()).getLeft() + "px -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.arrowBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.GJE5YCFCACD{padding:" + (theme().button().padding().toString() + "")  + ";text-align:" + ("center")  + ";font-size:" + (theme().button().font().size() + "")  + ";color:" + (theme().button().font().color() + "") ) + (";font-weight:" + (theme().button().font().weight() + "")  + ";font-family:" + (theme().button().font().family() + "")  + ";}.GJE5YCFCNBD .GJE5YCFCACD{line-height:" + (theme().button().smallLineHeight() + "px")  + ";font-size:" + (theme().button().smallFontSize() + "px")  + ";}.GJE5YCFCKBD .GJE5YCFCACD{line-height:" + (theme().button().mediumLineHeight() + "px")  + ";font-size:" + (theme().button().mediumFontSize() + "px")  + ";}.GJE5YCFCIBD .GJE5YCFCACD{line-height:" + (theme().button().largeLineHeight() + "px")  + ";font-size:" + (theme().button().largeFontSize() + "px")  + ";}.GJE5YCFCHBD{padding:" + ("0")  + ";}.x-toolbar-mark .GJE5YCFCACD{padding:" + (theme().toolbar().buttonOverride().padding().toString() + "")  + ";text-align:") + (("center")  + ";font-size:" + (theme().toolbar().buttonOverride().font().size() + "")  + ";color:" + (theme().toolbar().buttonOverride().font().color() + "")  + ";font-weight:" + (theme().toolbar().buttonOverride().font().weight() + "")  + ";font-family:" + (theme().toolbar().buttonOverride().font().family() + "")  + ";}.x-toolbar-mark .GJE5YCFCNBD .GJE5YCFCACD{line-height:" + (theme().toolbar().buttonOverride().smallLineHeight() + "px")  + ";font-size:" + (theme().toolbar().buttonOverride().smallFontSize() + "px")  + ";}.x-toolbar-mark .GJE5YCFCKBD .GJE5YCFCACD{line-height:" + (theme().toolbar().buttonOverride().mediumLineHeight() + "px")  + ";font-size:" + (theme().toolbar().buttonOverride().mediumFontSize() + "px")  + ";}.x-toolbar-mark .GJE5YCFCIBD .GJE5YCFCACD{line-height:" + (theme().toolbar().buttonOverride().largeLineHeight() + "px")  + ";font-size:" + (theme().toolbar().buttonOverride().largeFontSize() + "px") ) + (";}.x-toolbar-mark .GJE5YCFCOBD{height:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplit()).getHeight() + "px")  + ";width:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplit()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplit()).getSafeUri().asString() + "\") -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplit()).getLeft() + "px -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplit()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("right"+ " " +"center")  + ";padding-right:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GJE5YCFCPBD{height:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getHeight() + "px")  + ";width:") + (((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getSafeUri().asString() + "\") -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getLeft() + "px -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GJE5YCFCPAD{height:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrow()).getHeight() + "px")  + ";width:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrow()).getWidth() + "px")  + ";overflow:" + ("hidden") ) + (";background:" + ("url(\"" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrow()).getSafeUri().asString() + "\") -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrow()).getLeft() + "px -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrow()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-right:" + ("10px")  + ";background-position:" + ("right"+ " " +"center")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GJE5YCFCABD{height:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getHeight() + "px")  + ";width:" + ((SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getSafeUri().asString() + "\") -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getLeft() + "px -" + (SlicedButtonCellAppearance_SlicedButtonCellResources_gecko1_8_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getTop() + "px  no-repeat")  + ";width:") + (("auto")  + ";height:" + ("auto")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}"));
      }
      public java.lang.String arrow() {
        return "GJE5YCFCPAD";
      }
      public java.lang.String arrowBottom() {
        return "GJE5YCFCABD";
      }
      public java.lang.String button() {
        return "GJE5YCFCBBD";
      }
      public java.lang.String hasWidth() {
        return "GJE5YCFCCBD";
      }
      public java.lang.String iconBottom() {
        return "GJE5YCFCDBD";
      }
      public java.lang.String iconLeft() {
        return "GJE5YCFCEBD";
      }
      public java.lang.String iconRight() {
        return "GJE5YCFCFBD";
      }
      public java.lang.String iconTop() {
        return "GJE5YCFCGBD";
      }
      public java.lang.String iconWrap() {
        return "GJE5YCFCHBD";
      }
      public java.lang.String large() {
        return "GJE5YCFCIBD";
      }
      public java.lang.String mainTable() {
        return "GJE5YCFCJBD";
      }
      public java.lang.String medium() {
        return "GJE5YCFCKBD";
      }
      public java.lang.String noIcon() {
        return "GJE5YCFCLBD";
      }
      public java.lang.String over() {
        return "GJE5YCFCMBD";
      }
      public java.lang.String small() {
        return "GJE5YCFCNBD";
      }
      public java.lang.String split() {
        return "GJE5YCFCOBD";
      }
      public java.lang.String splitBottom() {
        return "GJE5YCFCPBD";
      }
      public java.lang.String text() {
        return "GJE5YCFCACD";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellStyle style() {
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
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAKCAYAAACNMs+9AAAAK0lEQVR42mNgGELg////6/+jgum4FPIA8Xmoot1AzILPVAUg3g/EAoPIswCE6y6lP53soQAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMgAAAAOCAYAAABq6VM3AAAAXUlEQVR42u3VsQ1AYBgEUIVSYQSbKiUapTEMoPhGMIIKiSV+fyGhV3ovuQUuuVxRAAAAAAAAX/SxTTnpyT5qBW5tnFUexnIPZG4jlVqBly6OJj9HDLHW2gAAAPinCwVTJCstCkIdAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAABICAYAAADGScSgAAAAWElEQVR42mNgAAKhnPX1Qrnr/zOQCkY1jmoc1TiqcVTjqMZRjYNV4////zf/RwWTidXIA8SXoZq2AzEL0U4FKlYA4v0gQ0ajY1TjqMZRjaMaRzWOahyMGgGDfUO46m5UAwAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMgAAAAOCAYAAABq6VM3AAAAX0lEQVR42u3VsQmAMBCG0RSWFpIJHFBncAzHsLC0cAgHOlMIEogT+B58Cxz8XErAtzxti6R2Kc9bSGrnhQIAAPxMROxRW10F3oH0pesZx1HqXAXqkYylszS4BgAAwD/dt/UwYsQ5oGoAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage3 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAKCAYAAACNMs+9AAAAOUlEQVR42mNgGEIgLS1tPRD/h+HU1NTpWBVmZWXxABWchyrcXV9fz4LT1IyMDAWgSfsTEhIEBpFnAR0EF5ut0NXeAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage4 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMgAAAAOCAYAAABq6VM3AAAAXElEQVR42u3VsQmAMAAEQAtLC0dwtDQJIUtkDMdwAAtHcCRNEcHe0jv4BR6eHwYAAAAAAOCLlNLWcj2JMa5aga6UMrVhnH0ge6111Aq85JyX9hxHCGHWBgAAwD/doxQXmzufLCoAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage5 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAABICAYAAADGScSgAAAAY0lEQVR42mNgAILz58/Xnzt37j8DqWBU46jGUY2jGkc1jmoc1ThYNaanp29OS0v7j4QnE6UxKyuLB6j4MlTT9vr6ehainZqRkaGQmpq6H2TIaHSMahzVOKpxVOOoxlGNg1EjAPSk37J77vZIAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage6 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMgAAAAOCAYAAABq6VM3AAAAb0lEQVR42u3Vuw3CMBSGUReUFIzAaG78kJfwGAxCSZEN7IKBQoogUYQJco70LfBLVzcE4L85Z5d0XBhjrJKO80IBAABOppTyzDmv31JKD6vArrV23Q7jvR/Iq/d+sQr8qLXet8+xxBhv1gAAADinD0ZaCln5ymRMAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource arrow;
  private static com.google.gwt.resources.client.ImageResource arrowBottom;
  private static com.google.gwt.resources.client.ImageResource split;
  private static com.google.gwt.resources.client.ImageResource splitBottom;
  private static com.google.gwt.resources.client.ImageResource toolBarArrow;
  private static com.google.gwt.resources.client.ImageResource toolBarArrowBottom;
  private static com.google.gwt.resources.client.ImageResource toolBarSplit;
  private static com.google.gwt.resources.client.ImageResource toolBarSplitBottom;
  private static com.sencha.gxt.theme.neptune.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellStyle style;
  private static com.sencha.gxt.theme.neptune.client.ThemeDetails theme;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      arrow(), 
      arrowBottom(), 
      split(), 
      splitBottom(), 
      toolBarArrow(), 
      toolBarArrowBottom(), 
      toolBarSplit(), 
      toolBarSplitBottom(), 
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
        resourceMap.put("arrow", arrow());
        resourceMap.put("arrowBottom", arrowBottom());
        resourceMap.put("split", split());
        resourceMap.put("splitBottom", splitBottom());
        resourceMap.put("toolBarArrow", toolBarArrow());
        resourceMap.put("toolBarArrowBottom", toolBarArrowBottom());
        resourceMap.put("toolBarSplit", toolBarSplit());
        resourceMap.put("toolBarSplitBottom", toolBarSplitBottom());
        resourceMap.put("style", style());
        resourceMap.put("theme", theme());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'arrow': return this.@com.sencha.gxt.theme.neptune.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellResources::arrow()();
      case 'arrowBottom': return this.@com.sencha.gxt.theme.neptune.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellResources::arrowBottom()();
      case 'split': return this.@com.sencha.gxt.theme.neptune.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellResources::split()();
      case 'splitBottom': return this.@com.sencha.gxt.theme.neptune.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellResources::splitBottom()();
      case 'toolBarArrow': return this.@com.sencha.gxt.theme.neptune.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellResources::toolBarArrow()();
      case 'toolBarArrowBottom': return this.@com.sencha.gxt.theme.neptune.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellResources::toolBarArrowBottom()();
      case 'toolBarSplit': return this.@com.sencha.gxt.theme.neptune.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellResources::toolBarSplit()();
      case 'toolBarSplitBottom': return this.@com.sencha.gxt.theme.neptune.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellResources::toolBarSplitBottom()();
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellResources::theme()();
    }
    return null;
  }-*/;
}
