package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SignUpPage {

    WebDriver driver;

    @FindBy(id = "ctl00_lblUser")
    WebElement myAccountElement;

    @FindBy(xpath = "//body/form[@id='aspnetForm']/div[@id='site-wrapper']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/a[1]")
    WebElement signUpElement;

    @FindBy(id = "ctl00_phBody_SignUp_txtName")
    WebElement nameElement;

    @FindBy(name ="ctl00$phBody$SignUp$txtEmail")
    WebElement numberElement;

    @FindBy(name = "ctl00$phBody$SignUp$btnContinue")
    WebElement conformElement;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void signInClick() throws InterruptedException, AWTException {
        Thread.sleep(1000);
        myAccountElement.click();
        Robot robot = new Robot();
//        robot.mouseMove(1211,46);
        Thread.sleep(5000);
        signUpElement.click();
        Thread.sleep(1000);
        nameElement.sendKeys("kumar");
        Thread.sleep(1000);
        numberElement.sendKeys("9052895912");
        Thread.sleep(5000);
        robot.mouseMove(750,492);
        robot.mouseWheel(1);
        robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);

    }
}
