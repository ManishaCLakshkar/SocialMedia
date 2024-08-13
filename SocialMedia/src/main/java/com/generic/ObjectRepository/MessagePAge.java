package com.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MessagePAge {
	 WebDriver driver;
	@FindBy(xpath = "//div[@class=\"x1iyjqo2 xh8yej3\"]/descendant::span[text()='Messages']")
	private WebElement messageEdt;

	@FindBy(xpath="//span[text()='test20825']")
	private WebElement userDemo;
	
	
		public WebElement getUserDemo() {
		return userDemo;
	}


		public MessagePAge(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
