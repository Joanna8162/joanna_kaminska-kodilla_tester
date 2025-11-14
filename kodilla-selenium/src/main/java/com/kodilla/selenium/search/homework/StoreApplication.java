package com.kodilla.selenium.search.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class StoreApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/selenium-drivers/Firefox/geckodriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        KodillaStorePom storePom = new KodillaStorePom(driver);
        driver.close();
    }
}