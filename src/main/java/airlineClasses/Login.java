package airlineClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	ChromeDriver driver;
	//step1
	
	@FindBy(xpath="(//a[.='Start here.'])[1]")
	WebElement start_here;
	
		@FindBy(name="email")
		WebElement username;
		
		@FindBy(id="continue")
		WebElement cont;
		
		@FindBy(id="ap_password")
		WebElement pass;
		
		@FindBy(id="signInSubmit")
		WebElement sigin_button;
		
		@FindBy(id="twotabsearchtextbox")
		WebElement search_product;
		//step2
	
		
	
		public void start()
		{
			
			start_here.click();
		}
		public void un()
		{
		//username.sendKeys("ektamurarka81@gmail.com" +Keys.ENTER);
		//username.sendKeys("9560044390" +Keys.ENTER);//step4-passed
			username.sendKeys("ektamurarka81@gmail.com");
			//username.sendKeys(Keys.ENTER);
		}
/*		public WebElement price_tag()
		{
			return start_here;
			
			
		} */
		
		public void cont1()
		{
			
			cont.click();
			
			
		}
		public void pwd()
		{
			//password.sendKeys("" + Keys.ENTER);
			pass.sendKeys("Nissan@2024");
			//password.sendKeys(Keys.ENTER);
			//cont.click();
		
		}
		public void signin1()
		{
			
			sigin_button.click();
		}
		
		public void search()
		{
			search_product.sendKeys("amazon flights"+ Keys.ENTER);
		}
		//step3
		
		public Login(WebDriver driver)
		
		{
			
			PageFactory.initElements(driver, this);
		}
	}


	



