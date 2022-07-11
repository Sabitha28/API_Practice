package sample;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import pojoexample.ListUsersApi;
import org.junit.Test;

import com.aventstack.extentreports.util.Assert;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojo.Getitems;
//@JsonIgnoreProperties(ignoreUnknown = true)
public class NestedjsonwithPOJO {
@Test
	//public static void main(String args[]) {
	public void pojo() {
		
		/*Getitems gc=given().expect().defaultParser(Parser.JSON)
				.when()
				.get("https://run.mocky.io/v3/8ec8f4f7-8e68-4f4b-ad18-4f0940d40bb7").as(Getitems.class);
				//System.out.println(gc);
				System.out.println(gc.getItems().getPrice());*/
	
	//RestAssured.baseURI="https://reqres.in/api/users?page=2";
	//RestAssured.given().when().get().as(ListUsersApi.class);
	
	ListUsersApi gc=given().expect().defaultParser(Parser.JSON)
			.when()
			.get("https://reqres.in/api/users?page=2").as(ListUsersApi.class);
			//System.out.println(gc);
			System.out.println(gc.getData().get(1).getEmail());
			System.out.println(gc.toString());

				
	}

	}
//}
