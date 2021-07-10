package com.testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoCartSearchTest extends BaseTest{

    @DataProvider
    public Object[][] searchTestData(){
        return new Object[][] {
                {"Macbook"},
                {"iPhone"},
                {"iPad"}
        };
    }

    @Test
    public void doLogin() {
        driver.findElement(By.id("input-email")).sendKeys("naveenanimation20@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("Selenium12345");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }


    @Test(dataProvider = "searchTestData")
    public void searchTest(String searchText){
        driver.findElement(By.cssSelector("input.form-control.input-lg")).clear();
        driver.findElement(By.cssSelector("input.form-control.input-lg")).sendKeys(searchText);
        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Products meeting the search criteria']")).isDisplayed());
    }

}
