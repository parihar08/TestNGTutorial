package listenerspackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestResult;

//All listeners are Interfaces

public class CustomListener2 implements IInvokedMethodListener{
	
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// This method runs before any method runs in the test class
		System.out.println("\nBefore Invocation: "+ testResult.getTestClass().getName()); //prints class name
		System.out.println("\nBefore Invocation: "+ method.getTestMethod().getMethodName()); //prints method name
	}
	
	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// This method runs after any method runs in the test class
		System.out.println("\nAfter Invocation: "+ testResult.getTestClass().getName()); //prints class name
		System.out.println("\nAfter Invocation: "+ method.getTestMethod().getMethodName()); //prints method name		
	}

}
