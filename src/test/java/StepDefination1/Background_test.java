package StepDefination1;

import io.cucumber.java.en.*;

public class Background_test {


    @Given("User should be on login page")
    public void user_should_be_on_login_page() {
        System.out.println("======User landed on Login Page =======");

    }

    @When("Input username and password")
    public void input_username_and_password() {
        System.out.println("====Id and Password Inserted========");
    }

    @When("CLick signin button")
    public void c_lick_signin_button() {
        System.out.println("=======button clicked=======");
    }

    @When("Click on Admin Menu")
    public void click_on_admin_menu() {
        System.out.println("====hit on admin button=====");
    }

    @Then("Validate the System user is displaying")
    public void validate_the_system_user_is_displaying() {
        System.out.println("=====validation done======");
    }

    @When("Click on the My info")
    public void click_on_the_my_info() {
        System.out.println("====my info clicked========");
    }

    @Then("Valiade the page is on that section")
    public void valiade_the_page_is_on_that_section() {
        System.out.println("=====validation sucessfull");
    }




}
