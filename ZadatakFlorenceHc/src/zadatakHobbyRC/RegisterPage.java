package zadatakHobbyRC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	public static WebElement element = null;

	// Find First Name Textbox
	public static WebElement firstNameTextBox(WebDriver driver) {
		element = driver.findElement(By.id("FirstName"));
		return element;

	}

	// Fill First Name Textbox
	public void fillFirstNameTextBox(WebDriver driver, String firstName) {
		element = firstNameTextBox(driver);
		element.sendKeys(firstName);
	}

	// Find Last Name Textbox
	public static WebElement lastNameTextBox(WebDriver driver) {
		element = driver.findElement(By.id("LastName"));
		return element;
	}

	// Fill Last Name Textbox
	public void fillLastNameTextBox(WebDriver driver, String lastName) {
		element = lastNameTextBox(driver);
		element.sendKeys(lastName);
	}

	// Find Email Textbox
	public static WebElement emailTextBox(WebDriver driver) {
		element = driver.findElement(By.id("Email"));
		return element;
	}

	// Fill Email Name Textbox
	public void fillEmailTextBox(WebDriver driver, String email) {
		element = emailTextBox(driver);
		element.sendKeys(email);
	}

	// Find Newsletter Checkbox
	public static WebElement newsletterCheckBox(WebDriver driver) {
		element = driver.findElement(By.id("Newsletter"));
		return element;
	}

	// Click Newsletter Checkbox
	public void clickNewsletterCheckbox(WebDriver driver) {
		element = newsletterCheckBox(driver);
		element.click();
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

	// Find Confirm Password Textbox
	public static WebElement confirmPasswordTextBox(WebDriver driver) {
		element = driver.findElement(By.id("ConfirmPassword"));
		return element;
	}

	// Fill Confirm Password Textbox
	public void fillConfirmPasswordTextBox(WebDriver driver, String password) {
		element = confirmPasswordTextBox(driver);
		element.sendKeys(password);
	}

	// Find Register Button
	public static WebElement registerButton(WebDriver driver) {
		element = driver.findElement(By.id("register-button"));
		return element;
	}

	// Click Register Button
	public void clickRegisterButton(WebDriver driver) {
		element = registerButton(driver);
		element.click();
	}

}
