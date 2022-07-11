package sample;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

//import org.junit.Test;

import com.aventstack.extentreports.util.Assert;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class Getwithqueryparam {
	//@Test
	public void queryparam() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		
		String res=given().contentType(ContentType.JSON).queryParam("postId", "2")
				.when().get("/Comments").then().extract().response().asString();
		JsonPath js=new JsonPath(res);
		System.out.println("js:"+js.toString());
		String email=js.getString("email[2]");
		System.out.println(email);
				//assert.assertEquals(res, email);
		
	}
	//@Test
public void verifyresponse() {
	RestAssured.baseURI="http://localhost:3000/posts";
	String res=given().
	when().get("/0001")
	.then().statusCode(200).body("batters.batter[0].id", equalTo("1001")).extract().response().asString();
	System.out.println(res);
//assert.assertEquals(UNDEFINED_PORT, DEFAULT_PORT)
	
}
@Test
public void verifyresponse1() {
	RestAssured.baseURI="http://localhost:3000/posts";
	//req = new RequestSpecBuilder().setContentType(ContentType.JSON).setBaseUri("http://localhost:3000/posts").build();
	
	String res=given().
	when().get("/0001")
	.then().statusCode(200).extract().response().asString();
	System.out.println(res);
	JsonPath js=new JsonPath(res);
	//System.out.println(js.toString());
	String id=js.getString("batters.batter[1].id");
	System.out.println("id:"+id);
	
}
}

