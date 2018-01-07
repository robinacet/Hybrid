package com.hybrid.com.hybridtest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
public WebDriver driver;
//	@BeforeTest
//	public void LaunchBrowser() throws InterruptedException
//	{
//		
//		System.setProperty("webdriver.gecko.driver",".\\geckodriver.exe");
//		driver = new FirefoxDriver();
//
////		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver.exe");
////		ChromeOptions options = new ChromeOptions();
////		options.addArguments("--disable-extensions");
////		driver = new ChromeDriver(options);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://admin.maxwellfinefoods.com/");
//		driver.manage().window().maximize();
//			
//		
//	}	
	
	@Test
     public void TestCase_1() throws Exception
     {
		String Expected1 = ExcelReadWrite.ExcelRead(2, 5);
		System.out.println(Expected1);
		
//		System.out.println("Executing testcase1");
//		driver.findElement(By.xpath(".//*[@class='btn-text-full red']")).click();
//		String warning1 = driver.findElement(By.xpath("(.//*[@class='field-validation-error'])[1]")).getText();
//		String warning2 = driver.findElement(By.xpath("(.//*[@class='field-validation-error'])[2]")).getText();
//		String Expected1 = ExcelReadWrite.ExcelRead(2, 3);
//		
//		if(warning1.contains("Username i required") || warning2.contains("Password is required"))
//		{
//			ExcelReadWrite.ExcelWrite(1, 5, "Pass");
//		}
//		else
//		{
//			 
//			ExcelReadWrite.ExcelWrite(1, 5, "Fail");
//		    ExcelReadWrite.ExcelWrite(1, 6, "Excpected is "+warning1+"but actual is "+warning2);
//		}
//		
//		Assert.assertEquals("Username i required", warning1);
//		Assert.assertEquals("Password is required", warning2);
//			
//		System.out.println(" testcase1 completed");
     }
	
//	@Test
//    public void TestCase_2() throws Exception
//    {
//		System.out.println("Executing testcase2");
//		String Username = ExcelReadWrite.ExcelRead(2, 3);
//		System.out.println(Username);
//		driver.findElement(By.id("login_username")).sendKeys(Username);
//		driver.findElement(By.xpath(".//*[@class='btn-text-full red']")).click();
//		Thread.sleep(2000);
//		String warning2 = driver.findElement(By.xpath("(.//*[@class='field-validation-error'])[1]")).getText();
//		
//		
//		
//		if(warning2.contains("Password is required"))
//		{
//			ExcelReadWrite.ExcelWrite(2, 5, "Pass");
//		}
//		else
//			ExcelReadWrite.ExcelWrite(2, 5, "Fail");
//		
//		Assert.assertEquals("Password is required", warning2);
//			
//		System.out.println(" testcase2 completed");
//		
//    }
//	
//	@AfterTest
//	public void closeBrowser() 
//	{
//     driver.close();
//	}


	
	
}
