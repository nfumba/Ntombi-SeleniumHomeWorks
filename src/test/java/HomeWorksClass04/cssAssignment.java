package HomeWorksClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class cssAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        // Fill text boxes using unique CSS selectors
        driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("John");
        driver.findElement(By.cssSelector("input#lastName")).sendKeys("Doe");
        driver.findElement(By.cssSelector("input[data-id='email']")).sendKeys("johndoe@example.com");
        driver.findElement(By.cssSelector("input[class='phone']")).sendKeys("123-456-7890");
        driver.findElement(By.cssSelector("input[placeholder='Address']")).sendKeys("123 Main St");

        // Submit form
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}



}
