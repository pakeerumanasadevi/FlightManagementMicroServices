package com.capg.fms.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	public TestSteps() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/ADMIN/Desktop/CAPGEMINI/Boot Camp/stsbdd/driver/chromedriver.exe");
	}

	public WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String baseURL = "http://localhost:4200";

	@Before
	public void driverStart() {
		driver = new ChromeDriver();
		System.out.println("Hooks Executed");
	}

	@Given("^user launches FMS webapp$")

	public void user_launches_FMS_webapp() throws Throwable {
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.findElement(By.name("login")).click();
	}

	@When("^user provides valid username and password$")
	public void user_provides_valid_username_and_password() throws Throwable {

		driver.findElement(By.name("uname")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Admin123");
		Thread.sleep(2500);
	}

	@And("clicks on login")
	public void clicks_on_login() {
		driver.findElement(By.name("login")).click();

	}

	@Then("^user should logout successfully$")
	public void user_should_logout_successfully() throws Throwable {

		Thread.sleep(3500);
		driver.findElement(By.name("logout")).click();
		Thread.sleep(3500);
		driver.close();
	}
}
