package stepdefinition;

import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import objectrepo.AddTariffPlanToCustomer;
import objectrepo.AddcustomerPage;
import objectrepo.HomePage;
import objectrepo.TelecomBase;

public class AddTariffPlanToCustomerStep extends TelecomBase {
	AddTariffPlanToCustomer atpc;
	
	@Given("the user is in assigntariffplantocustomer page")
	public void the_user_is_in_assigntariffplantocustomer_page() {
		HomePage hg = new HomePage();
		btnClick(hg.getLnk_AddTariffPlantoCustomer());
	}

	@When("The user enters customerId")
	public void the_user_enters_customerId(DataTable uDetails) {
		atpc=new AddTariffPlanToCustomer();
	    Map<String,String> uDetailsMap=uDetails.asMap(String.class, String.class);
	}

	@Then("the user should navigate to next page")
	public void the_user_should_navigate_to_next_page() {
	    
	}


}
