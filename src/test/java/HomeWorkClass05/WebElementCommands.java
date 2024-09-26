package HomeWorkClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");

        //get the text from the attribute section
        WebElement attributeText = driver.findElement(By.xpath("//div[@id='textattr']"));
        String text = attributeText.getText();
        System.out.println("the text in the attribute section is : "+text);
        if(text.equals("inspect me to view my custom attribute")){
            System.out.println("the text matches to the one mentioned in acceptance criteria");
        }
        else {
            System.out.println("the text doesnt match to the one mentioned in acceptance criteria");
        }
//        hey devs please take a look at the acceptance criteria as this text donot match the one on the website!!!
//click on the radio  button if it is enabled
        WebElement muscifesRadioBtn = driver.findElement(By.xpath("//input[@value='music_festival']"));
        if(muscifesRadioBtn.isEnabled()){
            muscifesRadioBtn.click();
        }
        // ensure that techtalk is disbaled
        WebElement techtalkRadioBtn = driver.findElement(By.xpath("//input[@value='tech_talk']"));
        boolean statusOfTechTalkRb = techtalkRadioBtn.isEnabled();
        if(!statusOfTechTalkRb){
            System.out.println("the tech talk radio button is disabled  ==test case pass");
        }
        else {
            System.out.println("the tech talk radio button is enabled  -==== test case fail");
        }
        //click on the show more option button
        WebElement showmoreBtn = driver.findElement(By.xpath("//button[text()='Show More Options']"));
        showmoreBtn.click();
//ensure that the rdio btn is displayed then click on it
        WebElement artExhibitionRb = driver.findElement(By.xpath("//input[@value='art_exhibition']"));
        if(artExhibitionRb.isDisplayed()){
            artExhibitionRb.click();
        }

        //        get the value of attribute title
        WebElement titleElement = driver.findElement(By.xpath("//div[@id='hidden_message']"));
        System.out.println(titleElement.getAttribute("title"));

        //        find the text box and clear it
        WebElement textBox = driver.findElement(By.xpath("//input[@id='inputField']"));
//        clear the text box
        textBox.clear();
        textBox.sendKeys("here is the custom text entered");
    }
}

