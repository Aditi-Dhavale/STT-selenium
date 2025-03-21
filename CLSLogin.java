package pkgstt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class CLSLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADITI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//invoke testing chrome browser
		
		ChromeOptions options= new ChromeOptions();
		options.setBinary("C:\\Users\\ADITI\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
				
		//initiate browser	
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();

	}

}
