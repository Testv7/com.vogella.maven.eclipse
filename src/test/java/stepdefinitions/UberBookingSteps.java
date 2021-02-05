package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {
	
	@Given("User wants to select a car type {string} from uban")
	public void user_wants_to_select_a_car_type_from_uban(String carType) {
		System.out.println("Car Type" + carType);
}

	@When("User selects car {string} and pick up point {string} and drop at {string}")
	public void user_selects_car_and_pick_up_point_and_drop_at(String carType, String pickUpLocation, String DropLocation) {
		System.out.println("Car Type is" + carType + "Pick up Location " + pickUpLocation + "Drop Location" + DropLocation);
	}

	@When("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("Step 3");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {
		System.out.println("Step 4 :" + price);
	}


}
