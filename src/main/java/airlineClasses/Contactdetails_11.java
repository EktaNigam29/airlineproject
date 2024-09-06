package airlineClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactdetails_11 {
	
	
	ChromeDriver driver;
	//step1
	
	
			
			@FindBy(xpath="//input[@name='mobile']")
			WebElement contact;
			@FindBy(xpath="//input[@name='email']")
			WebElement mail;
	
	
		//step2
			public void mobile()
			{
				contact.sendKeys("9560044390");
			}
			public void mail1()
			{
				mail.sendKeys("ektamurarka81@gmail.com");
			}
			public WebElement mail2()
			{
				return mail;
			}
		//step3
		
	public Contactdetails_11(WebDriver driver)
		
		{
			
			PageFactory.initElements(driver, this);
		}


	
	}


