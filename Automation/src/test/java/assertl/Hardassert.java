package assertl;

import org.testng.Assert;
import org.testng.annotations.Test;

import dynamiccode.base;

public class Hardassert extends base{
  @Test
  public void f() {
  
  
  String Expected_url="https://www.amazon.in/";
  
launchbrowse("chrome");
  hiturl("https://www.amazon.in/");
String Actual_URl= driver.getCurrentUrl();  
  System.out.println(Actual_URl);
  Assert.assertEquals(Actual_URl, Expected_url);
  System.out.println("Execution complete successfull");
  
  
  
  }
}
