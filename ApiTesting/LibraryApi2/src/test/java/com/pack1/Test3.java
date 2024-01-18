package com.pack1;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class Test3 {

	public static void main(String[] args) {

		String authorName =RestAssured.given().log().all()
		.queryParam("ID", "wd221qs221")
		.when().get("http://216.10.245.166/Library/GetBook.php")
		.then().log().all()
		.statusCode(200)
		.body("[0].author", Matchers.equalTo("Ritu1Raj"))
		.extract().path("[0].author");
		
		System.out.println("authorName "+ authorName);

	}

}
