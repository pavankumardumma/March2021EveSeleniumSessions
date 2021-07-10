package com.testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest  extends BaseTest{

    @DataProvider
    public Object[][] loginPageNegativeTestData(){
        return new Object[][] {
                {"", ""},
                {" ", " "},
                {"test@gmail.com", " "},
                {" ", "test@123"},
                {"test@gmail.com", "test@123"}
        };
    }


    @Test(dataProvider = "loginPageNegativeTestData")
    public void doLogin(String userName, String password) {
        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-password")).clear();
        driver.findElement(By.id("input-email")).sendKeys(userName);
        driver.findElement(By.id("input-password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).isDisplayed());
    }
}
