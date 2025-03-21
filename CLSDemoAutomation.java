package maven_selenium.maven_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CLSDemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//opening website
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		// input box
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Aditi");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Dhavale");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Kothrud, Pune");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("adu@email.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9890728947");
		
		//clicking radio button or check boxes
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
		
		// selecting from dropdown using typing 
		driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
		
		driver.findElement(By.linkText("English")).click();
		driver.findElement(By.linkText("Croatian")).click();
		
		// selecting dropdown
		Select a = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
		a.selectByValue("C");
		
		driver.findElement(By.xpath("//*[@id=\"countries\"]")).click();
		driver.findElement(By.linkText("Select Country")).click();
		
		driver.findElement(By.xpath("//*[@id=\"select2-country-container\"]")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).click();
		driver.findElement(By.linkText("India")).click();
		
		// DOB
		Select year = new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]")));
		year.selectByValue("2004");
		Select month = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
		month.selectByValue("September");
		Select day = new Select(driver.findElement(By.xpath("//*[@id=\"daybox\"]")));
		day.selectByValue("10");
		
		// password
		driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("password");
		
		//confirm password
		driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("password");
		
		driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).sendKeys("C:\\SYMBIOSISALL\\sem6\\CV\\house.jpg");
		
		driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
		
	}

}
