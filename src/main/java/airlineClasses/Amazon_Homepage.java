package airlineClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Homepage {
	ChromeDriver driver;
	//step1
		@FindBy(id="nav-link-accountList")
		WebElement accountlist;
		
		@FindBy(xpath="(//span[.='Sign in'])[1]")
		WebElement siginbutton;
		
		
		
		
		
		//step2
		public void accountandlist(WebDriver driver2)
		{
			Actions a1=new Actions(driver2);
			a1.moveToElement(accountlist).perform();
		}
		
		
		public void sigin()
		{
			
			siginbutton.click();
		}
		
		
		
		//step3
		
		public Amazon_Homepage(WebDriver driver)
		
		{
			
			PageFactory.initElements(driver, this);
		}


	
	}



