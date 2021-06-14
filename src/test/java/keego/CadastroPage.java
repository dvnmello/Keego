package keego;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CadastroPage {

	static WebDriver driver;
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extentReport;
	static ExtentTest extentTest;

	@Before
	public void beforeCenario(Scenario cenario) throws InterruptedException {
		if (extentReport == null) {
			extentReport = new ExtentReports();
			htmlReporter = new ExtentHtmlReporter("src/test/resources/htmlReporter.html");
			extentReport.attachReporter(htmlReporter);
		}

		extentTest = extentReport.createTest(cenario.getId());

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// driver.get("http://advantageonlineshopping.com/#");
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static ExtentTest getExtentTest() {
		return extentTest;
	}

	public void verificarPagina() throws InterruptedException {

		driver.navigate().to("http://advantageonlineshopping.com/#/register");
		Thread.sleep(2000);

		if (driver.findElement(By.id("form")).isEnabled()) {
			System.out.println("Test 1 Pass");
		} else {
			System.out.println("Test 1 Fail");
		}
		;
	}

	public void verificaCampos() {
		if (driver.findElement(By.id("formCover")).isEnabled()) {
			System.out.println("Test 1 Pass");
		} else {
			System.out.println("Test 1 Fail");
		}
		;
	}

	public void preencherDados() {
		driver.findElement(By.name("usernameRegisterPage")).sendKeys("Teste10");
		driver.findElement(By.name("emailRegisterPage")).sendKeys("teste10@gmail.com");
		driver.findElement(By.name("passwordRegisterPage")).sendKeys("Abcd1234");
		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Abcd1234");
		driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Teste");
		driver.findElement(By.name("last_nameRegisterPage")).sendKeys("10");
		driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("6199998888");
		WebElement selectElement = driver.findElement(By.name("countryListboxRegisterPage"));
		Select cmbCountry = new Select(selectElement);
		cmbCountry.selectByVisibleText("Brazil");
		driver.findElement(By.name("cityRegisterPage")).sendKeys("Brasilia");
		driver.findElement(By.name("addressRegisterPage")).sendKeys("Rua 7");
		driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("DF");
		driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("71908-180");

	}

	public void botaoPrivacidade() {
		driver.findElement(By.name("i_agree")).click();

	}

	public void clicarRegister() {
		if (driver.findElement(By.name("i_agree")).isEnabled()) {
			System.out.println("Test 1 Pass");
		} else {
			System.out.println("Test 1 Fail");
		}
		;
		driver.findElement(By.id("register_btnundefined")).click();

	}

	public void cadastrado() {
		driver.get("http://advantageonlineshopping.com/#");
		driver.findElement(By.id("menuUserLink")).isEnabled();

	}

	public void verificaUser() {
		driver.findElement(By.id("menuUserLink")).click();
		driver.findElement(By.id("My_account")).click();

	}

	@After
	public void afterCenario(Scenario cenario) {

		extentTest.log(Status.PASS, "Cenario " + cenario.getName() + " executado com sucesso!");
		extentReport.flush();
		driver.close();
	}

}
