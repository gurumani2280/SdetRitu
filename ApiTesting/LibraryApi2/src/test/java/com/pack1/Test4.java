package com.pack1;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test4 {

	public static void main(String[] args) {
		RestAssured.given().log().all()
		.contentType(ContentType.JSON)
		.body("{\"ID\":\"bc6de227471\"}")
		.when().delete("http://216.10.245.166/Library/DeleteBook.php")
		.then().log().all()
		.body("msg", Matchers.equalTo("book is successfully deleted"));

	}

}
