
package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.Hooks;

public class AddTarrifPlan {
	public AddTarrifPlan() {
		PageFactory.initElements(Hooks.driver, this);
		
	}
	@FindBy(id="rental1")
	private WebElement txt_rental;
	@FindBy(id="local_minutes")
	private WebElement free_lomin;
	@FindBy(id="inter_minutes")
	private WebElement free_inmin;
	@FindBy(id="sms_pack")
	private WebElement free_sms;
	@FindBy(id="minutes_charges")
	private WebElement local_mincharges;
	@FindBy(id="inter_charges")
	private WebElement inter_nationalcharges;
	@FindBy(id="sms_charges")
	private WebElement sms_percharges;
	@FindBy(name="submit")
	private WebElement clk_submit;
	public WebElement getTxt_rental() {
		return txt_rental;
	}
	public WebElement getFree_lomin() {
		return free_lomin;
	}
	public WebElement getFree_inmin() {
		return free_inmin;
	}
	public WebElement getFree_sms() {
		return free_sms;
	}
	public WebElement getLocal_mincharges() {
		return local_mincharges;
	}
	public WebElement getInter_nationalcharges() {
		return inter_nationalcharges;
	}
	public WebElement getSms_percharges() {
		return sms_percharges;
	}
	public WebElement getClk_submit() {
		return clk_submit;
	}
@FindBy(tagName="h2")
private WebElement successmsg;
public WebElement getSuccessmsg() {
	return successmsg;
}
}
