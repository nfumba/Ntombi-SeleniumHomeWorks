package HomeWorkClass06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        //subscribe to the new letter
        WebElement newsLetter = driver.findElement(By.xpath("//input[@id='newsletter']"));
        if (newsLetter.isEnabled()) {
            newsLetter.click();
        }
        List<WebElement> allHobbies = driver.findElements(By.xpath("//input[@class='cb-element']"));

        for (WebElement hobby : allHobbies) {
            String valueOfOption = hobby.getAttribute("id");
            if (valueOfOption.equals("cooking") || valueOfOption.equals("reading")) {
                hobby.click();
            }
            WebElement supportCB = driver.findElement(By.xpath("//input[@value='Support' ]"));
            WebElement Music = driver.findElement(By.xpath("//input[@value='Music' ]"));
//        cnfrm they are not displayed
            if (!supportCB.isDisplayed() && !Music.isDisplayed()) {

                WebElement showBtn = driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
                showBtn.click();
                Thread.sleep(2000);
                Music.click();
            }

        }
    }
}