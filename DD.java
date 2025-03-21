package DataDriven_Maven.DataDriven_Maven;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DD {

	public static void main(String[] args) throws Exception, Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        
        File srcfile=new File("C:\\SYMBIOSISALL\\sem6\\STT\\demoautomationtesting_password.xlsx\\");
        
        XSSFWorkbook workbook;
        XSSFSheet sheet;
        XSSFRow row;
     
        workbook = new XSSFWorkbook(srcfile);
        sheet = workbook.getSheetAt(0);
        
        for(int i=1; i<=sheet.getLastRowNum();i++) {
        	String username=sheet.getRow(i).getCell(1).getStringCellValue();
        	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
        	
        	String password=sheet.getRow(i).getCell(2).getStringCellValue();
        	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        	
        	driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        	driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
        	
        }        
        driver.navigate().back();
        driver.navigate().refresh();

	}

}
