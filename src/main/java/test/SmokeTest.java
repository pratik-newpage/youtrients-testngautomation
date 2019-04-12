package test;


import org.testng.annotations.Test;
import pageobject.*;


public class SmokeTest extends BaseTestCase {


    @Test
    public void taxCalculationOfCanadaForBuyDNASubscriptionproductOfCanada() throws Throwable {
        String age = "23";
        String gender = "male";
        String weight = "53";
        String height = "5";
        String waist = "30";
        String madication = "NA";
        String supplements = "NA";
        String allergies = "NA";
        String postcode = "T0A 0E";

        Home_Page homePage = new Home_Page();
        Products_Page productPage = new Products_Page();
        Screener_Page screenerPage = new Screener_Page();
        TaxCalculation taxCalculation = new TaxCalculation();

        homePage.navigateToHomePage();
        homePage.logIn();
        Thread.sleep(3000);
        productPage.clickOnBuyNowButton();
        Thread.sleep(3000);
        productPage.click_BuyNowFinal();
        Thread.sleep(3000);
        screenerPage.fillScreenerData(age, gender, weight, height, waist, madication, supplements, allergies);
        Thread.sleep(500);
        Screener_Page.click_SaveButton().click();
        Thread.sleep(3000);

        //-----------Tax Calculation-------------//
        taxCalculation.clickOnEstimateShippingAndTaxLabel();
        Thread.sleep(500);
        taxCalculation.selectCountry("Canada");
        Thread.sleep(500);
        taxCalculation.selectState("Alberta");
        Thread.sleep(500);
        taxCalculation.fillPostCode(postcode);
        taxCalculation.clickOnGetQuotesButton().click();
        Thread.sleep(3000);
        taxCalculation.clickOnShippingChargeRadioButton();
        taxCalculation.clickOnShippingButton();
        Thread.sleep(3000);
        taxCalculation.taxCalculation(19.00);

        //------Checkout----------//
        taxCalculation.checkOutProcess();
    }

    @Test
    public void taxCalculationOfCanadaForBuySubscriptionOnlyproductOfCanada() throws Throwable {
        String age = "23";
        String gender = "male";
        String weight = "53";
        String height = "5";
        String waist = "30";
        String madication = "NA";
        String supplements = "NA";
        String allergies = "NA";
        String postcode = "T0A 0E";

        Home_Page homePage = new Home_Page();
        Products_Page productPage = new Products_Page();
        Screener_Page screenerPage = new Screener_Page();
        TaxCalculation taxCalculation = new TaxCalculation();

        homePage.navigateToHomePage();
        homePage.logIn();
        Thread.sleep(3000);
        productPage.clickOnBuyNow1Button();
        Thread.sleep(3000);
        productPage.click_BuyNowFinal();
        Thread.sleep(3000);
        screenerPage.fillScreenerData(age, gender, weight, height, waist, madication, supplements, allergies);
        Thread.sleep(500);
        Screener_Page.click_SaveButton().click();
        Thread.sleep(3000);

        //-----------Tax Calculation-------------//
        taxCalculation.clickOnEstimateShippingAndTaxLabel().click();
        Thread.sleep(500);
        taxCalculation.selectCountry("Canada");
        Thread.sleep(500);
        taxCalculation.selectState("Alberta");
        Thread.sleep(500);
        taxCalculation.fillPostCode(postcode);
        taxCalculation.clickOnGetQuotesButton().click();
        Thread.sleep(3000);
        taxCalculation.clickOnShippingChargeRadioButton();
        taxCalculation.clickOnShippingButton();
        Thread.sleep(3000);
        taxCalculation.taxCalculation(19.00);

        //------Checkout----------//
        taxCalculation.checkOutProcess();
    }

    @Test
    public void taxCalculationOfCanadaForBuytheDNATestOnlyproductOfCanada() throws Throwable {
        String age = "23";
        String gender = "male";
        String weight = "53";
        String height = "5";
        String waist = "30";
        String madication = "NA";
        String supplements = "NA";
        String allergies = "NA";
        String postcode = "T0A 0E";

        Home_Page homePage = new Home_Page();
        Products_Page productPage = new Products_Page();
        Screener_Page screenerPage = new Screener_Page();
        TaxCalculation taxCalculation = new TaxCalculation();

        homePage.navigateToHomePage();
        homePage.logIn();
        Thread.sleep(3000);
        productPage.clickOnBuyNow2Button();
        Thread.sleep(3000);
        productPage.click_BuyNowFinal();
        Thread.sleep(3000);
//        screenerPage.fillScreenerData(age, gender, weight, height, waist, madication, supplements, allergies);
//        Thread.sleep(500);
//        Screener_Page.click_SaveButton().click();
//        Thread.sleep(3000);

        //-----------Tax Calculation-------------//
        taxCalculation.clickOnEstimateShippingAndTaxLabel().click();
        Thread.sleep(500);
        taxCalculation.selectCountry("Canada");
        Thread.sleep(500);
        taxCalculation.selectState("Alberta");
        Thread.sleep(500);
        taxCalculation.fillPostCode(postcode);
        taxCalculation.clickOnGetQuotesButton().click();
        Thread.sleep(3000);
        taxCalculation.clickOnShippingChargeRadioButton();
        taxCalculation.clickOnShippingButton();
        Thread.sleep(3000);
        taxCalculation.taxCalculation(19.00);

        //------Checkout----------//
        taxCalculation.checkOutProcess();
    }

    @Test
    public void taxCalculationOfCanadaForBuyDNAPlusSubscriptionNoKitproductOfCanada() throws Throwable {
        String age = "23";
        String gender = "male";
        String weight = "53";
        String height = "5";
        String waist = "30";
        String madication = "NA";
        String supplements = "NA";
        String allergies = "NA";
        String postcode = "T0A 0E";

        Home_Page homePage = new Home_Page();
        Products_Page productPage = new Products_Page();
        Screener_Page screenerPage = new Screener_Page();
        TaxCalculation taxCalculation = new TaxCalculation();

        homePage.navigateToHomePage();
        homePage.logIn();
        Thread.sleep(3000);
        productPage.clickOnBuyNowButton();
        Products_Page.click_DownArrow();
        Products_Page.click_NoKit();
        Thread.sleep(3000);
        Products_Page.click_NoKit1();
        Thread.sleep(3000);
        Products_Page.click_Continue();
        Thread.sleep(2000);
        screenerPage.fillScreenerData(age, gender, weight, height, waist, madication, supplements, allergies);
        Thread.sleep(500);
        Screener_Page.click_SaveButton().click();
        Thread.sleep(3000);

        //-----------Tax Calculation-------------//
        taxCalculation.clickOnEstimateShippingAndTaxLabel().click();
        Thread.sleep(500);
        taxCalculation.selectCountry("Canada");
        Thread.sleep(500);
        taxCalculation.selectState("Alberta");
        Thread.sleep(500);
        taxCalculation.fillPostCode(postcode);
        taxCalculation.clickOnGetQuotesButton().click();
        Thread.sleep(3000);
        taxCalculation.clickOnShippingChargeRadioButton();
        taxCalculation.clickOnShippingButton();
        Thread.sleep(5000);
        taxCalculation.taxCalculation(0.00);
//        //------Checkout----------//
        taxCalculation.checkOutProcess();
    }

    @Test
    public void taxCalculationOfCanadaForBuyBuyDNATestOnlyNoKitproductOfCanada() throws Throwable {
        String age = "23";
        String gender = "male";
        String weight = "53";
        String height = "5";
        String waist = "30";
        String madication = "NA";
        String supplements = "NA";
        String allergies = "NA";
        String postcode = "T0A 0E";

        Home_Page homePage = new Home_Page();
        Products_Page productPage = new Products_Page();
        Screener_Page screenerPage = new Screener_Page();
        TaxCalculation taxCalculation = new TaxCalculation();

        homePage.navigateToHomePage();
        homePage.logIn();
        Thread.sleep(3000);
        productPage.clickOnBuyNow2Button();
        Products_Page.click_DownArrow1();
        Thread.sleep(3000);
        Products_Page.click_NoKit2();
        Thread.sleep(3000);
        Products_Page.click_NoKit1();
        Thread.sleep(3000);
        Products_Page.click_Continue();
        Thread.sleep(2000);
//        screenerPage.fillScreenerData(age, gender, weight, height, waist, madication, supplements, allergies);
//        Thread.sleep(500);
//        Screener_Page.click_SaveButton().click();
//        Thread.sleep(3000);

        //-----------Tax Calculation-------------//
        taxCalculation.clickOnEstimateShippingAndTaxLabel().click();
        Thread.sleep(500);
        taxCalculation.selectCountry("Canada");
        Thread.sleep(500);
        taxCalculation.selectState("Alberta");
        Thread.sleep(500);
        taxCalculation.fillPostCode(postcode);
        taxCalculation.clickOnGetQuotesButton().click();
        Thread.sleep(3000);
        taxCalculation.clickOnShippingChargeRadioButton();
        taxCalculation.clickOnShippingButton();
        Thread.sleep(5000);
        taxCalculation.taxCalculation(0.00);
        //------Checkout----------//
        taxCalculation.checkOutProcess();
    }

    @Test
    public void taxCalculationOfCanadaForBuyDNASubscriptionproductOfJapan() throws Throwable {
        String age = "23";
        String gender = "male";
        String weight = "53";
        String height = "5";
        String waist = "30";
        String madication = "NA";
        String supplements = "NA";
        String allergies = "NA";
        String postcode = "500-0000";

        Home_Page homePage = new Home_Page();
        Products_Page productPage = new Products_Page();
        Screener_Page screenerPage = new Screener_Page();
        TaxCalculation taxCalculation = new TaxCalculation();

        homePage.navigateToHomePage();
        homePage.logIn();
        Thread.sleep(3000);
        productPage.clickOnBuyNowButton();
        Thread.sleep(3000);
        productPage.click_BuyNowFinal();
        Thread.sleep(3000);
        screenerPage.fillScreenerData(age, gender, weight, height, waist, madication, supplements, allergies);
        Thread.sleep(500);
        Screener_Page.click_SaveButton().click();
        Thread.sleep(3000);

        //-----------Tax Calculation-------------//
        taxCalculation.clickOnEstimateShippingAndTaxLabel().click();
        Thread.sleep(500);
        taxCalculation.selectCountry("Japan");
        Thread.sleep(500);
        taxCalculation.selectState("Gifu");
        Thread.sleep(500);
        taxCalculation.fillPostCode(postcode);
        taxCalculation.clickOnGetQuotesButton().click();
        Thread.sleep(3000);
        taxCalculation.clickOnShippingChargeRadioButton();
        taxCalculation.clickOnShippingButton();
        Thread.sleep(3000);
        taxCalculation.taxCalculation(46.00);

        //------Checkout----------//
        taxCalculation.checkOutProcessForOutsideCountry("500-0000");
    }

    @Test
    public void taxCalculationOfCanadaForBuySubscriptionOnlyproductOfJapan() throws Throwable {
        String age = "23";
        String gender = "male";
        String weight = "53";
        String height = "5";
        String waist = "30";
        String madication = "NA";
        String supplements = "NA";
        String allergies = "NA";
        String postcode = "500-0000";

        Home_Page homePage = new Home_Page();
        Products_Page productPage = new Products_Page();
        Screener_Page screenerPage = new Screener_Page();
        TaxCalculation taxCalculation = new TaxCalculation();

        homePage.navigateToHomePage();
        homePage.logIn();
        Thread.sleep(3000);
        productPage.clickOnBuyNow1Button();
        Thread.sleep(3000);
        productPage.click_BuyNowFinal();
        Thread.sleep(3000);
        screenerPage.fillScreenerData(age, gender, weight, height, waist, madication, supplements, allergies);
        Thread.sleep(500);
        Screener_Page.click_SaveButton().click();
        Thread.sleep(3000);

        //-----------Tax Calculation-------------//
        taxCalculation.clickOnEstimateShippingAndTaxLabel().click();
        Thread.sleep(500);
        taxCalculation.selectCountry("Canada");
        Thread.sleep(500);
        taxCalculation.selectState("Alberta");
        Thread.sleep(500);
        taxCalculation.fillPostCode(postcode);
        taxCalculation.clickOnGetQuotesButton().click();
        Thread.sleep(3000);
        taxCalculation.clickOnShippingChargeRadioButton();
        taxCalculation.clickOnShippingButton();
        Thread.sleep(3000);
        taxCalculation.taxCalculation(19.00);

        //------Checkout----------//
        taxCalculation.checkOutProcess();
    }

    @Test
    public void taxCalculationOfCanadaForBuytheDNATestOnlyproductOfJapan() throws Throwable {
        String age = "23";
        String gender = "male";
        String weight = "53";
        String height = "5";
        String waist = "30";
        String madication = "NA";
        String supplements = "NA";
        String allergies = "NA";
        String postcode = "500-0000";

        Home_Page homePage = new Home_Page();
        Products_Page productPage = new Products_Page();
        Screener_Page screenerPage = new Screener_Page();
        TaxCalculation taxCalculation = new TaxCalculation();

        homePage.navigateToHomePage();
        homePage.logIn();
        Thread.sleep(3000);
        productPage.clickOnBuyNow2Button();
        Thread.sleep(3000);
        productPage.click_BuyNowFinal();
        Thread.sleep(3000);
        screenerPage.fillScreenerData(age, gender, weight, height, waist, madication, supplements, allergies);
        Thread.sleep(500);
        Screener_Page.click_SaveButton().click();
        Thread.sleep(3000);

        //-----------Tax Calculation-------------//
        taxCalculation.clickOnEstimateShippingAndTaxLabel().click();
        Thread.sleep(500);
        taxCalculation.selectCountry("Canada");
        Thread.sleep(500);
        taxCalculation.selectState("Alberta");
        Thread.sleep(500);
        taxCalculation.fillPostCode(postcode);
        taxCalculation.clickOnGetQuotesButton().click();
        Thread.sleep(3000);
        taxCalculation.clickOnShippingChargeRadioButton();
        taxCalculation.clickOnShippingButton();
        Thread.sleep(3000);
        taxCalculation.taxCalculation(19.00);

        //------Checkout----------//
        taxCalculation.checkOutProcess();
    }
    @Test
    public void taxCalculationOfCanadaForBuyDNAPlusSubscriptionNoKitproductOfJapan() throws Throwable {
        String age = "23";
        String gender = "male";
        String weight = "53";
        String height = "5";
        String waist = "30";
        String madication = "NA";
        String supplements = "NA";
        String allergies = "NA";
        String postcode = "500-0000";

        Home_Page homePage = new Home_Page();
        Products_Page productPage = new Products_Page();
        Screener_Page screenerPage = new Screener_Page();
        TaxCalculation taxCalculation = new TaxCalculation();

        homePage.navigateToHomePage();
        homePage.logIn();
        Thread.sleep(3000);
        productPage.clickOnBuyNowButton();
        Thread.sleep(5000);
        Products_Page.click_DownArrow();
        Thread.sleep(3000);
		Products_Page.click_NoKit();
		Thread.sleep(3000);
		Products_Page.click_NoKit1();
		Thread.sleep(3000);
		Products_Page.click_Continue();
        Thread.sleep(2000);
        screenerPage.fillScreenerData(age, gender, weight, height, waist, madication, supplements, allergies);
        Thread.sleep(500);
        Screener_Page.click_SaveButton().click();
        Thread.sleep(3000);

        //-----------Tax Calculation-------------//
        taxCalculation.clickOnEstimateShippingAndTaxLabel().click();
        Thread.sleep(500);
        taxCalculation.selectCountry("Japan");
        Thread.sleep(500);
        taxCalculation.selectState("Gifu");
        Thread.sleep(500);
        taxCalculation.fillPostCode(postcode);
        taxCalculation.clickOnGetQuotesButton().click();
        Thread.sleep(3000);
        taxCalculation.clickOnShippingChargeRadioButton();
        taxCalculation.clickOnShippingButton();
        Thread.sleep(3000);
        taxCalculation.taxCalculation(0.00);
//        //------Checkout----------//
        taxCalculation.checkOutProcess();
    }

// In Progress
//	//----------------Tax calculation for USA-------------------//
//	
//	@Given("^Products Page USA$")
//	public void products_Page_For_USA() throws Throwable {
//		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//		Home_Page.click_ProductTab(driver).click();
//	    Thread.sleep(500);
//
//	}
//
//	@When("^Select DNA plus Subscription USA$")
//	public void select_DNA_plus_Subscription_For_USA() throws Throwable {
//		Actions actions = new Actions(driver);
//		actions.moveToElement(Products_Page.clickOnBuyNowButton(driver));
//		actions.perform();
//		Products_Page.clickOnBuyNowButton(driver).click();
//		Thread.sleep(500);
//		Products_Page.click_BuyNowFinal(driver).click();
//
//		//Screener Page
//		Thread.sleep(500);
//		Screener_Page.enter_Age(driver).sendKeys("25");
//		Screener_Page.enter_Gender(driver).sendKeys("m");
//		Screener_Page.enter_Weight(driver).sendKeys("55");
//		Screener_Page.enter_Height(driver).sendKeys("5.5");
//		Screener_Page.enter_Waist(driver).sendKeys("22");
//		Screener_Page.enter_Medication(driver).sendKeys("NA");
//		Screener_Page.enter_Supplements(driver).sendKeys("NA");
//		actions.moveToElement(Screener_Page.enter_Allergies(driver));
//		actions.perform();
//		Screener_Page.enter_Allergies(driver).sendKeys("NA");
//		Thread.sleep(500);
//		Screener_Page.click_SaveButton(driver).click();
//		Thread.sleep(500);
//		
//	}
//	
//	@Then("^Tax Calculation for USA and Checkout$")
//	public void tax_Calculation_For_USA_And_Checkout() throws Throwable{
//		
//		double expactedShippingCharge = 0;
//		String creditCardNumber = "4111111111111111112122050";
//		TaxCalculation.clickOnEstimateShippingAndTaxLabel(driver).click();
//		Thread.sleep(500);
//		TaxCalculation.selectCountry(driver, "United States");
//		Thread.sleep(500);
//		TaxCalculation.selectState(driver, "New Jersey");
//		Thread.sleep(500);
//		TaxCalculation.clickOnGetQuotesButton(driver).click();
//		TaxCalculation.clcikOnShippingChargeRadioButton(driver).click();
//		TaxCalculation.clcikOnShippingButton(driver).click();
//		Thread.sleep(10000);
//		double taxValue = 0;
//		double productValue =TaxCalculation.getProductValue(driver);
//		double totalTaxOnProduct = productValue * taxValue / 100;
//		double actualShippingCharge = TaxCalculation.getShippingCharge(driver);
//		double totalProductVlaue = productValue + totalTaxOnProduct + expactedShippingCharge;
//		
//		Assert.assertEquals(expactedShippingCharge,actualShippingCharge , 00);
//		Assert.assertEquals(TaxCalculation.getTotalTaxValue(driver),totalTaxOnProduct , 00);
//		Assert.assertEquals(TaxCalculation.getTotalProductValue(driver),totalProductVlaue , 00);
//		Estimate_Page.clickOnCheckoutButton(driver).click();
//		Thread.sleep(2000);
//		
//		//------Checkout page----------//
//		double productValueInCheckOutPage = TaxCalculation.getProductValueInCheckOutPage(driver);
//		double totalTaxOnProductInCheckOutPage = TaxCalculation.getTotalTaxValueInCheckOutPage(driver);
//		double shippingChargeInCheckOutPage = TaxCalculation.getShippingChargeInCheckOutPage(driver);
//		double totalProductValueInCheckOutPage = TaxCalculation.getTotalProductValueInCheckPutPage(driver);
//		System.out.println(productValue + " " + totalTaxOnProduct + " " +actualShippingCharge + " " +totalProductVlaue);
//		System.out.println(productValueInCheckOutPage + " " +totalTaxOnProductInCheckOutPage + " " +shippingChargeInCheckOutPage +" " + totalProductValueInCheckOutPage);
//		Assert.assertEquals(productValueInCheckOutPage,productValue , 00);
//		Assert.assertEquals(totalTaxOnProductInCheckOutPage,totalTaxOnProduct , 00);
//		Assert.assertEquals(shippingChargeInCheckOutPage,actualShippingCharge , 00);
//		Assert.assertEquals(totalProductValueInCheckOutPage,totalProductValueInCheckOutPage , 00);
//		Checkout_Page.clickOnPayForMyOrderButton(driver).click();
//		double totalCardValue = Double.parseDouble(TaxCalculation.getTotalCardValueInCheckPutPage(driver));
//		System.out.println(totalCardValue);
//		Assert.assertEquals(totalCardValue,totalProductValueInCheckOutPage , 00);
//		Thread.sleep(500);
//	
//		//---------Credit card details------------//
//		Actions actions = new Actions(driver); 
//		Checkout_Page.enter_CardDetails(driver).click();
//		Checkout_Page.enter_CardDetails(driver).sendKeys(creditCardNumber);
//		actions.moveToElement(Checkout_Page.confirm_Order(driver));
//		actions.perform();
//		Checkout_Page.confirm_Order(driver).click();
//		driver.quit();		
//	}	
//	
//	@Given("^Products Page displayed(USA)$")
//	public void products_Page_displayed_FOR_USA() throws Throwable {
//
//		Home_Page.click_ProductTab(driver).click();
//	    Thread.sleep(500);
//
//	}
//
//	@When("^Select Subscription only(USA)$")
//	public void select_Subscription_Only_For_USA() throws Throwable {
//
//		Actions actions = new Actions(driver);
//		actions.moveToElement(Products_Page.clickOnBuyNow1Button(driver));
//		actions.perform();
//		Products_Page.clickOnBuyNow1Button(driver).click();
//		Thread.sleep(500);
//		Products_Page.click_BuyNowFinal(driver).click();
//
//		//Screener Page
//		Screener_Page.enter_Age(driver).sendKeys("25");
//		Screener_Page.enter_Gender(driver).sendKeys("m");
//		Screener_Page.enter_Weight(driver).sendKeys("55");
//		Screener_Page.enter_Height(driver).sendKeys("5.5");
//		Screener_Page.enter_Waist(driver).sendKeys("22");
//		Screener_Page.enter_Medication(driver).sendKeys("NA");
//		Screener_Page.enter_Supplements(driver).sendKeys("NA");
//		actions.moveToElement(Screener_Page.enter_Allergies(driver));
//		actions.perform();
//		Screener_Page.enter_Allergies(driver).sendKeys("NA");
//		Thread.sleep(500);
//		Screener_Page.click_SaveButton(driver).click();
//		Thread.sleep(500);
//
//	}
//
//	@Then("^Tax Calculation for USA and Checkout for it$")
//	public void tax_Calculation_For_USA_And_Checkout_For_It() throws Throwable {
//		//--------Tax calculation---------------//
//		double expactedShippingCharge = 40;
//		TaxCalculation.clickOnEstimateShippingAndTaxLabel(driver).click();
//		Thread.sleep(500);
//		TaxCalculation.selectCountry(driver, "Canada");
//		Thread.sleep(500);
//		TaxCalculation.selectState(driver, "Manitoba");
//		Thread.sleep(500);
//		TaxCalculation.clickOnGetQuotesButton(driver).click();
//		TaxCalculation.clcikOnShippingChargeRadioButton(driver).click();
//		TaxCalculation.clcikOnShippingButton(driver).click();
//		Thread.sleep(500);
//		double taxValue = CanadaStatesEnum.Manitoba.calculateTax();
//		double productValue =TaxCalculation.getProductValue(driver);
//		double totalTaxOnProduct = productValue * taxValue / 100;
//		double actualShippingCharge = TaxCalculation.getShippingCharge(driver);
//		double totalProductVlaue = productValue + totalTaxOnProduct + expactedShippingCharge;
//		Assert.assertEquals(expactedShippingCharge,actualShippingCharge , 00);
//		Assert.assertEquals(TaxCalculation.getTotalTaxValue(driver),totalTaxOnProduct , 00);
//		Assert.assertEquals(TaxCalculation.getTotalProductValue(driver),totalProductVlaue , 00);
//		
//		//------Checkout page----------//
//		double productValueInCheckOutPage = TaxCalculation.getProductValueInCheckOutPage(driver);
//		double totalTaxOnProductInCheckOutPage = TaxCalculation.getTotalTaxValueInCheckOutPage(driver);
//		double shippingChargeInCheckOutPage = TaxCalculation.getShippingChargeInCheckOutPage(driver);
//		double totalProductValueInCheckOutPage = TaxCalculation.getTotalProductValueInCheckPutPage(driver);
//		System.out.println(productValueInCheckOutPage);
//		System.out.println(totalTaxOnProductInCheckOutPage);
//		System.out.println(shippingChargeInCheckOutPage);
//		System.out.println(totalProductValueInCheckOutPage);
//		Assert.assertEquals(productValueInCheckOutPage,productValue , 00);
//		Assert.assertEquals(totalTaxOnProductInCheckOutPage,totalTaxOnProduct , 00);
//		Assert.assertEquals(shippingChargeInCheckOutPage,actualShippingCharge , 00);
//		Assert.assertEquals(totalProductValueInCheckOutPage,totalProductValueInCheckOutPage , 00);
//		Checkout_Page.clickOnPayForMyOrderButton(driver).click();
//		String totalCardValue = TaxCalculation.getTotalCardValueInCheckPutPage(driver);
//		System.out.println(totalCardValue);
//	
//	}
//	
//	@Given("^Products Page should be displayed(USA)$")
//	public void products_Page_Displayed_For_USA() throws Throwable {
//
//		Home_Page.click_ProductTab(driver).click();
//	    Thread.sleep(500);
//
//	}
//
//	@When("^Select DNA test only(USA)$")
//	public void select_DNA_Test_Only_For_USA() throws Throwable {
//
//		Actions actions = new Actions(driver);
//		new WebDriverWait(driver, 10000);
//		actions.moveToElement(Products_Page.clickOnBuyNow2Button(driver));
//		new WebDriverWait(driver, 10000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		actions.perform();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		new WebDriverWait(driver, 10000);
//		Products_Page.clickOnBuyNow2Button(driver).click();
//		Thread.sleep(1000);
//		new WebDriverWait(driver, 10000);
//		Products_Page.click_BuyNowFinal(driver).click();
//
//	}
//
//	@Then("^Tax Calculation for USA and Pay for it$")
//	public void tax_Calculation_For_USA_And_Pay_For_It() throws Throwable {
//		new WebDriverWait(driver, 150000);
//		Thread.sleep(10000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Actions actions = new Actions(driver);
//		Thread.sleep(10000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		actions.moveToElement(Checkout_Page.total_Checkout(driver)).perform();
//		String total = Checkout_Page.total_Checkout(driver).getText();
//		System.out.println(total);
//		actions.moveToElement(Checkout_Page.clickOnPayForMyOrderButton(driver));
//		new WebDriverWait(driver, 10000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		actions.perform();
//		new WebDriverWait(driver, 10000);
//		Checkout_Page.clickOnPayForMyOrderButton(driver).click();
//		new WebDriverWait(driver, 10000);
//
//		System.out.println("1");
//		new WebDriverWait(driver, 10000).until(ExpectedConditions.visibilityOf(Checkout_Page.enter_CardDetails(driver)));
//		System.out.println("2");
//		actions.moveToElement(Checkout_Page.enter_CardDetails(driver)).click();
//	   System.out.println("3");
//		actions.moveToElement(Checkout_Page.enter_CardDetails(driver));
//		new WebDriverWait(driver, 5000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		actions.perform();
//		String cardTotal = Checkout_Page.total_PayByCard(driver).getText();
//		System.out.println(cardTotal);
//		Assert.assertThat("The card total does not matches cart total",cardTotal,containsString(total));
//		new WebDriverWait(driver, 5000);
//		Checkout_Page.enter_CardDetails(driver).click();
//		Thread.sleep(10000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		//Checkout_Page.enter_CardDetails(driver).clear();
//		Checkout_Page.enter_CardDetails(driver).sendKeys("41111111111111111238900");
//		//Checkout_Page.enter_MonthYear(driver).sendKeys("1238");
//		//Checkout_Page.enter_CVV(driver).sendKeys("900");
//		Thread.sleep(10000);
//		actions.moveToElement(Checkout_Page.confirm_Order(driver));
//		new WebDriverWait(driver, 5000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		actions.perform();
//		Checkout_Page.confirm_Order(driver).click();
//
//		Thread.sleep(15000);
//		String expected = "Your order has been placed!";
//		String actual = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
//		System.out.println(actual);
//		Assert.assertEquals("Successful Transaction", expected, actual);
//
//	}


//   @Test
//    public void products_Page_displayed() throws Throwable {
//
//        Home_Page.click_ProductTab(driver).click();
//        Thread.sleep(500);
//
//    }
//
//    @Test
//    public void select_Subscription_only() throws Throwable {
//
//
//        Actions actions = new Actions(driver);
//        actions.moveToElement(Products_Page.clickOnBuyNow1Button(driver));
//        actions.perform();
//        Products_Page.clickOnBuyNow1Button(driver).click();
//        Thread.sleep(500);
//        Products_Page.click_BuyNowFinal(driver).click();
//
//        //Screener Page
//        Screener_Page.enter_Age(driver).sendKeys("25");
//        Screener_Page.enter_Gender(driver).sendKeys("m");
//        Screener_Page.enter_Weight(driver).sendKeys("55");
//        Screener_Page.enter_Height(driver).sendKeys("5.5");
//        Screener_Page.enter_Waist(driver).sendKeys("22");
//        Screener_Page.enter_Medication(driver).sendKeys("NA");
//        Screener_Page.enter_Supplements(driver).sendKeys("NA");
//        actions.moveToElement(Screener_Page.enter_Allergies(driver));
//        actions.perform();
//        Screener_Page.enter_Allergies(driver).sendKeys("NA");
//        Thread.sleep(500);
//        Screener_Page.click_SaveButton(driver).click();
//
//    }
//
//    @Test
//    public void tax_Calculation_For_Canada_And_Checkout_For_It() throws Throwable {
//        double expactedShippingCharge = 0;
//        String creditCardNumber = "4111111111111111112122050";
//        TaxCalculation.clickOnEstimateShippingAndTaxLabel(driver).click();
//        Thread.sleep(500);
//        TaxCalculation.selectCountry(driver, "Canada");
//        Thread.sleep(500);
//        TaxCalculation.selectState(driver, "Yukon Territory");
//        Thread.sleep(500);
//        TaxCalculation.clickOnGetQuotesButton(driver).click();
//        TaxCalculation.clcikOnShippingChargeRadioButton(driver).click();
//        TaxCalculation.clcikOnShippingButton(driver).click();
//        Thread.sleep(10000);
//        double taxValue = CanadaStatesEnum.YukonTerritory.calculateTax();
//        double productValue = TaxCalculation.getProductValue(driver);
//        double totalTaxOnProduct = productValue * taxValue / 100;
//        double actualShippingCharge = TaxCalculation.getShippingCharge(driver);
//        double totalProductVlaue = productValue + totalTaxOnProduct + expactedShippingCharge;
//
//        Assert.assertEquals(expactedShippingCharge, actualShippingCharge, 00);
//        Assert.assertEquals(TaxCalculation.getTotalTaxValue(driver), totalTaxOnProduct, 00);
//        Assert.assertEquals(TaxCalculation.getTotalProductValue(driver), totalProductVlaue, 00);
//        Estimate_Page.clickOnCheckoutButton(driver).click();
//        Thread.sleep(2000);
//
//        //------Checkout page----------//
//        double productValueInCheckOutPage = TaxCalculation.getProductValueInCheckOutPage(driver);
//        double totalTaxOnProductInCheckOutPage = TaxCalculation.getTotalTaxValueInCheckOutPage(driver);
//        double shippingChargeInCheckOutPage = TaxCalculation.getShippingChargeInCheckOutPage(driver);
//        double totalProductValueInCheckOutPage = TaxCalculation.getTotalProductValueInCheckPutPage(driver);
//        System.out.println(productValue + " " + totalTaxOnProduct + " " + actualShippingCharge + " " + totalProductVlaue);
//        System.out.println(productValueInCheckOutPage + " " + totalTaxOnProductInCheckOutPage + " " + shippingChargeInCheckOutPage + " " + totalProductValueInCheckOutPage);
//        Assert.assertEquals(productValueInCheckOutPage, productValue, 00);
//        Assert.assertEquals(totalTaxOnProductInCheckOutPage, totalTaxOnProduct, 00);
//        Assert.assertEquals(shippingChargeInCheckOutPage, actualShippingCharge, 00);
//        Assert.assertEquals(totalProductValueInCheckOutPage, totalProductValueInCheckOutPage, 00);
//        Checkout_Page.clickOnPayForMyOrderButton(driver).click();
//        double totalCardValue = Double.parseDouble(TaxCalculation.getTotalCardValueInCheckPutPage(driver));
//        System.out.println(totalCardValue);
//        Assert.assertEquals(totalCardValue, totalProductValueInCheckOutPage, 00);
//        Thread.sleep(500);
//
//        //---------Credit card details------------//
//        Actions actions = new Actions(driver);
//        Checkout_Page.enter_CardDetails(driver).click();
//        Checkout_Page.enter_CardDetails(driver).sendKeys(creditCardNumber);
//        actions.moveToElement(Checkout_Page.confirm_Order(driver));
//        actions.perform();
//        Checkout_Page.confirm_Order(driver).click();
//        driver.quit();
//
//        Thread.sleep(15000);
//        String expected = "Your order has been placed!";
//        String actual = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
//        System.out.println(actual);
//        Assert.assertEquals("Successful Transaction", expected, actual);
//
//    }
//	
//	@Given("^Products Page should be displayed$")
//	public void products_Page_should_be_displayed() throws Throwable {
//
//		Home_Page.click_ProductTab(driver).click();
//	    Thread.sleep(500);
//
//	}
//
//	@When("^Select DNA test only$")
//	public void select_DNA_test_only() throws Throwable {
//
//		Actions actions = new Actions(driver);
//		new WebDriverWait(driver, 10000);
//		actions.moveToElement(Products_Page.clickOnBuyNow2Button(driver));
//		new WebDriverWait(driver, 10000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		actions.perform();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		new WebDriverWait(driver, 10000);
//		Products_Page.clickOnBuyNow2Button(driver).click();
//		Thread.sleep(1000);
//		new WebDriverWait(driver, 10000);
//		Products_Page.click_BuyNowFinal(driver).click();
//	}
//
//	@Then("^Tax Calculation for Canada and Pay for it$")
//	public void tax_Calculation_For_Canada_And_Pay_For_It() throws Throwable {
//		double expactedShippingCharge = 0;
//		String creditCardNumber = "4111111111111111112122050";
//		TaxCalculation.clickOnEstimateShippingAndTaxLabel(driver).click();
//		Thread.sleep(500);
//		TaxCalculation.selectCountry(driver, "Canada");
//		Thread.sleep(500);
//		TaxCalculation.selectState(driver, "Yukon Territory");
//		Thread.sleep(500);
//		TaxCalculation.clickOnGetQuotesButton(driver).click();
//		TaxCalculation.clcikOnShippingChargeRadioButton(driver).click();
//		TaxCalculation.clcikOnShippingButton(driver).click();
//		Thread.sleep(10000);
//		double taxValue = CanadaStatesEnum.YukonTerritory.calculateTax();
//		double productValue =TaxCalculation.getProductValue(driver);
//		double totalTaxOnProduct = productValue * taxValue / 100;
//		double actualShippingCharge = TaxCalculation.getShippingCharge(driver);
//		double totalProductVlaue = productValue + totalTaxOnProduct + expactedShippingCharge;
//		
//		Assert.assertEquals(expactedShippingCharge,actualShippingCharge , 00);
//		Assert.assertEquals(TaxCalculation.getTotalTaxValue(driver),totalTaxOnProduct , 00);
//		Assert.assertEquals(TaxCalculation.getTotalProductValue(driver),totalProductVlaue , 00);
//		Estimate_Page.clickOnCheckoutButton(driver).click();
//		Thread.sleep(2000);
//		
//		//------Checkout page----------//
//		double productValueInCheckOutPage = TaxCalculation.getProductValueInCheckOutPage(driver);
//		double totalTaxOnProductInCheckOutPage = TaxCalculation.getTotalTaxValueInCheckOutPage(driver);
//		double shippingChargeInCheckOutPage = TaxCalculation.getShippingChargeInCheckOutPage(driver);
//		double totalProductValueInCheckOutPage = TaxCalculation.getTotalProductValueInCheckPutPage(driver);
//		System.out.println(productValue + " " + totalTaxOnProduct + " " +actualShippingCharge + " " +totalProductVlaue);
//		System.out.println(productValueInCheckOutPage + " " +totalTaxOnProductInCheckOutPage + " " +shippingChargeInCheckOutPage +" " + totalProductValueInCheckOutPage);
//		Assert.assertEquals(productValueInCheckOutPage,productValue , 00);
//		Assert.assertEquals(totalTaxOnProductInCheckOutPage,totalTaxOnProduct , 00);
//		Assert.assertEquals(shippingChargeInCheckOutPage,actualShippingCharge , 00);
//		Assert.assertEquals(totalProductValueInCheckOutPage,totalProductValueInCheckOutPage , 00);
//		Checkout_Page.clickOnPayForMyOrderButton(driver).click();
//		double totalCardValue = Double.parseDouble(TaxCalculation.getTotalCardValueInCheckPutPage(driver));
//		System.out.println(totalCardValue);
//		Assert.assertEquals(totalCardValue,totalProductValueInCheckOutPage , 00);
//		Thread.sleep(500);
//	
//		//---------Credit card details------------//
//		Actions actions = new Actions(driver); 
//		Checkout_Page.enter_CardDetails(driver).click();
//		Checkout_Page.enter_CardDetails(driver).sendKeys(creditCardNumber);
//		actions.moveToElement(Checkout_Page.confirm_Order(driver));
//		actions.perform();
//		Checkout_Page.confirm_Order(driver).click();
//		driver.quit();
//
////		Thread.sleep(15000);
////		String expected = "Your order has been placed!";
////		String actual = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
////		System.out.println(actual);
////		Assert.assertEquals("Successful Transaction", expected, actual);
//
//	}


}