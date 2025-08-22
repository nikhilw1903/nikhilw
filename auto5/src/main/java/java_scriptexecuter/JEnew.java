package java_scriptexecuter;



import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;

import dynamiccode.base;

 class JEnew extends base {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchbrowser("chrome");
		hiturl("https://www.railyatri.in/");
		
		JavascriptExecutor je= (JavascriptExecutor) driver;
	
//	je.executeScript("Window.scrollBy(0,300)");
	je.executeScript("window.scrollBy(0,document.body.scrollHeight)\r\n");
	je.executeScript("window.history.go(0)");
	je.executeScript("window.history.back()");
	je.executeScript("window.history.forward()");
	}}