package stepdefinition;

import java.io.IOException;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectrepo.AddTariffPlanPage;
import objectrepo.HomePage;
import objectrepo.TelecomBase;

public class AddTariffStep extends TelecomBase {

	AddTariffPlanPage atp;

	@Given("The user is in add tariff plan page")
	public void the_user_is_in_add_tariff_plan_page() {
		HomePage hg = new HomePage();
		btnClick(hg.getLnk_addTariffPlan());

	}

	@When("the user fill in the valid tariff plan details {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_in_the_valid_tariff_plan_details(String monthRent, String freelmin, String freeimin,
			String freeSmsPack, String localPMin, String interPMin, String smsPerCharges) {

		type(atp.getMonthrent(), monthRent);

		type(atp.getFreelocalMin(), freelmin);

		type(atp.getFreeinterMin(), freeimin);

		type(atp.getFreesmsPack(), freeSmsPack);
		type(atp.getLocalMinCharge(), localPMin);
		;
		type(atp.getInterMinCharge(), interPMin);
		type(atp.getSmsPerCharge(), smsPerCharges);

	}

	@When("the user left tariff plan details empty {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_left_tariff_plan_details_empty(String monthRent, String freelmin, String freeimin,
			String freeSmsPack, String localPMin, String interPMin, String smsPerCharges) {
		type(atp.getMonthrent(), monthRent);

		type(atp.getFreelocalMin(), freelmin);

		type(atp.getFreeinterMin(), freeimin);

		type(atp.getFreesmsPack(), freeSmsPack);
		type(atp.getLocalMinCharge(), localPMin);
		;
		type(atp.getInterMinCharge(), interPMin);
		type(atp.getSmsPerCharge(), smsPerCharges);
	}
	
	@When("the user left one field blank of tariff plan details  {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_left_one_field_blank_of_tariff_plan_details(String monthRent, String freelmin, String freeimin,
			String freeSmsPack, String localPMin, String interPMin, String smsPerCharges) {
		type(atp.getMonthrent(), monthRent);

		type(atp.getFreelocalMin(), freelmin);

		type(atp.getFreeinterMin(), freeimin);

		type(atp.getFreesmsPack(), freeSmsPack);
		type(atp.getLocalMinCharge(), localPMin);
		;
		type(atp.getInterMinCharge(), interPMin);
		type(atp.getSmsPerCharge(), smsPerCharges);
	}

	@Then("the user should see the error message")
	public void the_user_should_see_the_error_message() {
		try {
			Assert.assertTrue(isAlertPresent());
		} catch (Throwable e) {
			e.printStackTrace();

		}
	}

	@When("the user fill in the valid tariff plan details {string}")
	public void the_user_fill_in_the_valid_tariff_plan_details(String rowNum) throws IOException {
		atp = new AddTariffPlanPage();

		int mapIndex = Integer.parseInt(rowNum) - 2;
		type(atp.getMonthrent(), mdata.get(mapIndex).get("Monthly Rental"));
		type(atp.getFreelocalMin(), mdata.get(mapIndex).get("Free Local Minutes"));
		type(atp.getFreeinterMin(), mdata.get(mapIndex).get("Free International Minutes"));
		type(atp.getFreesmsPack(), mdata.get(mapIndex).get("Free SMS Pack"));
		type(atp.getLocalMinCharge(), mdata.get(mapIndex).get("Local Per Minutes Charges"));
		type(atp.getInterMinCharge(), mdata.get(mapIndex).get("International Per Minutes Charges"));
		type(atp.getSmsPerCharge(), mdata.get(mapIndex).get("SMS Per Charges"));

	}

	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		btnClick(atp.getBtnSubmit());
	}

	@Then("the user should see the success message")
	public void the_user_should_see_the_success_message() {
		try {
			Assert.assertTrue(atp.getMessage().isDisplayed());
		} catch (Throwable e) {
			e.printStackTrace();

		}
	}

}
