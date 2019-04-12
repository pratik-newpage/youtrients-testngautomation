package pageobject;

import driver.pageobject.BasePO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products_Page extends BasePO {


    @FindBy(css = ".product-with-test-sub> .product-text> .btn-cta")
    WebElement clickOnBuyNowButton;

    public void clickOnBuyNowButton() {
        clickOnBuyNowButton.click();
    }

    @FindBy(css = ".product-with-test-sub> .product-text> .btn-cta")
    WebElement clickOnBuyNow1Button;

    public void clickOnBuyNow1Button() {

        clickOnBuyNow1Button.click();

    }

    @FindBy(xpath = "//div[3]/div/div/a")
    WebElement clickOnBuyNow2Button;

    public void clickOnBuyNow2Button() {
        clickOnBuyNow2Button.click();

    }

    @FindBy(xpath = "//*[@id=\"input-option244\"]")
    WebElement clickOnDownArrow;

    public void click_DownArrow() {

        clickOnDownArrow.click();
    }

    @FindBy(xpath = "//*[@id=\"input-option244\"]/option[2]")
    WebElement clickOnWithKit;

    public WebElement click_WithKit(WebDriver driver) {

      return clickOnWithKit;

    }

    @FindBy(xpath = "//*[@id=\"input-option244\"]/option[3]")
    WebElement clickOnNoKit;

    public void click_NoKit() {

        clickOnNoKit.click();
    }

    @FindBy(xpath = "//*[@id=\"optiongroup2\"]")
    WebElement click_NoKit1;
    public  void click_NoKit1() {
        click_NoKit1.click();
    }

    @FindBy(xpath = "//*[@id=\"radio-span\"]/li[3]/a")
    WebElement click_Continue;
    public void click_Continue() {
        click_Continue.click();
    }

    @FindBy(css = "#product> .form-group >.btn-cta")
    WebElement click_BuyNowFinal;
    public void click_BuyNowFinal() {
        click_BuyNowFinal.click();
    }

    @FindBy(id = "input-option242")
    WebElement click_DownArrow1;
    public void click_DownArrow1() {

        click_DownArrow1.click();


    }

    @FindBy(xpath = "//*[@id=\"input-option242\"]/option[2]")
    WebElement click_WithKit1;

    public  WebElement click_WithKit1(WebDriver driver) {

        return  click_WithKit1;



    }

    @FindBy(xpath = "//*[@id=\"input-option242\"]/option[3]")
    WebElement click_NoKit2;
    public void click_NoKit2() {
        click_NoKit2.click();
    }
}
