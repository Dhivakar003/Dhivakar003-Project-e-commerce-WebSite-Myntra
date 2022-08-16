package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends ProjectSpecificMethod {

	@FindBy(xpath = "(//a[text()='Men'])[1]")
	WebElement mm;
	@FindBy(xpath = "(//a[text()='Women'])[1]")
	WebElement wm;
	@FindBy(xpath = "(//a[text()='Kids'])[1]")
	WebElement km;
	@FindBy(xpath = "(//a[text()='Home & Living'])[1]")
	WebElement hlm;
	@FindBy(xpath = "(//a[text()='Beauty'])[1]")
	WebElement bm;
	@FindBy(xpath = "(//a[text()='Studio'])[1]")
	WebElement sm;
	
	
	public HomePage(WebDriver driver) {
		dr = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnMenMenu() throws InterruptedException {
		actions.mouseOver(dr, mm);
		actions.click(dr, mm);
		actions.getCurrentUrl(dr);
		actions.getTitle(dr);
		actions.ThreadSleep(dr, mm);
	}

	public void clickOnWomenMenu() throws InterruptedException {
		actions.mouseOver(dr, wm);
		actions.click(dr, wm);
		actions.getCurrentUrl(dr);
		actions.getTitle(dr);
		actions.ThreadSleep(dr, wm);
	}

	public void clickOnKidsMenu() throws InterruptedException {
		actions.mouseOver(dr, km);
		actions.click(dr, km);
		actions.getCurrentUrl(dr);
		actions.getTitle(dr);
		actions.ThreadSleep(dr, km);
	}

	public void clickOnHomeAndLivingMenu() throws InterruptedException {
		actions.mouseOver(dr, hlm);
		actions.click(dr, hlm);
		actions.getCurrentUrl(dr);
		actions.getTitle(dr);
		actions.ThreadSleep(dr, hlm);
	}

	public void clickOnBeautyMenu() throws InterruptedException {
		actions.mouseOver(dr, bm);
		actions.click(dr, bm);
		actions.getCurrentUrl(dr);
		actions.getTitle(dr);
		actions.ThreadSleep(dr, bm);
	}

	public void clickOnStudioMenu() throws InterruptedException {
		actions.mouseOver(dr, sm);
		actions.click(dr, sm);
		actions.getCurrentUrl(dr);
		actions.getTitle(dr);
		actions.ThreadSleep(dr, sm);
	}

}
