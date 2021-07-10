package com.testngsessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {

    @Test(invocationCount = 2, priority = 1)
    public void loginPageTest(){
        System.out.println("Login Page Test");
    }

    @Test(priority = 2, enabled = false)
    public void homePageTest(){
        System.out.println("Home Page Test");
    }
}
