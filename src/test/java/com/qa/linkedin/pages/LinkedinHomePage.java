package com.qa.linkedin.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LinkedinHomePage extends BasePageWeb {
private Logger log = Logger.getLogger(LinkedinHomePage.class);

// create a constructor
public LinkedinHomePage() {
PageFactory.initElements(driver, this);
}

@FindBy(css = "a.nav__logo-link")
private WebElement linkedinLogo;

@FindBy(xpath = "//*[@class='nav__button-secondary']")
private WebElement signinLink;
// assert page title tag

@FindBy(css = "h1[class*='main-heading']")
private WebElement linkedinHomePageHeaderText;

@FindBy(css="h1[class")
String homePageTitle = "LinkedIn: Log In or Sign Up";
String signinTitle = "LinkedIn Login, Sign in | LinkedIn";

@FindBy(xpath = "//h1[contains(class,'header__content__heading')]")
private WebElement signInheadertext;

@FindBy(id = "username")
private WebElement usernameEditbox;

@FindBy(id = "password")
private WebElement passwordEditbox;

// @FindBy(xpath="//*[@id=\"organic-div\"]/form/div[3]/button")
@FindBy(css = "button[class*='btn__primary--large from__button--floating']") // *[class='btn__primary--large
// from__button--floating']")
private WebElement signinButton;

public void verifyLinkedinHomePageTitle() {
log.debug("Verifying the Linkedin Home Page Title" + homePageTitle);
wait.until(ExpectedConditions.titleContains(homePageTitle));
Assert.assertEquals(driver.getTitle(), homePageTitle);
}

public void verifyLinkedinLogo() throws InterruptedException {
log.debug("verify linkedin Logo is present in HomePage");
isVisible(linkedinLogo);
Assert.assertTrue(isDisplayedElement(linkedinLogo));
}

public void clickSigninLink() throws InterruptedException {
log.debug("Click on signin Link in Linked in homepage");
highlightAndClick(signinLink);
}

public void verifyLinkedinHomePageHeaderText() throws InterruptedException {
log.debug("verify verifyLinkedinHomePageHeaderText is present in HomePage");
isVisible(linkedinHomePageHeaderText);
Assert.assertTrue(isDisplayedElement(linkedinHomePageHeaderText));
}

public void verifySignInePageTitle() {
log.debug("Verifying the SignInePageTitlePage " + signinTitle);
wait.until(ExpectedConditions.titleContains(signinTitle));
Assert.assertEquals(driver.getTitle(), signinTitle);
}

public void signInHeaderText() {
log.debug("wait for the sign in headertext");
wait.until(ExpectedConditions.invisibilityOf(signInheadertext));
Assert.assertTrue(signInheadertext.isDisplayed(), "signInheadertext is not present");
}

public void doLogIn(String username, String password) throws InterruptedException {
log.debug("entering username and password");
sendKey(usernameEditbox, username);
sendKey(passwordEditbox, password);
}

/**
* username.sendKeys("thejaswaniv87@gmail.com"); password.clear();
* password.sendKeys("vhkkkk"); highlightAndClick(signinButton); }
*
* @throws InterruptedException
**/

public void clickSigninButton() throws InterruptedException {
log.debug("click on signinButton in signInpage");
highlightAndClick(signinButton);
}

}

/**package com.qa.linkedin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.log4testng.Logger;

public class LinkedinHomePage extends BasePageWeb{
private Logger log=Logger.getLogger(LinkedinHomePage.class);

//create a constructor

public LinkedinHomePage() {
	
	PageFactory.initElements(driver,this);
}

@FindBy(cssSelector="a.nav_logo-link")
private WebElement linkedinLogo;

@FindBy(xpath="//*[@class='nav_button-secondary']")
private WebElement signinLink;

@FindBy(css=h1[class*='main-heading']")

private WebElement  linkedinHomePageHeaderText;
String homePageTitle="Linkedin:Log in or Sign up";

public void verifyLinkedInHomePageTitle() {
	
	
	log.debug("verifying the LinkedIn Home page title:"+homePageTitle);
	
	wait.until(ExpectedConditions.titleContains(homePageTitle));
	
	Assert.assertEquals(driver.getTitle(),homePageTitle);
}

public void verifyLinkedinLogo() {
	
	log.debug("verify Linkedin homepage is present in Homepage");
	isVisible(linkedinLogo);
	Assert.assertTrue(isDisplayedElement(linkedinLogo));
}

public void clickSigninLink() {
	
	log.debug("click on signin link in Linkedin Home page");
	
}
}*/
