package Day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C01_Question {
    /*
    //Automation Exercise Category Test
     */
    public static void main(String[] args) throws InterruptedException {
        //1- Create a test class and set the relevant settings
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to https://www.automationexercise.com/
        driver.get("https://www.automationexercise.com/ ");
        //3- Locate the elements in the category section
        List<WebElement> categoryList = driver.findElements(By.className("panel-heading"));
        //4- Test that there are 3 elements in the Category section
        System.out.println(categoryList.size());
//        if(categoryList.size()==3){
//            System.out.println("Test is PASSED for amount of elements");
//        }else {
//            System.out.println("Test is FAILED for amount of elements");
//        }
        //5- Print the category names
        for (int i = 0; i <categoryList.size() ; i++) {
            System.out.print(categoryList.get(i).getText()+ " " );
            Thread.sleep(2000);
        }
        //6- Close the page
            //driver.close();
    }
}
