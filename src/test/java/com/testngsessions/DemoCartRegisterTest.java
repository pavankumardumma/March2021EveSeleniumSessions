package com.testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoCartRegisterTest extends BaseTest {

    @DataProvider
    public Object[][] registerUsersTestData() {

        return new Object[][]{
                {"Jasprit", "Bumrah", "jasprit.bumrah@gmail.com", "123456", "jaspritbumrah"},
                {"Rohit", "Sharma", "rohit.sharma@gmail.com", "234567", "rohitsharma"},
                {"Ajinkya", "Rahane", "ajinkya.rahane@gmail.com", "345678", "ajinkyarahane"},
                {"Rishabh", "Pant", "rishabh.pant@gmail.com", "456789", "rishabhpant"},
                {"Ravindra", "Jadeja", "ravindra.jadeja@gmail.com", "567890", "ravindrajadeja"}
        };

    }


    @Test(dataProvider = "registerUsersTestData")
    public void registerTest(String firstName, String lastName, String email, String telephone, String password) {

        driver.findElement(By.id("input-firstname")).clear();
        driver.findElement(By.id("input-firstname")).sendKeys(firstName);
        driver.findElement(By.id("input-lastname")).clear();
        driver.findElement(By.id("input-lastname")).sendKeys(lastName);
        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-email")).sendKeys(email);
        driver.findElement(By.id("input-telephone")).clear();
        driver.findElement(By.id("input-telephone")).sendKeys(telephone);
        driver.findElement(By.id("input-password")).clear();
        driver.findElement(By.id("input-password")).sendKeys(password);
        driver.findElement(By.id("input-confirm")).clear();
        driver.findElement(By.id("input-confirm")).sendKeys(password);
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).isDisplayed());
        driver.findElement(By.linkText("Logout")).click();
        driver.findElement(By.linkText("Register")).click();

    }
}
