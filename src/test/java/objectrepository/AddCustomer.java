package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.Hooks;

public class AddCustomer {
	public AddCustomer() {
		PageFactory.initElements(Hooks.driver, this);
	}
@FindBy(xpath="//label[text()='Done']")
private WebElement rdo_done;
@FindBy(id="fname")
private WebElement txt_fname;
@FindBy(id="lname")
private WebElement txt_lname;
@FindBy(id="email")
private WebElement txt_email;
@FindBy(name="addr")
private WebElement txt_address;
@FindBy(id="telephoneno")
private WebElement txt_phno;
@FindBy(name="submit")
private WebElement clk_submit;
public WebElement getRdo_done() {
	return rdo_done;
}
public WebElement getTxt_fname() {
	return txt_fname;
}
public WebElement getTxt_lname() {
	return txt_lname;
}
public WebElement getTxt_email() {
	return txt_email;
}
public WebElement getTxt_address() {
	return txt_address;
}
public WebElement getTxt_phno() {
	return txt_phno;
}
public WebElement getClk_submit() {
	return clk_submit;
}
@FindBy(tagName="h3")
private WebElement customerid;
public WebElement getCustomerid() {
	return customerid;
}
}
