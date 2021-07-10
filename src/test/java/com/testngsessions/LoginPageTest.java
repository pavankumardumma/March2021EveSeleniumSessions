package com.testngsessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPageTest extends BaseTest{

    @Test
    public void accountsPageTitleTest() {
        String title = driver.getTitle();
        System.out.println("My Page Title: " + title);
        Assert.assertEquals(title, "Account Login");
    }


    @Test
    public void registerLinkTest() {
        Assert.assertTrue(driver.findElement(By.linkText("Register")).isDisplayed());
    }


}
