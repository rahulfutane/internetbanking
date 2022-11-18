package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_CUSTOMER_LOGIN {
	public WebDriver driver;
	public POM_CUSTOMER_LOGIN(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[normalize-space()='Customer Login']")
	public WebElement custlg;
	
	@FindBy(xpath = "//*[@id=\"userSelect\"]") 
	public WebElement selectname;
	
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/form/button")
	public WebElement clicklog;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[3]/button[2]")
	public WebElement clickdepo;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[4]/div/form/button")
	public WebElement depoammount;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[4]/div/form/button")
	public WebElement depo;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[3]/button[3]")
	public WebElement clickwithdr;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[4]/div/form/div/input")
	public WebElement withdrammount;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[4]/div/form/button")
	public WebElement withdr;
	
	@FindBy(xpath = "/html/body/div/div/div[1]/button[2]")
	public WebElement logout;
	
	

}
