package zadatakHobbyRC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public static WebElement element = null;

	// Find Register Button
	public static WebElement registerButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@value='Register']"));
		return element;
	}

	// Click Register Button
	public void clickRegisterButton(WebDriver driver) {
		element = registerButton(driver);
		element.click();
	}

	// Find Email Textbox
	public static WebElement emailTextBox(WebDriver driver) {
		element = driver.findElement(By.id("Email"));
		return element;
	}

	// Fill Email Textbox
	public void fillEmailTextbox(WebDriver driver, String email) {
		element = emailTextBox(driver);
		element.sendKeys(email);
		;
	}

	// Find Password Textbox
	public static WebElement passwordTextBox(WebDriver driver) {
		element = driver.findElement(By.id("Password"));
		return element;
	}

	// Fill Password Textbox
	public void fillPasswordTextBox(WebDriver driver, String password) {
		element = passwordTextBox(driver);
		element.sendKeys(password);
	}

	// Find Remember Me Checkbox
	public static WebElement rememberMeCheckBox(WebDriver driver) {
		element = driver.findElement(By.id("RememberMe"));
		return element;
	}

	// Click Remember Me Checkbox
	public void clickRememberMeCheckBox(WebDriver driver) {
		element = rememberMeCheckBox(driver);
		element.click();
	}

	// Find Forgot Password link
	public static WebElement forgotPasswordLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(), 'Forgot password')]"));
		return element;
	}

	// Click Forgot Password link
	public void clickForgotPasswordLink(WebDriver driver) {
		element = forgotPasswordLink(driver);
		element.click();
	}

	// Find Log In Button
	public static WebElement logInButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@value='Log in']"));
		return element;
	}

	// Click Log In Button
	public void clickLogInButton(WebDriver driver) {
		element = logInButton(driver);
		element.click();
	}

	// Find Profile Link Button
	public static WebElement profileButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='header-links']//a[@class='account']"));
		return element;
	}

	// Click Profile Link Button
	public void clickProfileButton(WebDriver driver) {
		element = profileButton(driver);
		element.click();
	}

	// Find Log Out Button
	public static WebElement logOutButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='ico-logout']"));
		return element;
	}

	// Click Log Out Button
	public void clickLogOutButton(WebDriver driver) {
		element = logOutButton(driver);
		element.click();
	}

}
