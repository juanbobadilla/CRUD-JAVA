package datosApp;

/**
* datosApp/datosHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Persona.idl
* lunes 23 de abril de 2018 07:38:57 PM COT
*/

public final class datosHolder implements org.omg.CORBA.portable.Streamable
{
  public datosApp.datos value = null;

  public datosHolder ()
  {
  }

  public datosHolder (datosApp.datos initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = datosApp.datosHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    datosApp.datosHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return datosApp.datosHelper.type ();
  }

}
