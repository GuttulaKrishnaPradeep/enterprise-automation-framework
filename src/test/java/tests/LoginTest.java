package tests;

import base.BaseTest;
import driver.DriverFactory;
import pages.LoginPage;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

@Test
public void loginTest(){

DriverFactory.getDriver()
.get("https://www.facebook.com/");

LoginPage login = new LoginPage();
login.login("Admin","admin123");

}
}
