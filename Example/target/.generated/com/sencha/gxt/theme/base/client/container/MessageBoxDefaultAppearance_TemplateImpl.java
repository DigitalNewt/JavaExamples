package com.sencha.gxt.theme.base.client.container;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class MessageBoxDefaultAppearance_TemplateImpl implements com.sencha.gxt.theme.base.client.container.MessageBoxDefaultAppearance.Template {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.container.MessageBoxDefaultAppearance.MessageBoxBaseStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"></div><div class="{1}"></div><div class="{2}"></div>
       * 
     * params:
       * com.sencha.gxt.theme.base.client.container.MessageBoxDefaultAppearance_MessageBoxBaseStyle_icon_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.container.MessageBoxDefaultAppearance_MessageBoxBaseStyle_message_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.container.MessageBoxDefaultAppearance_MessageBoxBaseStyle_content_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.container.MessageBoxDefaultAppearance_Template_render_SafeHtml__MessageBoxBaseStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.container.MessageBoxDefaultAppearance_Template_render_SafeHtml__MessageBoxBaseStyle_style___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.container.MessageBoxDefaultAppearance_MessageBoxBaseStyle_icon_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.container.MessageBoxDefaultAppearance_MessageBoxBaseStyle_message_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.container.MessageBoxDefaultAppearance_MessageBoxBaseStyle_content_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
