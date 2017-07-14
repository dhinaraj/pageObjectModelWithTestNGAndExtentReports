package testsSample;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestLogger;
import base.TestBaseSetup;
import pageobjectsAdmin.AdminBasePage;
import pageobjectsAdmin.AdminMemberSearchPage;
import pageobjectsAdmin.ReferralMapPage;
import pageobjectsMember.MemberLandingPage;

public class RewardReportTests extends TestBaseSetup {
	
	private WebDriver driver;
	private AdminMemberSearchPage adminMemberSearchPage;
	private AdminBasePage basePage;
	private MemberLandingPage memberLandingPage;
		
		@BeforeClass
		public void setUp() {
			driver=getDriver();
			basePage = new AdminBasePage(driver);
			adminMemberSearchPage = new AdminMemberSearchPage(driver);
			memberLandingPage = new MemberLandingPage(driver);

		}
		
		@Test
		public void test1() throws InterruptedException {
			TestLogger.log("Log line looks good! Test fails");
			basePage.login("dhina2", "casuarina1", "");
		
		}


		
		@Test
		public void test3() throws InterruptedException {
			TestLogger.log("Log line looks good! Test fails");
			memberLandingPage.closePopUpAfterLogin();
			memberLandingPage.clickOnRewards();
		
		}
		
		

		

		
}