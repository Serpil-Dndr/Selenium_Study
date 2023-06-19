package Day02_driversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_TitleTest {

    public static void main(String[] args) {
        //1.set property
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        //2.web driver object
        WebDriver driver = new ChromeDriver();
        //3. use driver object for your test or work browser

        //let's go to amazon.com
        driver.get("https://www.amazon.com/");
        //let's get the title using driver
        String expectedTitle = "Amazon";
        String actualTitle =driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test is Passed");

        }else{
            System.out.println("Tets is failed");
            System.out.println("Actual title: "+ actualTitle);
            System.out.println("Expected Title: "+ expectedTitle);
        }
          driver.close();
    }
}
