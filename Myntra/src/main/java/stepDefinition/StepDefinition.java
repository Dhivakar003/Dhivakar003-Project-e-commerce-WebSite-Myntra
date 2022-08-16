package stepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends ProjectSpecificMethod {

	@Given("user launch the browser")
	public void launchBrowser() throws IOException {
		prop=new Properties();
		FileInputStream file = new FileInputStream("./configuration/config.properties");
		prop.load(file);
		if (prop.getProperty("BrowserName").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			dr = new ChromeDriver();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("disable-notifications");
			option.addArguments("disable-popup-blocking");
		} else if (prop.getProperty("BrowserName").equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			dr = new EdgeDriver();
		}	
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		hp = new HomePage(dr);
		ETE = new FunctionalTesing(dr);
		
	}

	@When("user opens an url")
	public void openURL(){		
		dr.get(prop.getProperty("Url"));
	}

	@Then("clicking on Men menu should be ridirected to mens product Page")
	public void clickOnMenMenu() throws InterruptedException {
		hp.clickOnMenMenu();
		
	}

	@And("clicking on Women menu should be ridirected to Womens product Page")
	public void clickOnWomenMenu() throws InterruptedException {
		hp.clickOnWomenMenu();
	
	}

	@And("clicking on Kids menu should be ridirected to Kids product Page")
	public void clickOnKidsMenu() throws InterruptedException {
		hp.clickOnKidsMenu();
	
	}

	@And("clicking on Home&Living menu should be ridirected to Home&Living product Page")
	public void clickOnHomeAndLivingMenu() throws InterruptedException {
		hp.clickOnHomeAndLivingMenu();
	
	}

	@And("clicking on Beauty menu should be ridirected to Kids product Page")
	public void clickOnBeautyMenu() throws InterruptedException {
		hp.clickOnBeautyMenu();
		
	}

	@Then("clicking on Studio menu should be ridirected to Studio product Page")
	public void clickOnStudioMenu() throws InterruptedException {
		hp.clickOnStudioMenu();
		dr.navigate().to("https://www.myntra.com/");
	
	}
	
	@Then("click on search box in Home page")
	public void clickSearchBox() throws InterruptedException {
		ETE.clickSearch();
	
	}

	@Then("Enter Search product name as {string} in the field")
	public void productSearch(String product) throws InterruptedException, IOException {
		ETE.enterProductName(product);
	
	}
	
	@And("select checkbox to filter color Blue in the product page")
	public void checkOnColor() throws InterruptedException {
		ETE.checkColor();
	
	}
	
	@And("click on first Men polo collor tshirt in the product page")
	public void clickTshirt() throws InterruptedException {
		ETE.clickFirstTshirt();
	
	}
	
	@And("select size of the tshirt in the product page")
	public void clickSizeofTshirt() throws InterruptedException {
		ETE.clickSize();
	
	}
	
	@And("click on add to bag in the product page")
	public void clickAddToBag() throws InterruptedException {
		ETE.clickAddToBag();
	
	}
	
	@And("click on go to bag in the product page")
	public void clickGotoBag() throws InterruptedException {
		ETE.clickGotoBag();
	
	}
	
	@Then("view details in the order page")
	public void viewPlaceOrder() throws InterruptedException, IOException {
		ETE.viewPlaceOrder();
	
	}
}