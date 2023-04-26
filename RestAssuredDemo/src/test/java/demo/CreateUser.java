package demo;

import java.util.HashMap;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateUser {
	HashMap<String, String> map = new HashMap<>();
	@BeforeTest
	public void createPayLoad() {
		map.put("name", "parwana");
		map.put("email", "parwana12@gmail.com");
		map.put("gender", "female");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "/public/v2/users";
		

		
	}
	@Test
	public void createResource() {
		RestAssured
		.given()
		.contentType("application/json")
		.body(map)
		.header("Authorization", "Bearer e3fd7899e210bb32cf906cef9e696b87f19f9edd7f0b771d41f840a7bb13e8cd")
		.when()
		.post()
		.then()
		.statusCode(201)
		.log().all();
	}
	

}
