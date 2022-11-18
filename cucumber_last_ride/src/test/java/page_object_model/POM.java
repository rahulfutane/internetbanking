package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	
	WebDriver driver;
	public POM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this );
	}
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/div[2]/button")
	public WebElement managerlog;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/button[1]")
	public WebElement addcust;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")
	public WebElement fristname;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")
	public WebElement lastname;
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")
	public WebElement postcoad;
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/button")
	public WebElement clickaddcust;
	
	@FindBy(xpath = "/html/body/div/div/div[1]/button[1]")
	public WebElement home;
	
	
	

}
