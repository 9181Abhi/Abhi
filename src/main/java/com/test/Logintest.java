package com.test;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pom.Loginexcel;


public class Logintest {
	@Test
	public void loginfunctionality() throws IOException, InterruptedException
	{
	
	String path="E:\\New folder\\sausedemo.xlsx";
	FileInputStream File= new FileInputStream(path);
	XSSFWorkbook wb = new XSSFWorkbook(File);
	XSSFSheet sht = wb.getSheet("Sheet1");
	
	XSSFRow rw1=sht.getRow(0);
	XSSFCell ce1 = rw1.getCell(0);
	String Username=ce1.getStringCellValue();

	XSSFRow rw2=sht.getRow(1);
	XSSFCell ce2 = rw2.getCell(0);
	String Password=ce2.getStringCellValue();
	//System.out.println(password);
	
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.get("https://www.saucedemo.com");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
	
	Loginexcel login = new Loginexcel(driver);
	login.enterUsername(Username);
	login.enterPassword(Password);
	login.clickLoginButton();
	
	
	
	}
	
}


	
	