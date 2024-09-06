package airlineClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class One_way_4 {
	
	ChromeDriver driver;
	//step1
	
	
			
			@FindBy(xpath="(//span[@class='a-button-inner'])[2]")
			WebElement flight;
		@FindBy(xpath="(//span[@class='_76efd884 sizeMini colorTertiary'])[1]")
		WebElement delhi;
		
		@FindBy(name="searchText")
		WebElement name1;
		
		@FindBy(xpath="(//div[@class='_90aa3c07 a407febf _6078df67']/div)[1]")
		WebElement place;
		@FindBy(xpath="//div[@class='c8b37779 a7e7e442 _78875a75']")
		WebElement button5;
		@FindBy(xpath="(//span[@class='_76efd884 sizeMini colorTertiary'])[1]")
		WebElement bom;
		
		@FindBy(name="searchText")
		WebElement name2;
		@FindBy(xpath="(//div[@class='_90aa3c07 a407febf _6078df67'])[2]")
		WebElement place1;
		@FindBy(xpath="//button[.='Search']")
		WebElement button;
		//step2
		public void flight1()
		{
			
			flight.click();;
		}
		
		public void flight2()
		{
			
			delhi.click();
		}
		public void search()
		{
			
			name1.click();
		}
		public void place1()
		{
			
			place.click();
		}
		public void arrow()
		{
			button5.click();
		}
		public void flight3()
		{
			
			bom.click();
		}
		public void search1()
		{
			
			name2.click();
		}
		public void place2()
		{
			
			place1.click();
		}
		public void button1()
		{
			button.sendKeys(Keys.ENTER);
		}
		public WebElement button2()
		{
			return button;
		}
		//step3
		
	public One_way_4(WebDriver driver)
		
		{
			
			PageFactory.initElements(driver, this);
		}


	
	}






