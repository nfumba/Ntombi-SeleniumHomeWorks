package HomeWorkClass02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class intoductiontoLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        WebElement fullName = driver.findElement(By.id("fullName"));
        fullName.sendKeys("Ntombifikile Fumba");
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.id("yourEmail"));
        email.sendKeys("fikile.fumba@yahoo.com");
        Thread.sleep(2000);

        WebElement clientName = driver.findElement(By.name("ClientName"));
        clientName.sendKeys("Ntombi");
        Thread.sleep(2000);

        WebElement clientID = driver.findElement(By.id("ClientId"));
        clientID.sendKeys("12345");

        Thread.sleep(2000);

        WebElement clientFeedback = driver.findElement(By.name("Clientfeedback"));
        clientFeedback.sendKeys("the service was good , happy with the turnaround time");
        Thread.sleep(2000);

        WebElement projectName = driver.findElement(By.id("ProjectNameId"));
        projectName.sendKeys("Selenium Project");
        Thread.sleep(2000);

        WebElement projectDeadLine = driver.findElement(By.name("ProjectTime"));
        projectDeadLine.sendKeys("12 pm");
        Thread.sleep(2000);

        WebElement currentAddress = driver.findElement(By.id("CurrentAddressId"));
        currentAddress.sendKeys("7 Aspeling Crescent, Highbury Park");
        Thread.sleep(2000);

        WebElement permanentAddress = driver.findElement(By.id("PermanentAddressId"));
        permanentAddress.sendKeys("Same as current");
        Thread.sleep(2000);

        //driver.close();

        WebElement submit = driver.findElement(By.id("btn-submit"));
        submit.click();
        Thread.sleep(2000);

        WebElement link= driver.findElement(By.linkText("Click Here."));
        link.click();
        Thread.sleep(2000);

        //driver.close();


    }
}
