package airlineClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flightinfo_10 {
	
	ChromeDriver driver;
	//step1
	        @FindBy(xpath="//div[@class='_7c598c35 a69d62e8']")
			WebElement faredetails;//
	        @FindBy(xpath="//div[@class='_7c598c35 ']")
			WebElement baggage;
	        @FindBy(xpath="(//ul[@class='tabs  e2d4af1c']/li/div)[1]")
			WebElement baggage1;
	        @FindBy(xpath="(//ul[@class='tabs  e2d4af1c']/li/div)[2]")
			WebElement cancel;
	
	
		//step2
			public void fd() {
			
				faredetails.click();
			}
			public void bg()
			{
				baggage.click();
			}
			public void bg1()
			{
				baggage1.click();
			}
			public void cancel1()
			{
				cancel.click();
			}
		//step3
		
	public Flightinfo_10 (WebDriver driver)
		
		{
			
			PageFactory.initElements(driver, this);
		}


	
	}



