package com.company.testclasses;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest {
	private WebDriver d;

	@Parameters({"browser"})
	@BeforeTest
	public void Test1(String browser) throws InterruptedException{
		if (browser.equalsIgnoreCase("chrome")){
			System.out.println("hello its chrome");
			chrome();
		}

		if (browser.equals("firefox")){
			System.out.println("hello its firefox");
			firefox();

		}
	}
	@Test
	public void firefox() throws InterruptedException{
	    d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://www.google.co.in//?gfe_rd=cr&ei=DVI_VN3kEuTA8gftlIHYCQ&gws_rd=ssl");
		d.findElement(By.id("gbqfq")).sendKeys("selenium");
		d.findElement(By.id("gbqfb")).click();
		Thread.sleep(2000);
	}
	@Test
	public void chrome() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/chromedriver_win32/chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://www.google.co.in//?gfe_rd=cr&ei=DVI_VN3kEuTA8gftlIHYCQ&gws_rd=ssl");
		d.findElement(By.id("gbqfq")).sendKeys("selenium");
		d.findElement(By.id("gbqfb")).click();
		Thread.sleep(2000);
	}
	
	 @AfterTest
	 public void at(){
		 d.quit();
	 }
}