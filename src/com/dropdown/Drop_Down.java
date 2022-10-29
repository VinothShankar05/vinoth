package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SDET\\Java_Classes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/dropdowns");

		WebElement findElement = driver.findElement(By.id("fruits"));
		findElement.click();

		Select a = new Select(findElement);
		// a.selectByIndex(2);
		a.selectByVisibleText("Orange");

	}

}
