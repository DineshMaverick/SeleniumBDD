package com.cucumber.test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.extentreport.ExtentReportsClass;
import com.pom.CreditcardPage;
import com.pom.EbayController;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Creditcards_llyods {

	
	WebDriver driver;
	 ExtentReports extent;
	 ExtentTest test;
	 ExtentHtmlReporter htmlReporter;
	
	  @Given("Credit card eligibility validation")
	    public void credit_card_eligibility_validation() {
			
			try {
				
			
				
				 htmlReporter = new ExtentHtmlReporter("./ExtentReport/test-output.html");
				    
			        extent = new ExtentReports();
			        extent.attachReporter(htmlReporter);

			        test = extent.createTest("Create Control Data", "Create Control Data");
			        test.log(Status.PASS, "Step 1 PASS");

			        test.fail("details Failed", MediaEntityBuilder.createScreenCaptureFromPath("C:\\SampleBDD\\fail.PNG").build());
			        
				System.out.println("Chrome Browser Environmnet Created");
				System.out.println("________________________________________");
				Path currentRelativePath = Paths.get("");
				
				System.setProperty("webdriver.chrome.driver","C://Users//dg375835//Documents//Hybrid-Selenium-Cucumber-BDD-master//Hybrid-Selenium-Cucumber-BDD-master//DriverEXE//chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");
				options.addArguments("--disable-web-security");
				options.addArguments("--no-proxy-server");

				Map<String, Object> pref = new HashMap<String, Object>();
				pref.put("credentials_enable_service", false);
				pref.put("profile.password_manager_enabled", false);
				pref.put("profile.default_content_setting_values.notifications", 2);
				options.setExperimentalOption("prefs", pref);
				
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https://www.lloydsbank.com/");
			
			} catch (Exception e) {
				
				
			}
	    }

	  @Given("I am logged in to the Lloyds banking application")
	  public void iAmLoggedInToTheLloydsBankingApplication() 
	    {
	       
	        //Navigate to Product and Services Section
	    	 WebDriverWait wait = new WebDriverWait(driver, 10);
	         wait.until(ExpectedConditions.elementToBeClickable(CreditcardPage.option_creditcard));
	         driver.findElement(CreditcardPage.option_creditcard).click();
	    }




@When("^I navigate to the Products and Services section$")
public void i_navigate_to_the_Products_and_Services_section() throws Throwable {
	        // Implement navigation to Products and Services section
	    	  WebDriverWait wait = new WebDriverWait(driver, 10);
	          wait.until(ExpectedConditions.elementToBeClickable(CreditcardPage.option_allcreditcards ));
	          driver.findElement(CreditcardPage.option_allcreditcards ).click();
	    }


        @And("I navigate to the credit card screen")
        public void iNavigateToTheCreditCardScreen() {
        // Write code to navigate to the credit card screen
        	  WebDriverWait wait = new WebDriverWait(driver, 10);
	          wait.until(ExpectedConditions.elementToBeClickable(CreditcardPage.option_allcreditcards));
	          driver.findElement(CreditcardPage.btn_checkeligibility).click();
         }
        
        @And("I click the \"Check your eligibility\" button")
        public void iClickTheCheckYourEligibilityButton() {
            // Write code to click on the "Check your eligibility" button
        	  WebDriverWait wait = new WebDriverWait(driver, 10);
	          wait.until(ExpectedConditions.elementToBeClickable(CreditcardPage.option_allcreditcards));
	          driver.findElement(CreditcardPage.btn_check).click();
        }

        @Then("I will enter fields Title \"([^\"]*)\", FirstName \"([^\"]*)\", MiddleName \"([^\"]*)\", LastName \"([^\"]*)\", Gender \"([^\"]*)\", MaritalStatus \"([^\"]*)\" in the credit card eligibility screen")
        public void i_will_enter_fields_in_the_credit_card_eligibility_screen(
                String title, String firstName, String middleName,
	    String Title, String FirstName, String MiddleName,
	    String LastName, String Gender, String MaritalStatus) {
	    WebDriverWait wait = new WebDriverWait(driver, 10);

	    // Clicking elements with explicit wait
	    driver.findElement(CreditcardPage.titleMrRadio).click();
	    driver.findElement(CreditcardPage.firstNameInput).sendKeys(FirstName);
	    driver.findElement(CreditcardPage.middleNameInput).sendKeys(MiddleName);
	    driver.findElement(CreditcardPage.lastNameInput).sendKeys(LastName);
	    driver.findElement(CreditcardPage.genderMaleRadio).click();
	    driver.findElement(CreditcardPage.maritalStatusSingleRadio).click();
	    driver.findElement(CreditcardPage.isBritishYesRadio).click();
	    }
}

	
	
	
	
	
	
	

