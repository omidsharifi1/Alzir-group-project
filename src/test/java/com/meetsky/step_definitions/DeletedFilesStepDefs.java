package com.meetsky.step_definitions;

import com.meetsky.pages.DeletedFilesPage;
import com.meetsky.pages.FilesPage;
import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.*;

public class DeletedFilesStepDefs {
FilesPage filesPage = new FilesPage();
LoginPage loginPage = new LoginPage();
DeletedFilesPage deletedFilesPage = new DeletedFilesPage();

    @Given("user inside File page")
    public void user_inside_file_page() {

loginPage.clickMenuByText("Files");



    }
    @Then("user go to Deleted Files page")
    public void user_go_to_deleted_files_page() {

        filesPage.deletedFilesModule.click();
        BrowserUtils.sleep(3);
    }


    @When("the user selects the option to order files by newest to oldest")
    public void the_user_selects_the_option_to_order_files_by_newest_to_oldest() {

            deletedFilesPage.ascendingSortIcon.click();
            deletedFilesPage.ascendingSortIcon.click();
            BrowserUtils.sleep(10);




            List<WebElement> allDates=  deletedFilesPage.TimeElement;
//            List<String> timeStamp= new ArrayList<>();
        List<String> timeStamp= new ArrayList<>();

        for (WebElement each : allDates) {
           timeStamp.add(each.getAttribute("data-timestamp"));

        }

        // Convert each string to a long number
        List<Long> timeStampAsNumbers = new ArrayList<>();
        for (String number : timeStamp) {
            timeStampAsNumbers.add(Long.parseLong(number));
        }

        Assert.assertTrue(timeStampAsNumbers.get(1) > timeStampAsNumbers.get(2));

        System.out.println(timeStampAsNumbers);


//        String  currentDateValue  = deletedFilesPage.FirstdateElements.getAttribute("data-timestamp");
////        String previousDateValue= deletedFilesPage.NdateElement.getAttribute("data-timestamp");
//
//        System.out.println(currentDateValue);
//        =========================================================================================================

//        long previousTimestamp = Long.parseLong(previousDateValue);
//        long currentTimestamp = Long.parseLong(currentDateValue);
//
//// Assert that the current timestamp is greater than the previous timestamp
//        Assert.assertTrue("Current timestamp should be greater than previous timestamp",
//                currentTimestamp > previousTimestamp);




//
//        List<WebElement> mmm = (List<WebElement>) deletedFilesPage.FirstdateElements;
//
//        List<Date> dates = new ArrayList<>();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy h:mm a");
//
//        for (WebElement dateElement : mmm) {
//            String dateString = dateElement.getAttribute("data-original-title");
//            try {
//                Date date = dateFormat.parse(dateString);
//                dates.add(date);
//            } catch (ParseException e) {
//                System.err.println("Error parsing date: " + dateString);
//            }
//        }
//
//        // Verify order
//        for (int i = 1; i < dates.size(); i++) {
//            Assert.assertTrue(dates.get(i).compareTo(dates.get(i - 1)) >= 0);
//        }
    }












    @Then("the deleted files should be displayed in descending order of deletion timestamp")
    public void the_deleted_files_should_be_displayed_in_descending_order_of_deletion_timestamp() {

//            deletedFilesPage.descendingSortIcon.click();
//            BrowserUtils.sleep(2);



    }

}

