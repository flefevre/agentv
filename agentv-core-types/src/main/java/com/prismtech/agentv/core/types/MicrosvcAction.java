package com.prismtech.agentv.core.types;


/**
* com/prismtech/agentv/core/types/MicrosvcAction.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/actions.idl
* Sunday, February 14, 2016 7:24:59 PM CET
*/

/**
* Updated by idl2j
* from ../idl/actions.idl
* Sunday, February 14, 2016 7:25:00 PM CET
*/

import com.prismtech.cafe.dcps.keys.KeyList;

@KeyList(
    topicType = "MicrosvcAction",
    keys = {}
)
public final class MicrosvcAction implements org.omg.CORBA.portable.IDLEntity
{
  public com.prismtech.agentv.core.types.MicrosvcActionCase action = null;

  public MicrosvcAction ()
  {
  } // ctor

  public MicrosvcAction (com.prismtech.agentv.core.types.MicrosvcActionCase _action)
  {
    action = _action;
  } // ctor

} // class MicrosvcAction