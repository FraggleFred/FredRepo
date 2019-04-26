
package com.fred;

import org.owasp.encoder.Encode;


public class EncoderTest
{
  /**
   * Default constructor
   */
  public EncoderTest()
  {
  }


  /**
   * Test method
   * 
   * @param pArgs
   *          Command line arguments
   */
  @SuppressWarnings("deprecation")
  public static void main(String[] pArgs)
  {
    try
    {
      String xtUrl = "https://localhost/xtimewf/gwmenu-war?LOGIN=VVNFUklEPWRlODQ3MzY0JkRPTUFJTj1kZS5iZTEmVElNRVNUQU1QPTE4MDMyMDE5MTA1MTU4JlZB&#10;TFVFPTc4MzExNTA2Q0I1RDZENTI3MTY0QkExMDQxQzEwMkND";
      String instId = "vmosbingsa:/appl/prod/ADVT14:ADVT14";
      String iHCMUrl = "https://www.adpworld.de/whrm";
      String jsUrl = "<script>alert(1);</script>";

      System.out.println(iHCMUrl);
      System.out.println(Encode.forUri(iHCMUrl));
      System.out.println(Encode.forUri(jsUrl));
      System.out.println(Encode.forUriComponent(iHCMUrl));

      System.out.println();
      System.out.println(instId);
      System.out.println(Encode.forHtml(instId));

      System.out.println();
      System.out.println(xtUrl);
      System.out.println(Encode.forUri(xtUrl));
      System.out.println(Encode.forUriComponent(xtUrl));
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}
