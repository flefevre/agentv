package com.prismtech.agentv.core.types;


/**
* com/prismtech/agentv/core/types/RepoAction.java .
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
    topicType = "RepoAction",
    keys = {}
)
public final class RepoAction implements org.omg.CORBA.portable.IDLEntity
{
  public com.prismtech.agentv.core.types.RepoActionCase action = null;

  public RepoAction ()
  {
  } // ctor

  public RepoAction (com.prismtech.agentv.core.types.RepoActionCase _action)
  {
    action = _action;
  } // ctor

} // class RepoAction
