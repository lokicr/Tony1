package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public WebDriver driver;
    public LandingPage langingPage;
    public OfferPage OfferPage;


    public PageObjectManager(WebDriver driver)
    {
        this.driver=driver;
    }

    public LandingPage GetMeTheLandingPage()
    {
       langingPage= new LandingPage(driver);
       return langingPage;
    }

    public OfferPage offerPage()
    {
        OfferPage= new OfferPage(driver);
        return offerPage();
    }



}
