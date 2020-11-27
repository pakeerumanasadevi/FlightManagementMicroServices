package com.capg.fms.as.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AirportServiceSeleniumTests {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/ADMIN/Desktop/CAPGEMINI/Boot Camp/stsbdd/driver/chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
		String baseURL = "http://localhost:4200";
		webdriver.get(baseURL);
		System.out.println(webdriver.getTitle());
		webdriver.manage().window().maximize();

		webdriver.findElement(By.name("username")).sendKeys("manasa");
		webdriver.findElement(By.name("Password")).sendKeys("Manasa123");
		webdriver.findElement(By.name("confirm")).sendKeys("Manasa123");
		webdriver.findElement(By.name("name")).sendKeys("P Manasa");
		Select dropdown = new Select(webdriver.findElement(By.name("gender")));
		dropdown.selectByVisibleText("F");

		webdriver.findElement(By.name("userPhoneno")).sendKeys("8436276510");
		webdriver.findElement(By.name("email")).sendKeys("manasa@gmail.com");
		Thread.sleep(2500);
		webdriver.findElement(By.name("signup")).click();

		Thread.sleep(2500);

		// webdriver.findElement (By.name("login")).click();
		// Thread.sleep(3000);
		webdriver.findElement(By.name("uname")).sendKeys("admin");
		webdriver.findElement(By.name("password")).sendKeys("Admin123");

		Thread.sleep(3000);
		webdriver.findElement(By.name("login")).click();
		Thread.sleep(2500);
		webdriver.findElement(By.id("vairport")).click();
		Thread.sleep(2000);
		js.executeScript("scrollBy(0,800)");
		Thread.sleep(2500);

		WebElement aid = webdriver.findElement(By.id("airid"));
		aid.sendKeys("105");
		webdriver.findElement(By.name("search")).click();
		// Alert formAlert = webdriver.switchTo().alert();

		// formAlert.accept();
		Thread.sleep(2000);
		webdriver.findElement(By.name("logoutairport")).click();
		Thread.sleep(2200);
		webdriver.close();

	}
}
