package zadatakHobbyRC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
	public static WebElement element = null;
	@FindBy(xpath = "//h2[@class='product-title']")
	protected WebElement searchResultTitle;
	boolean a;

	// Find Register Button
	public static WebElement registerButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='ico-register']"));
		return element;
	}

	// Click Register Button
	public void clickRegisterButton(WebDriver driver) {
		element = registerButton(driver);
		element.click();
	}

	// Find Log In Button
	public static WebElement logInButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='ico-login']"));
		return element;
	}

	// Click Log In Button
	public void clickLogInButton(WebDriver driver) {
		element = logInButton(driver);
		element.click();
	}

	// Find Shopping Cart Button
	public static WebElement shoppingCartButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
		return element;
	}

	// Click Shopping Cart Button
	public static void clickShoppingCartButton(WebDriver driver) {
		element = shoppingCartButton(driver);
		element.click();
	}

	// Find Cart Content Quantity Button
	public static WebElement cartContentQuantity(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@class='cart-qty']"));
		return element;
	}

	// Click Cart Content Quantity Button
	public static void clickCartContentQuantity(WebDriver driver) {
		element = cartContentQuantity(driver);
		element.click();
	}

	// Find Wishlist Button
	public static WebElement wishlistButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='ico-wishlist']/span[@class='cart-label']"));
		return element;
	}

	// Click Wishlist Button
	public static void clickWishlistButton(WebDriver driver) {
		element = wishlistButton(driver);
		element.click();
	}

	// Find Wishlist Content Quantity button
	public static WebElement wishlistContentQuantity(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@class='wishlist-qty']"));
		return element;
	}

	// Click Wishlist Content Quantity Button
	public static void clickWishlistContentQuantity(WebDriver driver) {
		element = wishlistContentQuantity(driver);
		element.click();
	}

	// Find Search Textbox
	public static WebElement searchTextBox(WebDriver driver) {
		element = driver.findElement(By.id("small-searchterms"));
		return element;
	}

	// Fill Search Textbox
	public void fillSearchTextBox(WebDriver driver, String searchItem) {
		element = searchTextBox(driver);
		element.sendKeys(searchItem);
	}

	// Find Search button
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@class='button-1 search-box-button']"));
		return element;
	}

	// Click Search Button
	public void clickSearchButton(WebDriver driver) {
		element = searchButton(driver);
		element.click();
	}

	// Find Log out button
	public WebElement logOutButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='ico-logout']"));
		return element;
	}

	// Click Log out Button
	public void clickLogOutButton(WebDriver driver) {
		element = logOutButton(driver);
		element.click();
	}

	// Check Search Result exists
	public boolean isPresent(WebDriver driver) {
		if (a = driver.findElements(By.xpath("//a[contains(@title, 'Watermelon')]")).size() > 0) {
			return true;
		} else
			return false;

	}
}
