package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditcardPage {

	public static By option_creditcard  = By.xpath("[href='/products-and-services.html'][data-tealium-event='Internal Click']");

	public static By option_allcreditcards = By.xpath("a[data-tealium-narrative='See all our credit cards'][data-tealium-event='Internal Click']");

	public static By btn_checkeligibility = By.xpath("a[data-tealium-narrative='Check your eligibility'][data-tealium-event='Internal Click']");
	
	public static By btn_check = By.cssSelector("a[data-selector='cta-item-primary']");
	
	public static By titleMrRadio = By.id("title-Mr");
	
	public static By titleMrsRadio = By.id("title-Mrs");
	
	public static By titleMissRadio = By.id("title-Miss");
	
	public static By firstNameInput = By.name("firstName");
	
	public static By middleNameInput = By.name("middleName");
	
	public static By lastNameInput = By.name("lastName");
	
	public static By dobDateInput = By.name("dobDate");
	
	public static By dobMonthInput = By.name("dobMonths");
	
	public static By dobYearInput = By.name("dobYears");
	
	public static By genderMaleRadio = By.id("gender-Male");
	
	public static By genderFemaleRadio = By.id("gender-Female");
	
	public static By genderOtherRadio = By.id("gender-Other");
	
	public static By maritalStatusSingleRadio = By.id("maritalStatus-Single");
	
	public static By maritalStatusMarriedRadio = By.id("maritalStatus-Married");
	
	public static By maritalStatusDivorcedRadio = By.id("maritalStatus-Divorced");
	
	public static By isBritishYesRadio = By.id("isBritish-Yes");
	
	public static By isBritishNoRadio = By.id("isBritish-No");
	
	public static By continueButton = By.xpath("//button[contains(text(),'Continue')]");

	public static By btn_checknow  = By.xpath("//a[contains(@title, 'Check your eligibility')]");
	
	public static By gpa_SalesOrganization = By.xpath("//tbody//tr[1]//td[1]/p-celleditor/input");

	public static By gpa_SalesOrganizationtextClick = By.xpath("//tbody//tr[1]//td[10]");
	
	public static By gpa_SalesOrganizationtext = By.xpath("//tbody//tr[1]//td[10]//p-celleditor//input");

	public static By gpa_SalesOrganizationDescClick = By.xpath("//tbody//tr[1]//td[2]");
	
	public static By gpa_SalesOrganizationDesc = By.xpath("//tbody//tr[1]//td[2]//p-celleditor//input");

	//public static By gpa_SalesOrganizationDesctext = By.xpath("//*[@id='pr_id_5-table']/tbody/tr[1]/td[2]/p-celleditor/input");

	public static By gpa_StartDateClick = By.xpath("//tbody//tr[1]//td[4]");
	
	public static By gpa_StartDate = By.xpath("//tbody//tr[1]//td[4]");

	public static By gpa_StartDatetext = By.xpath("//*[@id='dateDebuteffectiveStartDate']/span/input[@type='text']");

	public static By gpa_StartDate_Month = By.xpath(" /html/body/div/div/div/div[1]/div/select[1]");

	public static By gpa_selectMonth = By.xpath("//option[text()='June']");

	public static By gpa_StartDate_Year = By.xpath("//html/body/div/div/div/div[1]/div/select[2]");

	public static By gpa_selectYear = By.xpath("//option[@value='2022']");

	public static By gpa_selectDate = By.xpath("//html/body/div/div/div/div[2]/table/tbody/tr[1]/td[4]/span");

	public static By gpa_Buffer = By.xpath("//html/body/app-root/div[2]/div[2]/div/app-control-data/div[2]/div[2]/div");

	public static By gpa_EndDate = By.xpath("//tbody//tr[1]//td[5]");

	public static By gpa_EndDatetext = By.xpath("//*[@id='dateDebuteffectiveEndDate']/span/input");

	public static By gpa_EndDate_Month = By.xpath("//html/body/div/div/div/div[1]/div/select[1]");

	public static By gpa_selectEndMonth = By.xpath("//option[text()='July']");

	public static By gpa_EndDate_Year = By.xpath("//html/body/div/div/div/div[1]/div/select[2]");

	public static By gpa_selectEndYear = By.xpath("//option[@value='2024']");

	public static By gpa_selectEndDate = By.xpath("//html/body/div/div/div/div[2]/table/tbody/tr[1]/td[2]");

	public static By gpa_Comments = By.xpath("(//td[@class='p-element p-editable-column ng-star-inserted'])[9]");

	public static By gpa_Commentstext = By.xpath("//*[@id='pr_id_5-table']/tbody/tr[1]/td[10]/p-celleditor/input");

	public static By gpa_ClickSave = By.xpath("//button[@label='Save']");
	
	public static By mainPhoneNoInput = By.xpath("//input[@name='mainPhoneNoNumber']");
	
	public static By otherPhoneNoInput = By.xpath("//input[@name='otherPhoneNo-number']");
	
	public static By emailAddressInput = By.xpath("//input[@name='emailAddress']");
	
	public static By confirmEmailAddressInput = By.xpath("//input[@name='confirmEmailAddress']");
	
	public static By findAddressButton = By.xpath("//button[@name='find-address']");
	
	public static By enterAddressYourselfLink = By.xpath("//a[@data-cy='manualAddressLink-currentAddress']");
	
	public static By britishForcesPostOfficeLink = By.xpath("//a[@data-selector='bfpo-link']");
	
	public static By continueToStep3Button = By.xpath("//button[contains(text(),'Continue to step 3 of 4')]");
	
	public static By cancelButton = By.xpath("//button[contains(text(),'Cancel')]");
	
	public static By previousButton = By.xpath("//button[contains(text(),'Previous')]");
	
	public static By helpPanelNeedHelpLink = By.xpath("//a[@data-accordion-name='NEED HELP?']");
	
	public static By helpPanelFAQLink = By.xpath("//a[@data-accordion-name='FAQ']");


}
