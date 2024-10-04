package HomeWorkClass06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonsAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");
        //1. Choose Your Favorite Beverage:
        //   - Select the Juice radio button from the list of favorite beverages.

        WebElement FavBev = driver.findElement(By.xpath("//input[@value='Juice' and @name='beverage']"));
        Boolean stateofRB = FavBev.isSelected();
        if (!stateofRB) {
            FavBev.click();
        }
        //2. Preferred Working Environment:
        //   - Retrieve all radio buttons in the Preferred Working Environment section.
        //   - Traverse through the list of radio buttons in code and select the Hybrid option.

        List<WebElement> preferredWorkingEnv = driver.findElements(By.xpath("//input[@name='working_enviroment']"));
        for (WebElement workEnv : preferredWorkingEnv) {
            if (workEnv.getAttribute("value").equals("hybrid")) {
                workEnv.click();
            }
        }

        Thread.sleep(2000);

        //3. Choose Your Favorite Season:
        //   - If the Spring radio button is disabled, click on the "Enable Buttons" button.

        WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
        enableBtn.click();

        //   - Ensure that the Spring option is now enabled, then select it.
        WebElement spring = driver.findElement(By.xpath("//input[@value='spring']"));
        Boolean stateofSpringRb = enableBtn.isEnabled();
        if (stateofSpringRb) {
            spring.click();
        }

        Thread.sleep(2000);

        //   - By default, the Winter radio button is hidden. Ensure, through code, that it is not displayed initially. Then click on the "Show Buttons" button.
        WebElement showHiddenBtn = driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        showHiddenBtn.click();
        //   - Verify that the Winter option is displayed after clicking and is available for selection.
        WebElement winterOption = driver.findElement(By.xpath("//input[@value='winter']"));
        Boolean stateOfWinterRB = winterOption.isDisplayed();
        if (stateOfWinterRB) {
            winterOption.click();

            Thread.sleep(2000);
        }
        //Choose Your Favorite Meal:
        //   - Select the Lunch radio button from the list of favorite meals.
        WebElement fanMeal = driver.findElement(By.xpath("//input[@value='lunch']"));
        fanMeal.click();

        Thread.sleep(2000);
        driver.quit();

    }
}





