package com.maven.testproject.com.maven.testproject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest 
{
    @Test
    public void launchWebsite()
    {
    	
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://classic.crmpro.com/index.html");
    	driver.quit();
        
    }
}
