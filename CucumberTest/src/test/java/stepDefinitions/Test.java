package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Test {
	WebDriver driver = null;

	@Given("^I am in Google page$")

	public void i_am_in_Google_page() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("http://google.com");

	}

	@When("^I enter \"([^\"]*)\" in the searchbox$")
	public void i_enter_in_the_searchbox(String data) throws Throwable {

		driver.findElement(By.name("q")).sendKeys(data);
		driver.findElement(By.name("q")).submit();
	}

	@Then("^I see \"([^\"]*)\" page$")
	public void i_see_page(String arg1) throws Throwable {

		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, arg1);

	}
}
