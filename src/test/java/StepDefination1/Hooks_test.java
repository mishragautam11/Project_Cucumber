package StepDefination1;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Hooks_test {


    @Before
    public void beforeactions(){
        System.out.println("System start browser");
    }

    @After
    public void afteractions(){
        System.out.println("System closed the browser");
    }

    @Given("Open up google url")
    public void open_up_google_url() {
        System.out.println("Browser open");

    }
    @When("Validate logo")
    public void validate_logo() {
        System.out.println("logo verified");

    }
    @Then("shutdown browser")
    public void shutdown_browser() {
        System.out.println("Browser closed");

    }




    @Given("Open the google Url")
    public void open_the_google_url() {
        System.out.println("2nd browser opens ");

    }
    @When("Validate all buttons")
    public void validate_all_buttons() {
        System.out.println("button validated");

    }
    @Then("Close browser")
    public void close_browser() {
        System.out.println("2nd browser closed");

    }




    @Given("Opens google url")
    public void opens_google_url() {
        System.out.println("3rd browser opens");

    }
    @When("Input testing in search box")
    public void input_testing_in_search_box() {
        System.out.println("Input provided");

    }
    @Then("Hit Enter")
    public void hit_enter() {
        System.out.println("Enter pressed");

    }
    @Then("Close browser1")
    public void close_browser1() {
        System.out.println("3rd browser closed");

    }






}
