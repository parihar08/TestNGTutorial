package listenerspackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListeners implements IInvokedMethodListener,ITestListener,ISuiteListener{
	
	@Override
	public void onFinish(ISuite suite) {
		// This method runs when suite tag <suite> completes
		System.out.println("\nonFinish: After Suite Completes -->Suite Name -->"+ suite.getName()); //prints suite name		
	}

	@Override
	public void onStart(ISuite suite) {
		// This method runs when suite tag <suite> starts
		System.out.println("\nonStart: Before Suite Starts -->Suite Name -->"+ suite.getName()); //prints suite name
	}
	
	@Override
	public void onFinish(ITestContext context) {
		// This method executes after test tag <test> of xml file
		System.out.println("\nonFinish: Test Tag Name -->"+ context.getName()); //prints name of the test tag		
	}

	@Override
	public void onStart(ITestContext context) {
		// This method executes before test tag <test> of xml file
		System.out.println("\nonStart: Test Tag Name -->"+ context.getName()); //prints name of the test tag
		//Print name of all test methods inside the class onStart
		ITestNGMethod methods[] = context.getAllTestMethods();
		System.out.println("\nThese methods will be executed in this test tag: ");
		for(ITestNGMethod method:methods){
			System.out.println(method.getMethodName());
		}
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// This method executes when any @test method fails
		System.out.println("\nonTestFailure: Test Method Name -->"+ result.getName()); //prints method name		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// This method executes when any @test method is skipped
		System.out.println("\nonTestSkipped: Test Method Name -->"+ result.getName()); //prints method name
	}

	@Override
	public void onTestStart(ITestResult result) {
		// This method executes when any @test method starts
		System.out.println("\nonTestStart: Test Method Name -->"+ result.getName()); //prints method name
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// This method executes when any @test method is successful
		System.out.println("\nonTestSuccess: Test Method Name -->"+ result.getName()); //prints method name
	}
	
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
