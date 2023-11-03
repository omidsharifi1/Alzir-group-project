package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeletedFilesPage extends FilesPage {

    public DeletedFilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "label[@id='view-toggle']")
    public WebElement GridView;

    @FindBy(xpath = "(//span[contains(@class, 'sort-indicator icon-triangle')])[2]")
    public WebElement ascendingSortIcon;

    @FindBy(xpath = "(//span[contains(@class, 'sort-indicator icon-triangle')])[2]")
    public WebElement descendingSortIcon;


    @FindAll({@FindBy(xpath = "((//table[@id='filestable'])[11]/tbody/tr/td[@class='date']/span[@data-timestamp])")})
    public List<WebElement> TimeElement;

}

//    @FindBy(xpath = "((//table[@id='filestable'])[11]/tbody/tr/td[@class='date']/span[@data-timestamp])[2]")
//    public WebElement NdateElement;
//    private WebDriver driver; // Initialize your WebDriver instance



    // Method to click on the sort icon based on provided XPath patterns






//  try {
//            // Locate the sort icon for ascending order
//
//            // Click the ascending sort icon
//            ascendingSortIcon.click();
//
//            // Wait for sorting action (if needed)
//            // Add additional logic here if required
//
//            // Verify sorting order (if needed)
//            // Add additional verification logic here if required
//
//            // If ascending sort is successful, click the descending sort icon
//
//            descendingSortIcon.click();
//
//            // Wait for sorting action (if needed)
//            // Add additional logic here if required
//
//            // Verify sorting order (if needed)
//            // Add additional verification logic here if required
//
//        } catch (Exception e) {
//            System.err.println("Error while clicking the sort icon: " + e.getMessage());
//        }
//    }
