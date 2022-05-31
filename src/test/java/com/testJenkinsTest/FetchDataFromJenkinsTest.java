package com.testJenkinsTest;

import org.testng.annotations.Test;

public class FetchDataFromJenkinsTest {
	
	public String browser;
	
@Test	
public void practiceTest()
{
	System.out.println("practiceTest Running");
	browser=System.getProperty("BROWSER");
}
}
