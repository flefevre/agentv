package com.prismtech.agentv.core.types;


/**
* com/prismtech/agentv/core/types/RepoActionCase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/actions.idl
* Sunday, February 14, 2016 7:24:59 PM CET
*/

public final class RepoActionCase implements org.omg.CORBA.portable.IDLEntity
{
  private com.prismtech.agentv.core.types.InstallMicrosvc ___install;
  private com.prismtech.agentv.core.types.UpgradeMicrosvc ___upgrade;
  private com.prismtech.agentv.core.types.RemoveMicrosvc ___remove;
  private com.prismtech.agentv.core.types.RepoActionKind __discriminator;
  private boolean __uninitialized = true;

  public RepoActionCase ()
  {
  }

  public com.prismtech.agentv.core.types.RepoActionKind discriminator ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    return __discriminator;
  }

  public com.prismtech.agentv.core.types.InstallMicrosvc install ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyinstall (__discriminator);
    return ___install;
  }

  public void install (com.prismtech.agentv.core.types.InstallMicrosvc value)
  {
    __discriminator = com.prismtech.agentv.core.types.RepoActionKind.A_INSTALL;
    ___install = value;
    __uninitialized = false;
  }

  public void install (com.prismtech.agentv.core.types.RepoActionKind discriminator, com.prismtech.agentv.core.types.InstallMicrosvc value)
  {
    verifyinstall (discriminator);
    __discriminator = discriminator;
    ___install = value;
    __uninitialized = false;
  }

  private void verifyinstall (com.prismtech.agentv.core.types.RepoActionKind discriminator)
  {
    if (discriminator != com.prismtech.agentv.core.types.RepoActionKind.A_INSTALL)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public com.prismtech.agentv.core.types.UpgradeMicrosvc upgrade ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyupgrade (__discriminator);
    return ___upgrade;
  }

  public void upgrade (com.prismtech.agentv.core.types.UpgradeMicrosvc value)
  {
    __discriminator = com.prismtech.agentv.core.types.RepoActionKind.A_UPGRADE;
    ___upgrade = value;
    __uninitialized = false;
  }

  public void upgrade (com.prismtech.agentv.core.types.RepoActionKind discriminator, com.prismtech.agentv.core.types.UpgradeMicrosvc value)
  {
    verifyupgrade (discriminator);
    __discriminator = discriminator;
    ___upgrade = value;
    __uninitialized = false;
  }

  private void verifyupgrade (com.prismtech.agentv.core.types.RepoActionKind discriminator)
  {
    if (discriminator != com.prismtech.agentv.core.types.RepoActionKind.A_UPGRADE)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public com.prismtech.agentv.core.types.RemoveMicrosvc remove ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyremove (__discriminator);
    return ___remove;
  }

  public void remove (com.prismtech.agentv.core.types.RemoveMicrosvc value)
  {
    __discriminator = com.prismtech.agentv.core.types.RepoActionKind.A_REMOVE;
    ___remove = value;
    __uninitialized = false;
  }

  public void remove (com.prismtech.agentv.core.types.RepoActionKind discriminator, com.prismtech.agentv.core.types.RemoveMicrosvc value)
  {
    verifyremove (discriminator);
    __discriminator = discriminator;
    ___remove = value;
    __uninitialized = false;
  }

  private void verifyremove (com.prismtech.agentv.core.types.RepoActionKind discriminator)
  {
    if (discriminator != com.prismtech.agentv.core.types.RepoActionKind.A_REMOVE)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

} // class RepoActionCase
