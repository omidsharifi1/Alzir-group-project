package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Talk_Module_conversationIN extends BasePage {

    public Talk_Module_conversationIN() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"emptycontent\"]/h2")
    public WebElement pageText;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/div[1]/div/button")
    public WebElement creatConversation;

    @FindBy(xpath = "//*[@id=\"content-vue\"]/div[2]/div[2]/div/div/div[1]/div[1]/input")
    public WebElement conversationPlaceholder;


    @FindBy(xpath = "//*[@id=\"content-vue\"]/div[2]/div[2]/div/div/div[1]/div[2]/label")
    public WebElement allowGuestToJoin;


    @FindBy(xpath = "//*[@id=\"content-vue\"]/div[2]/div[2]/div/div/div[2]/button[2]/span/span")
    public WebElement addPraticipantsBtn;

    @FindBy(xpath = "//*[@id=\"content-vue\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[1]/ul/li[1]/div[2]/div")
    public WebElement searchParticipant;

    @FindBy(xpath = "//*[@id=\"content-vue\"]/div[2]/div[2]/div/div/div[2]/button[2]/span/span")
    public WebElement creatConversationbtn;

    @FindBy(xpath = "//*[@id=\"content-vue\"]/div[2]/div[2]/div/div/div[2]/button/span/span")
    public WebElement closeBtn;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[1]/a/div/p")
    public WebElement displayCreatedConver;
    @FindBy(xpath = "//*[@id=\"conversation_edkbrj64\"]/div/div[2]/div[1]/div[1]/span")
    public WebElement conversationBox;

    ////*[@id="conversation_q4ix9e2s"]/div/div[2]/div[2]/div/div/div/button/span

    //starts-with(@id, 'conversation_')
    @FindBy(xpath = "//*[contains(@id, 'conversation_')]/div/div[2]/div[2]/div/div/div/button/span")
    public WebElement threeDotButton;


    @FindBy(xpath = "//*[starts-with(@id, 'menu-')]/li[6]/button/span[2]")
    public WebElement DeleteButton;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[8]/h2")
    public WebElement popUpDeleteConversation;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[8]/div[2]/button[2]")
    public WebElement yesButton;

    @FindBy(xpath = "//*[@id=\"conversation_29yza6hb\"]")
    public WebElement avilableConversation;

    public void hoverOverElementAndClick(String path) {
        Actions actions = new Actions(Driver.getDriver());
        WebElement element = Driver.getDriver().findElement(By.xpath(path));
        actions.moveToElement(element).perform();

    }


    public void hoverOverDeleteBtnAndClick(String path) {
        Actions actions = new Actions(Driver.getDriver());
        WebElement element = Driver.getDriver().findElement(By.xpath(path));
        actions.moveToElement(element).click().perform();

    }

/*
    @FindBy(xpath = "//*[@id=\"popover_0741skuz9b\"]/div/div[1]/div[1]/div")
    public List<WebElement> DeleteButton;

    public void clickByText(String text){
        try {
            for (WebElement module :DeleteButton) {
                if (module.getAttribute("action.active").equalsIgnoreCase(text)) {
                    module.click();
                }
            }
        }catch(Exception e){
            System.err.println("No such element found with text: " + text);
            e.printStackTrace();
        }
    }

 */


    public void interactWithDynamicElement() {
        // Find all elements matching the initial part of the ID
        By xpathExpression = By.xpath("//*[contains(@id, 'conversation_')]/div/div[2]/div[2]/div/div/div/button/span");
        List<WebElement> elements = Driver.getDriver().findElements(xpathExpression);

        // Iterate through the found elements and identify the correct one
        WebElement targetElement = null;
        for (WebElement element : elements) {
            if (element.getAttribute("id").startsWith("conversation_")) {
                targetElement = element;
                break;

            }
            element.click();
        }


        // Now you can use the 'targetElement' for your interactions
        if (targetElement != null) {
            targetElement.click(); // Perform your action on the element
        } else {
            // Handle the case where the element was not found
        }


    }


/*
    public void clickDeleteConversation(){

    String dynamicID = "axmpw";
    String xpathExpression = "//*[contains(@id, 'menu-')]/li[6]/button/span[2]";

    // Find the element using the dynamic XPath
    WebElement dynamicElement =Driver.getDriver().findElement(By.xpath(xpathExpression));

    // Click the dynamic element
        dynamicElement.click();
    }

 */
}


