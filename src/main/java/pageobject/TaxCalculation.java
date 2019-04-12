package pageobject;

import driver.pageobject.BasePO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TaxCalculation extends BasePO {

    private static WebElement element = null;
    private static String countryName = null;
    private static String selectedCountryName = null;
    private static String productValue = null;
    private static String totalTaxValue = null;
    private static String totalProductValue = null;
    private static String shippingCharge = null;
    private static String totalCardValue = null;
    private static String getAddressValue = null;

    private static String productValueInChekoutPage = null;
    private static String totalTaxValueInChekoutPage = null;
    private static String totalProductValueInChekoutPage = null;
    private static String shippingChargeInChekoutPage = null;
    private static String totalCardValueInChekoutPage = null;


    @FindBy(xpath = "//a[@href ='#collapse-shipping']")
    static WebElement eclickOnEstimateShippingAndTaxLabel;

    public  void clickOnEstimateShippingAndTaxLabel() {
        eclickOnEstimateShippingAndTaxLabel.click();

    }

    @FindBy(name = "input-country")
    static WebElement selectCountry;

    public static Select selectCountry(String countryName) {
        Select countryname = new Select(selectCountry);
        countryname.selectByVisibleText(countryName);
        WebElement option = countryname.getFirstSelectedOption();
        selectedCountryName = option.getText();
        return countryname;
    }

    @FindBy(name = "input-zone")
    static WebElement selectState;

       public static Select selectState(String stateName) {
        Select statename = new Select(selectState);
        statename.selectByVisibleText(stateName);
        return statename;
    }

    @FindBy(name = "ipostcode")
    static WebElement fillPostCode;
    public static void fillPostCode(String postCode) {
        fillPostCode.clear();
        fillPostCode.sendKeys(postCode);
    }

    @FindBy(id = "button-quote")
    static WebElement clickOnGetQuotesButton;
    public  WebElement clickOnGetQuotesButton() {

        return clickOnGetQuotesButton;
    }

    @FindBy(css = ".col-sm-4.col-sm-offset-8 > table tbody > tr:nth-child(1) > td:nth-child(2)")
    static WebElement getProductValue;

    public static Double getProductValue() {
        productValue = getProductValue.getText().substring(1).replace(",", "");
        return Double.parseDouble(productValue);
    }

    @FindBy(css = ".col-sm-4.col-sm-offset-8 > table tbody > tr:nth-child(2) > td:nth-child(2)")
    static WebElement getShippingCharge;
    public static Double getShippingCharge() {
        shippingCharge = getShippingCharge.getText().substring(1).replace(",", "");
        return Double.parseDouble(shippingCharge);
    }

    @FindBy(css = ".col-sm-4.col-sm-offset-8 > table tbody > tr:nth-child(3) > td:nth-child(2)")
    static WebElement getTotalTaxValue;

    public static Double getTotalTaxValue() {
        totalTaxValue =getTotalTaxValue.getText().substring(1).replace(",", "");
        return Double.parseDouble(totalTaxValue);
    }

    @FindBy(css = ".col-sm-4.col-sm-offset-8 > table tbody > tr:nth-child(3) > td:nth-child(2)")
    static WebElement gettotalProductValueForOutsideCountry;

    public static Double gettotalProductValueForOutsideCountry() {
        totalTaxValue = gettotalProductValueForOutsideCountry.getText().substring(1).replace(",", "");
        return Double.parseDouble(totalTaxValue);
    }

    @FindBy(css = ".col-sm-4.col-sm-offset-8 > table tbody > tr:nth-child(3) > td:nth-child(2)")
    static WebElement gettotalProductValueForOutsideCountry;
    public static Double getTotalProductValue() {
        totalProductValue = getDriver().findElement(By.cssSelector(".col-sm-4.col-sm-offset-8 > table tbody > tr:nth-child(4) > td:nth-child(2)")).getText().substring(1).replace(",", "");
        return Double.parseDouble(totalProductValue);
    }

    public static void clickOnShippingChargeRadioButton() {
        getDriver().findElement(By.name("shipping_method")).click();
    }

    public static void clickOnShippingAddress(String addressValue) {
        getAddressValue = getDriver().findElement(By.name("delivery_details[shipping_address]")).getAttribute(addressValue);
    }

    public static void clickOnShippingButton() {
        getDriver().findElement(By.id("button-shipping")).click();
    }

    //-------------CheckOut Page--------------------//
    public static Double getProductValueInCheckOutPage() {
        productValueInChekoutPage = getDriver().findElement(By.cssSelector("tbody > tr:nth-child(3) > td:nth-child(2)")).getText().substring(1).replace(",", "");
        return Double.parseDouble(productValueInChekoutPage);
    }

    public static Double getShippingChargeInCheckOutPage() {
        shippingChargeInChekoutPage = getDriver().findElement(By.cssSelector("tbody > tr:nth-child(4) > td:nth-child(2)")).getText().substring(1).replace(",", "");
        return Double.parseDouble(shippingChargeInChekoutPage);
    }

    public static Double getTotalTaxValueInCheckOutPage() {
        totalTaxValueInChekoutPage = getDriver().findElement(By.cssSelector("tbody > tr:nth-child(5) > td:nth-child(2)")).getText().substring(1).replace(",", "");
        return Double.parseDouble(totalTaxValueInChekoutPage);
    }

    public static Double getTotalProductValueInCheckPutPageForOutsidecountry() {
        totalTaxValueInChekoutPage = getDriver().findElement(By.cssSelector("tbody > tr:nth-child(5) > td:nth-child(2)")).getText().substring(1).replace(",", "");
        return Double.parseDouble(totalTaxValueInChekoutPage);
    }

    public static Double getTotalProductValueInCheckPutPage() {
        totalProductValueInChekoutPage = getDriver().findElement(By.cssSelector("tbody > tr:nth-child(6) > td:nth-child(2)")).getText().substring(1).replace(",", "");
        return Double.parseDouble(totalProductValueInChekoutPage);
    }

    public static String getTotalCardValueInCheckPutPage() {
        totalCardValueInChekoutPage = getDriver().findElement(By.id("currency-notification")).getText();
//        replaceAll("Your card will be charged for ", "")
        return totalProductValue;
    }

//    public static String getShippingChargeFromString(){
//        shippingCharge =  getDriver().findElement(By.xpath("//label[contains(.,'DHL - Express Worldwide')]")).getText().replaceAll("DHL - Express Worldwide - 4 Days  - $", "");
//        return shippingCharge;
//    }

    public static void clickOnNewBillingAddressRadioButton(){
        getDriver().findElement(By.cssSelector("div.delivery-details-content.content-delivery-details > div > div.extpanel-body > form > div:nth-child(3) > label > input[type=\"radio\"]")).click();
    }

    public static void fillShippingAddress(String firstname, String lastname, String companyname, String address1, String address2, String city, String postcode) {
        getDriver().findElement(By.id("input-shipping-firstname")).sendKeys(firstname);
        getDriver().findElement(By.id("input-shipping-lastname")).sendKeys(lastname);
        getDriver().findElement(By.id("input-shipping-company")).sendKeys(companyname);
        getDriver().findElement(By.id("input-shipping-address-1")).sendKeys(address1);
        getDriver().findElement(By.id("input-shipping-address-2")).sendKeys(address2);
        getDriver().findElement(By.id("input-shipping-city")).sendKeys(city);
        getDriver().findElement(By.id("input-shipping-postcode")).sendKeys(postcode);
    }

    public static void fillBillingAddress(String firstname, String lastname, String companyname, String address1, String address2, String city, String postcode) {
        getDriver().findElement(By.id("input-payment-firstname")).sendKeys(firstname);
        getDriver().findElement(By.id("input-payment-lastname")).sendKeys(lastname);
        getDriver().findElement(By.id("input-payment-company")).sendKeys(companyname);
        getDriver().findElement(By.id("input-payment-address-1")).sendKeys(address1);
        getDriver().findElement(By.id("input-payment-address-2")).sendKeys(address2);
        getDriver().findElement(By.id("input-payment-city")).sendKeys(city);
        getDriver().findElement(By.id("input-payment-postcode")).sendKeys(postcode);
    }


    private static double standardShippingCharge;
    private static double taxValue;
    private static double productValueOnEstimatePage;
    private static double totalTaxOnProduct;
    private static double actualShippingCharge;
    private static double totalProductVlaue;

    private static double productValueInCheckOutPage;
    private static double totalTaxOnProductInCheckOutPage;
    private static double shippingChargeInCheckOutPage;
    private static double totalProductValueInCheckOutPage;


    public static void taxCalculation(double shippingCharge) {

        switch (selectedCountryName) {
            case "Canada":
                taxValue = CanadaStatesEnum.Alberta.calculateTax();
                productValueOnEstimatePage = getProductValue();
                totalTaxOnProduct = (productValueOnEstimatePage + shippingCharge ) * taxValue / 100;
                actualShippingCharge = getShippingCharge();
                totalProductVlaue = productValueOnEstimatePage + totalTaxOnProduct + shippingCharge;
                System.out.println(productValue + " " + totalTaxOnProduct + " " + actualShippingCharge + " " + totalProductVlaue);
                Assert.assertEquals(shippingCharge, actualShippingCharge, 00);
                Assert.assertEquals(getTotalTaxValue(), totalTaxOnProduct, 00);
                Assert.assertEquals(getTotalProductValue(), totalProductVlaue, 00);
                break;
            case "Japan":
                taxValue = 0.00;
                productValueOnEstimatePage = getProductValue();
                totalTaxOnProduct = productValueOnEstimatePage * taxValue / 100;
                actualShippingCharge = getShippingCharge();
                totalProductVlaue = productValueOnEstimatePage + totalTaxOnProduct + shippingCharge;
                System.out.println(productValue + " " + totalTaxOnProduct + " " + actualShippingCharge + " " + totalProductVlaue);
                Assert.assertEquals(shippingCharge, actualShippingCharge, 00);
//                Assert.assertEquals(getTotalTaxValue(), totalTaxOnProduct, 00);
                Assert.assertEquals(gettotalProductValueForOutsideCountry(), totalProductVlaue, 00);
                break;

        }

        standardShippingCharge = shippingCharge;

    }

    public static void checkOutProcess() {
        try {
            String firstname = "pratik";
            String lastname = "patel";
            String companyname = "qwe";
            String address1 = "xyz";
            String address2 = "ssssd";
            String city = "ABEE";
            String postcode = "T0A 0E";
            Estimate_Page.clickOnCheckoutButton().click();
            Thread.sleep(4000);
            clickOnNewBillingAddressRadioButton();
//          fillBillingAddress(firstname, lastname, companyname, address1, address2, city, postcode);
            fillShippingAddress(firstname, lastname, companyname, address1, address2, city, postcode);
            Thread.sleep(10000);
            clickOnShippingChargeRadioButton();
            Thread.sleep(4000);
            productValueInCheckOutPage = getProductValueInCheckOutPage();
            totalTaxOnProductInCheckOutPage = getTotalTaxValueInCheckOutPage();
            shippingChargeInCheckOutPage = getShippingChargeInCheckOutPage();
            totalProductValueInCheckOutPage = getTotalProductValueInCheckPutPage();
            System.out.println(productValueOnEstimatePage + " " + totalTaxOnProduct + " " + actualShippingCharge + " " + totalProductVlaue);
            System.out.println(productValueInCheckOutPage + " " + totalTaxOnProductInCheckOutPage + " " + shippingChargeInCheckOutPage + " " + totalProductValueInCheckOutPage);
            Assert.assertEquals(productValueInCheckOutPage, productValueOnEstimatePage, 00);
            Assert.assertEquals(totalTaxOnProductInCheckOutPage, totalTaxOnProduct, 00);
            Assert.assertEquals(shippingChargeInCheckOutPage, actualShippingCharge, 00);
            Assert.assertEquals(totalProductVlaue, totalProductValueInCheckOutPage, 00);
            Thread.sleep(3000);
            Checkout_Page.clickOnPayForMyOrderButton().click();
            Thread.sleep(5000);
            double totalCardValue = Double.parseDouble(TaxCalculation.getTotalCardValueInCheckPutPage());
            System.out.println(totalCardValue);
            Assert.assertEquals(totalCardValue, totalProductValueInCheckOutPage, 00);
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }
    }

        public static void checkOutProcessForOutsideCountry(String postCode) {
            try {
                String firstname = "pratik";
                String lastname = "patel";
                String companyname = "qwe";
                String address1 = "xyz";
                String address2 = "ssssd";
                String city = "ABEE";
                Estimate_Page.clickOnCheckoutButton().click();
                Thread.sleep(4000);
                Thread.sleep(3000);
                clickOnNewBillingAddressRadioButton();
//              fillBillingAddress(firstname, lastname, companyname, address1, address2, city, postcode);
                fillShippingAddress(firstname, lastname, companyname, address1, address2, city, postCode);
                Thread.sleep(10000);
                clickOnShippingChargeRadioButton();
                Thread.sleep(4000);
                productValueInCheckOutPage = getProductValueInCheckOutPage();
                shippingChargeInCheckOutPage = getShippingChargeInCheckOutPage();
                totalProductValueInCheckOutPage = getTotalProductValueInCheckPutPageForOutsidecountry();
                System.out.println(productValueOnEstimatePage + " " + totalTaxOnProduct + " " + actualShippingCharge + " " + totalProductVlaue);
                System.out.println(productValueInCheckOutPage + " " + totalTaxOnProductInCheckOutPage + " " + shippingChargeInCheckOutPage + " " + totalProductValueInCheckOutPage);
                Assert.assertEquals(productValueInCheckOutPage, productValueOnEstimatePage, 00);
                Assert.assertEquals(shippingChargeInCheckOutPage, actualShippingCharge, 00);
                Assert.assertEquals(totalProductVlaue, totalProductValueInCheckOutPage, 00);
                Thread.sleep(5000);
                Checkout_Page.clickOnPayForMyOrderButton().click();
                Thread.sleep(5000);

                System.out.println(getTotalCardValueInCheckPutPage());
//                double totalCardValue = Double.parseDouble(getTotalCardValueInCheckPutPage());
//                System.out.println(totalCardValue);
//                Assert.assertEquals(totalCardValue, totalProductValueInCheckOutPage, 00);
//                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
    }


}
