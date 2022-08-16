package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FunctionalTesing extends ProjectSpecificMethod{
	
	@FindBy(xpath = "//div[@class='desktop-query']/input")
	WebElement search;
	@FindBy(xpath = "//div[@class='desktop-query']/input")
	WebElement Product;
	@FindBy(id = "desktop-header-cnt")
	WebElement searchSS;
	@FindBy(xpath = "(//ul[@class='categories-list']//following::div)[22]")
	WebElement col;
	@FindBy(xpath = "(//img[@class='img-responsive'])[1]")
	WebElement fts;
	@FindBy(xpath = "//strong[text()='Rs. 649']")
	WebElement fts_price;
	@FindBy(xpath = "(//button[@class='size-buttons-size-button size-buttons-size-button-default'])[3]")
	WebElement tss;
	@FindBy(xpath = "//div[text()='ADD TO BAG']")
	WebElement cart;
	@FindBy(xpath = "//span[text()='GO TO BAG']")
	WebElement gocart;
	@FindBy(xpath = "//span[text()='649']")
	WebElement ord_price;
	@FindBy(xpath = "//div[@class='priceBlock-base-container']")
	WebElement orderpriceSS;
	@FindBy(xpath = "(//div[@class='desktop-actions']/a)[2]")
	WebElement Bag;	
	@FindBy(xpath = "//div[@class='itemComponents-base-invisibleBackDrop']")
	WebElement salert;
	@FindBy(xpath = "(//main['pdp-pdp-container']/div)[1]")
	WebElement bc;
	
	public FunctionalTesing(WebDriver driver) {
		dr = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSearch() throws InterruptedException {		
		System.out.print("The current window url : ");
		actions.getCurrentUrl(dr);
		actions.click(dr, search);		
	}

	public void enterProductName(String product) throws InterruptedException, IOException {
		actions.type(Product, product);
		actions.portionScreenshot(dr, searchSS,"searchProduct");
		actions.clickEnter(dr, Product);
		actions.ThreadSleep(dr, Product);
	}

	
	public void checkColor() throws InterruptedException {	
		actions.click(dr, col);	
		actions.ThreadSleep(dr, col);
	}

	public void clickFirstTshirt() throws InterruptedException{		
		actions.click(dr, fts);	
		actions.window();
		System.out.print("The new window url : ");
		actions.getCurrentUrl(dr);		
		System.out.print("Price in the product Page : ");
		actions.getText(dr,fts_price);		
		actions.ThreadSleep(dr, fts);
	}
	
	public void clickSize() throws InterruptedException {	
		actions.mouseOver(dr, tss);
		actions.click(dr, tss);
		actions.ThreadSleep(dr, tss);	
	}
	
	public void clickAddToBag() throws InterruptedException {		
		actions.click(dr, cart);	
		actions.ThreadSleep(dr, cart);
		System.out.print("BreadCrumbs validation : ");
		actions.getText(dr, bc);
	}
	
	public void clickGotoBag() throws InterruptedException {			
		actions.click(dr, gocart);	
		actions.ThreadSleep(dr, gocart);
	}
	
	public void viewPlaceOrder() throws InterruptedException, IOException {	
		actions.click(dr, salert);
		System.out.print("Price in the order Page : ");
		actions.getText(dr, ord_price);			
		actions.portionScreenshot(dr, orderpriceSS, "orderPrice");
		actions.screenshot(dr,"vieworder");	
	}
		
}
