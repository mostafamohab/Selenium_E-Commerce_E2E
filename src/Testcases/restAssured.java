package Testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class restAssured {
	@BeforeSuite
	public void setUp() {

		// Given - All input details
		// When - Submit the API
		// Then - Validate the Response

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
	}

	@Test(priority = 7)
	public void getTest1() {
		given().log().all().header("Cookie", "__cfduid=de2354a31bda903ee9b1614f176bc71691613051811").when()
				.get("posts/1").then().log().all().assertThat().statusCode(200)
				.body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
				.header("Server", "cloudflare");

	}

	@Test(priority = 8)
	public void getTest2() {

		given().log().all().header("Cookie", "__cfduid=de2354a31bda903ee9b1614f176bc71691613051811")
				.body("{\r\n" + "	\"title\": \"foo\",\r\n" + "    \"body\": \"bar\",\r\n" + "    \"userId\": 1\r\n"
						+ "}")
				.when().post("posts").then().log().all().assertThat().statusCode(201).body("body", equalTo(null))
				.header("Content-Type", "application/json; charset=utf-8");

	}

}
