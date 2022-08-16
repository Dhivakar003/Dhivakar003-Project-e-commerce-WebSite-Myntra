package stepDefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actions extends ProjectSpecificMethod {

	public static void mouseOver(WebDriver driver, WebElement ele) {
		Actions act = new Actions(dr);
		act.moveToElement(ele).build().perform();
	}

	public static void keyBoard(WebDriver driver, WebElement ele) {
		Actions builder = new Actions(dr);
		builder.sendKeys(Keys.ENTER);
	}

	public static void click(WebDriver driver, WebElement ele) {
		ele.click();
	}

	public static void clickEnter(WebDriver driver, WebElement ele) {
		ele.sendKeys(Keys.ENTER);

	}

	public static void ThreadSleep(WebDriver driver, WebElement ele) throws InterruptedException {
		Thread.sleep(2000);
	}

	public static void getCurrentUrl(WebDriver driver) throws InterruptedException {
		System.out.println(dr.getCurrentUrl());
	}

	public static char getText(WebDriver driver, WebElement ele) throws InterruptedException {
		System.out.println(ele.getText());
		return 0;
	}

	public static void getTitle(WebDriver driver) throws InterruptedException {
		System.out.println(dr.getTitle());
	}

	public static void isDisplayed(WebElement ele) throws InterruptedException {
		System.out.println(ele.isDisplayed());
	}

	public static void isEnabled(WebElement ele) throws InterruptedException {
		System.out.println(ele.isEnabled());
	}

	public static void isSelected(WebElement ele) throws InterruptedException {
		System.out.println(ele.isSelected());
	}

	public static void type(WebElement ele, String text) throws InterruptedException {
		ele.sendKeys(text);
	}

	public static void explicitWait(WebDriver driver, WebElement ele) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) ele));
	}

	public static void window() {
		String parentwd = dr.getWindowHandle();
		dr.switchTo().window(parentwd);
		for (String child : dr.getWindowHandles()) {
			dr.switchTo().window(child);
		}
	}

	public static void screenshot(WebDriver driver, String file) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) dr;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File des = new File(".\\screenshots\\" + file + ".png");
		FileUtils.copyFile(src, des);
	}

	public static void portionScreenshot(WebDriver driver, WebElement ele, String file) throws IOException {

		File src = ele.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\screenshots\\" + file + ".png");
		FileUtils.copyFile(src, trg);
	}

	public static void dropDown(WebDriver driver, WebElement ele) {
		Select select = new Select(ele);
		select.selectByIndex(2);
	}

}
