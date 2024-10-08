package StepDefinations;

import PageObjects.LandingPage;
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

public class LandingPageStepDefination {

    public WebDriver driver;
    public  String parent;
    public String child;
    static
    {
        System.out.println("before running Landingpage constructor" );
    }
    public TestContestSetup testContestSetup;
    public String OfferPageProdutName;

    public LandingPageStepDefination(TestContestSetup testContestSetup)
    {
        System.out.println("running Landingpage constructor" );
       this.testContestSetup=testContestSetup;

    }

    @Given("user is on greencard landing page")
    public void user_is_on_greencard_landing_page() {

        System.out.println("=======Running first scenario=========");

    }

 @When("user searched with shortname {string} and extracted actual name of product")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String Shortname) {

        System.out.println("running second scenario");
        LandingPage landingpage = testContestSetup.pageObjectManger.GetMeTheLandingPage();
        landingpage.SearchItem(Shortname);
        String ProductName =landingpage.getProductName();
        System.out.println("parent value ="+ ProductName);


    }


}
