package com.odde.cucumber.android;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    @Given("there is an account {string} with password {string}")
    public void there_is_an_account_with_password(String string, String string2) {
        LoginPage page = new LoginPage();
        page.login("admin@bbuddy.com", "123456");
    }

    @When("login with username {string} and password {string}")
    public void login_with_username_and_password(String string, String string2) {

    }

    @Then("I can see the home")
    public void i_can_see_the_home() {
    }
}
