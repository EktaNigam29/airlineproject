package airlineTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import airlineClasses.Amazon_Homepage;
import airlineClasses.Login;
import airlineClasses.Mutipleseat_9;
import airlineClasses.One_way_4;
@Listeners(utility_Package.Listen2.class)
public class Testcase9_multiple extends Launch_Quit2{
	@Test
	public void mutilpeTraveller()
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
	
	One_way_4 s1= new One_way_4(driver);
	s1.flight1();
	s1.flight2();

	Mutipleseat_9 m1=new Mutipleseat_9(driver);
	m1.travel();
	m1.pass();
	String t1=m1.pass1().getText();
	Assert.assertEquals(t1, "4", "pass");
	
}
	}
