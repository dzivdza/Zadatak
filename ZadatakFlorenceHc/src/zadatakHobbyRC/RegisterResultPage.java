package zadatakHobbyRC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterResultPage {
	public static WebElement element = null;

	// Find Continue Button
	public static WebElement continueButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@value='Continue']"));
		return element;
	}

	// Click Continue Button
	public void clickContinueButton(WebDriver driver) {
		element = continueButton(driver);
		element.click();
	}

}
