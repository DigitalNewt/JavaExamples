package com.sencha.gxt.theme.neptune.client.base.button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources {
  private static Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator _instance0 = new Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator();
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
    style = new com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJE5YCFCBCC{border-radius:" + (theme().button().borderRadius() + "px")  + ";border-width:" + (theme().button().border().toString() + "")  + ";border-style:" + (theme().button().border().style() + "")  + ";border-color:" + (theme().button().border().color() + "")  + ";background-color:" + ("#3892d3")  + ";box-sizing:" + ("border-box")  + ";height:" + ("100%")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().button().gradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().button().gradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().button().gradient() + "" + ")")  + ";background:") + (("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().button().gradient() + "" + ")")  + ";padding:" + (theme().button().radiusMinusBorderWidth().toString() + "")  + ";cursor:" + ("pointer")  + ";outline:" + ("none")  + ";white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";}.GJE5YCFCCCC{padding:" + (theme().button().padding().toString() + "")  + ";text-align:" + ("center")  + ";font-size:" + (theme().button().font().size() + "px")  + ";color:" + (theme().button().font().color() + "")  + ";font-weight:" + (theme().button().font().weight() + "") ) + (";font-family:" + (theme().button().font().family() + "")  + ";vertical-align:" + ("middle")  + ";}.GJE5YCFCLCC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";}.GJE5YCFCMCC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().button().pressedGradient() + "" + ")")  + " !important;background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().button().pressedGradient() + "" + ")")  + " !important;background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().button().pressedGradient() + "" + ")")  + " !important;background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().button().pressedGradient() + "" + ")")  + " !important;}.GJE5YCFCDCC{background:") + (("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";}.GJE5YCFCNCC{line-height:" + (theme().button().smallLineHeight() + "px")  + ";font-size:" + (theme().button().smallFontSize() + "px")  + ";}.GJE5YCFCJCC{line-height:" + (theme().button().mediumLineHeight() + "px")  + ";font-size:" + (theme().button().mediumFontSize() + "px")  + ";}.GJE5YCFCICC{line-height:" + (theme().button().largeLineHeight() + "px")  + ";font-size:" + (theme().button().largeFontSize() + "px")  + ";}.GJE5YCFCFCC{display:" + ("inline-block") ) + (";vertical-align:" + ("middle")  + ";margin-left:" + ("2px")  + ";}.GJE5YCFCGCC{display:" + ("inline-block")  + ";vertical-align:" + ("middle")  + ";margin-right:" + ("2px")  + ";}.GJE5YCFCHCC{display:" + ("block")  + ";margin:" + ("0"+ " " +"auto")  + ";margin-bottom:" + ("2px")  + ";}.GJE5YCFCECC{display:" + ("block")  + ";margin:" + ("0"+ " " +"auto")  + ";margin-top:") + (("2px")  + ";}.GJE5YCFCKCC .GJE5YCFCFCC{margin-left:" + ("0")  + ";}.GJE5YCFCKCC .GJE5YCFCGCC{margin-right:" + ("0")  + ";}.GJE5YCFCOCC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("left"+ " " +"center")  + ";padding-left:" + ("20px") ) + (";background-repeat:" + ("no-repeat")  + ";}.GJE5YCFCPCC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.GJE5YCFCPBC{height:") + (((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-left:" + ("10px")  + ";background-position:" + ("left"+ " " +"center")  + ";background-repeat:" + ("no-repeat")  + ";}.GJE5YCFCACC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getWidth() + "px") ) + (";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-bottom:" + ("14px")  + ";background-position:" + ("center"+ " " +"bottom")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GJE5YCFCBCC{border-radius:" + (theme().toolbar().buttonOverride().borderRadius() + "px")  + ";border-width:" + (theme().toolbar().buttonOverride().border().toString() + "")  + ";border-style:" + (theme().toolbar().buttonOverride().border().style() + "")  + ";border-color:") + ((theme().toolbar().buttonOverride().border().color() + "")  + ";background-color:" + ("#3892d3")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().gradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().gradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().gradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().toolbar().buttonOverride().gradient() + "" + ")")  + ";padding:" + (theme().button().radiusMinusBorderWidth().toString() + "")  + ";cursor:" + ("pointer")  + ";outline:" + ("none")  + ";}.x-toolbar-mark .GJE5YCFCCCC{padding:" + (theme().toolbar().buttonOverride().padding().toString() + "")  + ";text-align:" + ("center") ) + (";font-size:" + (theme().toolbar().buttonOverride().font().size() + "px")  + ";color:" + (theme().toolbar().buttonOverride().font().color() + "")  + ";font-weight:" + (theme().toolbar().buttonOverride().font().weight() + "")  + ";font-family:" + (theme().toolbar().buttonOverride().font().family() + "")  + ";}.x-toolbar-mark .GJE5YCFCLCC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";}.x-toolbar-mark .GJE5YCFCMCC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().pressedGradient() + "" + ")")  + " !important;background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().pressedGradient() + "" + ")")  + " !important;background:") + (("-ms-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().pressedGradient() + "" + ")")  + " !important;background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().toolbar().buttonOverride().pressedGradient() + "" + ")")  + " !important;}.x-toolbar-mark .GJE5YCFCDCC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";}.x-toolbar-mark .GJE5YCFCNCC{line-height:" + (theme().toolbar().buttonOverride().smallLineHeight() + "px")  + ";font-size:" + (theme().toolbar().buttonOverride().smallFontSize() + "px")  + ";}.x-toolbar-mark .GJE5YCFCJCC{line-height:" + (theme().toolbar().buttonOverride().mediumLineHeight() + "px")  + ";font-size:" + (theme().toolbar().buttonOverride().mediumFontSize() + "px")  + ";}.x-toolbar-mark .GJE5YCFCICC{line-height:" + (theme().toolbar().buttonOverride().largeLineHeight() + "px") ) + (";font-size:" + (theme().toolbar().buttonOverride().largeFontSize() + "px")  + ";}.x-toolbar-mark .GJE5YCFCFCC{display:" + ("inline-block")  + ";vertical-align:" + ("middle")  + ";margin-left:" + ("2px")  + ";}.x-toolbar-mark .GJE5YCFCGCC{display:" + ("inline-block")  + ";vertical-align:" + ("middle")  + ";margin-right:" + ("2px")  + ";}.x-toolbar-mark .GJE5YCFCHCC{display:" + ("block")  + ";margin:" + ("0"+ " " +"auto")  + ";margin-bottom:" + ("2px")  + ";}.x-toolbar-mark .GJE5YCFCECC{display:") + (("block")  + ";margin:" + ("0"+ " " +"auto")  + ";margin-top:" + ("2px")  + ";}.x-toolbar-mark .GJE5YCFCKCC .GJE5YCFCFCC{margin-left:" + ("0")  + ";}.x-toolbar-mark .GJE5YCFCKCC .GJE5YCFCGCC{margin-right:" + ("0")  + ";}.x-toolbar-mark .GJE5YCFCOCC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto") ) + (";background-position:" + ("left"+ " " +"center")  + ";padding-left:" + ("20px")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GJE5YCFCPCC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:") + (("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GJE5YCFCPBC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-left:" + ("10px")  + ";background-position:" + ("left"+ " " +"center")  + ";background-repeat:" + ("no-repeat") ) + (";}.x-toolbar-mark .GJE5YCFCACC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-bottom:" + ("14px")  + ";background-position:" + ("center"+ " " +"bottom")  + ";background-repeat:" + ("no-repeat")  + ";}")) : ((".GJE5YCFCBCC{border-radius:" + (theme().button().borderRadius() + "px")  + ";border-width:" + (theme().button().border().toString() + "")  + ";border-style:" + (theme().button().border().style() + "")  + ";border-color:" + (theme().button().border().color() + "")  + ";background-color:" + ("#3892d3")  + ";box-sizing:" + ("border-box")  + ";height:" + ("100%")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().button().gradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().button().gradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().button().gradient() + "" + ")")  + ";background:") + (("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().button().gradient() + "" + ")")  + ";padding:" + (theme().button().radiusMinusBorderWidth().toString() + "")  + ";cursor:" + ("pointer")  + ";outline:" + ("none")  + ";white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";}.GJE5YCFCCCC{padding:" + (theme().button().padding().toString() + "")  + ";text-align:" + ("center")  + ";font-size:" + (theme().button().font().size() + "px")  + ";color:" + (theme().button().font().color() + "")  + ";font-weight:" + (theme().button().font().weight() + "") ) + (";font-family:" + (theme().button().font().family() + "")  + ";vertical-align:" + ("middle")  + ";}.GJE5YCFCLCC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";}.GJE5YCFCMCC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().button().pressedGradient() + "" + ")")  + " !important;background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().button().pressedGradient() + "" + ")")  + " !important;background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().button().pressedGradient() + "" + ")")  + " !important;background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().button().pressedGradient() + "" + ")")  + " !important;}.GJE5YCFCDCC{background:") + (("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().button().overGradient() + "" + ")")  + ";}.GJE5YCFCNCC{line-height:" + (theme().button().smallLineHeight() + "px")  + ";font-size:" + (theme().button().smallFontSize() + "px")  + ";}.GJE5YCFCJCC{line-height:" + (theme().button().mediumLineHeight() + "px")  + ";font-size:" + (theme().button().mediumFontSize() + "px")  + ";}.GJE5YCFCICC{line-height:" + (theme().button().largeLineHeight() + "px")  + ";font-size:" + (theme().button().largeFontSize() + "px")  + ";}.GJE5YCFCFCC{display:" + ("inline-block") ) + (";vertical-align:" + ("middle")  + ";margin-right:" + ("2px")  + ";}.GJE5YCFCGCC{display:" + ("inline-block")  + ";vertical-align:" + ("middle")  + ";margin-left:" + ("2px")  + ";}.GJE5YCFCHCC{display:" + ("block")  + ";margin:" + ("0"+ " " +"auto")  + ";margin-bottom:" + ("2px")  + ";}.GJE5YCFCECC{display:" + ("block")  + ";margin:" + ("0"+ " " +"auto")  + ";margin-top:") + (("2px")  + ";}.GJE5YCFCKCC .GJE5YCFCFCC{margin-right:" + ("0")  + ";}.GJE5YCFCKCC .GJE5YCFCGCC{margin-left:" + ("0")  + ";}.GJE5YCFCOCC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.split()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("right"+ " " +"center")  + ";padding-right:" + ("20px") ) + (";background-repeat:" + ("no-repeat")  + ";}.GJE5YCFCPCC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.splitBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:" + ("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.GJE5YCFCPBC{height:") + (((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrow()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-right:" + ("10px")  + ";background-position:" + ("right"+ " " +"center")  + ";background-repeat:" + ("no-repeat")  + ";}.GJE5YCFCACC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getWidth() + "px") ) + (";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.arrowBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-bottom:" + ("14px")  + ";background-position:" + ("center"+ " " +"bottom")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GJE5YCFCBCC{border-radius:" + (theme().toolbar().buttonOverride().borderRadius() + "px")  + ";border-width:" + (theme().toolbar().buttonOverride().border().toString() + "")  + ";border-style:" + (theme().toolbar().buttonOverride().border().style() + "")  + ";border-color:") + ((theme().toolbar().buttonOverride().border().color() + "")  + ";background-color:" + ("#3892d3")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().gradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().gradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().gradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().toolbar().buttonOverride().gradient() + "" + ")")  + ";padding:" + (theme().button().radiusMinusBorderWidth().toString() + "")  + ";cursor:" + ("pointer")  + ";outline:" + ("none")  + ";}.x-toolbar-mark .GJE5YCFCCCC{padding:" + (theme().toolbar().buttonOverride().padding().toString() + "")  + ";text-align:" + ("center") ) + (";font-size:" + (theme().toolbar().buttonOverride().font().size() + "px")  + ";color:" + (theme().toolbar().buttonOverride().font().color() + "")  + ";font-weight:" + (theme().toolbar().buttonOverride().font().weight() + "")  + ";font-family:" + (theme().toolbar().buttonOverride().font().family() + "")  + ";}.x-toolbar-mark .GJE5YCFCLCC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";}.x-toolbar-mark .GJE5YCFCMCC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().pressedGradient() + "" + ")")  + " !important;background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().pressedGradient() + "" + ")")  + " !important;background:") + (("-ms-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().pressedGradient() + "" + ")")  + " !important;background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().toolbar().buttonOverride().pressedGradient() + "" + ")")  + " !important;}.x-toolbar-mark .GJE5YCFCDCC{background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("-o-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("-ms-linear-gradient(" + "top"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +theme().toolbar().buttonOverride().overGradient() + "" + ")")  + ";}.x-toolbar-mark .GJE5YCFCNCC{line-height:" + (theme().toolbar().buttonOverride().smallLineHeight() + "px")  + ";font-size:" + (theme().toolbar().buttonOverride().smallFontSize() + "px")  + ";}.x-toolbar-mark .GJE5YCFCJCC{line-height:" + (theme().toolbar().buttonOverride().mediumLineHeight() + "px")  + ";font-size:" + (theme().toolbar().buttonOverride().mediumFontSize() + "px")  + ";}.x-toolbar-mark .GJE5YCFCICC{line-height:" + (theme().toolbar().buttonOverride().largeLineHeight() + "px") ) + (";font-size:" + (theme().toolbar().buttonOverride().largeFontSize() + "px")  + ";}.x-toolbar-mark .GJE5YCFCFCC{display:" + ("inline-block")  + ";vertical-align:" + ("middle")  + ";margin-right:" + ("2px")  + ";}.x-toolbar-mark .GJE5YCFCGCC{display:" + ("inline-block")  + ";vertical-align:" + ("middle")  + ";margin-left:" + ("2px")  + ";}.x-toolbar-mark .GJE5YCFCHCC{display:" + ("block")  + ";margin:" + ("0"+ " " +"auto")  + ";margin-bottom:" + ("2px")  + ";}.x-toolbar-mark .GJE5YCFCECC{display:") + (("block")  + ";margin:" + ("0"+ " " +"auto")  + ";margin-top:" + ("2px")  + ";}.x-toolbar-mark .GJE5YCFCKCC .GJE5YCFCFCC{margin-right:" + ("0")  + ";}.x-toolbar-mark .GJE5YCFCKCC .GJE5YCFCGCC{margin-left:" + ("0")  + ";}.x-toolbar-mark .GJE5YCFCOCC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplit()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto") ) + (";background-position:" + ("right"+ " " +"center")  + ";padding-right:" + ("20px")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GJE5YCFCPCC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarSplitBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";background-position:" + ("center"+ " " +"bottom")  + ";padding-bottom:") + (("14px")  + ";background-repeat:" + ("no-repeat")  + ";}.x-toolbar-mark .GJE5YCFCPBC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrow()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-right:" + ("10px")  + ";background-position:" + ("right"+ " " +"center")  + ";background-repeat:" + ("no-repeat") ) + (";}.x-toolbar-mark .GJE5YCFCACC{height:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getHeight() + "px")  + ";width:" + ((Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getSafeUri().asString() + "\") -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getLeft() + "px -" + (Css3ButtonCellAppearance_Css3ButtonResources_default_InlineClientBundleGenerator.this.toolBarArrowBottom()).getTop() + "px  no-repeat")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";padding-bottom:" + ("14px")  + ";background-position:" + ("center"+ " " +"bottom")  + ";background-repeat:" + ("no-repeat")  + ";}"));
      }
      public java.lang.String arrow() {
        return "GJE5YCFCPBC";
      }
      public java.lang.String arrowBottom() {
        return "GJE5YCFCACC";
      }
      public java.lang.String button() {
        return "GJE5YCFCBCC";
      }
      public java.lang.String buttonInner() {
        return "GJE5YCFCCCC";
      }
      public java.lang.String focused() {
        return "GJE5YCFCDCC";
      }
      public java.lang.String iconBottom() {
        return "GJE5YCFCECC";
      }
      public java.lang.String iconLeft() {
        return "GJE5YCFCFCC";
      }
      public java.lang.String iconRight() {
        return "GJE5YCFCGCC";
      }
      public java.lang.String iconTop() {
        return "GJE5YCFCHCC";
      }
      public java.lang.String large() {
        return "GJE5YCFCICC";
      }
      public java.lang.String medium() {
        return "GJE5YCFCJCC";
      }
      public java.lang.String noText() {
        return "GJE5YCFCKCC";
      }
      public java.lang.String over() {
        return "GJE5YCFCLCC";
      }
      public java.lang.String pressed() {
        return "GJE5YCFCMCC";
      }
      public java.lang.String small() {
        return "GJE5YCFCNCC";
      }
      public java.lang.String split() {
        return "GJE5YCFCOCC";
      }
      public java.lang.String splitBottom() {
        return "GJE5YCFCPCC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonStyle style() {
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
  private static com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonStyle style;
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
      case 'arrow': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::arrow()();
      case 'arrowBottom': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::arrowBottom()();
      case 'split': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::split()();
      case 'splitBottom': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::splitBottom()();
      case 'toolBarArrow': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::toolBarArrow()();
      case 'toolBarArrowBottom': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::toolBarArrowBottom()();
      case 'toolBarSplit': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::toolBarSplit()();
      case 'toolBarSplitBottom': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::toolBarSplitBottom()();
      case 'style': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::style()();
      case 'theme': return this.@com.sencha.gxt.theme.neptune.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources::theme()();
    }
    return null;
  }-*/;
}
