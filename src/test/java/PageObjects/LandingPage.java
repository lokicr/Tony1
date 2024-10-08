package PageObjects;

import Utilitys.TestContestSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    public WebDriver driver;

    public LandingPage(WebDriver driver)
    {
        this.driver=driver;
    }

    private String search="//input[@type='search']";
    private String ProductName="//h4[text()='Tomato - 1 Kg']";
    private String TopDeals= "//a[text()='Top Deals']";


    public void SearchItem(String ShortName)
    {
    driver.findElement(By.xpath(String.valueOf(search))).sendKeys(ShortName);
    }

    public String getProductName()
    {
        String ProductText=driver.findElement(By.xpath(ProductName)).getText();
        return ProductText;
    }

    public void clickOnTopDealsPage()
    {
        driver.findElement(By.xpath(TopDeals)).click();
    }





}
