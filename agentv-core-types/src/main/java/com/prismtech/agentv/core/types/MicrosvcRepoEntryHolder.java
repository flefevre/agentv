package com.prismtech.agentv.core.types;

/**
* com/prismtech/agentv/core/types/MicrosvcRepoEntryHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/nodeinfo.idl
* Sunday, February 14, 2016 7:24:55 PM CET
*/

public final class MicrosvcRepoEntryHolder implements org.omg.CORBA.portable.Streamable
{
  public com.prismtech.agentv.core.types.MicrosvcRepoEntry value = null;

  public MicrosvcRepoEntryHolder ()
  {
  }

  public MicrosvcRepoEntryHolder (com.prismtech.agentv.core.types.MicrosvcRepoEntry initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.prismtech.agentv.core.types.MicrosvcRepoEntryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.prismtech.agentv.core.types.MicrosvcRepoEntryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.prismtech.agentv.core.types.MicrosvcRepoEntryHelper.type ();
  }

}