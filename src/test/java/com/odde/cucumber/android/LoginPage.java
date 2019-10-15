package com.odde.cucumber.android;

public class LoginPage {
    private Driver driver = new Driver();

    public void login(String username, String password){
        driver.fill("Username", username);
        driver.fill("Password", password);
        driver.click("email_sign_in_button");
    }
}
