package com.actions_windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Robot {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\SDET\\Java_Classes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
//		
//		Actions ac = new Actions(driver);
//		WebElement findElement = driver.findElement(By.xpath("(//a[@class='nav-a  ']) [3]"));
//		ac.doubleClick(findElement).build().perform();
//		
//		String windowHandle = driver.getWindowHandle();
//		System.out.println(windowHandle);
//		
		Robot a = new Robot();

		a.keyPress(KeyEvent.VK_CONTROL);
		a.keyPress(KeyEvent.VK_T);

		Set<String> windowHandles = driver.getWindowHandles();

		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}
		int size = driver.getWindowHandles().size();
		System.out.println(size);
	}

}
