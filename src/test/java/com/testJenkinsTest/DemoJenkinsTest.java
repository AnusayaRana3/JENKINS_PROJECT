package com.testJenkinsTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoJenkinsTest {

	@Test
	 public void practice1Test()
	{
		Reporter.log("TestNgPractice2Test-->Test1",true);
		
	}
	
	@Test
	public void practice2Test()
	{
		Reporter.log("TestNgPractice2Test-->Test2",true);
	}
	
	@Test
	public void practice3Test()
	 {
		Reporter.log("TestNgPractice2Test-->Test3",true);
	 }
	
}
