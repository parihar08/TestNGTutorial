package listenerspackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

//All listeners are Interfaces

public class CustomListener1 implements ITestListener{
	
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
		System.out.println("These methods will be executed in this test tag: ");
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

}
