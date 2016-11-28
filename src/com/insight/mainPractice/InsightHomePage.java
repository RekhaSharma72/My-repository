package com.insight.mainPractice;


public class InsightHomePage<WebDriver> {

	private WebDriver driver;
	
	public InsightHomePage(WebDriver driver){
		
		this.driver= driver;
		
	}
	
	// This method checks for Logo
	public String logoInsightHomePage(){
		WebElement logo = driver.findElement(By.id("company_logo_src"));
		String logoText = logo.getAttribute("alt");
		return logoText;
		
	}
		//This method passes keyword in the search box
		public String typeinSearchBox(String typeword){
			 String text= "";		
			WebElement searchBox = driver.findElement(By.id("searchText"));
			searchBox.sendKeys(typeword);
			
			WebElement button = driver.findElement(By.id("searchBtn"));
			System.out.println("trying to click");
			button.click();
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement h2 = driver.findElement(By.xpath("//h2[contains(text(),'Desktop')]"));
			
			text= h2.getText();
			return text;
		}
		
	}


