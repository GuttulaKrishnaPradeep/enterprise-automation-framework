package tests;

import base.BaseTest;
import driver.DriverFactory;
import pages.LoginPage;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

@Test
public void loginTest(){
	
	//remove duplicate from array

int arr[]= {1, 2, 3, 4, 4, 7, 9};
//String arr1[] = {"String", "string1", "string2"};

Set<Integer> set = new HashSet<>();
for(int i = 0;i<arr.length;i++) {
	System.out.println(arr[i]);
	set.add(arr[i]);
}
System.out.println(set);

//Reverse eachword in sentense

String s = "Iam Automation Test Engineer";

String arr1[]= s.split(" ");
System.out.println(Arrays.toString(arr1));
String rev="";

for(int j=0;j<arr1.length;j++) {
	
	String word = arr1[j];
	
	for(int s1 = word.length()-1; s1>=0;s1--) {
		System.out.println(word.charAt(s1));
		rev = rev+word.charAt(s1);
		}
	rev = rev+(" ");
}
System.out.println(rev);

//Print vocels and consonents

String t ="Hello World, I am in Hyderabad";

String t1 = t.toLowerCase();

String v = "";
String c = "";

for(int x = 0; x< t1.length(); x++) {
	char ch = t1.charAt(x);
	
	if(ch>'a' && ch<'z') {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			v = v+ch;
		}else {
		c=c+ch;
		}
	}
	
	
}

System.out.println(v);
System.out.println(c);

//Second largest element in array

int[] num = {1, 5,500, 10, 45, 60, 100};
int largenumber = num[0];
int secondnumber = 0;

for(int y = 1; y<num.length;y++) {
	if(largenumber<num[y]) {
		secondnumber = largenumber;
		largenumber = num[y];
	}else if(num[y]> secondnumber && num[y]!=largenumber) {
		secondnumber = num[y];
	}
	
	
}
System.out.println(largenumber);
System.out.println(secondnumber);





}
}
