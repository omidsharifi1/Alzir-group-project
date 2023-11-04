package com.meetsky.step_definitions;

import com.meetsky.pages.DeletedFilesPage;
import com.meetsky.pages.FilesPage;
import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
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
      BrowserUtils.waitForPageToLoad(10);
    }


    @When("the user selects the option to order files by newest to oldest")
    public void the_user_selects_the_option_to_order_files_by_newest_to_oldest() {

            deletedFilesPage.SortIcon.click();
            deletedFilesPage.SortIcon.click();
            BrowserUtils.sleep(2);






//        System.out.println(timeStampAsNumbers1);


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
        List<WebElement> ascendingSortDate=  deletedFilesPage.TimeElement;
//            List<String> timeStamp= new ArrayList<>();
        List<String> timeStamp1= new ArrayList<>();

        for (WebElement each : ascendingSortDate) {
            timeStamp1.add(each.getAttribute("data-timestamp"));

        }

        // Convert each string to a long number
        List<Long> timeStampAsNumbers1 = new ArrayList<>();
        for (String number : timeStamp1) {
            timeStampAsNumbers1.add(Long.parseLong(number));
        }

        Assert.assertTrue(timeStampAsNumbers1.get(1) > timeStampAsNumbers1.get(2));


        System.out.println(timeStamp1);


    }


    @When("the user selects the option to order files by oldest to newest")
    public void theUserSelectsTheOptionToOrderFilesByOldestToNewest() {

        Driver.getDriver().navigate().refresh();
        BrowserUtils.waitForPageToLoad(10);
        deletedFilesPage.SortIcon.click();
    }

    @Then("the deleted files should be displayed in ascending order of deletion timestamp")
    public void theDeletedFilesShouldBeDisplayedInAscendingOrderOfDeletionTimestamp() {

        List<WebElement> descendingSortDate=  deletedFilesPage.TimeElement;
//            List<String> timeStamp= new ArrayList<>();
        List<String> timeStamp2= new ArrayList<>();

        for (WebElement each : descendingSortDate) {
            timeStamp2.add(each.getAttribute("data-timestamp"));

        }

        // Convert each string to a long number
        List<Long> timeStampAsNumbers1 = new ArrayList<>();
        for (String number : timeStamp2) {
            timeStampAsNumbers1.add(Long.parseLong(number));
        }

        Assert.assertTrue(timeStampAsNumbers1.get(1) < timeStampAsNumbers1.get(2));

        BrowserUtils.sleep(10);
        System.out.println(timeStamp2);
    }


    @Given("there is a deleted file on the top of the list")
    public void thereIsADeletedFileOnTheTopOfTheList() {
        List<WebElement> DeletedFilesAndFolders =  deletedFilesPage.Files;
        Assert.assertTrue(!(DeletedFilesAndFolders.isEmpty()));



    }



    @When("the user clicks on the three dots icon next to that file")
    public void theUserClicksOnTheThreeDotsIconNextToThatFile() {
        Driver.getDriver().navigate().refresh();
        BrowserUtils.waitForPageToLoad(10);

        deletedFilesPage.threeDots.click();
    }

    @And("selects the Permanently Delete option and click it")
    public void selectsTheOption() {

    

        deletedFilesPage.deletePermantly.click();
        BrowserUtils.sleep(3);

//       Assert.assertTrue(FilesNames.contains(firstFile));
//        BrowserUtils.sleep(3);
    }


    @And("verify file name {string} is permanently deleted")
    public void verifyIsPermanentlyDeleted(String FileName) {

        List<WebElement> DeletedFilesAndFolders =  deletedFilesPage.Files;

        List<String> FilesNames= new ArrayList<>();

        for (WebElement each : DeletedFilesAndFolders) {
            FilesNames.add(each.getAttribute("title"));
        }
        Assert.assertTrue(!(FilesNames.get(1).equalsIgnoreCase(FileName)));
        System.out.println(FilesNames);

    }
}

