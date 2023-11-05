package com.meetsky.pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.meetsky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckModule_Page_IN extends BasePage {


    public DeckModule_Page_IN() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/button/span[1]")
    public WebElement threeVerticalLineBtn;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[3]/a/span")
    public WebElement addBoardBtn;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/div/form/input[1]")
    public WebElement boardPlaceHolder;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/div/form/input[2]")
    public WebElement arrowBtn;

    @FindBy(xpath = "//span[normalize-space(text())='New Project']")
    public WebElement newBoradText;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[2]/ul/li[1]/a")
    public WebElement clickonCard;

    @FindBy(xpath = "//*[@id=\"stack-add\"]/button")
    public WebElement creatListBtn;


    @FindBy(xpath = "//*[@id=\"new-stack-input-main\"]")
    public WebElement listCreatingPlaceHolder;


    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div/div[2]/div/div[1]/form/input[1]")
    public WebElement listName;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div/div/div/div[1]/button")
    public WebElement addCardToListBtn;

    @FindBy(xpath = "//*[@id=\"new-stack-input-main\"]")
    public WebElement cardNamePlaceHolder;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/h3")
    public WebElement cardNameOnList;


    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/div/div/div/div/button/span")
    public WebElement assignCardToMe;



    public void hoverOverAssignBtnAndClick(String path) {
        Actions actions = new Actions(Driver.getDriver());
        WebElement element = Driver.getDriver().findElement(By.xpath(path));
        actions.moveToElement(element).click().perform();


    }



}
