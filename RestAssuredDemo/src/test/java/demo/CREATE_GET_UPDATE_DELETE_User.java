package demo;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CREATE_GET_UPDATE_DELETE_User {
	HashMap<String, String> map = new HashMap<String, String>();
 int id;
	
	@BeforeTest
	public void createPayLoad() {
		map.put("name", "Jamshid");
		map.put("email", "jamshid1245@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "/public/v2/users";
		
		
	}
public void createUser() {
	Response response = RestAssured
	.given()
	.contentType("application/json")
	.body(map)
	.header("Authorization", "Bearer e3fd7899e210bb32cf906cef9e696b87f19f9edd7f0b771d41f840a7bb13e8cd")
	.when()
	.post()
	.then()
	.statusCode(201)
	.log().all()
	.contentType(ContentType.JSON).extract().response();
	
	JsonPath jsonPath = response.jsonPath();
	id = jsonPath.get("id");
	//System.out.println(jsonPath.get("id"));
}
}



