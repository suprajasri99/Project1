package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	@Test(dataProvider = "getData")
	public void WebLoginHomeLoan(String uname, String pw) {
		System.out.println("Selenium");
		System.out.println(uname);
		System.out.println(pw);

	}

	@Test
	public void MobileLoginHomeLoan() {
		System.out.println("AppiumMobile");

	}

	@Test(groups = { "Smoke" })
	public void LoginAPIHomeLoan() {
		System.out.println("RestAPI");

	}

	@DataProvider
	public Object[][] getData() {

		// combination1- username1, password1
		// combination2- username2, password2
		// combination3- username3, password3
		Object[][] data = new Object[3][2];
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[2][0] = "username3";
		data[2][1] = "password3";

		return data;

	}
	@Test
	public void LoginProperties() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\SriSalla\\eclipse-workspace\\TestNGTurorial\\src\\test\\datadriven.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
	}

}
