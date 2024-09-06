package airlineTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import airlineClasses.Amazon_Homepage;
import airlineClasses.Login;
@Listeners(utility_Package.Listen2.class)
public class Testcase2_Login extends Launch_Quit2{
	@Test
	public void login1()
	{
		Amazon_Homepage h1= new Amazon_Homepage(driver);
		h1.accountandlist(driver);
		h1.sigin();
		
		Login l1=new Login(driver);
		l1.un();
		l1.cont1();
		l1.pwd();
		l1.signin1();
		l1.search();
	}

}
