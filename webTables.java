package maven_selenium.maven_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().window().maximize();
        
        List<WebElement> as=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td[1]"));
        for(WebElement comp:as) {
        	String company=comp.getText();
        	System.out.println(company);
        	System.out.println("---------------------");
        }
        
        List<WebElement> ab=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td[2]"));
        for(WebElement comp:ab) {
        	String contact=comp.getText();
        	System.out.println(contact);
        	System.out.println("---------------------");
        }
        
        List<WebElement> ac=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td[3]"));
        for(WebElement comp:ac) {
        	String country=comp.getText();
        	System.out.println(country);
        	System.out.println("---------------------");
        }

	}

}
