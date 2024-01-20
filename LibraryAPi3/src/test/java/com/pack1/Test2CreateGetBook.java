package com.pack1;


import java.util.List;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test2CreateGetBook {
	
	public static void main(String[] args) {
		CreateBook book = new CreateBook();
		book.setName("Learn Rest API");
		book.setIsbn("bc6ed");
		book.setAisle("2311");
		book.setAuthor("NAMO");
		System.out.println("main begin");
		
		Response resp = RestAssured.given().log().all()
					.contentType(ContentType.JSON)
					.body(book)
					.when()
					.post("http://216.10.245.166/Library/Addbook.php")
					.then().log().all()
					.assertThat().statusCode(200)
					.extract().response();
		
		
		String createRespMsg = resp.path("Msg");
		String createRespID = resp.path("ID");
		
		System.out.println("createRespMsg " + createRespMsg);
		System.out.println("createRespID " + createRespID);
		
		//https://stackoverflow.com/questions/21725093/rest-assured-deserialize-response-json-as-listpojo
		GetBook[] getBook=RestAssured.given().log().all()
		.queryParam("ID", createRespID)
		.when().get("http://216.10.245.166/Library/GetBook.php")
		.then().log().all()
		.statusCode(200).extract().response().as(GetBook[].class);
		
		System.out.println(getBook[0].getAisle());
		System.out.println(getBook[0].getAuthor());
	
		
		
		
		
	}

}
