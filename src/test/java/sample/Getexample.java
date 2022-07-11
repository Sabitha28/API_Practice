package sample;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


import org.junit.Test;

import io.restassured.RestAssured;

public class Getexample {
	@Test
	public void get() {
		RestAssured.baseURI="https://reqres.in/api/users";
		/*String payload="{\r\n"
				+ "\"id\": 38,\r\n"
				+ "            \"email\": \"sabi.ann@reqres.in\",\r\n"
				+ "            \"first_name\": \"sab\",\r\n"
				+ "            \"last_name\": \"red\",\r\n"
				+ "            \"avatar\": \"https://reqres.in/img/faces/38-image.jpg\"\r\n"
				+ "}";*/
		String res=given().
				queryParam("id", "7").header("Content-Type","application/json").
				when().get().then().log().all().assertThat().statusCode(200).toString();
		//System.out.println(res);
	}

}
