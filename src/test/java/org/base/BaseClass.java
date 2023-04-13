package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		return driver = new ChromeDriver(ops);

	}

	public void launchUrl(String url) {
		driver.get(url);

	}

	public void maximize() {
		driver.manage().window().maximize();

	}

	public String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public void type(WebElement element, String data) {
		element.sendKeys(data);

	}

	public void btnClick(WebElement element) {
		element.click();

	}

	public String text(WebElement element) {
		String text = element.getText();
		return text;

	}

	public String attributeValue(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}

	public void selectValue(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);

	}

	public void selectByText(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByVisibleText(data);

	}

	public void selectbyIndex(WebElement element, int data) {
		Select s = new Select(element);
		s.selectByIndex(data);
	}

	public void quitBrowser() {
		driver.quit();

	}
}
