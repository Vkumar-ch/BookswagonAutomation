package com.selenium.test;

import com.selenium.base.BaseClass;
import com.selenium.pages.LoginPage;
import com.selenium.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class TestBookStore extends BaseClass {
    LoginPage loginPage;
    SignUpPage signUpPage;

    @BeforeMethod
    public void start(){
        setUp();
        loginPage = new LoginPage(driver);
        signUpPage = new SignUpPage(driver);
    }

    @Test
    public void LogOntoBookStore() throws InterruptedException {
        loginPage.loginClick();
        String currentPage = driver.getCurrentUrl();
        Assert.assertEquals(currentPage,"https://www.bookswagon.com/arts-photography-books");
    }

    @Test
    public void SignUpToBookStore() throws InterruptedException, AWTException {
        signUpPage.signInClick();

    }



}
