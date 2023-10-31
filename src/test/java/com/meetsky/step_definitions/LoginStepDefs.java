package com.meetsky.step_definitions;

import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @When("User is already in the log in page")
    public void user_is_already_in_the_log_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {

        loginPage.login(username,password);
    }





}
