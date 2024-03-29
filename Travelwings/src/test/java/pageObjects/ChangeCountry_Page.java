package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.ExcelUtils;
import utils.Constants;

public class ChangeCountry_Page {
	private static WebElement element;
	
	
	public static WebElement region_selection(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='headlinkR']"));
		return element;
	}
	
	
	
	public static WebElement country(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@id='userSelectedCountry_title']"));
		return element;
	}


	public static WebElement change_country(WebDriver driver, int testrow) throws InterruptedException{
		
		String name = ExcelUtils.getStringValue(testrow, Constants.country_col);
		
		ChangeCountry_Page.region_selection(driver).click();
		
		Thread.sleep(1000);
		
		ChangeCountry_Page.country(driver).click();
		
		Thread.sleep(1000);
		
		if(name.equalsIgnoreCase("india")) {
			element = driver.findElement(By.xpath("//ul/li[@title='India']"));
		}
		
		else if(name.equalsIgnoreCase("Australia")) {
			element = driver.findElement(By.xpath("//ul/li[@title='Australia']"));
		}
		
		else if(name.equalsIgnoreCase("Singapore")) {
			element = driver.findElement(By.xpath("//ul/li[@title='Singapore']"));
		}
		
		else if(name.equalsIgnoreCase("Nigeria")) {
			element = driver.findElement(By.xpath("//ul/li[@title='Nigeria']"));
		}
		
		else if(name.equalsIgnoreCase("Ghana")) {
			element = driver.findElement(By.xpath("//ul/li[@title='Ghana']"));
		}
		else {
			System.out.println("Operating Contry not exists");
			System.exit(0);
		}
		return element;
		
	}
	
	
	public static WebElement currency(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@id='currency_title']"));
		return element;
	}
	
	
	
	public static WebElement change_currency(WebDriver driver,int testrow) throws InterruptedException{
		
		String name = ExcelUtils.getStringValue(testrow, Constants.currency_col);
		ChangeCountry_Page.region_selection(driver).click();
		
		Thread.sleep(2000);
		
		ChangeCountry_Page.currency(driver).click();
		
		Thread.sleep(2000);
		
		if(name.equalsIgnoreCase("AED")) {
			element = driver.findElement(By.xpath("//li[@title='AED']"));
		}
		
		else if(name.equalsIgnoreCase("USD")) {
			element = driver.findElement(By.xpath("//li[@title='US Dollar']"));
		}
		
		else if(name.equalsIgnoreCase("Singapore")) {
			element = driver.findElement(By.xpath("//ul/li[@title='Singapore']"));
		}
		
		else if(name.equalsIgnoreCase("Nigeria")) {
			element = driver.findElement(By.xpath("//ul/li[@title='Nigeria']"));
		}
		
		else if(name.equalsIgnoreCase("Ghana")) {
			element = driver.findElement(By.xpath("//ul/li[@title='Ghana']"));
		}
		
		return element;
		
	}

}
