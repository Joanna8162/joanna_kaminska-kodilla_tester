package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://allegro.pl/");

        WebElement categoryDropdown = driver.findElement(By.xpath("//select//option[contains(text(), 'Elektronika')]"));
        categoryDropdown.click();

        WebElement searchField = driver.findElement(By.xpath("//input[contains(@placeholder, 'czego szukasz?')]"));
        searchField.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("//span[contains(text(), 'szukaj')]"));
        searchButton.click();

    }
}


