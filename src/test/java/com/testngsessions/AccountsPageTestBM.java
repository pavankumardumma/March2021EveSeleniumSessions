package com.testngsessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class AccountsPageTestBM {

    public WebDriver driver;

    public void doLogin() {
        driver.findElement(By.id("input-email")).sendKeys("naveenanimation20@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("Selenium12345");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        doLogin();
    }


    @Test
    public void accountPageTitleTest() {
        String title = driver.getTitle();
        System.out.println("Page Title : " + title);
        Assert.assertEquals(title, "My Account");
    }


    @Test
    public void logoutLinkTest() {
        Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
    }

    @Test
    public void searchBoxTest() {
        Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}

