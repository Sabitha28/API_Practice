package sample;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

//import org.junit.Test;

import io.restassured.RestAssured;

public class PostExample {
//@Test
	public void post() throws IOException {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
		String res=given().queryParam("userId", "1").header("Content-Type","application/json").
				body(Files.readAllBytes(Paths.get("E:\\Selenium_New\\API\\src\\test\\java\\sample\\payload.json"))).
				when().post("/posts").then().assertThat().statusCode(201).
				body("title", equalTo("qui est esse")).extract().response().asString();
						
		System.out.println(res);
	}
@Test
public void post1() throws IOException {
	RestAssured.baseURI="http://localhost:3000";
	String res=given().header("Content-Type","application/json").
			body(Files.readAllBytes(Paths.get("E:\\Selenium_New\\API\\src\\test\\java\\sample\\chocolate.json"))).
			when().post("/posts").then().assertThat().statusCode(201).
			extract().response().asString();
					
	System.out.println(res);
}

	}

