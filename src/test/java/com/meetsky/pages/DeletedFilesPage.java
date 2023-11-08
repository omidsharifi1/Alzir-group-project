package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import io.cucumber.java.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DeletedFilesPage extends FilesPage {

    public DeletedFilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "label[@id='view-toggle']")
    public WebElement GridView;

    @FindBy(xpath = "(//span[contains(@class, 'sort-indicator icon-triangle')])[2]")
    public WebElement SortIcon;


    @FindAll({@FindBy(xpath = "((//table[@id='filestable'])[11]/tbody/tr/td[@class='date']/span[@data-timestamp])")})
    public List<WebElement> TimeElement;

    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[1]")
    // this is the location of the first file in the list
    public WebElement threeDots;

    @FindBy(linkText = "Delete permanently")
    public WebElement deletePermantly;

    @FindAll({@FindBy(xpath = "(//table[@id='filestable'])[11]/tbody/tr/td[@class='filename']//span[@class='nametext extra-data'] ")})
    public List<WebElement> Files;



    @FindBy(linkText = "All files")
    public WebElement AllFilesTab;

    @FindAll({@FindBy(xpath = "(//table[@id='filestable'])[1]/tbody/tr/td//span[@class='innernametext']")})
    public List<WebElement> FilesNamesInFilesTab;


//    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    @FindBy(xpath = "(//span[.=' Restore'])[1]")
    public WebElement restoreButton;

//================================================================================
    public WebElement getWebElementByIndexToRestor(int index) {
        String xpath = "(//span[.=' Restore'])[" + index + "]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

//============================================================================================


//        List<String> FilesNames = new ArrayList<>();
//
//        // Populate FilesNames list with titles
//        for (WebElement each : Files) {
//            FilesNames.add(each.getAttribute("title"));
//        }

@BeforeClass
public String getFirstDeletedByName() { // I use this method to store the name of first file in Deleted Files field

    List<WebElement> xxxx = Files;

    List<String> FilesNames = new ArrayList<>();

    for (WebElement each : xxxx) {
        FilesNames.add(each.getAttribute("title"));
    }

    if (FilesNames.isEmpty()) {
        // Handle the case where the list is empty (e.g., return an appropriate default value)
        return "No files found";
    }

    String fileName = FilesNames.get(0);
    int dotIndex = fileName.lastIndexOf(".");
    if (dotIndex > 0) {
        fileName = fileName.substring(0, dotIndex);
    }

    return fileName;

    }

//=========================================================================================================



//    ===================================================================================
}












