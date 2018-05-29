package Firstpagetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import tpn.pages.objects.ATHomePageObjects;
import tpn.pages.objects.ATbasepage;
import tpn.pages.objects.Basepage;
import tpn.pages.objects.HomePageObjects;

public class ATHomePageTest {

	ATHomePageObjects homePage;
	ATbasepage bp;

	public ATHomePageTest() {

		bp = new ATbasepage();
		homePage = new ATHomePageObjects();
	}

	@Test
	public void clickwebelenemtitems() {
		homePage.clickwomen();
		System.out.println(bp.getTitle());
		Assert.assertTrue(bp.getTitle().equals("Women - My Store"));
	}

	@Test
	public void emailvalidation() {

		//homePage.setmailval();
		//homePage.clickemail();
		//Assert.assertTrue(homePage.Valchk().contains("already registered"));

		// homePage.setText("//*[@id='newsletter-input']", "sstest@gmail.com");

	}
	
	
	@Test
	public void verifyContainerDetails() {
		List<WebElement> products = homePage.getContainer();
		System.out.println("container size :" + products.size());
		for(int i = 0; i< products.size(); i++) {
			WebElement prod = products.get(i);
		}
	}

	/*
	 * homePage.clickDresses(); System.out.println(bp.getTitle());
	 * Assert.assertTrue(bp.getTitle().equals("Dresses - My Store"));
	 * 
	 * homePage.clicktshirts(); System.out.println(bp.getTitle());
	 * Assert.assertTrue(bp.getTitle().equals("T-shirts - My Store"));
	 */

}
