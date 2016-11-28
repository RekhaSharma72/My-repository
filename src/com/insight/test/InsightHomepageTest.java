package com.insight.test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.insight.mainPractice.InsightHomePage;

public class InsightHomepageTest {
	WebDriver driver;
	InsightHomePage is;
	
	@Before
	public void open(){
		driver = new FirefoxDriver();
		driver.get("http://www.insight.com./");
		driver.manage().window().maximize();
		is= new InsightHomePage(driver);
	}
	@Test
	public void testInsightHomePage(){
		String actualText = is.logoInsightHomePage();
		String expectedText = "Insight";
		System.out.println("in first Test");
		Assert.assertTrue(actualText.contains(expectedText));
		driver.close();
				
	}

	@Test
	public void testSearch(){
		System.out.println("in Test");
		InsightHomePage is = new InsightHomePage(driver);
		String searchText = "Desktops";
		System.out.println("in second Test");
		String actualText = is.typeinSearchBox(searchText);
	
		Assert.assertTrue(actualText.contains("Desktop"));
	
		driver.close();
	}
	@After
	public void close(){
		if (driver = null)
			
	}
		
	
	
		
		
		//InsightHomePage hp = new InsightHomePage(driver);
		//hp.typeinSearchBox();
	}
	


