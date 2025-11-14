package com.kodilla.selenium.search.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KodillaStorePomTest {

    KodillaStorePom storePom;

    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "C:/selenium-drivers/Firefox/geckodriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("marionette", true);
        driver = new FirefoxDriver(firefoxOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new KodillaStorePom(driver);
    }

    @Test
    public void shouldShowNumberOfNotebooksFound() {
        List<WebElement> notebooksList = storePom.searchProduct("NoteBook");
        int result = notebooksList.size();
        assertEquals(2, result);
    }

    @Test
    public void shouldShowNumberOfSchoolProductsFound() {
        List<WebElement> schoolList = storePom.searchProduct("School");
        int result = schoolList.size();
        assertEquals(1, result);
    }

    @Test
    public void shouldShowNumberOfBrandProductsFound() {
        List<WebElement> brandList = storePom.searchProduct("Brand");
        int result = brandList.size();
        assertEquals(1, result);
    }

    @Test
    public void shouldShowNumberOfBusinessProductsFound() {
        List<WebElement> businessList = storePom.searchProduct("Business");
        int result = businessList.size();
        assertEquals(0, result);
        // Szukamy komunikatu o braku wyników
        WebElement noResultsMessage = driver.findElement(By.cssSelector("h3.text-center.missing"));
        assertTrue(noResultsMessage.isDisplayed());
    }

    @Test
    public void shouldShowNumberOfGamingProductsFound() {
        List<WebElement> gamingList = storePom.searchProduct("Gaming");
        int result = gamingList.size();
        assertEquals(1, result);
    }

    @Test
    public void shouldShowNumberOfPowerfulProductsFound() {
        List<WebElement> powerfulList = storePom.searchProduct("Powerful");
        int result = powerfulList.size();
        assertEquals(0, result);
        // Szukamy komunikatu o braku wyników
        WebElement noResultsMessage = driver.findElement(By.cssSelector("h3.text-center.missing"));
        assertTrue(noResultsMessage.isDisplayed());
    }

    @Test
    public void shouldIgnoreCaseWhenSearching() {
        // Test dla małych i wielkich liter (dowolne zapytanie)
        List<WebElement> listLowerCase = storePom.searchProduct("notebook");
        List<WebElement> listUpperCase = storePom.searchProduct("NOTEBOOK");

        assertEquals(listLowerCase.size(), listUpperCase.size());
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }

}