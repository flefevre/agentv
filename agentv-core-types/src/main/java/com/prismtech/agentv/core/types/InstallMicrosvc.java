package com.prismtech.agentv.core.types;


/**
* com/prismtech/agentv/core/types/InstallMicrosvc.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/actions.idl
* Sunday, February 14, 2016 7:24:59 PM CET
*/

public final class InstallMicrosvc implements org.omg.CORBA.portable.IDLEntity
{
  public String microsvc = null;
  public byte payload[] = null;

  public InstallMicrosvc ()
  {
  } // ctor

  public InstallMicrosvc (String _microsvc, byte[] _payload)
  {
    microsvc = _microsvc;
    payload = _payload;
  } // ctor

} // class InstallMicrosvc
