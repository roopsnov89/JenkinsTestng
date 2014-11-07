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
	
	@BeforeTest
	public void before(){
		
		
		d = new FirefoxDriver();
		 d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@Parameters({"Browser1"})
	@Test
    public void Test() throws InterruptedException{
		System.out.println("new test method");
		d.get("https://www.google.co.in//?gfe_rd=cr&ei=DVI_VN3kEuTA8gftlIHYCQ&gws_rd=ssl");

		d.findElement(By.id("gbqfq")).sendKeys("Manage");
		d.findElement(By.id("gbqfb")).click();
		Thread.sleep(2000);
	}
	@AfterTest
	 public void at(){
		 d.quit();
	 }

}
