package org.scrnshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshott {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Sumi\\Eclipse\\Screenshottt\\ChromeDriver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login/");
	driver.get("https://www.flipkart.com/");
	
	
	
	
}
}
