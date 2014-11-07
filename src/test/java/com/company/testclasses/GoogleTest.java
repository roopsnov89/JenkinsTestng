package com.company.testclasses;



import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest {
	
	@Parameters({"Browser1"})
    @Test
    public void Test1(){
		System.out.println("hello first Test");
	}
}