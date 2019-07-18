package StepDefinition;

import java.awt.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class Snippetscucumbercode {
/*	static WebDriver driver;
	@Given("the user is in add customer page")
	public void the_user_is_in_add_customer_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish Chandra\\Desktop\\eclipse\\eclipse\\sirisha\\task\\lib\\driver1\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/index.html");
	driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    
	    
	}

	@When("the user fill in valid customer details")
	public void the_user_fill_in_valid_customer_details() {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("test");
		driver.findElement(By.id("lname")).sendKeys("siri");
		driver.findElement(By.id("email")).sendKeys("siri1@gmail.com");
		driver.findElement(By.id("//div[@name='addr']")).sendKeys("Nellore");
		driver.findElement(By.id("telephoneno")).sendKeys("2345678");
	   
		
		
	    
	}
	@When("the user fill in valid customer details")
	public void the_user_fill_in_valid_customer_details(DataTable dataTable) {
		List<String> dataTablelist=dataTable.asList(String.class);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(dataTablelist.get(0));
		driver.findElement(By.id("lname")).sendKeys(dataTablelist.get(1));
		driver.findElement(By.id("email")).sendKeys(dataTablelist.get(2));
		driver.findElement(By.name("addr")).sendKeys(dataTablelist.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(dataTablelist.get(4));
	    
	}
	@When("the user fill in valid customer details")
	public void the_user_fill_in_valid_customer_details(DataTable customerdetails) {
	   Map<String,String>custdetailsmap=customerdetails.asMap(String.class,String.class);
	   driver.findElement(By.xpath("//label[text()='Done']")).click();
	   driver.findElement(By.id("fname")).sendKeys(custdetailsmap.get("firstname"));
	   driver.findElement(By.id("lname")).sendKeys(custdetailsmap.get("lastname"));
	   driver.findElement(By.id("email")).sendKeys(custdetailsmap.get("emailAddress"));
	   driver.findElement(By.name("addr")).sendKeys(custdetailsmap.get("address"));
	   driver.findElement(By.id("telephoneno")).sendKeys(custdetailsmap.get("phno"));
	   
	   
	}

	
	
	@When("the user click the submit button")
	public void the_user_click_the_submit_button() {
driver.findElement(By.name("submit")).click();

	}

	@Then("the user should see the generated customer ID")
	public void the_user_should_see_the_generated_customer_ID() {
	Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed()); 
	   
	}



@Given("The user is in add add tarrif plan page")
public void the_user_is_in_add_add_tarrif_plan_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish Chandra\\Desktop\\eclipse\\eclipse\\sirisha\\task\\lib\\driver1\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/index.html");
	driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	  
   
}


@When("the user fill in valid tarrif plan  details {string},{string},{string},{string},{string},{string},{string}")
public void the_user_fill_in_valid_tarrif_plan_details(String monthrental, String freelocal, String freeinter, String freesms, String localcharges, String internationalcharges, String smspercharges) {
	driver.findElement(By.id("rental1")).sendKeys(monthrental);
    driver.findElement(By.id("local_minutes")).sendKeys(freelocal);
    driver.findElement(By.id("inter_minutes")).sendKeys(freeinter);
    driver.findElement(By.id("sms_pack")).sendKeys(freesms);
    driver.findElement(By.id("minutes_charges")).sendKeys(localcharges);
    driver.findElement(By.id("inter_charges")).sendKeys(internationalcharges);
    driver.findElement(By.id("sms_charges")).sendKeys(smspercharges);
     
}

@When("the user  click submit button in add tarrif plan")
public void the_user_click_submit_button_in_add_tarrif_plan() {
	 driver.findElement(By.name("submit")).click();
	  
}

@Then("the user should set the success message")
public void the_user_should_set_the_success_message() {
   driver.findElement(By.tagName("h2")).isDisplayed();

}
*/}

