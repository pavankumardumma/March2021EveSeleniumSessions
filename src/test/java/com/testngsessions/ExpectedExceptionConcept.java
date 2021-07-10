package com.testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

    int age = 24;

    @Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
    public void loginPageTest() {
        System.out.println("Login Page Test");
//        int i = 9 / 0;

        ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
        obj = null;
        System.out.println(obj.age);

    }

}
