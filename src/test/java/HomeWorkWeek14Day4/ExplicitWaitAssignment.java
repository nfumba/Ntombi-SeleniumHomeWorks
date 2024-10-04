package HomeWorkWeek14Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class ExplicitWaitAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");
        //1. **Change Text**:
        WebElement changeText = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        changeText.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));
        WebElement newText = driver.findElement(By.xpath("//h2[@id='headingtext']"));

        System.out.println(newText.getText());


        Thread.sleep(2000);

        //2. **Enable Button**:
        WebElement enableButton = driver.findElement(By.xpath("//button[@id='enable_button']"));
        enableButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));
        WebElement button = driver.findElement(By.xpath("//button[text()='Button']"));
        button.click();

        Thread.sleep(2000);

        //**Checkbox Checked Based on Click**:
        WebElement button2 = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        button2.click();

        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));
        WebElement cb = driver.findElement(By.xpath("//input[@id='checkbox']"));
        System.out.println (cb.isSelected());

        Thread.sleep(2000);
        driver.quit();


    }
}