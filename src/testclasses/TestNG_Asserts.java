package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import appcode.SomeClassToTest;

public class TestNG_Asserts {
	//Default run order of TestNG test methods is by alphabetic order 
	
		@Test
		public void testSum() {
			System.out.println("Running Test -->Test Sum");
			SomeClassToTest obj = new SomeClassToTest();
			int result = obj.sumNumbers(3, 5);
			Assert.assertEquals(result, 8);	
		}
		
		@Test
		public void testStrings() {
			System.out.println("Running Test -->Test Strings");
			String expectedStrings = "Hello World";
			SomeClassToTest obj = new SomeClassToTest();
			String result = obj.addStrings("Hello", "World");
			Assert.assertEquals(result, expectedStrings);	
		}
		
		@Test
		public void testArrays() {
			System.out.println("Running Test -->Test Arrays");
			int[] expectedArray = {1,2};
			SomeClassToTest obj = new SomeClassToTest();
			int[] result = obj.getArray();
			Assert.assertEquals(result, expectedArray);
			System.out.println("End Test -->Test Arrays");
		}
}
