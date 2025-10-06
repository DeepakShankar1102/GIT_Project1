package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardEvents {


	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
		keyboardEvents eve=new keyboardEvents();
		eve.KeyBoard5();

	}
	//1.SendKeys
	public void KeyBoard1() throws InterruptedException
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Ele= driver.findElement(By.xpath("//*[@name='q']"));

		Ele.sendKeys("Phones");
		Ele.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		driver.close();
	}

	//2.SendKeys Copy and Paste the Text
	public void KeyBoard2() throws InterruptedException
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// First input box
		WebElement input1 = driver.findElement(By.id("inputText1"));
		input1.sendKeys("Hello Deepak");

		// Select All (Ctrl+A) + Copy (Ctrl+C)
		input1.sendKeys(Keys.CONTROL + "a");
		input1.sendKeys(Keys.CONTROL + "c");

		// Switch to second input box
		WebElement input2 = driver.findElement(By.id("inputText2"));
		input2.click();

		// Paste (Ctrl+V)
		input2.sendKeys(Keys.CONTROL + "v");
		Thread.sleep(10000);
		driver.close();		
	}

	/*
	 *  Explanation:

Keys.CONTROL + "a" → Select all text.

Keys.CONTROL + "c" → Copy text.

Keys.CONTROL + "v" → Paste text.
	 * /
	 */

	//3.Using Actions Class to Press and Release Keys
	public void KeyBoard3() throws InterruptedException
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchBox = driver.findElement(By.name("q"));

		Actions actions = new Actions(driver);

		// Hold SHIFT and type text (will appear in UPPERCASE)
		actions.keyDown(searchBox, Keys.SHIFT)
		.sendKeys("Selenium Course")
		.keyUp(Keys.SHIFT)
		.perform();

		// Press ENTER
		actions.sendKeys(Keys.ENTER).perform();

		Thread.sleep(10000);
		driver.close();
	}
	/*
	 * Explanation:

keyDown(Keys.SHIFT) → holds SHIFT key.

sendKeys("text") → types while SHIFT is held (uppercase).

keyUp(Keys.SHIFT) → releases SHIFT.
	 */

	//Using Arrow Keys to Navigate Dropdown
	public void KeyBoard4() throws InterruptedException
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchBox = driver.findElement(By.name("q"));

		searchBox.sendKeys("Selenium");

		Thread.sleep(2000); // wait for suggestions to load

		// Navigate suggestions using Arrow Down
		searchBox.sendKeys(Keys.ARROW_DOWN);
		searchBox.sendKeys(Keys.ARROW_DOWN);
		searchBox.sendKeys(Keys.ARROW_DOWN);

		// Press Enter to select
		searchBox.sendKeys(Keys.ENTER);


		Thread.sleep(10000);
		driver.close();
	}

	/*
	 * Keys.ARROW_DOWN → moves through dropdown options.
	 */





	public void KeyBoard5() throws InterruptedException, AWTException
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Scroll down using Robot (Page Down)
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

		Thread.sleep(2000);

		// Press TAB key
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		// Press ENTER
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);


		Thread.sleep(10000);
		driver.close();
	}

}

















/*Quick Interview One-Liners

sendKeys() → Best for typing into elements.

Actions → Best for complex key + mouse combos.

Robot → Best for OS-level events & popups.*/
