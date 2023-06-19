package Day02_driversMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_NutellaTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
//<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search Amazon" spellcheck="false">
    WebElement searchBar= driver.findElement(By.id("twotabsearchtextbox"));
    searchBar.click();
    searchBar.sendKeys("nutella");
    searchBar.submit();
    String pageSource = driver.getPageSource();
        String expectedWord="1-48 of 159 results for";
        if (pageSource.contains("expectedWord")) {
            System.out.println("Test Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
