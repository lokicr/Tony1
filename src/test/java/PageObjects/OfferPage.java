package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {


    WebDriver driver;

    public OfferPage(WebDriver driver)
    {
        this.driver=driver;
    }

   private String SearchBox= "search-field";


    public void searchItem(String ItemName)
    {
        driver.findElement(By.id(SearchBox)).sendKeys(ItemName);
    }

    public String getProductName()
    {
        return driver.findElement(By.id(SearchBox)).getText();
    }

























}
