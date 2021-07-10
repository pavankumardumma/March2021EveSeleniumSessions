package com.testngsessions;

import org.testng.annotations.Test;

public class PriorityTestConcept {

    @Test
    public void a_test(){
        System.out.println("a_test");
    }

    @Test(priority = 0)
    public void b_test(){
        System.out.println("b_test");
    }



    @Test(priority = 0)
    public void c_test(){
        System.out.println("c_test");
    }

    @Test(priority = 2)
    public void d_test(){
        System.out.println("d_test");
    }


    @Test
    public void e_test(){
        System.out.println("e_test");
    }

    @Test(priority = 3)
    public void f_test(){
        System.out.println("f_test");
    }

    @Test(priority = -1)
    public void g_test(){
        System.out.println("g_test");
    }
}
