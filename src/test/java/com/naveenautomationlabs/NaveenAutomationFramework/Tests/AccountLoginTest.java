package com.naveenautomationlabs.NaveenAutomationFramework.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.NaveenAutomationFramework.Pages.YourStore;
import com.naveenautomationlabs.NaveenAutomationFramework.base.TestBase;

public class AccountLoginTest extends TestBase {
	
	@BeforeMethod
	public void setUp() {
		initialisation();
	}

	@Test
	public void testExample() {
		System.out.println("This is a test");
	}
	@AfterMethod
	public void quit() {
		tearDown();
	}
	
}
