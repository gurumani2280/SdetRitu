package com.pack1;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test4DeleteByID {
	public static void main(String[] args) {
		RestAssured.given().log().all()
		.contentType(ContentType.JSON)
		.body("{\"ID\":\"bce6ed223621\"}")
		.when()
		.delete("http://216.10.245.166/Library/DeleteBook.php")
		.then().log().all();
	}

}
