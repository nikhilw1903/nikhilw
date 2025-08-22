package Action;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamiccode.base;

public class keybord extends base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		launchbrowser("chrome");
		hiturl("https://www.jeevansathi.com/");
		Actions ac4 = new Actions(driver);
	WebElement email=driver.findElement(By.cssSelector("input#email"));
	ac4.moveToElement(email).click().sendKeys("lsajrsalksdf").build().perform();
ac4.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
ac4.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
ac4.keyDown(Keys.TAB);
ac4.keyDown((Keys.TAB));
ac4.keyDown((Keys.TAB));
ac4.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
driver.findElement(By.cssSelector("div#eye")).click();
ac4.keyDown(Keys.DOWN).build().perform();
Thread.sleep(3000);
ac4.keyDown(Keys.DOWN).build().perform();
Thread.sleep(3000);


	}

}
