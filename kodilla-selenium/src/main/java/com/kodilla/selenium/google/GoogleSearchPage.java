package com.kodilla.selenium.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

public class GoogleSearchPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Pole wyszukiwania - input
    @FindBy(css = "input.gLFyf")
    private WebElement searchBoxInput;

    // Pole wyszukiwania - textarea (po wyszukaniu frazy)
    @FindBy(css = "textarea.gLFyf")
    private WebElement searchBoxTextarea;

    // Wyniki wyszukiwania
    @FindBy(css = "div.GkAmnd a")
    private List<WebElement> searchResults;

    // Przycisk akceptacji plików cookie
    private By acceptCookiesButton = By.cssSelector("div.QS5gu.sy4vM");

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    private WebElement getSearchBox() {
        try {
            if (searchBoxInput.isDisplayed()) {
                return searchBoxInput;
            } else {
                wait.until(ExpectedConditions.visibilityOf(searchBoxTextarea));
                return searchBoxTextarea;
            }
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOf(searchBoxTextarea));
            return searchBoxTextarea;
        }
    }

    // Metoda do wyszukiwania
    public void searchFor(String searchTerm) {
        WebElement searchBox = getSearchBox();
        searchBox.clear();
        searchBox.sendKeys(searchTerm);
        searchBox.submit();
    }

    // Obsługuje plik cookie, jeśli pojawi się przycisk "Zaakceptuj wszystko"
    public void acceptCookies() {
        try {
            // Czekaj na widoczność przycisku akceptacji plików cookie
            WebElement cookieButton = wait.until(ExpectedConditions.visibilityOfElementLocated(acceptCookiesButton));
            cookieButton.click();  // Kliknij przycisk akceptacji
        } catch (Exception e) {
            System.out.println("No cookie modal found.");
        }
    }

    // Klikanie w losowy wynik wyszukiwania
    public String clickRandomSearchResult() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> searchResults.size() > 0); // Czekaj na wyniki

        Random random = new Random();
        WebElement randomResult = searchResults.get(random.nextInt(searchResults.size()));
        String url = randomResult.getAttribute("href");

        randomResult.click();

        new WebDriverWait(driver, 10).until(ExpectedConditions.urlToBe(url));

        return url;
    }
}
