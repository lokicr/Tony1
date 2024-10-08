package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class JavaSelenimPractice {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lokesh\\Desktop\\Naveen Project\\chromedriver-win64/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Radio Button clicking
        driver.findElement(By.xpath("//input[@value='radio2' and @name='radioButton']")).click();

        //drop down option selecting
        WebElement droupDown = driver.findElement(By.id("dropdown-class-example"));
        Select select=new Select(droupDown);
        select.selectByVisibleText("Select");
        Thread.sleep(5000);
        select.selectByVisibleText("Option1");

        //swetching to new window
        String mainwindowid=driver.getWindowHandle();
        System.out.println("mainwindowid  "+mainwindowid);
        System.out.println("main Window: " + driver.getTitle());
        WebElement newWindow = driver.findElement(By.id("openwindow"));
        newWindow.click();
        Set<String> multipleWindowIds = driver.getWindowHandles();

        for(String Windowids: multipleWindowIds )
        {
            if(!Windowids.equals(mainwindowid))
            {
                driver.switchTo().window(Windowids);
                System.out.println("Switched to Sub Window: " + driver.getTitle());
                driver.findElement(By.xpath("//a[text()='Access all our Courses']")).click();
                driver.manage().window().minimize();


            }
        }

        driver.switchTo().window(mainwindowid);

        driver.findElement(By.xpath("//input[@value='radio1' and @name='radioButton']")).click();


        







    }


}
