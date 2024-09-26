package HomeWorkClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpathHomework {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");

        //The user should enter the names of books in reverse order from least favorite to favorite using advanced Xpath
        // (such as `parent`, `following-sibling`, or `preceding-sibling`).

        WebElement input1 = driver.findElement(By.xpath("//input[@id='least-favorite']"));
        input1.sendKeys("Alice's Adventures in Wonderland");
        WebElement input2 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        input2.sendKeys("Treasure Island");
        WebElement input3 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        input3.sendKeys("Pride and Prejudice");

        //The user should enter the name of their favorite book using advanced Xpath.
        WebElement OurFavBook = driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        OurFavBook.sendKeys("Harry Potter");

        //The user should enter the names of grandparent, parent, and child fields using advanced Xpath.

        WebElement grandparent = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandparent.sendKeys("12556");
        WebElement parent = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("11444");
        WebElement child = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("24444");

    }



}
