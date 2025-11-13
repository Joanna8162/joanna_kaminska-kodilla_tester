package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppII {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://allegro.pl/");

        WebElement categoryDropdown = driver.findElement(By.cssSelector("option[value='/kategoria/elektronika']"));
        categoryDropdown.click();

        WebElement searchField = driver.findElement(By.cssSelector("input[placeholder*='czego szukasz']"));
        searchField.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
        searchButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement firstProduct = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul > li > article"))
        );

        List<WebElement> productsList = driver.findElements(By.cssSelector("ul > li > article"));

        for (WebElement p : productsList) {
            System.out.println(p.getText());
        }
    }
}


