package stepdefinition;

import java.util.Map;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import objectrepo.AddcustomerPage;
import objectrepo.HomePage;
import objectrepo.TelecomBase;

public class AddCustomerStep extends TelecomBase {
	
	AddcustomerPage acp;
	
	@Given("the user is in add customer page")
	public void the_user_is_in_add_customer_page() {
		HomePage hg = new HomePage();
		btnClick(hg.getLnk_addCustomer());
	}

	@When("The user fill in the valid customer details")
	public void the_user_fill_in_the_valid_customer_details(DataTable uDetails) {
		acp=new AddcustomerPage();
	    Map<String,String> uDetailsMap=uDetails.asMap(String.class, String.class);
	    btnClick(acp.getDone());
	   type(acp.getFname(), uDetailsMap.get("firstName"));
	   type(acp.getLname(), uDetailsMap.get("lastName"));
	   type(acp.getEmail(), uDetailsMap.get("emailAddress"));
	   type(acp.getAddr(), uDetailsMap.get("address"));
	   type(acp.getPhno(), uDetailsMap.get("phNo"));
	   
	   
	}
	@When("The user blank customer details")
	public void the_user_blank_customer_details(DataTable uDetails) {
		 Map<String,String> uDetailsMap=uDetails.asMap(String.class, String.class);
		    btnClick(acp.getDone());
		   type(acp.getFname(), uDetailsMap.get("firstName"));
		   type(acp.getLname(), uDetailsMap.get("lastName"));
		   type(acp.getEmail(), uDetailsMap.get("emailAddress"));
		   type(acp.getAddr(), uDetailsMap.get("address"));
		   type(acp.getPhno(), uDetailsMap.get("phNo"));
	}
	
	
	
	@When("the user click the submit button")
	public void the_user_click_the_submit_button() {
		btnClick(acp.getBtnSubmit());
		
	}

	@Then("the user should see the customer id generated")
	public void the_user_should_see_the_customer_id_generated() {
		try {
			Assert.assertTrue(acp.getCustomerId().isDisplayed());
			acp.getCustomerId().getAttribute("value");
		} catch (Throwable e) {
			e.printStackTrace();
	}

	}
	@Then("the user should see the alert box")
	public void the_user_should_see_the_alert_box() {
		
		try {
			Assert.assertTrue(isAlertPresent());
			
			
		} catch (Throwable e) {
			e.printStackTrace();

		}
	}
	@When("The user fill in the invalid customer details")
	public void the_user_fill_in_the_invalid_customer_details(DataTable uDetails) {
		 Map<String,String> uDetailsMap=uDetails.asMap(String.class, String.class);
		    btnClick(acp.getDone());
		   type(acp.getFname(), uDetailsMap.get("firstName"));
		   type(acp.getLname(), uDetailsMap.get("lastName"));
		   type(acp.getEmail(), uDetailsMap.get("emailAddress"));
		   type(acp.getAddr(), uDetailsMap.get("address"));
		   type(acp.getPhno(), uDetailsMap.get("phNo"));
	}

	@Then("the user should see  error message at phone number")
	public void the_user_should_see_error_message_at_phone_number() {
		try {
			acp.getPhnErrMsg();
			Assert.assertTrue(acp.getPhnErrMsg().isDisplayed());
			//type(acp.getPhnErrMsg(), get);
			
		} catch (Throwable e) {
			e.printStackTrace();

		}
	}
}
