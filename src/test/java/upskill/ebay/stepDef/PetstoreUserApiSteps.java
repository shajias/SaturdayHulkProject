package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.api.restassured.PetstoreUserRestAssuredActions;

public class PetstoreUserApiSteps {
	
	PetstoreUserRestAssuredActions PetstoreUserRestAssuredActionsObj = new PetstoreUserRestAssuredActions(); 
	
	@Given("^Create user$")
	public void create_user() throws Throwable {
		PetstoreUserRestAssuredActionsObj.createUser();   
	}

	@Given("^Get user$")
	public void get_user() throws Throwable {
		PetstoreUserRestAssuredActionsObj.getUser();   
	}

	@When("^Update user$")
	public void update_user() throws Throwable {
		PetstoreUserRestAssuredActionsObj.updateUser(); 
	}

	@Then("^Delete user$")
	public void delete_user() throws Throwable {
		PetstoreUserRestAssuredActionsObj.deleteUser();   
	}

}
