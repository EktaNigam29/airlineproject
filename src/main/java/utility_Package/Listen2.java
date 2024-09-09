package utility_Package;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listen2 implements ITestListener
{
public static WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result ) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Date d1=new Date();
		//System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		//System.out.println(d2);
		String current_time= d2.toString();
		System.out.println(current_time);
		Reporter.log("test case is pass");
		TakesScreenshot ts=  (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\EKTA\\eclipse-workspace\\SeleniumProject\\passed\\ekta"+Math.random()+ current_time+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Date d1=new Date();
		//System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		//System.out.println(d2);
		String current_time= d2.toString();
		System.out.println(current_time);
		Reporter.log("test case is fail");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\EKTA\\eclipse-workspace\\SeleniumProject\\failed\\ekta"+Math.random()+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}



