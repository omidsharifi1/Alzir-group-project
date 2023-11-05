package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage {

    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath =" (//*[@id='selectedActionsList'])[1]/../a/span")
    public static WebElement NameHeaderIcon;


}

