package Day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_driversMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        //lets test url = "https://www.amazon.com"
        String expectedURL = "https://www.amazon.com/";
        String actualURL = driver.getCurrentUrl();
        if(actualURL.equals(expectedURL)){
            System.out.println("URL test is passed");
        }else{
            System.out.println("URL test is failed");
        }

//        Thread.sleep(5000);
     driver.close();
    }
}
