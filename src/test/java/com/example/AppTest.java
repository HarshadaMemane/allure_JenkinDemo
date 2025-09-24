package com.example;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class AppTest {

    @Test
    @Description("Simple test to check substractiob")
    public void testsubstraction() {
        int a = 20;
        int b = 5;
        int diff = a - b;
        assertEquals(diff, 15, "Sum should be 15");
    }
}


