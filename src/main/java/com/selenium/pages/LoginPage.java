package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "ctl00_lblUser")
    WebElement myAccountElement;

    @FindBy(name = "ctl00$phBody$SignIn$txtEmail")
    WebElement emailElement;

    @FindBy(name = "ctl00$phBody$SignIn$txtPassword")
    WebElement passwordElement;

    @FindBy(id = "ctl00_phBody_SignIn_btnLogin")
    WebElement loginElement;

    @FindBy(id = "ctl00_phBody_WishList_lnkbtnWishList")
    WebElement clickHere;

    @FindBy(xpath = "//body/form[@id='aspnetForm']/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement homeElement;

    @FindBy(xpath = "//body/form[@id='aspnetForm']/div[7]/ul[1]/li[1]/a[1]")
    WebElement categoryElement;

    @FindBy(xpath = "//body/form[@id='aspnetForm']/div[@id='site-wrapper']/div[1]/div[2]/div[3]/div[1]/div[4]/div[5]/a[1]/input[1]")
    WebElement addButton;

    @FindBy(name = "BookCart$lvCart$imgPayment")
    WebElement placeOrder;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void loginClick() throws InterruptedException {
        Thread.sleep(1000);
        myAccountElement.click();
        Thread.sleep(1000);
        emailElement.sendKeys("9014192458");
        Thread.sleep(1000);
        passwordElement.sendKeys("Kumar@123");
        loginElement.click();
        Thread.sleep(1000);
//        clickHere.click();
        homeElement.click();
        categoryElement.click();
        Thread.sleep(1000);
        addButton.click();
        Thread.sleep(5000);
//        placeOrder.click();


    }

}
