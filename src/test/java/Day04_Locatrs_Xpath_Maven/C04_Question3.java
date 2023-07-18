package Day04_Locatrs_Xpath_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_Question3 {
    public static void main(String[] args) {
       // https://www.diemol.com/selenium-4-demo/relative-locators-demo.html
//1) Go to
// 2 ) Locate Berlin with 3 different relative locators
//
//3 ) Test that the Relative locators are working correctly
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
    }
}
