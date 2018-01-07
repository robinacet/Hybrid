package com.hybrid.com.hybridtest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Getit {

	@Test
	public void GetTheLicense() throws InterruptedException
	{
		
		System.setProperty("webdriver.firefox.marionette","E:\\Work\\FindLicense\\geckodriver-v0.9.0-win64");

		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://sarathi.nic.in:8443/nrportal/sarathi/DLChangesCA.jsp");
		int j= 7300;
				
	for(int i=0;i<10000;i++)	
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 20);

	    
	    wait.until((ExpectedCondition<Boolean>) new ExpectedCondition<Boolean>(){
	        public Boolean apply(WebDriver driver)  
	        {
	            Select select = new Select(driver.findElement(By.id("statename1")));
	            return select.getOptions().size()>1;
	        }
	    });
		
		WebElement state = driver.findElement(By.id("statename1"));
		Select st= new Select(state);
		st.selectByValue("MH");
		
		
		Thread.sleep(2000);
	    wait.until((ExpectedCondition<Boolean>) new ExpectedCondition<Boolean>(){
	        public Boolean apply(WebDriver driver)  
	        {
	            Select select = new Select(driver.findElement(By.id("rtoName1")));
	            return select.getOptions().size()>1;
	        }
	    });
		
		WebElement rto = driver.findElement(By.id("rtoName1"));
		Select rt= new Select(rto);
		rt.selectByValue("MH32 ");
		
		driver.findElement(By.id("dl_number")).sendKeys("MH40 2014000"+j);
		j++;
		
		driver.findElement(By.xpath("html/body/center/div/div/form/table/tbody/tr/td[4]/input")).click();
		


		
		System.out.println(driver.findElement(By.id("first_name")).getAttribute("value")+"     "+j);		
	}
		
		
	}
	
	
	
}
