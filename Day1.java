package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	@AfterTest
	public void LastExecution() {
		System.out.println("I will execute this last");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am no. 1 from last");
	}
	@Parameters({"URL1"})
	@Test
	public void FirstTest(String ploan) {
		System.out.println("Hello");
		System.out.println(ploan);
	}
	@Parameters({"URL1","username"})
	@Test
	public void SecondTest(String ploan,String key) {
		System.out.println("Bye");
		System.out.println(ploan);
		System.out.println(key);
	}

}
