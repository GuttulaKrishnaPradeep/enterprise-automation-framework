package apiTests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class UserAPITest {

@Test
public void getUser(){

given()
.when()
.get("https://reqres.in/api/users/2")
.then()
.statusCode(200);

}
}
