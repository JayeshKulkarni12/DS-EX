package CalcApp;


/**
* CalcApp/CalcPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./calculator.idl
* Thursday, 25 May, 2023 1:04:44 PM IST
*/

public abstract class CalcPOA extends org.omg.PortableServer.Servant
 implements CalcApp.CalcOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("sum", new java.lang.Integer (0));
    _methods.put ("div", new java.lang.Integer (1));
    _methods.put ("mul", new java.lang.Integer (2));
    _methods.put ("sub", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // CalcApp/Calc/sum
       {
         float a = in.read_float ();
         float b = in.read_float ();
         float $result = (float)0;
         $result = this.sum (a, b);
         out = $rh.createReply();
         out.write_float ($result);
         break;
       }

       case 1:  // CalcApp/Calc/div
       {
         try {
           float a = in.read_float ();
           float b = in.read_float ();
           float $result = (float)0;
           $result = this.div (a, b);
           out = $rh.createReply();
           out.write_float ($result);
         } catch (CalcApp.CalcPackage.DivisionByZero $ex) {
           out = $rh.createExceptionReply ();
           CalcApp.CalcPackage.DivisionByZeroHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // CalcApp/Calc/mul
       {
         float a = in.read_float ();
         float b = in.read_float ();
         float $result = (float)0;
         $result = this.mul (a, b);
         out = $rh.createReply();
         out.write_float ($result);
         break;
       }

       case 3:  // CalcApp/Calc/sub
       {
         float a = in.read_float ();
         float b = in.read_float ();
         float $result = (float)0;
         $result = this.sub (a, b);
         out = $rh.createReply();
         out.write_float ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:CalcApp/Calc:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Calc _this() 
  {
    return CalcHelper.narrow(
    super._this_object());
  }

  public Calc _this(org.omg.CORBA.ORB orb) 
  {
    return CalcHelper.narrow(
    super._this_object(orb));
  }


} // class CalcPOA
