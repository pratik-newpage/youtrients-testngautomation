package pageobject;

import driver.pageobject.BasePO;
import net.bytebuddy.implementation.bind.annotation.FieldProxy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Estimate_Page extends BasePO {
	
	private static WebElement element = null;

	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]/a")
	WebElement clickOnCheckoutButton;

	public  void clickOnCheckoutButton(){

		clickOnCheckoutButton.click();


		}
}
	
