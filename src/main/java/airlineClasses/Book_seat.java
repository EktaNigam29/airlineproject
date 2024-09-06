package airlineClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Book_seat {
	ChromeDriver driver;
	//step1
	@FindBy(xpath="(//button[@class='_7e41f983 bba41d3c  _50baedd0  '])[2]")
		WebElement book;
		@FindBy(xpath="//a[.='Proceed to traveller details']")
		WebElement traveller;
		@FindBy(xpath="//div[@class='_7c598c35 colorLink d7c291ce']")
		WebElement adultadd;
		@FindBy(xpath="//button[.='Select']")
		WebElement s10;
		@FindBy(xpath="//input[@class='d85704da e53521cf']")
		WebElement adult;
		@FindBy(xpath="//li[.='Male']")
		WebElement male;
		@FindBy(name="first_name")
		WebElement fn;
		@FindBy(name="last_name")
		WebElement ln;
		@FindBy(xpath="//button[.='Add adult']")
		WebElement button14;
		@FindBy(xpath="//div[@class='c172d511']/label/i")
		WebElement checkbox;
		
		//@FindBy(xpath="//input[@class='d85704da e53521cf']")
		//WebElement adult9;
		@FindBy(xpath="//button[.='Proceed to seat selection']")
		WebElement seatselection;
				@FindBy(xpath="(//div[@class='_0d462540  _20da3076  '])[1]")
				WebElement seatselected;
		//step2
		
		public void booking() {
			
			book.click();
		}
	public void traveller1() {
			
		traveller.click();
		
		}
	public void adultadd1() {
		
		
		adultadd.click();
		}
	
	public void seat() {
			
			seatselection.click();
			
			}
	public void selected() {
		
	
		seatselected.click();
		
		}
	
	public void selected11() {
		
		
		
		s10.click();
		
		}
	public void gender() {
		
		
		
		male.click();
		
		}
	public void first() {
		
		
		
		fn.sendKeys("abcd");
		
		}
	public void last() {
		
		
		
		ln.sendKeys("efgh");
		
		}
public void button22() {
		
		
		
		button14.click();
		
		}
public void box() {
	
	
	
	checkbox.click();
	
	}
		//step3
		
	public Book_seat(WebDriver driver)
		
		{
			
			PageFactory.initElements(driver, this);
		}


	
	}











