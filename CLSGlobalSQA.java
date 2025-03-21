package pkgstt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.Select;

public class CLSGlobalSQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADITI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//invoke testing chrome browser
		
		ChromeOptions options= new ChromeOptions();
		options.setBinary("C:\\Users\\ADITI\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
				
		//initiate browser	
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.globalsqa.com/samplepagetest/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"wpcf7-f2598-p2599-o1\"]/form/p/span/input")).sendKeys("C:\\SYMBIOSISALL\\sem6\\CV\\house.jpg");
		driver.findElement(By.xpath("//*[@id=\"g2599-name\"]")).sendKeys("Aditi");
		driver.findElement(By.xpath("//*[@id=\"g2599-email\"]")).sendKeys("pookieblinder@abc");
		driver.findElement(By.xpath("//*[@id=\"g2599-website\"]")).sendKeys("https://www.youtube.com/");
		Select drpexp = new Select(driver.findElement(By.xpath("//*[@id=\"g2599-experienceinyears\"]")));
		drpexp.selectByValue("3-5");
		driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[5]/label[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[5]/label[4]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[6]/label[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/button")).click();
		driver.switchTo().alert().dismiss();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"contact-form-comment-g2599-comment\"]")).sendKeys("This for was helpful<3");
		driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/p[3]/button")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().refresh();
		//driver.back();
		driver.close();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
