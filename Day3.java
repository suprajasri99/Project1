package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	//@Parameters({"HomePage"})
	@Test
//	public void WebLoginCarLoan(String urlname){
//		System.out.println("Selenium");
//		System.out.println(urlname);
		
//	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before excuting allmethods in the class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After excuting allmethods in the class");
	}
	@Parameters({"URL"})
	@Test
	public void webLogoutCarLoan(String cloan) {
		
		System.out.println("WebLogout car Loan");
		System.out.println(cloan);
	}
	
	@Test
	public void MobileLoginCarLoan(){
		System.out.println("AppiumMobile");
		
	}
	@BeforeMethod
	public void beforeEvery() {
		
		System.out.println("I will execute before every test method in day3 class");
	}
	@AfterMethod
	public void afterEvery() {
		
		System.out.println("I will execute after every test method in day3 class");
	}
	@Test (groups= {"Smoke"})
	public void LoginAPICarLoan(){
		System.out.println("RestAPI");
		
	}
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("I am no. 1");
	}
	@Test
	public void MobileLogoutCarLoan(){
		System.out.println("AppiumMobile");
		
	}
	@Parameters({"URL"})
	@Test
	public void MobileRegistrationCarLoan(String uname){
		System.out.println("AppiumMobile");
		System.out.println(uname);
		
	}
	
	
	

}
