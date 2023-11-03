package com.meetsky.step_definitions;

import com.meetsky.pages.FilesPage;
import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class B30G4_136_US02_UploadEditDeleteFileModule_StepDefs {
    LoginPage loginPage = new LoginPage();
    FilesPage filesPage = new FilesPage();

    @Given("User click on the {string} link and be on the files page")
    public void user_click_on_the_link_and_be_on_the_files_page(String moduleName) {
        loginPage.clickMenuByText(moduleName);
    }


    @When("User clicks on the + icon")
    public void userClicksOnTheIcon() {
        filesPage.plusIcon.click();
    }

    @And("User clicks on {string} and choose file from their computer")
    public void userClicksOnAndChooseFileFromTheirComputer(String option) throws AWTException {
        filesPage.newFileOptionByText(option);
        BrowserUtils.sleep(5);

        String filePath = "C:\\Users\\nancy\\Downloads\\nancy_file1_plsNotDelete.jpg";

        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }

    @Then("User should see the successful uploaded file displayed in Files page")
    public void userShouldSeeTheSuccessfulUploadedFileDisplayedInFilesPage() {
        Assert.assertTrue(filesPage.file_nancyFile1.isDisplayed());
    }

    @And("User clicks on {string}")
    public void userClicksOn(String option) {
        filesPage.newFileOptionByText(option);
    }

    @And("User clicks on the arrow icon")
    public void userClicksOnTheArrowIcon() {
        filesPage.newFolderArrowIcon.click();
    }

    @Then("User should see {string} folder displayed in Files page")
    public void userShouldSeeFolderDisplayedInFilesPage(String expectedFolderName) {
        BrowserUtils.sleep(15);
        //BrowserUtils.waitForVisibility(filesPage.file_newFolderFile,25);

        String actualFolderName = filesPage.file_newFolderFile.getText();
        Assert.assertEquals("Folder name not matching!!!",expectedFolderName,actualFolderName);

    }

    @And("User clicks on the arrow icon and see the error message")
    public void userClicksOnTheArrowIconAndSeeTheErrorMessage() {
        filesPage.newFolderArrowIcon.click();

    }

    @And("User enters {string} as the new name and Enter")
    public void userEntersAsTheNewNameAndEnter(String newFolderName) {
        filesPage.newFolderNameInput.click();
        BrowserUtils.sleep(5);
        filesPage.newFolderNameInput.sendKeys(newFolderName + Keys.ENTER);

    }

    @Then("user should see the {string} folder displayed in Files page")
    public void userShouldSeeTheFolderDisplayedInFilesPage(String expectedFolderName) {
        BrowserUtils.waitForVisibility(filesPage.file_nancyFolderFile,15);

        String actualNewFolderName = filesPage.file_nancyFolderFile.getText();

        Assert.assertEquals("New folder name does not match!!!", expectedFolderName, actualNewFolderName);

    }

    @When("user hover to {string} folder")
    public void userHoverToFolder(String fileName) {
        filesPage.hoverToFileByText(fileName);
    }

    @When("User clicks on the three dots icon on nancy_file file")
    public void userClicksOnTheThreeDotsIconOnNancy_fileFile() {
        BrowserUtils.sleep(15);
        filesPage.threeDots_file_nancyfile1File.click();
    }

    @And("User clicks on Delete folder option")
    public void userClicksOnDeleteFolderOption() {
        filesPage.deleteFileOption.click();
    }

    @When("user is on Delete files page")
    public void userIsOnDeleteFilesPage() {
        filesPage.deletedFilesModule.click();
    }

    @Then("User should see nancy_file in Delete files page")
    public void userShouldSeeNancy_fileInDeleteFilesPage() {

        BrowserUtils.sleep(5);
        //String actualFileName = filesPage.delete_nancyfile1File.getText();

        Assert.assertTrue(filesPage.delete_nancyfile1File.isDisplayed());

    }

    @When("User scroll down to the end of the page")
    public void userScrollDownToTheEndOfThePage() {
        BrowserUtils.sleep(15);
        //BrowserUtils.waitForVisibility(filesPage.fileSummary, 55);

        BrowserUtils.scrollToElement(filesPage.folderSummary);

    }

    @Then("User should see the total number of files and folders")
    public void userShouldSeeTheTotalNumberOfFilesAndFolders() {
        BrowserUtils.sleep(5);
        //BrowserUtils.waitForVisibility(filesPage.fileSummary, 55);

        Assert.assertTrue(filesPage.folderSummary.isDisplayed());
        Assert.assertTrue(filesPage.fileSummary.isDisplayed());

    }
}
