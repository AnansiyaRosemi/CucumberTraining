package com.stepdefinition;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks1 extends BaseClass{

@Before
public  void beforeScenario() {
	System.out.println("before scenario");
		launchBrowser();
	maximize();

	launchUrl("https://www.facebook.com/");

}

@After
public  void afterScenario() {
	
	System.out.println("after scenario");
	quitBrowser();
}
}
