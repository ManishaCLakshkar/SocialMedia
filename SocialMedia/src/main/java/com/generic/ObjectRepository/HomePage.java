package com.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver=null;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class=\"x1iyjqo2 xh8yej3\"]/descendant::span[text()='Messages']")
	private WebElement messageEdt;
	
	public WebElement getMessageEdt() {
		return messageEdt;
	}

	@FindBy(xpath="//span[text()='More']")
	private WebElement morelink;
	
	@FindBy(xpath="//span[text()='Log out']")
	private WebElement logoutlink;

	public WebElement getMorelink() {
		return morelink;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}
	
	public void logout()
	{
		morelink.click();
		logoutlink.click();
	}
}
