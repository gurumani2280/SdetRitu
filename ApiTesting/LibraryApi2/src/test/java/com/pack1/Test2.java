package com.pack1;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Main Begin");
		String statusLine = RestAssured.given().log().all()
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ "\"name\":\"Learn API Automation with Java\",\r\n"
				+ "\"isbn\":\"bcde\",\r\n"
				+ "\"aisle\":\"227471\",\r\n"
				+ "\"author\":\"Ritu1Raj\"\r\n"
				+ "}")
		.when().post("http://216.10.245.166/Library/Addbook.php")
		.then().log().all().statusCode(200)
		.header("Server", "Apache")
		.statusLine("HTTP/1.1 200 OK")
////		.body(
////			  "Msg", Matchers.equalTo("Book Already Exists"),
////			  "ID", Matchers.equalTo("bc6de227471")
//				)
		.extract().statusLine();
		
		System.out.println("statusLine "+ statusLine);

	}

}
