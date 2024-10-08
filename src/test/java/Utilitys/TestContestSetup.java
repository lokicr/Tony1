package Utilitys;

import PageObjects.PageObjectManager;
import StepDefinations.LandingPageStepDefination;
import io.cucumber.plugin.event.Node;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContestSetup {


    public WebDriver driver;
    public String landingProdutName;
    public PageObjectManager pageObjectManger;
    public TestBase testBase;
    public GenericUtils GenericUtilities;


    public TestContestSetup() throws IOException {
        System.out.println("running Testcontestsetup");
        testBase=new TestBase();
        pageObjectManger =new PageObjectManager(testBase.webDriverManager());
        GenericUtilities=new GenericUtils(testBase.webDriverManager());

    }




}
