package Day04_Locatrs_Xpath_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Question {
    public static void main(String[] args) throws InterruptedException {
        //2- Go to https://www.amazon.com/
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
       //4- Refresh the page
        driver.navigate().refresh();
        //5- Test if the page title contains the phrase “Spend less”
        String actualRsult = driver.getTitle();
        String expectedResult="Spend less";
        System.out.println(actualRsult);
        if(actualRsult.contains(expectedResult)){
            System.out.println("Test Passsed");
        }else{
            System.out.println("Test Not passed");
        }
        //6- Press the Gift Cards tab
        WebElement giftButton= driver.findElement(By.linkText("Gift Cards"));
        giftButton.click();
        //7- Press the Birthday button
        WebElement birthdayButton= driver.findElement(By.linkText("Birthday"));
        birthdayButton.click();
        Thread.sleep(3000);
        //8- Click the first product from the Best Seller section
        WebElement bestSellerButton= driver.findElement(By.linkText("Best Sellers"));
        bestSellerButton.click();
        //_cDEzb_p13n-sc-css-line-clamp-3_g3dy1
        WebElement firstProduct= driver.findElement(By.className("_cDEzb_p13n-sc-css-line-clamp-3_g3dy1"));
        firstProduct.click();
        //9- Select $25 from Gift card details
        //a-autoid-0-announce
        WebElement amountGiftCard= driver.findElement(By.id("a-autoid-0-announce"));
        amountGiftCard.click();
        //10-Test the product price is $25
        //driver.navigate().back();
        //_cDEzb_p13n-sc-price_3mJ9Z
        WebElement price = driver.findElement(By.id("gc-buy-box-text"));
        System.out.println("Price is: " + price.getText());
        if(price.equals("$50.00")){
            System.out.println("Test paased");
        }else{
            System.out.println("Test not passed");
        }
        //11-Close the page
        Thread.sleep(3000);
        driver.close();
    }
}
