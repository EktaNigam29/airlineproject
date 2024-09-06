package airlineClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mutipleseat_9 {

	
	ChromeDriver driver;
	//step1
	        @FindBy(xpath="(//div[@class='sizeMedium a8cdd5cb']/span)[1]")
			WebElement travellers;
	       @FindBy(xpath="(//div[@class='ecbd2509 _769d5a4a _6078df67']/button)[4]")
			WebElement passenger;
	       
	
		//step2
			public void travel() {
			
				travellers.click();
			}
			public void pass()
			{
               passenger.click();
			}
			public WebElement pass1()
			{
               return passenger;
			}
			
		//step3
		
	public Mutipleseat_9 (WebDriver driver)
		
		{
			
			PageFactory.initElements(driver, this);
		}


	
	}





