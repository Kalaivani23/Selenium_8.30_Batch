package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AdactinStep {
WebDriver driver;
@Before
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Cucumber\\Cucumber\\Driver\\chromedriver.exe");
    driver =new ChromeDriver();
    driver.get("http://www.adactin.com/HotelApp/Register.php");


}
	@Given("^user get the URL and title$")
	public void user_get_the_URL_and_title()  {
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	     String title = driver.getTitle();
	     System.out.println(title);
	    
	}

	@When("^user enter Username and Password \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_Username_and_Password_and(String us, String pw)  {
	    
	    driver.findElement(By.id("username")).sendKeys(us);
	    driver.findElement(By.id("password")).sendKeys(pw);
	}

	@When("^confirm password \"([^\"]*)\"$")
	public void confirm_password(String pw)  {
	    driver.findElement(By.id("re_password")).sendKeys(pw);
	    
	}

	@When("^user enter fullname and email address  \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_fullname_and_email_address_and(String lk, String kj)  {
	    driver.findElement(By.id("full_name")).sendKeys(lk);
	    driver.findElement(By.id("email_add")).sendKeys(kj);
	}

	@When("^user click I agree button and register$")
	public void user_click_I_agree_button_and_register()  {
	    driver.findElement(By.id("tnc_box")).click();
	    driver.findElement(By.id("Submit")).click(); 	 	 	
	    
	}


}
