package pageobject;

import driver.pageobject.BasePO;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Home_Page extends BasePO {

    private static WebElement element = null;

    public void navigateToHomePage(){
        getDriver().get("http://52.176.165.241");
    }

    public static void fillLogInData(String email, String password) {
        enter_EmailAddress().sendKeys(email);
        enter_Password().sendKeys(password);
        click_LogIn_Tab().click();
    }


    public  void logIn() {
        String email = "pratik.patel@newpage1.io";
        String password = "abc@123";
        logIn.click();
        fillLogInData(email, password);
        click_ProductTab().click();

    }

    @FindBy(xpath = "//*[@id=\"input-email\"]")
    static WebElement enterEmailAddress;

    public static WebElement enter_EmailAddress() {

     return enterEmailAddress;

    }

    @FindBy(xpath = "//*[@id=\"input-password\"]")
    static WebElement enterPassword;

    public  static WebElement enter_Password() {

     return enterPassword;
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
    static WebElement clickOnLogInTab;

    public static WebElement click_LogIn_Tab() {

       return clickOnLogInTab;

    }

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a/span")
    WebElement clickOnProductTab;

    public WebElement click_ProductTab() {

       return clickOnProductTab;

    }

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a")
    WebElement clickOnCartIcon;

    public WebElement click_CartIcon(WebDriver driver) {


        return clickOnCartIcon;

    }


}
