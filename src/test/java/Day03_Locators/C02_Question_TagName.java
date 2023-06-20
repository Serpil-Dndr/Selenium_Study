package Day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C02_Question_TagName {
    public static void main(String[] args) throws InterruptedException {
        //Automation Exercise Link Test

        //1- Create a test class and set the relevant settings
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to https://www.automationexercise.com/
        driver.get("https://www.automationexercise.com/ ");
//3- Test that there are 147 links on the page.
        List linkCount = driver.findElements(By.tagName("a"));
        if (linkCount.size()== 147) {
            System.out.println("There are 147 links on the page.");
        } else {
            System.out.println("There are NOT 147 links on the page.");
        }
        //4- Click on Products link
        WebElement productsLink = driver.findElement(By.partialLinkText("Products"));
        productsLink.click();
        System.out.println(productsLink.isDisplayed());
       Thread.sleep(3000);

        // 5. Test that the special offer text appears
        WebElement specialOfferText = driver.findElement(By.id("sale_image"));
        if (specialOfferText.isDisplayed()) {
            System.out.println("Special offer text appears.");
        } else {
            System.out.println("Special offer text does NOT appear.");
        }
        //6- Close the page
        //driver.close();
    }

    }

