package Firstpagetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

import tpn.pages.objects.Basepage;
import tpn.pages.objects.HomePageObjects;


public class HomePageTest {

	HomePageObjects homePage = new HomePageObjects();
	Basepage bp;
	
	
	public HomePageTest() {
		
		bp = new Basepage();
	}

	
	
	@Test
	public void verifyRegistrationText() {
		Assert.assertTrue(homePage.getRegistrationFromPanel().isDisplayed());
	}

	@Test
	public void verifyPanels() {
		List<String>actualValue = homePage.getnavPanelHeading();
		ArrayList<String>expectedValues = new ArrayList<String>();
		expectedValues.addAll(Arrays.asList("Registration", "interaction", "Widget", "Frames and Windows"));
		Assert.assertTrue(actualValue.containsAll(expectedValues));
	}

	@Test
	public void verifyCustomerSupportImage() {
		Assert.assertTrue(bp.elementFound(homePage.getImgCustomerSupport()));
	}

	@Test
	public void verifyTitleHome() {
		Assert.assertTrue(bp.elementFound(homePage.getTitleHome()));
	}

	@Test
	public void verifyAboutUs() {
		Assert.assertTrue(bp.elementFound(homePage.getlnkAboutUs()));
	}

	@Test
	public void verifyServices() {
		Assert.assertTrue(bp.elementFound(homePage.getlnkServices()));
	}

	
@Test
	public void verifyBlog() {
		Assert.assertTrue(bp.elementFound(homePage.getlnkBlog()));
	}

	@Test
	public void verifyContact() {
		Assert.assertTrue(bp.elementFound(homePage.getlnkContact()));
	}
}

