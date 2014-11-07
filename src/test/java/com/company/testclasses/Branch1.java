package com.company.testclasses;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Branch1 {
	
	WebDriver d;
	
	@Parameters({"name","path"})
    @Test
    public void bn(String name,String path){
		System.setProperty(name,path);
		d = new ChromeDriver();
		System.out.println("hello Branch1");
	}
 
	 
	 
 
	
}
