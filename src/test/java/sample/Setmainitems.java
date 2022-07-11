package sample;

import chocolatepojo.Batters;
import chocolatepojo.mainitems;
import chocolatepojo.Topping;
import chocolatepojo.batter;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;

public class Setmainitems {

	@Test(priority = 1)
	public void mainitemsmethod() {
		mainitems mi = new mainitems();
		RestAssured.baseURI = "http://localhost:3000";
		mi.setId("0001");
		mi.setType("donut");
		mi.setName("Cake");
		mi.setPpu("0.55");
		Batters b = new Batters();
		mi.setBatters(b);
		batter ba = new batter();
		List<batter> batt = new ArrayList<batter>();
		batt.add(ba);
		ba.setId("1001");
		ba.setType("Regular");
		b.setBatter(batt);
		List<Topping> T = new ArrayList<Topping>();
		Topping top = new Topping();
		top.setId("5005");
		top.setType("Sugar");
		T.add(top);
		mi.setTopping(T);

		String res = given().header("Content-Type", "application/json").body(mi).when().post("/posts").then()
				.statusCode(201).extract().response().asString();
		System.out.println(res);
	}

}
