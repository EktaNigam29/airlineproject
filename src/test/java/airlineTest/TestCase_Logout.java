package airlineTest;

import org.apache.commons.math3.geometry.euclidean.twod.hull.ConvexHull2D;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import airlineClasses.Amazon_Homepage;
import airlineClasses.Login;
import airlineClasses.Logout_12;
import airlineClasses.One_way_4;
@Listeners(utility_Package.Listen2.class)
public class TestCase_Logout extends Launch_Quit2{
	@Test
	public void oneway()
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
	s1.search();
	s1.place1();
	s1.arrow();
	s1.flight3();
	s1.search1();
	s1.place2();
	s1.button1();
	h1.accountandlist(driver);
	Logout_12 l2=new Logout_12(driver);
		l2.out();
		//l2.out1();
		boolean b=driver.getCurrentUrl().contains("signin");
		//System.out.println(b);
		Assert.assertEquals(b, true, "failed");
		
	
		
	
	}
}
