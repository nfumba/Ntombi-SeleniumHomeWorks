package HomeWorkClass06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class RadioButtonsAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

        List<WebElement> FavBev = driver.findElements(By.xpath("//input[@name='beverage']"));
        for (WebElement radioBtn : FavBev) {
            if (radioBtn.getAttribute("value").equals("Juice")) {
                radioBtn.click();
            }

        }
    }
}




