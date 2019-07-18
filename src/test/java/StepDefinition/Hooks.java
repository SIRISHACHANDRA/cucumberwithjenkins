package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver driver;

	@Before
	public static void beforeMethod1() {

		System.setProperty("webdriver.ie.driver", "C:\\Users\\Harish Chandra\\Desktop\\eclipse\\eclipse\\sirisha\\task\\Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");

	}

	@After
	public static void afterMethod1() {
	/*	driver.close();*/
		driver.quit();
}
}