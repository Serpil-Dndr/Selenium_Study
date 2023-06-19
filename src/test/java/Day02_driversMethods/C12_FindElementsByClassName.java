package Day02_driversMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C12_FindElementsByClassName {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
Thread.sleep(1000);

        // Go to the amazon.com
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        // search for nutella
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("nutella");
        Thread.sleep(2000);

        searchBox.submit();
        Thread.sleep(2000);

        // print the highest price in the first page
        // This lists has web elements
        List<WebElement> priceList = driver.findElements(By.className("a-price-whole"));

        // getText() : we can not directly print web element so we need to reach each element tect contents
        for (int i = 0; i <priceList.size() ; i++) {
            System.out.print(priceList.get(i).getText()+ ",");

        }

        // to print highest price
        String strNumber = "";
        int number = 0 ;
        int highestNumber = 0;


        for (int i = 0; i < priceList.size(); i++) {
            strNumber = priceList.get(i).getText(); // "14"
            number = Integer.parseInt(strNumber); // 14

            if (number > highestNumber){
                highestNumber = number;
            }
        }
        System.out.println();
        System.out.println("The higest price : " + highestNumber);
        Thread.sleep(2000);
driver.close();
    }
}

