package Day02_driversMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C09_IphoneSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement iphoneSearch = driver.findElement(By.id("APjFqb"));
        iphoneSearch.click();
        iphoneSearch.sendKeys("Iphone");
        iphoneSearch.submit();


    }
}
