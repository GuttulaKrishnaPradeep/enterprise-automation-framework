package tests;

import base.BaseTest;
import driver.DriverFactory;
import pages.LoginPage;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	
	By username = By.name("username");
	By password = By.name("password");
	By submit = By.id("submit");
	By pagetitle = By.className("post-title");
	By logout = By.xpath("//a[text()='Log out']");
	By LoginHomePage = By.xpath("//a[text()='Test login']");

@Test(groups = {"Login", "Smoke"})
public void loginTest(){
	
	DriverFactory.getDriver().get("https://practicetestautomation.com/practice-test-login/");
	DriverFactory.getDriver().findElement(username).sendKeys("student");
	DriverFactory.getDriver().findElement(password).sendKeys("Password123");
	DriverFactory.getDriver().findElement(submit).click();
	String str = DriverFactory.getDriver().findElement(pagetitle).getText();
	
	Assert.assertEquals(str, "Logged In Successfully");
}

@Test(groups = {"logout", "regression"})
public void loginOut(){
	
	DriverFactory.getDriver().get("https://practicetestautomation.com/practice-test-login/");
	DriverFactory.getDriver().findElement(username).sendKeys("student");
	DriverFactory.getDriver().findElement(password).sendKeys("Password123");
	DriverFactory.getDriver().findElement(submit).click();
	String str = DriverFactory.getDriver().findElement(pagetitle).getText();
	Assert.assertEquals(str, "Logged In Successfully");
	DriverFactory.getDriver().findElement(logout).click();
	String str1 = DriverFactory.getDriver().findElement(LoginHomePage).getText();
	
	Assert.assertEquals(str1, "Test login");
	
	
}



}
