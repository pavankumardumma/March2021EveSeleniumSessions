package com.SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {

    @Test
    public void firstProgramTestNGtest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

    }

}
