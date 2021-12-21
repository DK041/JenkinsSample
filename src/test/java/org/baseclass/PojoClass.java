package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {

	public PojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtUser;
	
	@FindBy(id="username")
	private WebElement username;

	@FindBy(id = "pass")
	private WebElement txtPass;

	@FindBy(id = "password")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement btnLogin;

	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement Submit;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement email;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement submit;
	
	@FindBy(id = "first-name")
	private WebElement firstName;

	@FindBy(id = "last-name")
	private WebElement lastName;

	@FindBy(id = "mobile")
	private WebElement mobile;
	
	@FindBy(id="country")
	private WebElement country;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement mailid;

	@FindBy(xpath = "//button[@jscontroller='soHxf']")
	private WebElement next;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement gmailPass;
	
	
		
	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getUsername() {
		return username;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	
	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public WebElement getemail() {
		return email;
	}
	
	public WebElement getpassword() {
		return password;
	}
	
	public WebElement getsubmit() {
		return submit;
	}
	
	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getCountry() {
		return country;
	}
	
	public WebElement getCity() {
		return city;
	}
	
	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getMessage() {
		return message;
	}

	@FindBy(id = "message")
	private WebElement message;
	
	public WebElement getMailid() {
		return mailid;
	}
	
	public WebElement getNext() {
		return next;
	}
	
	public WebElement getGmailPass() {
		return gmailPass;
	}
	

}
