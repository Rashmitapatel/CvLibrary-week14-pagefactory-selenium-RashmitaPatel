package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ResultPage {

    @CacheLookup
    @FindBy(xpath = "//div[@class='search-header']//h1")
    WebElement resultText;

    public void verifyTheResults(String expected) {
        Assert.assertEquals(getTextFromElement(resultText), expected);
    }

    private boolean[] getTextFromElement(WebElement resultText) {

        return new boolean[0];
    }



}
