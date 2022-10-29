package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SDET\\Java_Classes\\Driver\\chromedriver.exe");  //Browser Launch
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");  //To pass url of webpage
		driver.manage().window().maximize();

		Dimension d = new Dimension(400, 400); //To change dimension of webpage
		driver.manage().window().setSize(d);

		Point e = new Point(300, 300);            //To change position of webpage
		driver.manage().window().setPosition(e);

		WebElement a = driver.findElement(By.xpath("//input[@type='text']"));  //xpath locator to pass element
		a.sendKeys("duck toys for kids");

		WebElement b = driver.findElement(By.xpath("//div[@class='autocomplete-results-container']"));
		b.click();

		WebElement c = driver.findElement(By.xpath("Search"));
		c.click();

	}
	

}
