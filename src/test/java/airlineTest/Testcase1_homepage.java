package airlineTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import airlineClasses.Amazon_Homepage;
@Listeners(utility_Package.Listen2.class)
public class Testcase1_homepage extends Launch_Quit2{
	
	@Test
	public void login()
	{
		Amazon_Homepage h1= new Amazon_Homepage(driver);
		h1.accountandlist(driver);
		h1.sigin();
		
	
				
	}
}
