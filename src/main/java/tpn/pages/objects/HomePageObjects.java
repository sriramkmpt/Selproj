package tpn.pages.objects;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends Basepage {

	@FindBy(xpath = "//h3[text()='Registration']")
	private WebElement registration;

	@FindBy(xpath = "//h3[text()='interaction']")
	private WebElement interaction;

	@FindBy(xpath = "//h3[text()='Widget']")
	private WebElement widget;

	@FindBy(xpath = "//h3[text()='Frames and Windows']")
	private WebElement framesAndWindows;

	@FindBys(@FindBy(xpath = "//div/aside[contains(@class,'widget_nav_menu')]//h3"))
	private List<WebElement>navPanelHeading;

	@FindBy(xpath = "//div[./h5[text()='Customer Support']]//img")
	private WebElement imgCustomerSupport;

	@FindBy(className = "entry-titl")
	private WebElement titleHome;

	@FindBy(xpath = ".//a[text()='About us']")
	private WebElement lnkAbousUs;

	@FindBy(xpath = ".//a[text()='Services']")
	private WebElement lnkServices;

	@FindBy(xpath = ".//a[text()='Blog']")
	private WebElement lnkBlog;

	@FindBy(xpath = ".//a[text()='Contact']")
	private WebElement lnkContact;

	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRegistrationFromPanel() {
		return registration;
	}

	public List<String> getnavPanelHeading() {
		ArrayList<String>list = new ArrayList<String>();
		for (WebElement element : navPanelHeading) {
			list.add(element.getText());
		}
		return list;
	}

	public WebElement getImgCustomerSupport() {
		return imgCustomerSupport;
	}

	public WebElement getTitleHome() {
		return titleHome;
	}
	
	public WebElement getlnkAboutUs() {
		return lnkAbousUs;
	}
	
	public WebElement getlnkServices() {
		return lnkServices;
	}
	
	public WebElement getlnkBlog() {
		return lnkBlog;
	}
	
	public WebElement getlnkContact() {
		return lnkContact;
	}	
}
