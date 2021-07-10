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

public class HomePageTest extends BaseTest {

    public void doLogin() {
        driver.findElement(By.id("input-email")).sendKeys("naveenanimation20@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("Selenium12345");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @Test
    public void accountsPageTitleTest() {
        doLogin();
        String title = driver.getTitle();
        System.out.println("My Page Title: " + title);
        Assert.assertEquals(title, "My Account");
    }


    @Test
    public void logoutLinkTest(){
        Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
    }

}
