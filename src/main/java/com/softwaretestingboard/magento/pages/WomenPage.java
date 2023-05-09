package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlistners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class WomenPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    // Mouse Hover on Women Menu
    WebElement womenMenu;

    @CacheLookup
    @FindBy(linkText = "Tops")
    // Mouse Hover on Tops
    WebElement tops;

    @CacheLookup
    @FindBy(linkText = "Jackets")
    // Click on Jackets
    WebElement clickOnJackets;

    @CacheLookup
    @FindBy(xpath = "//div[2]//div[3]//select[1]")
    WebElement selectByFilterProductName;

    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter']")
    WebElement selectByFilterPrice;

    public void mouseHoverOnWomen() {
        CustomListeners.test.log(Status.PASS,"Mouse hover on women" + womenMenu);
        Reporter.log("Mouse hover on women" + womenMenu.toString());
        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverOnTop() {
        CustomListeners.test.log(Status.PASS,"Mouse hover on top" + tops);
        Reporter.log("Mouse hover on top" + tops.toString());
        mouseHoverToElement(tops);
    }
    public void clickOnJacket(){
        CustomListeners.test.log(Status.PASS,"Click on Jackets" + clickOnJackets);
        Reporter.log("Click on Jackets" + clickOnJackets.toString());
        clickOnElement(clickOnJackets);
    }
    public void selectFiletrFromDropDownList() {
        CustomListeners.test.log(Status.PASS,"Click on continue button" + selectByFilterProductName);
        Reporter.log("Click on continue button" + selectByFilterProductName.toString());
        clickOnElement(selectByFilterProductName);
    }
    public  void setSelectByFilterPrice(){
        CustomListeners.test.log(Status.PASS,"Click on continue button" + selectByFilterPrice);
        Reporter.log("Click on continue button" + selectByFilterPrice.toString());
        selectByValueFromDropDown(selectByFilterPrice,"price");
    }
}
