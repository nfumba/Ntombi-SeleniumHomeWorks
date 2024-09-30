package HomeWorkClass06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MutliSelectDropDownAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");


//        select tag
        WebElement fvrtFruit = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
//
        Select sel=new Select(fvrtFruit);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.selectByVisibleText("Apple");
        Thread.sleep(2000);
        sel.selectByValue("Pear");
//        check if the drop down is multi select
        System.out.println(sel.isMultiple());

//       /------------------------------------------------------------------
        WebElement MutliSelectDD = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select selectMulitple =new Select(MutliSelectDD);

        //selectMulitple.selectByIndex(0);
        selectMulitple.selectByVisibleText("Traveling");
        selectMulitple.selectByValue("Cooking");
        selectMulitple.selectByValue("Gardening");

        WebElement getAllSelected = driver.findElement(By.xpath("//button[@id='get_all']"));
        getAllSelected.click();

        Thread.sleep(5000);
        selectMulitple.deselectByIndex(1);

        driver.quit();


    }
}

