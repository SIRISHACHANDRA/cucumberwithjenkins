package StepDefinition;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import objectrepository.AddTarrifPlan;

public class AddTarrifplanSteps {
	
	//@When("the user fill in valid tariff plan details {string}, {string},{string},{string},{string},{string},{string}")
	@When("the user fill in valid tariff plan details {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_in_valid_tariff_plan_details(String monthRent, String freeLocal, String freeInter,
			String freeSMS, String localCharges, String InterCharges, String smsCharges) {

		AddTarrifPlan addtarif = new AddTarrifPlan();

		addtarif.getTxt_rental().sendKeys(monthRent);
		addtarif.getFree_lomin().sendKeys(freeLocal);
		addtarif.getFree_inmin().sendKeys(freeInter);
		addtarif.getFree_sms().sendKeys(freeSMS);
		addtarif.getLocal_mincharges().sendKeys(localCharges);
		addtarif.getInter_nationalcharges().sendKeys(InterCharges);
		addtarif.getSms_percharges().sendKeys(smsCharges);

	}

	//@When("the user clicks submit button in add tariff plan page")
	
	//public void the_user_clicks_submit_button_in_add_tariff_plan_page() {
	@When("the user  click submit button in add tarrif plan")
	public void the_user_click_submit_button_in_add_tarrif_plan() {
	
	AddTarrifPlan addtarif = new AddTarrifPlan();
		addtarif.getClk_submit().click();
	}

	@Then("the user should set the success message")
	public void the_user_should_set_the_success_message() {
		AddTarrifPlan addtarif = new AddTarrifPlan();
		Assert.assertTrue(addtarif.getSuccessmsg().isDisplayed());
	}

}

