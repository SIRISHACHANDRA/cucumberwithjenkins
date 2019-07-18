package StepDefinition;

import java.util.Map;

import org.openqa.selenium.Alert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;
import objectrepository.AddCustomer;

public class AddcustomerSteps {
	@When("the user fill in valid customer details")
	public void the_user_fill_in_valid_customer_details(DataTable customerDetails) {
		AddCustomer addcust = new AddCustomer();

		Map<String, String> customerDetailsMap = customerDetails.asMap(String.class, String.class);
		addcust.getRdo_done().click();
		addcust.getTxt_fname().sendKeys(customerDetailsMap.get("firstName"));
		addcust.getTxt_lname().sendKeys(customerDetailsMap.get("lastName"));
		addcust.getTxt_email().sendKeys(customerDetailsMap.get("emailAdress"));
		addcust.getTxt_address().sendKeys(customerDetailsMap.get("adress"));
		addcust.getTxt_phno().sendKeys(customerDetailsMap.get("phoneNum"));

	}

	/*@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
	*/	
	@When("the user click the submit button")
	public void the_user_click_the_submit_button() {
AddCustomer addcust = new AddCustomer();
		addcust.getClk_submit().click();
	}
	@Then("the user should see the generated customer ID")
	public void the_user_should_see_the_generated_customer_ID() {
		AddCustomer addcust = new AddCustomer();

		Assert.assertTrue(addcust.getCustomerid().isDisplayed());
	}
	@When("the user fill in invalid customer details")
	public void the_user_fill_in_invalid_customer_details(DataTable customerDetails) {
		AddCustomer addcust = new AddCustomer();

		Map<String, String> customerDetailsMap = customerDetails.asMap(String.class, String.class);
		addcust.getRdo_done().click();
		addcust.getTxt_fname().sendKeys(customerDetailsMap.get("firstName"));
		addcust.getTxt_lname().sendKeys(customerDetailsMap.get("lastName"));
		addcust.getTxt_email().sendKeys(customerDetailsMap.get("emailAdress"));
		addcust.getTxt_address().sendKeys(customerDetailsMap.get("adress"));
		addcust.getTxt_phno().sendKeys(customerDetailsMap.get("phoneNum"));
	    
	}
	@Then("the user should see the popup message")
	public void the_user_should_see_the_popup_message() {
		Alert a=Hooks.driver.switchTo().alert();
		a.accept();
	}
}
