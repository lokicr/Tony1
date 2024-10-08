package StepDefinations;

import PageObjects.LandingPage;
import PageObjects.OfferPage;
import PageObjects.PageObjectManager;
import Utilitys.TestContestSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

//Single responsibility principle
//loosly coupled
//Factory design principle


public class OfferPageStepDefination  {

    public WebDriver driver;
    public String child;
    public TestContestSetup testContestSetup;
    //PageObjectManager pageObjectManager;
    public String OfferPageProdutName;


    public OfferPageStepDefination(TestContestSetup testContestSetup)
    {
       this.testContestSetup=testContestSetup;
    }

    @Then("user searched for {string} shortname in offer page to check the product exist")
    public void user_searched_for_shortname_in_offer_page_to_check_the_product_exist(String shortname) throws InterruptedException {

        switchToOfferPage();
        OfferPage OfferPage = testContestSetup.pageObjectManger.offerPage();
        OfferPage.searchItem(shortname);
        Thread.sleep(2000);
        OfferPageProdutName = OfferPage.getProductName();

    }

    public void switchToOfferPage()
    {

            LandingPage landingPage = testContestSetup.pageObjectManger.GetMeTheLandingPage();
            landingPage.clickOnTopDealsPage();
             testContestSetup.GenericUtilities.switchWindToChild();




    }

}
