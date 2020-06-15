package com.thed.zapi.cloud.sample;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class test1 {
	
	
	
	@Test
	public void SeleniumAmazonTest() {
		WebDriver driver;
		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver", "C:\\Freelancing\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    String baseUrl = "https://www.lambdatest.com/";
        String expectedTitle = "LambdaTest - Perform all your tests on cloud";
        String actualTitle = "";
// launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
// get the actual value of the title
        actualTitle = driver.getTitle();
/*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
	    
	    
	}
	
}


