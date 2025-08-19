package com.wiprojuly.testng;
import org.testng.annotations.Test;

public class LabSession16_08 {

    @Test(groups = {"Smoke"})
    public void loginTest() {
        System.out.println("Login Test executed");
    }

    @Test(groups = {"Regression"})
    public void paymentTest() {
        System.out.println("Payment Test executed");
    }

    @Test(groups = {"Smoke", "Regression"})
    public void logoutTest() {
        System.out.println("Logout Test executed");
    }
}
