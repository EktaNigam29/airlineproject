package airlineClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderingcouponcode_13 {
	ChromeDriver driver;
	//step1
	
	
			
			@FindBy(xpath="(//div[@class='_657d20b7 f54be1b2 _0c6150e5 _6078df67']/button)[1]")
			WebElement apply;
			
	
	
		//step2
			public void coupon()
			{
				apply.click();
			}
			public WebElement coupon1()
			{
				return apply;
			}
		
		//step3
		
	public Orderingcouponcode_13(WebDriver driver)
		
		{
			
			PageFactory.initElements(driver, this);
		}


	
	}





