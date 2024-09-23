package HomeWorkClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
    public static void main(String[] args) {

    WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath-homework.php");

    WebElement hobbies = driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        hobbies.sendKeys("Movies");

    WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

        WebElement favmovies = driver.findElement(By.name("favoriteMovies"));
        favmovies.sendKeys("What If");


        WebElement textelement = driver.findElement(By.xpath("//label[contains(text(),'sit amet consectetur ')]"));
        System.out.println(textelement.getText());

        WebElement city = driver.findElement(By.name("yourCity"));
                city.sendKeys("Johannesburg");


}
}

