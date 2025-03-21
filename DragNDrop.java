package maven_selenium.maven_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNDrop {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();


        WebElement frameElement = driver.findElement(By.xpath("//*[@id='post-2669']/div[2]/div/div/div[1]/p/iframe"));
        driver.switchTo().frame(frameElement);


        Actions ac = new Actions(driver);


        WebElement a1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
        WebElement a3 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img"));
        WebElement a4 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[3]/img"));
        WebElement a5 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[4]/img"));


        WebElement a2 = driver.findElement(By.xpath("//*[@id=\"trash\"]"));


        ac.dragAndDrop(a1, a2).perform();
        ac.dragAndDrop(a3, a2).perform();
        ac.dragAndDrop(a4, a2).perform();
        ac.dragAndDrop(a5, a2).perform();
        


        System.out.println("Drag and drop performed successfully!");



    }
}