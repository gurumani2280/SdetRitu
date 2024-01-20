package com.pack1;


import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test3CreateBook {
	
	public static void main(String[] args) {
		CreateBook book = new CreateBook();
		book.setName("Learn Rest API");
		book.setIsbn("bc7ed");
		book.setAisle("2411");
		book.setAuthor("NAMO");
		System.out.println("main begin");
		
		CreateBookResponse createBookResponse = RestAssured.given().log().all()
					.contentType(ContentType.JSON)
					.body(book) // Serialization
					.when()
					.post("http://216.10.245.166/Library/Addbook.php")
					.then().log().all()
					.assertThat().statusCode(200)
					.extract().response().as(CreateBookResponse.class);// deserialization
		
		//https://copyprogramming.com/howto/java-com-fasterxml-jackson-databind-exc-unrecognizedpropertyexception-unrecognized-field-not-marked-as-ignorable
		
		
		System.out.println(createBookResponse.getiD());
		System.out.println(createBookResponse.getMsg());
		
		
		
		
		
		
		
		
		
		
	}

}
