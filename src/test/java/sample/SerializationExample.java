package sample;

//import org.junit.Test;

import pojoSerializarion.CreateSerialization;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;

//import org.junit.Test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SerializationExample {
//@Test(priority=1)
	
	public void serial() {
		
		CreateSerialization cs=new CreateSerialization();
		HashMap<String,String>map=new HashMap<String,String>();
		map.put("userid", cs.getUserId());
		map.put("id", cs.getId());
		map.put("title", cs.getTitle());
		map.put("body", cs.getBody());
		/*cs.setUserId(202);
		cs.setId(202);
		cs.setTitle("sabitha");
		cs.setBody("reddy");*/
		String res=given().contentType(ContentType.JSON).body(map).when().post("http://localhost:3000/posts")
		.then().statusCode(201).toString();
		
		//System.out.println(cs.toString());
		
	}
	
	//@Test(priority=2)
	public void deserialization() {
		CreateSerialization cs=get("http://localhost:3000/posts/202").
				as(CreateSerialization.class);
		System.out.println(cs.getTitle());
		System.out.println(cs);
	}
	//delete API
@Test
public void del() {
	
	given().header("Content-Type","application/json")
	.when().delete("http://localhost:3000/posts/0001")
	.then().assertThat().statusCode(200);
	
}
//@Test


public void put() {

	CreateSerialization cs=new CreateSerialization();
	cs.setTitle("sabitha11");
given().header("Content-Type","application/json").body(cs)
.when().put("http://localhost:3000/posts/202")
.then().assertThat().statusCode(200);

}

}
