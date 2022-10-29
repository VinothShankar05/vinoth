package com.launch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\SDET\\Java_Classes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

//		WebElement a = driver.findElement(By.xpath("//input[@type = 'text']"));
//		a.sendKeys("vinothshankar");
//
//		WebElement b = driver.findElement(By.xpath("//input[@type='password']"));
//		b.sendKeys("Vinoth@10");
//
//		WebElement c = driver.findElement(By.xpath(
//				"//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    ']"));
//		c.click();
//
//		WebElement d = driver.findElement(By.xpath("//a[@class='_2Lks6']"));
//		d.click();
//		
//		WebElement e = driver.findElement(By.xpath("sqdOP yWX7d     _8A5w5   ZIAjV "));
//		e.click();
		
TakesScreenshot a = (TakesScreenshot) driver;
File source = a.getScreenshotAs(OutputType.FILE);
File destination = new File("D:\\SDET\\Java_Classes\\SS\\vinoth.png");
FileUtils.copyFile(source, destination);
	}
	
}
