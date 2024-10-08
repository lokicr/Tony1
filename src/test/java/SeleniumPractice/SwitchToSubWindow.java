package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchToSubWindow {

    public static void main(String[] args)
    {
        // Set path to your WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lokesh\\Desktop\\Naveen Project\\chromedriver-win64/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // Open the URL
        // Navigate to Rahul Shetty's practice page
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Get the main window handle (current window)
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("Main Window Handle: " + mainWindowHandle);

        // Find the element that opens the new window and click it
        WebElement openWindowButton = driver.findElement(By.id("openwindow"));
        openWindowButton.click();

        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();

        // Loop through all window handles to switch to the sub window
        for (String windowHandle : allWindowHandles)
        {
            if (!windowHandle.equals(mainWindowHandle))
            {
                // Switch to the sub window
                driver.switchTo().window(windowHandle);
                System.out.println("Switched to Sub Window: " + driver.getTitle());

                // Perform actions on the sub window (optional)
                // For example, get the title or any other info from the new window
                System.out.println("Sub Window Title: " + driver.getTitle());

                // Optionally, close the sub window
                driver.close();

                // Switch back to main window
                driver.switchTo().window(mainWindowHandle);
                System.out.println("Switched back to Main Window: " + driver.getTitle());
                break;
            }
        }

        String currenttab = driver.getWindowHandle();
        driver.findElement(By.id("opentab")).click();
        System.out.println("tiles of main window"+driver.getTitle());
        Set<String> multipletabs = driver.getWindowHandles();

        for(String taking:multipletabs)
        {
            if(!currenttab.equals(taking))
            {
                driver.switchTo().window(taking);
                System.out.println(driver.getTitle()+"============");
            }
        }







    }
}
