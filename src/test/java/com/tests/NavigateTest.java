package com.tests;

import org.testng.annotations.Test;

import com.pages.BasePage;

public class NavigateTest extends BasePage {

	@Test
	public void navigateToApp() {
		System.out.println("Title is: " + driver.getTitle());
	}

}
