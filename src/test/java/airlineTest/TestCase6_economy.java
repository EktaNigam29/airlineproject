package airlineTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import airlineClasses.Amazon_Homepage;
import airlineClasses.Business_Economy_6;
import airlineClasses.Login;
import airlineClasses.One_way_4;
import airlineClasses.Two_way_514;
@Listeners(utility_Package.Listen2.class)
public class TestCase6_economy extends Launch_Quit2{
	@Test
	public void business1()
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
	s1.button1();
	boolean b1=s1.button2().isEnabled();
	Assert.assertEquals(b1, true,"failed");
	Two_way_514 s2=new Two_way_514(driver);
	s2.going();
	s2.back();
	Business_Economy_6 c1=new Business_Economy_6(driver);
	c1.classes();
	c1.classes1();
	c1.classes2();
String s4=	c1.classes3().getText();
	Assert.assertEquals(s4, "Premium Economy", "failed"); 
	}
}

	
	

