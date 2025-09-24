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
        assertEquals(diff, 15, "diff should be 15");
    }
    @Test
    @Description("Simple test to check Addition")
    public void testsubstraction() {
        int a = 10;
        int b = 5;
        int sum = a + b;
        assertEquals(sum, 15, "Sum should be 15");
    }
    @Test
    @Description("Simple test to check multiplication")
    public void testmultiply() {
        int a = 10;
        int b = 5;
        int mul = a * b;
        assertEquals(mul, 50, "mul should be 15");
    }
}


