package com.actions_windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\SDET\\Java_Classes\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		// Opening first child window
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.contextClick(mobiles).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_UP);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// Opening second child window
		WebElement customerservice = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		a.contextClick(customerservice).build().perform();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_UP);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// Parent window ID
		String windowHandle = driver.getWindowHandle();
		System.out.println("The ID of the parent window is" + windowHandle);

		// Size of the windows
		int size = driver.getWindowHandles().size();
		System.out.println("The Size of all window is" + size);

		// Title of All windows
		Set<String> allwindows = driver.getWindowHandles();
		for (String windows : allwindows) {
			String Alltitle = driver.switchTo().window(windows).getTitle();
			System.out.println("The Title of all window is" + Alltitle);

		}
		// To handle particular window
		String actualtitle = "Amazon Customer Service";
		for (String particular : allwindows) {
			if (driver.switchTo().window(particular).getTitle().equals(actualtitle)) {

			}
			
		}

	}
}
