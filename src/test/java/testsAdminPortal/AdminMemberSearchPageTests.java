package testsAdminPortal;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBaseSetup;
import pageobjectsAdmin.AdminBasePage;
import pageobjectsAdmin.AdminMemberSearchPage;

public class AdminMemberSearchPageTests extends TestBaseSetup{
private WebDriver driver;
private AdminMemberSearchPage AdminMemberSearchPage;
private AdminBasePage basePage;
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}
		
	

}