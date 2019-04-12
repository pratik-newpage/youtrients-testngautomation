package pageobject;

import driver.pageobject.BasePO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Screener_Page extends BasePO {

    private static WebElement element = null;


    public static void fillScreenerData(String age, String gender, String Weight, String height, String waist, String madication, String supplements, String allergies) {
        enter_Age().sendKeys(age);
        Select selectGender = new Select(enter_Gender());
        selectGender.selectByIndex(1);
        enter_Weight().sendKeys(Weight);
        enter_Height().sendKeys(height);
        enter_Waist().sendKeys(waist);
        enter_Medication().sendKeys(madication);
        enter_Supplements().sendKeys(supplements);
        enter_Allergies().sendKeys(allergies);


    }

    @FindBy(id = "fname1")
    static WebElement enter_fname;

    public static WebElement enter_fname() {

        return enter_fname;

    }

    @FindBy(id = "lname1")
    static WebElement enter_lname;

    public static WebElement enter_lname() {
        return enter_lname;
    }

    @FindBy(id = "email1")
    static WebElement enter_email;

    public static WebElement enter_email() {

        return enter_email;

    }

    @FindBy(id = "age1")
    static WebElement enter_Age;

    public static WebElement enter_Age() {

        return enter_Age;

    }

    @FindBy(id = "age1")
    static WebElement enter_Gender;

    public static WebElement enter_Gender() {

        return enter_Gender;

    }

    @FindBy(xpath = "//*[@id=\"weight1\"]")
    static WebElement enter_Weight;

    public static WebElement enter_Weight() {

        return enter_Weight;

    }

    @FindBy(xpath = "//*[@id=\"height1\"]")
    static WebElement enter_Height;

    public static WebElement enter_Height() {


        return enter_Height;

    }

    @FindBy(xpath = "//*[@id=\"waist1\"]")
    static WebElement enter_Waist;

    public static WebElement enter_Waist() {

        return enter_Waist;

    }

    @FindBy(xpath = "//*[@id=\"medication1\"]")
    static WebElement enter_Medication;

    public static WebElement enter_Medication() {

        return enter_Medication;

    }

    @FindBy(xpath = "//*[@id=\"supplements1\"]")
    static WebElement enter_Supplements;

    public static WebElement enter_Supplements() {

        return enter_Supplements;

    }

    @FindBy(xpath = "//*[@id=\"alergies1\"]")
    static WebElement enter_Allergies;

    public static WebElement enter_Allergies() {

        return enter_Allergies;

    }

    @FindBy(xpath = "//*[@id=\"common-success\"]/div/div[2]/div/a")
    WebElement click_SaveButton;

    public WebElement click_SaveButton() {

        return click_SaveButton;

    }

}
