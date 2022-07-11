package sample;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

//import org.junit.Test;

import com.aventstack.extentreports.util.Assert;

import chocolatepojo.mainitems;
import chocolatepojo.batter;
import io.restassured.RestAssured;
import pojoSerializarion.CreateSerialization;

public class Getmainitems {
	
	String[] expectedids= {"1001","1002","1003","1004"};
	@Test
	public void Chocolatemethod() {

		mainitems ch = new mainitems();

		RestAssured.baseURI = "http://localhost:3000/posts";

		mainitems ci = get("http://localhost:3000/posts/0001").as(mainitems.class);
		// System.out.println(ci.getBatters().getBatter().get(1).getType());
		// System.out.println(ci);
		List<batter> batter = ci.getBatters().getBatter();
		System.out.println(batter.size());
		// to get id using Type
		for (int i = 0; i < batter.size(); i++) {
			if (batter.get(i).getType().equalsIgnoreCase("Blueberry")) {
				String id = batter.get(i).getId();
				System.out.println("id:" + id);
			}

		}
		ArrayList<String> actualids = new ArrayList<>();

		// to get all id's
		for (int i = 0; i < batter.size(); i++) {

			String id = batter.get(i).getId();
			actualids.add(id);
		}
		System.out.println("All actual ids:" + actualids);
		List<String>expected=Arrays.asList(expectedids);
		System.out.println("All expected ids:"+expected);
		//assert.assertEquals("expecting-----", expected, actualids)
		assertTrue(expected.equals(actualids));
		/*if(expected.equals(actualids)) {
			System.out.println("pass");
		}*/
	}

}
