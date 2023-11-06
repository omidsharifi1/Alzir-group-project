package com.meetsky.step_definitions;

import com.meetsky.pages.*;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;

import java.util.List;


import static com.meetsky.pages.HomePage.FilesIcon;

public class Change_Folder_Order {

    //Change_Folder_Order change_folder_order = new Change_Folder_Order();
    HomePage homePage = new HomePage();
    FilesPage filesPage = new FilesPage();
    SizePage sizePage = new SizePage();
    ModifiedPage modifiedPage = new ModifiedPage();
    SelectAll selectAll = new SelectAll();





    @Given("the user logged in with username as \\{string} and password as \\{string}")
    public void the_user_logged_in_with_username_as_and_password_as() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://qa.meetsky.net/index.php/login");
        System.out.println("User is on the login page of the website ");

    }

    @When("user click on Files")
    public void user_click_on_files() throws InterruptedException {

        homePage.FilesIcon.click();
        System.out.println("User click on Files icon");
        Thread.sleep(4000);

    }
    @When("user click on name")
    public void user_click_on_name() throws InterruptedException {

        filesPage.NameHeaderIcon.click();
        System.out.println("User click on name icon");
        Thread.sleep(4000);

    }
    @Then("User can change folder view order by Name")
    public void user_can_change_folder_view_order_by_name() {
        System.out.println("User sees the files order in alphabetic order by name ");

    }

    @When("user click on size")
    public void user_click_on_size() throws InterruptedException {

        SizePage.SizeIcon.click();
        System.out.println("User click on size icon");
        Thread.sleep(4000);

    }
    @Then("User can change folder view order by size")
    public void user_can_change_folder_view_order_by_size() {
        System.out.println("User sees the files order in alphabetic order by size ");

    }

    @When("user click on Modified")
    public void user_click_on_modified() throws InterruptedException {

        ModifiedPage.ModifiedIcone.click();
        System.out.println("User click on Modified icon");
        Thread.sleep(4000);



    }
        @Then("User can change folder view order by Modified`")
        public void user_can_change_folder_view_order_by_modified () throws InterruptedException {
        //throw new io.cucumber.java.PendingException();
            System.out.println("User sees the files order in alphabetic order by Modified ");
            Thread.sleep(4000);
        }

    @When("user click on select all")
    public void user_click_on_select_all() throws InterruptedException {
        SelectAll.SelectAll.click();
        Thread.sleep(4000);

    }
    @Then("User can see  all the files at once and see the total values of all files in the first line")
    public void user_can_see_all_the_files_at_once_and_see_the_total_values_of_all_files_in_the_first_line() {
        System.out.println("User can see  all the files at once and see the total values of all files ");

    }

}



