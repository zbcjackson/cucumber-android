package com.odde.cucumber.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Hooks {
    private static AppiumDriver<AndroidElement> driver;
    private static AppiumDriverLocalService service;

    public static AppiumDriver<AndroidElement> getDriver(){
        return driver;
    }

    @Before
    public void startServer() throws IOException {
//        service = AppiumDriverLocalService.buildDefaultService();
//        service.start();

        File appDir = new File("/Users/zbcjackson/src/training/bbuddy/bbuddy-android/app/build/outputs/apk");
        File app = new File(appDir.getCanonicalPath(), "app-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
//        capabilities.setCapability("appPackage", "io.appium.android.apis");
//        capabilities.setCapability("appActivity", ".ApiDemos");
        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        if (service != null) {
            service.stop();
        }
    }
}
