package com.prismtech.edison.display.types;

/**
* com/prismtech/edison/display/types/LCDTextHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl//display.idl
* Tuesday, February 16, 2016 1:52:37 AM CET
*/

public final class LCDTextHolder implements org.omg.CORBA.portable.Streamable
{
  public com.prismtech.edison.display.types.LCDText value = null;

  public LCDTextHolder ()
  {
  }

  public LCDTextHolder (com.prismtech.edison.display.types.LCDText initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.prismtech.edison.display.types.LCDTextHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.prismtech.edison.display.types.LCDTextHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.prismtech.edison.display.types.LCDTextHelper.type ();
  }

}