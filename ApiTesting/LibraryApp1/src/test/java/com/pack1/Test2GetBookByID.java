package com.pack1;



import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test2GetBookByID {
	public static void main(String[] args) {
		Response resp= RestAssured.given().log().all()
		.queryParam("ID", "bce6ed223621")
		.when()
		.get("http://216.10.245.166/Library/GetBook.php")
		.then().log().all()
		//.assertThat().statusCode(200)
		//.body("author", Matchers.equalToIgnoringCase("RituRaj1"))
		.extract().response();
		System.out.println(resp.asString());
	}

}
