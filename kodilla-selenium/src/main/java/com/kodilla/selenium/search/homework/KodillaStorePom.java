package com.kodilla.selenium.search.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class KodillaStorePom {

    @FindBy(css = "input[name='search']")
    WebElement searchField;

    WebDriver driver;

    public KodillaStorePom(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public List<WebElement> searchProduct(String product) {

        String searchTerm = product.toLowerCase();

        searchField.clear();
        searchField.sendKeys(product);

        // XPath z dynamiczną wartością
        String dynamicXpath = "//h3[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '" + searchTerm + "')]";

        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(dynamicXpath)));

            return driver.findElements(By.xpath(dynamicXpath));

        } catch (TimeoutException e) {
            // Jeśli nie znaleziono elementów w czasie oczekiwania, zwracamy pustą listę
            return new ArrayList<>();
        }
    }

    public void close() {
        driver.close();
    }
}