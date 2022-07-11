package sample;

//import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.aventstack.extentreports.util.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import io.restassured.RestAssured;

public class getwithparameters {
	//@Test
	public void param() {
	RestAssured.baseURI="https://jsonplaceholder.typicode.com";
	String res=given().log().all()
			.header("Content-Type","application/json").body(Payload.method("qui est esse1")).when().post("/posts").
			then().statusCode(201).extract().response().asString();
	JsonPath js= new JsonPath(res);
	String title=js.getString("title");
	System.out.println("titileee:"+title);
	
	

}
	
	@Test
	public void del() {
		
		
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		String res=given()
				.header("Content-Type","application/json").body(Payload.method("qui est esse1")).queryParam("title","qui est esse1").when().delete("/posts").
				then().statusCode(204).extract().response().asString();
		System.out.println(res);
		
	}

}