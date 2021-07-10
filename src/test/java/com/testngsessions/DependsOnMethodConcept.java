package com.testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

    @Test
    public void loginPageTest(){
        System.out.println("Login Page Test");
    }


    @Test(dependsOnMethods = "loginPageTest")
    public void homePageTest(){
        System.out.println("Home Page Test");
    }


    @Test(dependsOnMethods = "loginPageTest")
    public void accountsPageTest(){
        System.out.println("Accounts Page Test");
    }
}
