
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;



public class exportChanges {

// public WebDriver driver=null;

// public exportChanges (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 
	public exportChanges (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//input[@id='userName']")public WebElement userName;

@FindBy(xpath="//input[@id='password']")public WebElement userPassword;

@FindBy(id="loginBtn")public WebElement userLogin;

@FindBy(xpath="//a[@class='btn btn-primary dropdown-toggle blue-btn']")public WebElement userLogout;

@FindBy(xpath="//span[contains(text(),'Happy Me')]")public WebElement happyMe;
//pomStart
	


}
