package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\SDET\\Java_Classes\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testleaf.herokuapp.com/pages/frame.html");
	driver.switchTo().frame(0);
	WebElement findElement = driver.findElement(By.id("Click"));
	Thread.sleep(3000);
	findElement.click();
	driver.switchTo().defaultContent();
	
	
}
}
