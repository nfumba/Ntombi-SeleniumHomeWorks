package HomeWorkClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com");

        String pagetitle = driver.getTitle();
        System.out.println("page title is :" + pagetitle);

        driver.navigate().to("https://www.syntaxprojects.com");

        String title = driver.getTitle();
        System.out.println("page title is :" + title);
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

driver.close();
    }
}
