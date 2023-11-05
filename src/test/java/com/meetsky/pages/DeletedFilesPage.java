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
    public WebElement SortIcon;


    @FindAll({@FindBy(xpath = "((//table[@id='filestable'])[11]/tbody/tr/td[@class='date']/span[@data-timestamp])")})
    public List<WebElement> TimeElement;

    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[1]") // this is the location of the first file in the list
    public WebElement threeDots;

    @FindBy(linkText = "Delete permanently")
    public WebElement deletePermantly;

    @FindAll({@FindBy(xpath = "(//table[@id='filestable'])[11]/tbody/tr/td[@class='filename']//span[@class='nametext extra-data'] ")})
    public List<WebElement> Files;

}









