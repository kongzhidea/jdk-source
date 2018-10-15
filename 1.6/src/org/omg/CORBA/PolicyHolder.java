/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package org.omg.CORBA;

/**
* The Holder for <tt>Policy</tt>.  For more information on 
* Holder files, see <a href="doc-files/generatedfiles.html#holder">
* "Generated Files: Holder Files"</a>.<P>
* org/omg/CORBA/PolicyHolder.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ../../../../../src/share/classes/org/omg/PortableServer/corba.idl
* Saturday, July 17, 1999 12:26:20 AM PDT
*/

public final class PolicyHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CORBA.Policy value = null;

  public PolicyHolder ()
  {
  }

  public PolicyHolder (org.omg.CORBA.Policy initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CORBA.PolicyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CORBA.PolicyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CORBA.PolicyHelper.type ();
  }

}
