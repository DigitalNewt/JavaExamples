package com.landisgyr.randomnumbertracker.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FirstDigitCount_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getFirstDigitCount(com.landisgyr.randomnumbertracker.client.FirstDigitCount instance) /*-{
    return instance.@com.landisgyr.randomnumbertracker.client.FirstDigitCount::firstDigitCount;
  }-*/;
  
  private static native void setFirstDigitCount(com.landisgyr.randomnumbertracker.client.FirstDigitCount instance, int value) 
  /*-{
    instance.@com.landisgyr.randomnumbertracker.client.FirstDigitCount::firstDigitCount = value;
  }-*/;
  
  private static native int getFirstDigitNumber(com.landisgyr.randomnumbertracker.client.FirstDigitCount instance) /*-{
    return instance.@com.landisgyr.randomnumbertracker.client.FirstDigitCount::firstDigitNumber;
  }-*/;
  
  private static native void setFirstDigitNumber(com.landisgyr.randomnumbertracker.client.FirstDigitCount instance, int value) 
  /*-{
    instance.@com.landisgyr.randomnumbertracker.client.FirstDigitCount::firstDigitNumber = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.landisgyr.randomnumbertracker.client.FirstDigitCount instance) throws SerializationException {
    setFirstDigitCount(instance, streamReader.readInt());
    setFirstDigitNumber(instance, streamReader.readInt());
    
  }
  
  public static com.landisgyr.randomnumbertracker.client.FirstDigitCount instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.landisgyr.randomnumbertracker.client.FirstDigitCount();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.landisgyr.randomnumbertracker.client.FirstDigitCount instance) throws SerializationException {
    streamWriter.writeInt(getFirstDigitCount(instance));
    streamWriter.writeInt(getFirstDigitNumber(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.landisgyr.randomnumbertracker.client.FirstDigitCount_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.landisgyr.randomnumbertracker.client.FirstDigitCount_FieldSerializer.deserialize(reader, (com.landisgyr.randomnumbertracker.client.FirstDigitCount)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.landisgyr.randomnumbertracker.client.FirstDigitCount_FieldSerializer.serialize(writer, (com.landisgyr.randomnumbertracker.client.FirstDigitCount)object);
  }
  
}
