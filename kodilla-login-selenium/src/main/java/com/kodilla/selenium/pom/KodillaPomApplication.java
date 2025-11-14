package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class KodillaPomApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/selenium-drivers/Firefox/geckodriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.navigate().to("https://kodilla.com/pl/test/login");
        KodillaLoginPom loginPom = new KodillaLoginPom(driver);
        loginPom.login("test@kodilla.com", "haslo");
        driver.close();
    }
}