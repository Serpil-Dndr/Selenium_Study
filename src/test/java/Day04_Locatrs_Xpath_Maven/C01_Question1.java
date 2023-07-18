package Day04_Locatrs_Xpath_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Question1 {
    public static void main(String[] args) throws InterruptedException {
        //1- Go to https://the-internet.herokuapp.com/add_remove_elements/
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/ ");
        //2- Press the Add Element button
        WebElement addButton=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addButton.click();
        //3- Test that the Delete button is visible
        WebElement deleteButton = driver.findElement(By.className("added-manually"));
        if(deleteButton.isDisplayed()){
            System.out.println("Delete Button is visible");
        }
        else{
            System.out.println("Delete button not visible");
        }
        //4- Press the delete key
        deleteButton.click();
         Thread.sleep(3000);
         //5- Test that the text “Add/Remove Elements“ is visible
        if(addButton.isDisplayed()){
            System.out.println("Add buton is visible");
        }else{
            System.out.println("Add button is not visible");
        }
         driver.close();
    }

}
