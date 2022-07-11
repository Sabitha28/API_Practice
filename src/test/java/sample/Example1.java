package sample;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class Example1 {
	@Test
	public void exmple1() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
		String res=given().queryParam("userId", "1").header("Content-Type","application/json").
				when().get("/posts").then().assertThat().statusCode(200).
				body("title[0]", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")).toString();
		System.out.println(res);
	}

}
