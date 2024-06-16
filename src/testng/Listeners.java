package testng;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//ITestListener Interface which implements TestNG listeners
public class Listeners implements ITestListener {

	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
	}
	
	@Override 
	public void onTestFailure(ITestResult result) {
		//screenshot code
		//response if API is failed
		
		System.out.println("I failed executed Listeners Pass code" +result.getName());
	}
	@Override 
	public void onTestSkipped(ITestResult result) {
		
	}
	@Override 
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

}
}