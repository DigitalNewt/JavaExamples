package com.sencha.gxt.theme.neptune.client.sliced.mask;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class SlicedMaskAppearance_SlicedMaskTemplateImpl implements com.sencha.gxt.theme.neptune.client.sliced.mask.SlicedMaskAppearance.SlicedMaskTemplate {
  public com.google.gwt.safehtml.shared.SafeHtml template(com.sencha.gxt.theme.neptune.client.sliced.mask.SlicedMaskAppearance.SlicedMaskStyles style, java.lang.String message){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}">{1}</div>
     * params:
       * com.sencha.gxt.theme.neptune.client.sliced.mask.SlicedMaskAppearance_SlicedMaskStyles_text_ValueProviderImpl.INSTANCE.getValue(style), message
     */
    outer = GWT.<com.sencha.gxt.theme.neptune.client.sliced.mask.SlicedMaskAppearance_SlicedMaskTemplate_template_SafeHtml__SlicedMaskStyles_style__String_message___SafeHtmlTemplates>create(com.sencha.gxt.theme.neptune.client.sliced.mask.SlicedMaskAppearance_SlicedMaskTemplate_template_SafeHtml__SlicedMaskStyles_style__String_message___SafeHtmlTemplates.class).template0(com.sencha.gxt.theme.neptune.client.sliced.mask.SlicedMaskAppearance_SlicedMaskStyles_text_ValueProviderImpl.INSTANCE.getValue(style), message);
    return outer;
  }
}
