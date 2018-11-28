package listenerspackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestResult;

//All listeners are Interfaces

public class CustomListener3 implements ISuiteListener{
	
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



}
