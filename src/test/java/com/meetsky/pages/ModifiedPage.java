package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModifiedPage {

    public ModifiedPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "(//a[@id='modified'])[1]/span")
    public static WebElement ModifiedIcone;
}
