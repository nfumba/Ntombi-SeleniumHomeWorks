package HomeWorkClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;

public class RelativeXpath {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath-homework.php");
        // Enter hobbies
        WebElement hobbies = driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        hobbies.sendKeys("Movies");

        // click button and ensure message is displayed
        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();
       //Enter favorate movie
        WebElement favmovies = driver.findElement(By.name("favoriteMovies"));
        favmovies.sendKeys("What If");

        //The user uses the `contains()` method of XPath to locate a specific text element on the page and prints it to the console.
        WebElement textelement = driver.findElement(By.xpath("//label[contains(text(),'sit amet consectetur ')]"));
        System.out.println(textelement.getText());

        // enter the city in the designated field.
        WebElement city = driver.findElement(By.name("yourCity"));
        city.sendKeys("Johannesburg");

        // 6. Enter email addresses using indexing technique
        WebElement email1 = driver.findElement(By.xpath("(//input[@name='PrivateEmail'])"));
        email1.sendKeys("test1@example.com");
        WebElement email2 = driver.findElement(By.xpath("(//input[@name='OfficeEmail'])"));
        email2.sendKeys("test2@example.com");
        WebElement email3 = driver.findElement(By.xpath("(//input[@name='ProfessionalEmail'])"));
        email3.sendKeys("test3@example.com");

        Thread.sleep(3000);

        // 7. Enter client name and ID using operators technique
        WebElement clientName = driver.findElement(By.xpath("//input[@name='clientName' and @type='text']"));
        clientName.sendKeys("John Doe");
        WebElement clientID = driver.findElement(By.xpath("//input[@name='clientId' or @type='number']"));
        clientID.sendKeys("12345");

        Thread.sleep(3000);

        // 8. Enter street number and house number using any XPath technique
        WebElement addressline1 = driver.findElement(By.xpath("//input[@name='StreetNo']"));
        addressline1.sendKeys("123 Main St");
        WebElement adressLine2 = driver.findElement(By.xpath("//input[@name='HouseNo']"));
        adressLine2.sendKeys("456");

        Thread.sleep(3000);
        driver.quit();



        driver.quit();


    }
}

