package Utilitys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    public WebDriver driver;

    public void TestBase() {


    }


    public WebDriver webDriverManager() throws IOException {

        FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\Resources\\Global.properties");
        Properties prop= new Properties();
        prop.load(fis);
        String url = prop.getProperty("url");
        String browser = prop.getProperty("browser");

        if (driver == null)
        {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lokesh\\Desktop\\Naveen Project\\chromedriver-win64/chromedriver.exe");

          if(browser.equals("chrome"))
            {
                driver = new ChromeDriver();
            }

                driver.manage().window().maximize();
                driver.get(url);

        }
        return  driver;
    }






}













