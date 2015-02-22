package com.landisgyr.randomnumbertracker.client;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class RandomNumberTrackerService_Proxy extends RemoteServiceProxy implements com.landisgyr.randomnumbertracker.client.RandomNumberTrackerServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.landisgyr.randomnumbertracker.client.RandomNumberTrackerService";
  private static final String SERIALIZATION_POLICY ="DD7B8E655F31044D0FE165A2199AD248";
  private static final com.landisgyr.randomnumbertracker.client.RandomNumberTrackerService_TypeSerializer SERIALIZER = new com.landisgyr.randomnumbertracker.client.RandomNumberTrackerService_TypeSerializer();
  
  public RandomNumberTrackerService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "RandomNumberService", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getFirstDigitCountReport(int numbersToGenerate, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("RandomNumberTrackerService_Proxy", "getFirstDigitCountReport");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("I");
      streamWriter.writeInt(numbersToGenerate);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}
