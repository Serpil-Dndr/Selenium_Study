package Day02_driversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriversMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        //to get all html codes from the page
        String pageSource = driver.getPageSource();
        String expectedWord ="Clinic";
        if(pageSource.contains(expectedWord)){
            System.out.println("Test passed");
        }else{
            System.out.println("test failed");
        }
    }
}
