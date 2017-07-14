package testsAdminPortal;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBaseSetup;
import pageobjectsAdmin.AdminBasePage;
import pageobjectsAdmin.AdminMemberSearchPage;
import pageobjectsAdmin.ReferralMapPage;

public class ReferralMapPageTests extends TestBaseSetup {
	private WebDriver driver;
	private AdminMemberSearchPage signInPage;
	private AdminBasePage basePage;
	private ReferralMapPage referralMapPage;
		
		@BeforeClass
		public void setUp() {
			driver=getDriver();
			basePage = new AdminBasePage(driver);
			referralMapPage = new ReferralMapPage(driver);
		}
		
		
		@Test
		public void showReferralList() throws InterruptedException
		{
			basePage.login("dhina2", "casuarina1", "");
			referralMapPage.showReferralListing();
		}
		

}
