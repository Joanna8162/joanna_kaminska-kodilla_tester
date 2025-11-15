package com.kodilla.selenium.google;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.*;

class GoogleSearchPageTest {

    private WebDriver driver;
    private GoogleSearchPage googleSearchPage;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "C:/selenium-drivers/Firefox/geckodriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("marionette", true);
        driver = new FirefoxDriver(firefoxOptions);
        driver.get("https://www.google.pl");

        googleSearchPage = new GoogleSearchPage(driver);

        // Akceptacja plików cookie, jeśli pojawią się
        googleSearchPage.acceptCookies();
    }

    @Test
    public void testSelectedSearchResult() {
        String searchTerm = "selenium webdriver";
        googleSearchPage.searchFor(searchTerm);

        // Po wyszukaniu, klikamy w losowy wynik
        String expectedUrl = googleSearchPage.clickRandomSearchResult();

        // Czekaj na załadowanie nowej strony
        new WebDriverWait(driver, 10).until(ExpectedConditions.urlToBe(expectedUrl));

        String currentUrl = driver.getCurrentUrl();

        // Porównaj URL
        assertEquals(expectedUrl, currentUrl);
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
