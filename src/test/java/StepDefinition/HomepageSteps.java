package StepDefinition;

import cucumber.api.java.en.Given;
import objectrepository.HomePage;

public class HomepageSteps {
	@Given("the user is in add customer page")
	public void the_user_is_in_add_customer_page() {
	HomePage home = new HomePage();
		home.getLnk_addCustomer().click();

	}
	
	/*@Given("The user is in add tariff plan page")
	public void the_user_is_in_add_tariff_plan_page() {
	*/	
	@Given("The user is in add add tarrif plan page")
	public void the_user_is_in_add_add_tarrif_plan_page() {
	HomePage home = new HomePage();
		home.getLnk_addtarrifplan().click();
	}

}



