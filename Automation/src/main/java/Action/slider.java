package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamiccode.base;

public class slider extends base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchbrowse("chrome");
		hiturl("https://jqueryui.com/slider/");
		WebElement frame = driver.findElement(By.cssSelector("iframe[class=demo-frame]"));
		driver.switchTo().frame(frame);
		WebElement slider = driver.findElement(By.cssSelector("span[style]"));
		Actions ac3 = new Actions(driver);
//	ac3.moveToElement(slider).clickAndHold(slider).moveByOffset(500, 0).build().perform();
		ac3.dragAndDropBy(slider, 400, 0).build().perform();
		ac3.dragAndDropBy(slider, -400, 0).build().perform();
	}

}
