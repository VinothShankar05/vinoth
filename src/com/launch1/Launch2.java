package com.launch1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Launch2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SDET\\Java_Classes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		WebElement findElement = driver.findElement(By.xpath("(//button[text()='Click me'])[1]"));
		findElement.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(10000);

		//WebElement findElement2 = driver.findElement(By.xpath("(//button[text()='Click me']) [2]"));
		//findElement2.click();
		//Alert alert2 = driver.switchTo().alert();
		//alert2.dismiss();
		//Thread.sleep(10000);

//		WebElement findElement3 = driver.findElement(By.xpath("(//button[text()='Click me'])[1]"));
//		findElement3.click();
//		Alert alert3 = driver.switchTo().alert();
//		alert3.sendKeys("vinoth");
//		alert3.accept();
//		Thread.sleep(10000);

	}

}
