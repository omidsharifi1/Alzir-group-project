package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SizePage {
    public SizePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }




    @FindBy(xpath = "//div[3]/div[2]/div[2]/table/thead/tr/th[3]/a/span[1]")
    public static WebElement SizeIcon;

}
