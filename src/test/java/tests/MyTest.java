package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
	
	//Retry logic for failed taste cases can be achieved in two ways
	// 1. at test level
	// 2. AT RUN TIME
	
	
	// test level retry Logic
	//@Test(retryAnalyzer=analyser.RetryAnalyser.class)
	@Test
	public void test1() {
		Assert.assertEquals(true, false);
		
	}
	//@Test(retryAnalyzer=analyser.RetryAnalyser.class) // test level retry Logic
	@Test
	public void test2() {
		Assert.assertEquals(true, false);
		
	}

	@Test
	public void test3() {
		Assert.assertEquals(false, true);
	}
	//2 for at run time refer listener from testNG.xml and MyTransformer.java
	// also remove above line written with @Test
}
