package tpn.pages.objects;

import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ATHomePageObjects extends ATbasepage {

	public String resval;

	@FindBy(xpath = "//*[@title='Women']")
	private WebElement Women;

	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a")
	private WebElement Dresses;

	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a")
	private WebElement Tshirts;

	@FindBy(xpath = "//*[@id='newsletter-input']")
	private WebElement emailtext;

	@FindBy(xpath = "//*[@name='submitNewsletter']")
	private WebElement emailclkbut;

	@FindBy(xpath = "//*[@class='alert alert-danger']")
	private WebElement textvalchk;

	@FindBys(@FindBy(xpath = "//*[@class='product_list grid row']/li"))
	private List<WebElement> imgconchk;

	public ATHomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	public void clickwomen() {
		clickitem(Women);
	}

	public void clickDresses() {
		clickitem(Dresses);
	}

	public void clicktshirts() {
		clickitem(Tshirts);
	}

	public void setmailval() {
		setText(emailtext, "sstest@gmail.com");
	}

	public void clickemail() {
		clickitem(emailclkbut);
	}

	public String Valchk() {
		resval = textvalchk.getText();
		return resval;
	}

	public List<WebElement> getContainer() {
		return imgconchk;
	}

	public boolean chkaddtocart(WebElement indvalchk) {

		return indvalchk.findElement(By.xpath(".//*[text()='Add to Cart']")).isDisplayed();
	}

	public boolean chkmore(WebElement indvalchk) {

		return indvalchk.findElement(By.xpath(".//*[text()='More']")).isDisplayed();

	}

}
