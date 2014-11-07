package com.company.testclasses;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest {
	
	@Parameters({"browser"})
    @Test
    public void Test1(String browser){
		if (browser.equalsIgnoreCase("chrome")){
		System.out.println("hello its chrome");
		}
		if (browser.equals("firefox")){
			System.out.println("hello its firefox");
		}
	}
	
}