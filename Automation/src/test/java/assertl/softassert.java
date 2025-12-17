package assertl;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dynamiccode.base;

public class softassert extends base{
  @Test
  public void f() {
 
  
	  String Expected_url="https://www.amazon.in/";
	  
	  launchbrowse("chrome");
	    hiturl("https://www.amazon.in/");
	  String Actual_URl= driver.getCurrentUrl();  
	 SoftAssert s = new SoftAssert();
	    
  s.assertEquals(Actual_URl, Expected_url);
  System.out.println(Actual_URl);
  System.out.println("Execution complete successfully");
  s.assertAll();
  System.out.println("good man");
  }
}
