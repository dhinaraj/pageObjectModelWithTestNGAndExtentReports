package testsSample;

import static org.testng.Assert.assertTrue;

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

public class SampleTest1 extends TestBaseSetup {
	
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
		
		@Test (groups = {"Admin Login"})
		public void test1() throws InterruptedException {
			TestLogger.log("Login Page Called");
			assertTrue(basePage.verifyBasePageTitle("SecureCom Media"));
			TestLogger.log("Assertion Completed Completed");
		
		}
		@Test (groups = {"Admin Login"})
		public void test2() throws InterruptedException {
			TestLogger.log("Login Page Called");
			assertTrue(basePage.verifyBasePageTitle("SecureCom Media111"));
			TestLogger.log("Assertion Completed Completed");
		
		}
		
		@Test (groups = {"Admin Login"})
		public void test3() throws InterruptedException {
			TestLogger.log("Login Page Called");
			assertTrue(basePage.verifyBasePageTitle("SecureCom Media"));
			TestLogger.log("Assertion Completed Completed");
		
		}
		
		

		

		
}