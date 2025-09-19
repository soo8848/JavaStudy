package test.com.oopsw.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.oopsw.dao.CustomerDAO;
import com.oopsw.dao.CustomerDAOImpl;

public class JunitCustomerTest {
	static CustomerDAO c;
	@BeforeClass
	public static void allTestStart() throws Exception {
		c=new CustomerDAOImpl();
//		System.out.println("allTestStart()");
	}
	@AfterClass
	public static void allTestEnd() throws Exception {
		System.out.println("allTestEnd()");
	}
//	@Before
	public void unitTestStart() throws Exception {
		System.out.println("unitTestStart()");
	}
//	@After
	public void unitTestEnd() throws Exception {
		System.out.println("unitTestEnd()");
	}
	//@Test
	public void trueTest() {
		assertTrue(1==2);
	}
	@Test
	public void falseTest(){
		assertFalse("hi" == new String("hi"));
	}
	@Test
	public void addCustomerTest(){
		assertTrue(c.addCustomer("jeon", "011-5555-8888"));
	}

}
