package testcase;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import assertl.listner;
import dynamiccode.base;
@Listeners(listner.class)
public class NewTest2 extends base {
  @Test(priority=1)
  public void f() {
 
 launchbrowse("chrome");	  
 driver.get("https://www.amazon.in/");
 
  }

  @Test(priority=2)
  public void d() {
 
  }









}
