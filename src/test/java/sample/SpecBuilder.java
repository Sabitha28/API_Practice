package sample;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class SpecBuilder {
//@Test
	/*public void specBuilderexample() {
	RequestSpecification req=new RequestSpecBuilder().setContentType(ContentType.JSON).
	setBaseUri("http://localhost:3000").build();
	
	ResponseSpecification respec=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
	RequestSpecification res=given().spec(req);
			
	String response=res.when().get("/posts/0001").
	then().spec(respec).extract().response().asString();
	System.out.println(response);
	}*/

	@Test
public void spec_builder() {
	
	
	RequestSpecification req=new RequestSpecBuilder().setBaseUri("http://localhost:3000").
	setContentType(ContentType.JSON).build();
	
	ResponseSpecification respec=new ResponseSpecBuilder().expectStatusCode(200).
			expectContentType(ContentType.JSON).build();
	RequestSpecification res=given().spec(req);
	String response=res.when().get("/posts/0001").then().spec(respec).
			extract().response().asString();
	
	System.out.println(response);
	
	
	
	
	
}
}

























