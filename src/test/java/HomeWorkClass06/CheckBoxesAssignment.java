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

        //1. Subscribe to Newsletter:
        //   - Check if the "Subscribe to Newsletter" checkbox is enabled, and then click on it.
        WebElement newsLetter = driver.findElement(By.xpath("//input[@id='newsletter']"));
        if (newsLetter.isEnabled()) {
            newsLetter.click();
        }
        //2.Select Your Hobbies:
        //   - Retrieve the list of all checkboxes in the **Select Your Hobbies** section.
        //   - Traverse through the list and select the **Reading** and **Cooking** checkboxes.
        List<WebElement> allHobbies = driver.findElements(By.xpath("//input[@class='cb-element']"));

        for (WebElement hobby : allHobbies) {
            String valueOfOption = hobby.getAttribute("id");
            if (valueOfOption.equals("cooking") || valueOfOption.equals("reading")) {
                hobby.click();
            }

            //3. Select Your Interests:
            //   - Verify that the **Support** and **Music** checkboxes are not displayed by default.
            WebElement supportCB = driver.findElement(By.xpath("//input[@value='Support' ]"));
            WebElement Music = driver.findElement(By.xpath("//input[@value='Music' ]"));
            if (!supportCB.isDisplayed() && !Music.isDisplayed()) {

        //   - Click on the "Show Checkboxes" button, and then select the **Music** checkbox.
                WebElement showBtn = driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
                showBtn.click();
                Thread.sleep(2000);
                Music.click();
            }
        //4. Preferences:
            //   - Verify that the **Receive Notifications** checkbox is disabled.
            WebElement receiveNot = driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
            if(!receiveNot.isEnabled()){
                //   - Click on the "Enable Checkboxes" button, and then select the **Receive Notifications** checkbox.
                WebElement enableCheckboxes = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
                enableCheckboxes.click();
                receiveNot.click();

            }


        }
    }
}