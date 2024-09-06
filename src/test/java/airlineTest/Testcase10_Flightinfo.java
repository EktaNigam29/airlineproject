package airlineTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import airlineClasses.Amazon_Homepage;
import airlineClasses.Book_seat;
import airlineClasses.Flightinfo_10;
import airlineClasses.Login;
import airlineClasses.One_way_4;
import airlineClasses.Two_way_514;
@Listeners(utility_Package.Listen2.class)
public class Testcase10_Flightinfo extends Launch_Quit2{
		@Test
		public void bookingdetails() throws InterruptedException
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
		Book_seat s7= new Book_seat(driver);
		s7.booking();
		Thread.sleep(2000);
		Flightinfo_10 i1=new Flightinfo_10(driver);
		i1.fd();
		i1.bg();
		i1.bg1();
		i1.cancel1();
	boolean b7=	driver.getCurrentUrl().contains("flights");
	Assert.assertEquals(b7, true,"failed");
	
		
		
		
}
}
