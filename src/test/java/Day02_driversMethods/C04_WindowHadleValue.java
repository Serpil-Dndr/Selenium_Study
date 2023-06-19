package Day02_driversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_WindowHadleValue
{
    public static void main(String[] args)  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String windowsHandleValue = driver.getWindowHandle();
        System.out.println(windowsHandleValue);




        Thread.sleep(3000);
        driver.close();


    }
}
