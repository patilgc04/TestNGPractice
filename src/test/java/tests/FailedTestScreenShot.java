package tests;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FailedTestScreenShot {
	
	@Test
	public void test3() {
		Assert.assertEquals(false, true);
	}

	@AfterMethod
	public void takeScreenShot(ITestResult res) {
		if(res.getStatus()==ITestResult.FAILURE) {
			
			System.out.println("Screenshot captured");
			
		}
		
	}
}
