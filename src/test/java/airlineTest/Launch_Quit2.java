package airlineTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility_Package.Listen2;
/*Jab crossbrowser krna hai toh uncommand the 1st method & command the 2nd method
Jab nrml krna hai toh command the 1st method & uncommand the 2nd method*/
public class Launch_Quit2 extends Listen2 {
  //public static WebDriver driver;

@BeforeMethod
@Parameters("browser")
public void launch(String value)
	{
	if(value.equals("chrome"))
	{
		driver =new ChromeDriver();
	}
	if(value.equals("edge"))
	{
			 driver =new EdgeDriver();
	}
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
}
@AfterMethod()
public void post1()
{
	//driver.quit();
}
/*@BeforeMethod
public void launch()
{
driver =new ChromeDriver();
driver.get("https://www.amazon.in/");	
driver.manage().window().maximize();	
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterMethod()
public void post1()
{
	//driver.quit();
}*/



}