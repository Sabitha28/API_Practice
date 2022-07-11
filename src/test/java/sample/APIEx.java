package sample;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class APIEx {
	@Test
	public void sa() {
		//RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
		Response res=given().contentType(ContentType.JSON).when().get("/comments").then().extract().response();
		int a=res.statusCode();
		System.out.println(a);
		String b=res.jsonPath().getString("email[0]");
		System.out.println(b);
	//	assert.assertEquals(res, b);
				
		
	}
//public static void main(String[] args) {
	//APIEx.sa();
	public void ex() {
		//given().header("content-Type", "application/json").body("").
	}
	
}
//}
