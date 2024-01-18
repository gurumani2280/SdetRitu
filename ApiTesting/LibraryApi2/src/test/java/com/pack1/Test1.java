package com.pack1;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Main Begin");
		RestAssured.given().log().all()
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ "\"name\":\"Learn API Automation with Java\",\r\n"
				+ "\"isbn\":\"bc6de\",\r\n"
				+ "\"aisle\":\"227471\",\r\n"
				+ "\"author\":\"Ritu1Raj\"\r\n"
				+ "}")
		.when().post("http://216.10.245.166/Library/Addbook.php")
		.then().log().all().statusCode(200)
		.header("Server", "Apache")
		.body(
			  "Msg", Matchers.equalTo("Book Already Exists"),
			  "ID", Matchers.equalTo("bc6de227471")
				);
//		.body("Msg", Matchers.equalTo("Book Already Exists"))
//		.body("ID", Matchers.equalTo("bcede223471"));

	}

}
