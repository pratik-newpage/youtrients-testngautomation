package pageobject;

import driver.pageobject.BasePO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;


public class Checkout_Page extends BasePO {

	@FindBy(id = "bhvbv")
	WebElement payForMyOrderButton;

	public void clickOnPayForMyOrderButton(){
		payForMyOrderButton.click();
	}

//
//	public static WebElement enter_MonthYear(WebDriver driver) {
//
//
//		element = driver.findElement(By.name("exp-date"));
//
//		return element;
//
//	}
//
//	public static WebElement enter_CVV(WebDriver driver) {
//
//
//		element = driver.findElement(By.name("cvc"));
//
//		return element;
//
//	}
//
//	public static WebElement confirm_Order(WebDriver driver) {
//
//
//		element = driver.findElement(By.xpath("//*[@id=\"button-confirm\"]"));
//
//		return element;
//
//	}
//
//	public static WebElement total_Checkout(WebDriver driver) {
//
//
//		//element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/div/div/div/div[2]/div/div/div[1]/table[1]/tbody/tr[7]/td[2]"));
//		element = driver.findElement(By.cssSelector(".exthidden-xs tr:nth-child(6) > .noborder:nth-child(2)"));
//		return element;
//
//	}
//
//	public static WebElement total_PayByCard(WebDriver driver) {
//
//
//		element = driver.findElement(By.xpath("//*[@id=\"currency-notification\"]"));
//
//		return element;
//
//	}


}
