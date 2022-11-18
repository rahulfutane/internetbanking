package Step_last;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import page_object_model.POM;
import page_object_model.POM_CUSTOMER_LOGIN;

public class Step_defination_file_last {
	WebDriver driver;
	POM_CUSTOMER_LOGIN custlog;
	POM managerlg;
	@Given("Open a Browser")
	public void open_a_browser() {
	   
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   custlog = new POM_CUSTOMER_LOGIN(driver);
	   managerlg = new POM(driver);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("Enter URl")
	public void enter_u_rl() {
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	   
	}

	@When("User click on Bank Manager login")
	public void user_click_on_bank_manager_login() {
		managerlg.managerlog.click();
	}

	@When("User click on add customer feature")
	public void user_click_on_add_customer_feature() {
		managerlg.addcust.click();
	}

	@When("User enter frist name")
	public void user_enter_frist_name() {
		managerlg.fristname.sendKeys("rahul");
	}

	@When("User enter last name")
	public void user_enter_last_name() {
		managerlg.lastname.sendKeys("futane");
	}

	@When("User enter postan code")
	public void user_enter_postan_code() {
		managerlg.postcoad.sendKeys("441401");
	}

	@When("User click on add customer")
	public void user_click_on_add_customer() {
		managerlg.clickaddcust.click();
	}

	@When("user verified Alert massege")
	public void user_verified_alert_massege() {
	    String text = driver.switchTo().alert().getText();
	    System.out.println(text);
	}

	@Then("user click on ok button")
	public void user_click_on_ok_button() {
	    driver.switchTo().alert().accept();
	}
	
	@Then("User click on home")
	public void User_click_on_home() {
		managerlg.home.click();
	}

	@When("User click on custmor login")
	public void user_click_on_custmor_login() {
		custlog.custlg.click();
	}

	@When("User select name")
	public void user_select_name() {
		
		//WebElement el = custlog.selectname;
		Select dropdown = new Select(custlog.selectname);
		dropdown.selectByVisibleText("Harry Potter");
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		custlog.clicklog.click();
	}

	@When("User click on deposite feature")
	public void user_click_on_deposite_feature() {
		custlog.clickdepo.click();
	}

	@When("User Enter deposite ammount")
	public void user_enter_deposite_ammount() {
		custlog.depoammount.sendKeys("24600");
	}

	@When("User click on deposite")
	public void user_click_on_deposite() {
		custlog.depo.click();
	}

	@When("User click on withdrawl feature")
	public void user_click_on_withdrawl_feature() {
		custlog.clickwithdr.click();
	}

	@When("User Enter withdrawl ammount")
	public void user_enter_withdrawl_ammount() {
		custlog.clickwithdr.sendKeys("24600");
	}

	@When("User click on withdrawl")
	public void user_click_on_withdrawl() {
		custlog.withdr.click();
	}

	@When("User click on logout button")
	public void user_click_on_logout_button() {
		custlog.logout.click();
	}

	@Then("user close a browser")
	public void user_close_a_browser() {
	   driver.close();
	}

}
