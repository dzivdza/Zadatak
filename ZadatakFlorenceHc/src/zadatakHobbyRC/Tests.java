package zadatakHobbyRC;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Tests {
	WebDriver driver;
	String currentUrl;
	String homePage = "https://www.hobbyrc.co.uk/";
	final String sourceOne = "TBS Source One 5\" Frame";

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(homePage);

	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();

	}

	@Test
	@Parameters({"name", "lastName", "email", "password"})
	public void userRegistration(String name, String lastName, String email, String password) {
		zadatakHobbyRC.MainPage abc = new MainPage();
		abc.clickRegisterButton(driver);
		zadatakHobbyRC.RegisterPage obj = new RegisterPage();
		obj.fillFirstNameTextBox(driver, name);
		obj.fillLastNameTextBox(driver, lastName);
		obj.fillEmailTextBox(driver, email);
		obj.fillPasswordTextBox(driver, password);
		obj.fillConfirmPasswordTextBox(driver, password);
		obj.clickNewsletterCheckbox(driver);
		obj.clickRegisterButton(driver);
		currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.hobbyrc.co.uk/registerresult/1");
	}

	@Test(dependsOnMethods = "userRegistration")
	public void newUserRegistrated() {

		zadatakHobbyRC.RegisterResultPage obj = new RegisterResultPage();
		obj.clickContinueButton(driver);
		currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, homePage);

	}

	@Test(dependsOnMethods = "newUserRegistrated")
	public void logIn() {
		zadatakHobbyRC.MainPage abc = new MainPage();
		abc.clickLogOutButton(driver);
		abc.clickLogInButton(driver);
		currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.hobbyrc.co.uk/login");

	}

	@Test(dependsOnMethods = "logIn")
	@Parameters({"email", "password"})
	public void enterUNAndPss(String email, String password) {
		zadatakHobbyRC.LoginPage abc = new LoginPage();
		abc.fillEmailTextbox(driver, email);
		abc.fillPasswordTextBox(driver, password);
		abc.clickLogInButton(driver);
		currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, homePage);

	}

	@Test(dependsOnMethods = "enterUNAndPss")
	@Parameters({"search"})
	public void search(String search) {
		zadatakHobbyRC.MainPage obj = new MainPage();
		obj.fillSearchTextBox(driver, search);
		obj.clickSearchButton(driver);
		Assert.assertEquals(obj.isPresent(driver), true);
	}
}
