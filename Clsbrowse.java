package pkgstt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Clsbrowse {

	public static void main(String[] args) throws InturruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADITI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//invoke testing chrome browser
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\ADITI\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
		//initiate browser
		WebDriver driver = new Chromedriver(options);
		driver.get("https://data.mendeley.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

}
