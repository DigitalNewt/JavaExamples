package com.sencha.gxt.widget.core.client.box;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MessageBox_MessageBoxIcons_default_InlineClientBundleGenerator implements com.sencha.gxt.widget.core.client.box.MessageBox.MessageBoxIcons {
  private static MessageBox_MessageBoxIcons_default_InlineClientBundleGenerator _instance0 = new MessageBox_MessageBoxIcons_default_InlineClientBundleGenerator();
  private void errorInitializer() {
    error = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "error",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 32, 32, false, false
    );
  }
  private static class errorInitializer {
    static {
      _instance0.errorInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return error;
    }
  }
  public com.google.gwt.resources.client.ImageResource error() {
    return errorInitializer.get();
  }
  private void infoInitializer() {
    info = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "info",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 32, 32, false, false
    );
  }
  private static class infoInitializer {
    static {
      _instance0.infoInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return info;
    }
  }
  public com.google.gwt.resources.client.ImageResource info() {
    return infoInitializer.get();
  }
  private void questionInitializer() {
    question = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "question",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 32, 32, false, false
    );
  }
  private static class questionInitializer {
    static {
      _instance0.questionInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return question;
    }
  }
  public com.google.gwt.resources.client.ImageResource question() {
    return questionInitializer.get();
  }
  private void warningInitializer() {
    warning = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "warning",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 31, 32, false, false
    );
  }
  private static class warningInitializer {
    static {
      _instance0.warningInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return warning;
    }
  }
  public com.google.gwt.resources.client.ImageResource warning() {
    return warningInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,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";
  private static final java.lang.String externalImage0 = "data:image/gif;base64,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";
  private static final java.lang.String externalImage1 = "data:image/gif;base64,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";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB8AAAAgCAYAAADqgqNBAAAFLklEQVR42r2WD2xTVRTG78g6YFTZyiZ02IU/w7kgY50BjTgcijFoGCOgAZUIA5KByoIa0KCAUxkTnEhEBSPEyIBAhDlRx1RACAwGEhh00nVdV7rOthR1wIAq6+e997y+to7pHB0vOXnbe+ee7/ude9+9ZawLl72xFh7352C3+nI0HYC/rR8PhitXxuLsL9ZbY8LeaMOlSwy+K0yKi6iuHoo17+/pfgNez3TebhIF0lQDk6dMQmFhObqRulYKi8BVPRfPB/x9pPjhQ4mI1y3BwQOnusfAeddcOO0MLR4u3nYnFzfyGKJOwYQJUzF77sbuEXc7GET4LkfLBSeo4U+Bv5XE91UOQJ++i1F91BRZA+eb50jqi1ycRKndogNy5bcG6fPnb42cuM1mQ4Da38JUsYMVPcgIb31AfPcuAxIGLIscvcexAM31QeqtW+JFYSV6wXFuKBlqIQPZ2dNQsDBC9G4Lp7YEqYWgiFiWwe9GPDsxndqviJdvGwRdwnKcPl2Hm6Z2ngmfayJOhD7qUX5/GLkPDld2PL4IL5DJcQ9Nx6JXd96k+FmtpL7mjFa31LjYGF7UgEQ2Voq/+OQQWnx85UtxPv+ln96FgYYVXaf3NC4l6jpeuPU2dYU/naPlBdOR3OtxSV9a0k9d+WLz+ctJ9CMz8rCscFcXxc9ESfEAtaQSK/qLKCl+3+B8ZKVOgvMY0UqDfOXDReKbPkzrGr27YaksKgz4Pb2psIvET/4g5nwIcrPXYrwxh6i5MfFe0l/WAXxP8PHIzHgOK1b+T3pXTYIUly0XxTwaQGmnEEntn4J5z1RiTm4mUQthp0LPDfzZQIbWFY/AsOHvdP7YdVtLiFq000nUgkIWV+injU/mxV7H9g/uIHK7Es0a+ux4t65Z6FlK6lyUlHzVOXHv6b5EbRLu44k6UNxJ4quXGHix+TixM4bInSEGxInHw1cbJc0G6OvrG9F5ansMtdzKKJTiovWHd2jRkz0h8+R821kwT9CLA0eMtxLE8HvysHbtd/8u7j2ZBFcVw6UaopZtt7Lw4JSCyhD3CP3vYu1zQul5/prlRowcVdwxvbv+XSksqW1aarkoZFYitAO84L5NumC7rSE5ZqVr/JcOHL3hN9Hzu9PmYN26ihuLe6o0+PUQw9WT/LTyJsiBqnCogQtM3ckktYuFmwzERT3tejVkcGNxGoaNKGpP7zKvQtNeBu9hXtQSywvGq0Wk80BBLnR0m9hedTw0SNUPovd2FpZPY6JJ3BYrDbSeYEgfkYfi98rCxb3VyWjez38iHeWDHHGcJEYtEixG4in6wJGql6faazMG04lmah9w8w7+NhC+42Tw7VdGIz2zCJY6hd5pKZPUHi5+/VRPnqSlgTUs/K60XRALcmPSLCT3KcAbeTNoGkzBfDUE/R8G/lwjDbTwaU3UL8D69d+Q+PlTM3GugsRFkhhwQwqFfOIDA+SR2l8zG3vLgYrPJtHCM3dAL2E0aD1COdNycjBm3EoSbz6UhobdDM5KctZapcQRJZS/fdUBGoa35g3G4llP4euPs+Qz8e6f+aEh6v6+n8avXnQvYvouxPeVx8HcJ/Jh+pKhroxJEw3lHUejYlKIXeefZMtPTHbtv8aIHCHexhdd7mOTEd+/AKtW7SD6pgNZUvxYaQ/8vJlFPGq3k5E3nx8Nre5lGAbNC867uLZs/RZj7n8BxpEz5VEYqTBmzMSozBnyM7s94SUkGeZjytQimM228E+uqqoWH32yR8aGDZURD0FbuvlH9VP7G994fdsdyI7HAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource error;
  private static com.google.gwt.resources.client.ImageResource info;
  private static com.google.gwt.resources.client.ImageResource question;
  private static com.google.gwt.resources.client.ImageResource warning;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      error(), 
      info(), 
      question(), 
      warning(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("error", error());
        resourceMap.put("info", info());
        resourceMap.put("question", question());
        resourceMap.put("warning", warning());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'error': return this.@com.sencha.gxt.widget.core.client.box.MessageBox.MessageBoxIcons::error()();
      case 'info': return this.@com.sencha.gxt.widget.core.client.box.MessageBox.MessageBoxIcons::info()();
      case 'question': return this.@com.sencha.gxt.widget.core.client.box.MessageBox.MessageBoxIcons::question()();
      case 'warning': return this.@com.sencha.gxt.widget.core.client.box.MessageBox.MessageBoxIcons::warning()();
    }
    return null;
  }-*/;
}
