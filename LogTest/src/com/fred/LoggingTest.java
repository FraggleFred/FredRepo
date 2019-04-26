
package com.fred;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Log4j2 test class
 */
public class LoggingTest
{
  // member
  private static final Logger logM = LogManager.getFormatterLogger(LoggingTest.class);


  /**
   * Default constructor
   */
  public LoggingTest()
  {
  }


  /**
   * Do some logging
   */
  public void logit()
  {
    for (int i = 0; i < 300; i++)
    {
      if (logM.isInfoEnabled())
      {
        logM.info("logit() info " + i);
      }

      if (logM.isErrorEnabled())
      {
        logM.error("logit() error " + i);
      }
    }
  }


  /**
   * Test method
   * 
   * @param args
   *          Command line arguments
   */
  public static void main(String[] args)
  {
    try
    {
      LoggingTest lt = new LoggingTest();
      lt.logit();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}
