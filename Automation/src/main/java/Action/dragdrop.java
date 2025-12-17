package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamiccode.base;
import dynamiccode.base;

public class dragdrop extends base{

	public static void main(String[] args) {
	
launchbrowse("chrome");
hiturl("https://jqueryui.com/droppable/");

WebElement sdfg=driver.findElement(By.cssSelector("iframe.demo-frame"));
driver.switchTo().frame(sdfg);
Actions ac2 = new Actions(driver);

	WebElement drag=driver.findElement(By.cssSelector("div#draggable"));
	WebElement drop=driver.findElement(By.cssSelector("div#droppable"));
//	ac2.moveToElement(drag).clickAndHold(drag).moveToElement(drop).build().perform();
	ac2.dragAndDrop(drag, drop).build().perform();
	driver.switchTo().defaultContent();
	}

}
