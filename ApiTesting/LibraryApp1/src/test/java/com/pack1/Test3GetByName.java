package com.pack1;

import io.restassured.RestAssured;

public class Test3GetByName {

	
	public static void main(String[] args) {
		RestAssured.given().log().all()
		.queryParam("AuthorName", "RituRaj")
		.when()
		.get("http://216.10.245.166/Library/GetBook.php")
		.then().log().all();
	}

}
