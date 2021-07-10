package com.testngsessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DemoCartTest {

    public WebDriver driver;

    //global pre-conditions
    //test case specific pre-condition
    //test steps + validations (actual vs expected)
    //post steps

    @BeforeSuite
    public void setupDB() {
        System.out.println("Before Suite - setupDB");
    }

    @BeforeTest
    public void createUser() {
        System.out.println("Before Test - createUser");
    }

    @BeforeClass
    public void launchBrowser() {
        System.out.println("Before Class - launchBrowser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void loginToApp() {
        System.out.println("Before Method - loginToApp");
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.findElement(By.id("input-email")).sendKeys("naveenanimation20@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("Selenium12345");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }


    @Test
    public void accountPageTitleTest() {
        String title = driver.getTitle();
        System.out.println("Page Title : " +title);
        Assert.assertEquals(title, "My Account");
    }


    @Test
    public void logoutLinkTest(){
        Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
    }

    @Test
    public void searchBoxTest(){
        Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());
    }


    @AfterMethod
    public void logout(){
        System.out.println("After Method - logout");
        driver.findElement(By.linkText("Logout")).click();
    }

    @AfterClass
    public void closeBrowser(){
        System.out.println("After Class - closeBrowser");
        driver.close();
    }


    @AfterTest
    public void deleteUser(){
        System.out.println("After Test - deleteUser");
    }


    @AfterSuite
    public void disconnectDB(){
        System.out.println("After Suite - disconnectDB");
    }
}
