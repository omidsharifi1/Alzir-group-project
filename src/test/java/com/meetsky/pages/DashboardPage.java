package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage extends LoginPage{


    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//ul[@id='appmenu']/li/a")
    public List<WebElement> modulesOptions;

    @FindBy(xpath = "//div[@class='user-status-menu-item__header-content-displayname']")
    public WebElement username;


    @FindBy(id = "expand")
    public WebElement usernameExpression;


    @FindBy(xpath = "//div[.='Customize']")
    public WebElement customizeButton;


    @FindBy(xpath = "//div[@class='modal__content']/ol/li")
    public List<WebElement> widgetsOptions;


    @FindBy(xpath = "//button[@href='#']")
    public WebElement statusButton;


    @FindBy(xpath = "//button[@text='Set status message']")
    public WebElement setStatusButton;


    @FindBy(xpath = "//label[contains(., 'Online')]")
    public WebElement onlineStatus;

    @FindBy(xpath = "//label[contains(., 'Away')]")
    public WebElement awayStatus;

    @FindBy(xpath = "//label[contains(., 'Do not')]")
    public WebElement dndStatus;

    @FindBy(xpath = "//label[contains(., 'Invisib')]")
    public WebElement invisibleStatus;

    @FindBy(xpath = "//button[@href = '#']/span")
    public WebElement homeStatus;

    @FindBy(className = "header-menu__trigger")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@type=\"search\"]")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@attributes=\"[object Object]\"]")
    public WebElement foundFileBtn;

    @FindBy(xpath = "//div[@class=\"logo logo-icon\"]")
    public WebElement meetSkylogoBtn;

    public  void checkIfClickable(WebElement element){
        boolean isClickable = element.isEnabled();

        if (isClickable){
            element.click();
            System.out.println(element.getText()+" Widget is clickable");
        }else{
            System.out.println(element.getText()+" Widget is NOT clickable");
        }
    }

}


