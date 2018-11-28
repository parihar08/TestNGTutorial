package testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import listenerspackage.CustomListener2;

//Listeners are classes which wait for particular events to occur and trigger the logic we want
//We want to create a custom listener class in listeners package that listens to our test cases and trigger the logic we want

//@Listeners(CustomListener2.class)
public class TestNG_ListenersTest2 {
	
	@BeforeClass
	public void setUp() {
		System.out.println("\nTestNG_ListenersTest2 -->This runs once before class");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("\nRunning Test -->TestNG_ListenersTest2 -->Test Method1");
		Assert.assertTrue(false);
	}

	@Test
	public void testMethod2() {
		System.out.println("\nRunning Test -->TestNG_ListenersTest2 -->Test Method2");
		Assert.assertTrue(true);
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("\nTestNG_ListenersTest2 -->This runs once after class");
	}

}
