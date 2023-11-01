package com.meetsky.step_definitions;

import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {

    }



    @Given("the user logged in with username and password")
    public void theUserLoggedInWithUsernameAndPassword() {

      loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }
}
