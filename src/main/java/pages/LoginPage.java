package pages;

import org.openqa.selenium.By;
import driver.DriverFactory;

public class LoginPage {

By username = By.name("email");
By password = By.name("pass");
By loginBtn = By.xpath("//span[text()='Log in']");

public void login(String user,String pass){

DriverFactory.getDriver().findElement(username).sendKeys(user);
DriverFactory.getDriver().findElement(password).sendKeys(pass);
//DriverFactory.getDriver().findElement(loginBtn).click();

}
}