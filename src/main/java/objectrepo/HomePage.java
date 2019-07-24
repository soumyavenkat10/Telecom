package objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Hooks.driver, this);
	}

	@FindBy(xpath = "(//a[text()='Add Customer'])[1]")
	private WebElement lnk_addCustomer;

	@FindBy(xpath = "//a[text()='Add Tariff Plan']")
	private WebElement lnk_addTariffPlan;

	@FindBy(xpath = "//a[text()='Add Tariff Plan to Customer']")
	private WebElement lnk_AddTariffPlantoCustomer;

	@FindBy(xpath = "//a[text()='Pay Billing']")
	private WebElement lnk_PayBilling;

	public WebElement getLnk_AddTariffPlantoCustomer() {
		return lnk_AddTariffPlantoCustomer;
	}

	public WebElement getLnk_PayBilling() {
		return lnk_PayBilling;
	}

	public WebElement getLnk_addCustomer() {
		return lnk_addCustomer;
	}

	public WebElement getLnk_addTariffPlan() {
		return lnk_addTariffPlan;
	}

}
