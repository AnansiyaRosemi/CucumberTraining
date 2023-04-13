package org.stepdefinition;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{

	@Before
	public  void beforeScenario() {
		System.out.println("before scenario");
		launchBrowser();
		launchUrl("https://adactinhotelapp.com/");
		maximize();
		
	}
	
	
	@After
	public  void afterScenario() {
		System.out.println("after scenario");
		quitBrowser();
		
		
	}
}
