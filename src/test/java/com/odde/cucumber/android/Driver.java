package com.odde.cucumber.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class Driver {
    private AppiumDriver<AndroidElement> appiumDriver;

    public Driver() {
        appiumDriver = Hooks.getDriver();
    }

    public void fill(String id, String value) {
        appiumDriver.findElementById(id).replaceValue(value);
    }

    public void click(String id) {
        appiumDriver.findElementById(id).click();
    }
}
