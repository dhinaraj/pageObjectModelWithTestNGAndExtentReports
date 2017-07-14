package pageobjectsMember;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class MemberSubscriptionPage {
	protected WebDriver driver;

	public MemberSubscriptionPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnSubscription() {
		WebElement subcriptionLink = driver.findElement(By.xpath("//ul/li[2]/a/span[1]"));
		Actions builder = new Actions(driver);
		Action mouseOverSubscription = builder.moveToElement(subcriptionLink).build();
		mouseOverSubscription.perform();
	}

	public void clickOnPlanSubscription() {
		WebElement planSubcriptionLink = driver
				.findElement(By.xpath("html/body/header/div[1]/nav/div[2]/ul/li[2]/ul/li/a"));

		Actions builder = new Actions(driver);
		Action mouseOverPlanSubscription = builder.moveToElement(planSubcriptionLink).build();
		mouseOverPlanSubscription.perform();
	}

	public void clickOnFristTimeSubscription() {
		driver.findElement(By.xpath("html/body/header/div[1]/nav/div[2]/ul/li[2]/ul/li/ul/li/a")).click();
	}

	public void selectPlan1() {
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/input[1]")).click();
	}

	public void selectPlan2() {
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/input[2]")).click();
	}

	public void selectPlan3() {
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/input[3]")).click();
	}

	public void selectPlan4() {
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/input[4]")).click();
	}

	public void selectPlan5() {
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/input[5]")).click();
	}

	public void enterTopupCreditstoUse(String topupCreditAmount) {
		driver.findElement(By.name("me_points")).clear();
		driver.findElement(By.name("me_points")).sendKeys(topupCreditAmount);
	}

	public void enterAdvertisingCreditstoUse(String advertisingCreditAmount) {
		driver.findElement(By.name("advertising_credit")).sendKeys(advertisingCreditAmount);
	}

	public void enterSponsor(String referrerId) {
		driver.findElement(By.name("sponsor")).sendKeys(referrerId);
	}

	public void enterPlacement(String placementID) {
		driver.findElement(By.name("placement")).sendKeys(placementID);
	}

	public String readAmountToPay() {
		String amountToPay = driver
				.findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[2]/form/div[3]/div/p[2]")).getText();
		return amountToPay;
	}

	public void enterSecondaryPassword(String secondaryPassword) {
		driver.findElement(By.name("secondary_password")).sendKeys(secondaryPassword);
	}

	public void selectAgree() {
		driver.findElement(By.name("agreement")).click();
	}

	public void clickOnPurchase() {
		driver.findElement(By.partialLinkText("Purchase")).click();
	}

	public void clickOnCancelPurchaseButton() {
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[1]")).click();
	}

	public void enterPurchaseOtp(String purchaseOtp) {
		driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/div/div/input")).sendKeys(purchaseOtp);
	}

	public void clickOnConfirmPurchase() {
		driver.findElement(By.xpath("html/body/div[5]/div/div/div[3]/button[2]")).click();
	}

	// Methods

	public void selectFirstPackage(String subscriptionPackage) {
		clickOnSubscription();
		clickOnPlanSubscription();
		clickOnFristTimeSubscription();

		if (subscriptionPackage.equalsIgnoreCase("Entreprenuer+")) {
			selectPlan1();
		}

		if (subscriptionPackage.equalsIgnoreCase("Professional+")) {
			selectPlan2();
		}

		if (subscriptionPackage.equalsIgnoreCase("Enterprise+")) {
			selectPlan3();
		}

		if (subscriptionPackage.equalsIgnoreCase("Alliance")) {
			selectPlan4();
			;
		}
	}

	public void selectFirstPackageOld(String subscriptionPackage) {
		clickOnSubscription();
		clickOnPlanSubscription();
		clickOnFristTimeSubscription();

		if (subscriptionPackage.equalsIgnoreCase("Entreprenuer")) {
			selectPlan1();
		}

		if (subscriptionPackage.equalsIgnoreCase("Basic")) {
			selectPlan2();
		}

		if (subscriptionPackage.equalsIgnoreCase("Professional")) {
			selectPlan3();
		}

		if (subscriptionPackage.equalsIgnoreCase("Enterprise")) {
			selectPlan4();
			;
		}

		if (subscriptionPackage.equalsIgnoreCase("Alliance")) {
			selectPlan5();
			;
		}
	}

	public void selectSecondPackAfterCLP(String subscriptionPackage) {
		clickOnSubscription();
		clickOnPlanSubscription();
		clickOnFristTimeSubscription();

		if (subscriptionPackage.equalsIgnoreCase("Entreprenuer")) {
			selectPlan1();
		}

		if (subscriptionPackage.equalsIgnoreCase("Basic")) {
			selectPlan1();
		}

		if (subscriptionPackage.equalsIgnoreCase("Professional")) {
			selectPlan1();
		}

		if (subscriptionPackage.equalsIgnoreCase("Enterprise")) {
			selectPlan1();
			;
		}

		if (subscriptionPackage.equalsIgnoreCase("Alliance")) {
			selectPlan1();
			;
		}
	}

	public void enterPurchaseDetails(String subscriptionPackage, String referrerId, String placementID,
			String secondaryPassword) {

		String topupCreditAmount;

		if (subscriptionPackage.equalsIgnoreCase("Entreprenuer+")) {
			topupCreditAmount = "3000";
			enterTopupCreditstoUse(topupCreditAmount);
		}

		if (subscriptionPackage.equalsIgnoreCase("Professional+")) {
			topupCreditAmount = "9900";
			enterTopupCreditstoUse(topupCreditAmount);
		}

		if (subscriptionPackage.equalsIgnoreCase("Enterprise+")) {
			topupCreditAmount = "16500";
			enterTopupCreditstoUse(topupCreditAmount);
		}

		if (subscriptionPackage.equalsIgnoreCase("Alliance")) {
			topupCreditAmount = "50000";
			enterTopupCreditstoUse(topupCreditAmount);
		}

		enterSponsor(referrerId);
		enterPlacement(placementID);
		enterSecondaryPassword(secondaryPassword);
		selectAgree();

	}

	public void enterPurchaseDetailsOld(String subscriptionPackage, String referrerId, String placementID,
			String secondaryPassword, String voucherApplied) {

		String topupCreditAmount;

		if (subscriptionPackage.equalsIgnoreCase("Entreprenuer+")) {

			if (voucherApplied.equalsIgnoreCase("Y")) {
				topupCreditAmount = readAmountToPay();
			} else {
				topupCreditAmount = "3000";
			}

			enterTopupCreditstoUse(topupCreditAmount);
		}

		if (subscriptionPackage.equals("Basic")) {
			if (voucherApplied.equalsIgnoreCase("Y")) {
				topupCreditAmount = readAmountToPay();
			} else {
				topupCreditAmount = "3000";
			}
			enterTopupCreditstoUse(topupCreditAmount);
		}

		if (subscriptionPackage.equals("Professional+")) {
			if (voucherApplied.equalsIgnoreCase("Y")) {
				topupCreditAmount = readAmountToPay();
			} else {
				topupCreditAmount = "9900";
			}
			enterTopupCreditstoUse(topupCreditAmount);
		}

		if (subscriptionPackage.equals("Enterprise+")) {
			if (voucherApplied.equalsIgnoreCase("Y")) {
				topupCreditAmount = readAmountToPay();
			} else {
				topupCreditAmount = "16500";
			}
			enterTopupCreditstoUse(topupCreditAmount);
		}

		if (subscriptionPackage.equals("Alliance")) {
			if (voucherApplied.equalsIgnoreCase("Y")) {
				topupCreditAmount = readAmountToPay();
			} else {
				topupCreditAmount = "50000";
			}
			enterTopupCreditstoUse(topupCreditAmount);
		}

		enterSponsor(referrerId);
		enterPlacement(placementID);
		enterSecondaryPassword(secondaryPassword);
		selectAgree();

	}

	public void purchasePackage(String purchaseOtp) throws InterruptedException {

		clickOnPurchase();
		Thread.sleep(3000);
		enterPurchaseOtp(purchaseOtp);
		clickOnConfirmPurchase();

	}

	public void clickonCancelPurchase() {
			  
			  clickOnCancelPurchaseButton();
	}
	
}
