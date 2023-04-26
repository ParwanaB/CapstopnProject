package demo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GoRest {
	@Test
	public void goRest() {
		RestAssured.
		when().
		get("https://gorest.co.in/").
		then().
		assertThat().
		statusCode(200)
		.log().all();
		
		
	}

}
