package tests;

import base.BaseTest;
import driver.DriverFactory;
import pages.LoginPage;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.functors.IfClosure;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	
	private byte uppercaseLetter;
	private byte lowercaseLetter;

	/*
	 * By username = By.name("username"); By password = By.name("password"); By
	 * submit = By.id("submit"); By pagetitle = By.className("post-title"); By
	 * logout = By.xpath("//a[text()='Log out']"); By LoginHomePage =
	 * By.xpath("//a[text()='Test login']");
	 */

	/*
	 * @Test(groups = {"Login", "Smoke"}) public void loginTest(){
	 * 
	 * DriverFactory.getDriver().get(
	 * "https://practicetestautomation.com/practice-test-login/");
	 * DriverFactory.getDriver().findElement(username).sendKeys("student");
	 * DriverFactory.getDriver().findElement(password).sendKeys("Password123");
	 * DriverFactory.getDriver().findElement(submit).click(); String str =
	 * DriverFactory.getDriver().findElement(pagetitle).getText();
	 * 
	 * Assert.assertEquals(str, "Logged In Successfully"); }
	 * 
	 * @Test(groups = {"logout", "regression"}) public void loginOut(){
	 * 
	 * DriverFactory.getDriver().get(
	 * "https://practicetestautomation.com/practice-test-login/");
	 * DriverFactory.getDriver().findElement(username).sendKeys("student");
	 * DriverFactory.getDriver().findElement(password).sendKeys("Password123");
	 * DriverFactory.getDriver().findElement(submit).click(); String str =
	 * DriverFactory.getDriver().findElement(pagetitle).getText();
	 * Assert.assertEquals(str, "Logged In Successfully");
	 * DriverFactory.getDriver().findElement(logout).click(); String str1 =
	 * DriverFactory.getDriver().findElement(LoginHomePage).getText();
	 * 
	 * Assert.assertEquals(str1, "Test login");
	 * 
	 * 
	 * }
	 */

	/*
	 * @Test(groups = {"logout", "regression"}) public void loginOut1(){
	 * 
	 * String str = "Iamanautomati1o2n4t6e8stengineer"; String str1 =
	 * "Iam anautomati1o2n 4t6e8st engineer"; String chars = ""; String num = "";
	 * String rev = ""; String s = "";
	 * 
	 * String[] substr = str1.split(" "); for(int x = 0; x<substr.length;x++) {
	 * 
	 * for(int y = 0; y< substr[x].length(); y++) { s = new
	 * StringBuffer(substr[x]).reverse().toString(); } rev = rev+" "+s; }
	 * System.out.println("--------"); System.out.println(rev);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * for(int i = 0; i<str.length();i++) { char c = str.charAt(i);
	 * if(Character.isLetter(c)) { System.out.println(c); chars = chars+c; }else
	 * if(Character.isDigit(c)) { System.out.println(c); num = num+c; }
	 * 
	 * LinkedHashSet<Character> set = new LinkedHashSet<>(); set.add(c); }
	 * System.out.println(chars); System.out.println(num);
	 * 
	 * }
	 */

	/*
	 * @Test(groups = {"logout", "regression"}) public void secondHighestNumber() {
	 * 
	 * String m = "Hello world how are you"; String[] str =m.split(" "); String rev
	 * = null; for(int i = str.length-1;i>=0;i--){ rev = new
	 * StringBuffer(str[i]).reverse().toString(); System.out.println(rev);
	 * 
	 * } }
	 * 
	 * @Test public void reverseString() {
	 * 
	 * String m = "This method should reverse the string"; String[] str
	 * =m.split(" "); String rev = ""; for(int i = 0;i<str.length;i++){ rev =
	 * rev+" ";
	 * 
	 * for(int j=str[i].length()-1;j>=0;j--) { rev = rev+str[i].charAt(j); } }
	 * System.out.println(rev); }
	 * 
	 * @Test public void seperatenumandchars() {
	 * 
	 * String m = "This99method3243should"; String c=""; String n = ""; for(int i =
	 * 0;i<m.length();i++) { if(Character.isDigit(m.charAt(i))) { n=n+m.charAt(i);
	 * }else if (Character.isLetter(m.charAt(i))) { c=c+m.charAt(i); } }
	 * System.out.println(n); System.out.println(c); }
	 * 
	 * @Test public void removeDuplicateChars() {
	 * 
	 * String m = "KrishnaPradeep"; Set<Character> set = new LinkedHashSet<>();
	 * StringBuffer str = new StringBuffer(); for(int i=0;i<m.length();i++) {
	 * 
	 * set.add(m.charAt(i)); } for(Character ch : set) { str.append(ch); }
	 * System.out.println(set.toString()); System.out.println(str.toString()); }
	 * 
	 * @Test public void palindrome() {
	 * 
	 * String m = "madam"; String rev = ""; rev = new
	 * StringBuilder(m).reverse().toString();
	 * 
	 * if(m.equals(rev)) { System.out.println("Palendrome"); }else {
	 * System.out.println("Not Palendrome"); }
	 * 
	 * }
	 * 
	 * @Test public void swipetwoNum() {
	 * 
	 * int x = 4; int y = 8;
	 * 
	 * x= x+y; y=x-y; x=x-y; System.out.println("&&&&&&&&&&&&");
	 * System.out.println(x+"  "+y); }
	 * 
	 * @Test public void largestNumber() {
	 * 
	 * int arr[] = {1, 5, 7, 9, 4}; int m = arr[0];
	 * 
	 * for(int i = 0;i<arr.length;i++) { if(arr[i]>m) { m = arr[i]; }
	 * 
	 * } System.out.println("Max number in array"+"  "+m);
	 * 
	 * 
	 * }
	 * 
	 * @Test public void secondLargestNumber() {
	 * 
	 * int arr[] = {1, 5, 7, 9, 4}; int m = arr[0]; int s=0;
	 * 
	 * for(int i = 0;i<arr.length;i++) { if(arr[i]>m) { s = m; m = arr[i]; }else if
	 * (arr[i]>s) { s = arr[i]; } }
	 * System.out.println("Max number in array"+"  "+m); System.out.println(s);
	 * 
	 * }
	 */
	
	
	
	@Test
	public void test() {
		
		String str = "pradeepe";
		char c;
		int count = 0;;
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i= 0;i<str.length();i++) {
			str.charAt(i);
			count =0;
			for(int j= 0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count = count+1;
				}
			}
			map.put(str.charAt(i), count);
			
		}
		
		System.out.println(map.toString());

}


















}
