package org.stepdefanition;


import org.bcs.BaseCls1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fcd extends BaseCls1 {

	@Given("To launch the chrome browser and maximise window")
	public void to_launch_the_chrome_browser_and_maximise_window() {
		launchBrowser();
		maxi();
	}

	@When("To launch the url of the flipcart application")
	public void to_launch_the_url_of_the_flipcart_application() {
		launchUrl("https://www.flipkart.com/");
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		WebElement em = driver.findElement(By.xpath("//span[@class='_1Mikcj']"));
		em.click();
	}
	
	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		WebElement em = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		em.sendKeys("8012358912");
	}

	@When("To click the request otp button")
	public void to_click_the_request_otp_button() {
	WebElement lg = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		lg.click();
	}

	@When("To heck whether navigate to the home page or not")
	public void to_heck_whether_navigate_to_the_home_page_or_not() {
		System.out.println("flipcart");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		close();
	}

}
