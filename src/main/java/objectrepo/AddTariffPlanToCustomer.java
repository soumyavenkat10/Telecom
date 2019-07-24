package objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddTariffPlanToCustomer {

	public AddTariffPlanToCustomer() {
		PageFactory.initElements(Hooks.driver, this);
	}
	
	
	@FindBy(xpath = "customer_id")
	private WebElement customerId;
	
	
	@FindBy(xpath = "//input[@class='fit']")
	private WebElement submitBtn;

	public WebElement getCustomerId() {
		return customerId;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	
}
