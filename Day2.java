package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"Smoke"})
	public void FirstTest() {
		
		System.out.println("Good");
		}
	@BeforeTest
	public void FirstExecution() {
		
		System.out.println("I will execute this first");
	}
	@Test
	public void SecondTest() {
		System.out.println("Testing for Listeners");
		Assert.assertTrue(false);
		
	}
	

}
