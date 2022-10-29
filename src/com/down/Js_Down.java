package com.down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Js_Down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SDET\\Java_Classes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor a = (JavascriptExecutor) driver;
		a.executeScript("window.scroll(0, 5000)");
		//Thread.sleep(3000);
		
		JavascriptExecutor b = (JavascriptExecutor) driver;
		b.executeScript("window.scroll(0, -500)");
		//Thread.sleep(4000);
		
		WebElement findElement = driver.findElement(By.xpath("//span[contains(text(),'Up to 60% off')]"));
		a.executeScript("arguments[0].scrollIntoView();", findElement);
		
		WebDriverWait b1 = new WebDriverWait(driver, 20);
		b1.until(ExpectedConditions.visibilityOf(findElement));
		findElement.click();
		
		
		
		
	}

}
