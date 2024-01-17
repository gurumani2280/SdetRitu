package com.pack1;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test1CreateBook {
	
	public static void main(String[] args) {
		System.out.println("main begin");
		Response resp = RestAssured.given().log().all()
					.contentType(ContentType.JSON)
					.body("{\r\n"
							+ "\"name\":\"Learn Rest API Automation with Java6\",\r\n"
							+ "\"isbn\":\"bce6ed\",\r\n"
							+ "\"aisle\":\"223621\",\r\n"
							+ "\"author\":\"RituRaj6\"\r\n"
							+ "}")
					.when()
					.post("http://216.10.245.166/Library/Addbook.php")
					.then().log().all()
					.assertThat().statusCode(200)
					//.body("ID", Matchers.equalToIgnoringCase("bce1ed223421"))
					.extract().response();
		System.out.println(resp.asString());
		System.out.println("main end");
	}

}
