package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ControlDataPage {

	public static By gpa_DataMenu = By.xpath("//a[@role='menuitem']//span[text()='Data']");

	public static By gpa_ControlData = By.xpath("//a[@role='menuitem']//span[text()='Control Data']");

	public static By gpa_NewButton = By.xpath("//button[@label='New']");

	public static By gpa_SalesOrganization = By
			.xpath("(//td[@class='p-element p-editable-column ng-star-inserted'])[1]");

	public static By gpa_SalesOrganizationtext = By
			.xpath("//*[@id=\\\"pr_id_5-table\\\"]/tbody/tr[1]/td[1]/p-celleditor/input");

	public static By gpa_SalesOrganizationDesc = By
			.xpath("(//td[@class='p-element p-editable-column ng-star-inserted'])[1]");

	public static By gpa_SalesOrganizationDesctext = By
			.xpath("//*[@id=\\\"pr_id_5-table\\\"]/tbody/tr[1]/td[2]/p-celleditor/input");

	public static By gpa_StartDate = By.xpath("(//td[@class='p-element p-editable-column ng-star-inserted'])[3]");

	public static By gpa_StartDatetext = By.xpath("//*[@id='dateDebuteffectiveStartDate']/span/input[@type='text']");

	public static By gpa_StartDate_Month = By.xpath(" /html/body/div/div/div/div[1]/div/select[1]");

	public static By gpa_selectMonth = By.xpath("//option[text()='June']");

	public static By gpa_StartDate_Year = By.xpath("//html/body/div/div/div/div[1]/div/select[2]");

	public static By gpa_selectYear = By.xpath("//option[@value='2022']");

	public static By gpa_selectDate = By.xpath("//html/body/div/div/div/div[2]/table/tbody/tr[1]/td[4]/span");

	public static By gpa_Buffer = By.xpath("//html/body/app-root/div[2]/div[2]/div/app-control-data/div[2]/div[2]/div");

	public static By gpa_EndDate = By.xpath("(//td[@class='p-element p-editable-column ng-star-inserted'])[4]");

	public static By gpa_EndDatetext = By.xpath("//*[@id=\\\"dateDebuteffectiveEndDate\\\"]/span/input");

	public static By gpa_EndDate_Month = By.xpath("//html/body/div/div/div/div[1]/div/select[1]");

	public static By gpa_selectEndMonth = By.xpath("//option[text()='July']");

	public static By gpa_EndDate_Year = By.xpath("//html/body/div/div/div/div[1]/div/select[2]");

	public static By gpa_selectEndYear = By.xpath("//option[@value='2024']");

	public static By gpa_selectEndDate = By.xpath("//html/body/div/div/div/div[2]/table/tbody/tr[1]/td[2]");

	public static By gpa_Comments = By.xpath("(//td[@class='p-element p-editable-column ng-star-inserted'])[9]");

	public static By gpa_Commentstext = By
			.xpath("//*[@id=\\\"pr_id_5-table\\\"]/tbody/tr[1]/td[10]/p-celleditor/input");

	public static By gpa_ClickSave = By.xpath("//button[@label='Save']");

}
