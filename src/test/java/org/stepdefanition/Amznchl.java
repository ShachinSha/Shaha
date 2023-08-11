package org.stepdefanition;

import org.bcs.BaseCls1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amznchl extends BaseCls1 {
	
	@Given("To launch the chrome browser and maximise window")
	public void to_launch_the_chrome_browser_and_maximise_window() {
	   launchBrowser();
	   maxi();
	}

	@When("To launch the url of the amazon application")
	public void to_launch_the_url_of_the_amazon_application() {
	   	launchUrl("https://www.amazon.in/");
	}

	@When("To click the signin button")
	public void to_click_the_signin_button() {
	WebElement sn = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
	sn.click();
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		WebElement em = driver.findElement(By.name("email"));
	em.sendKeys("uvansankar3@gmail.com");
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
	WebElement lg = driver.findElement(By.id("continue"));
	lg.click();
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	}


}
