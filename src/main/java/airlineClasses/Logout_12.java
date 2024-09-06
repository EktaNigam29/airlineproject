package airlineClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_12 {
	
	ChromeDriver driver;
	//step1
	
	
			
			@FindBy(xpath="//span[.='Sign Out']")
			WebElement logout;
	
	
		//step2
			public void out()//Amazon Sign In
			{
				logout.click();
			}
			public WebElement out1()
			{
				return logout;
			}
		//step3
		
	public Logout_12(WebDriver driver)
		
		{
			
			PageFactory.initElements(driver, this);
		}


	
	}









