package com.pack1;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test6 {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Begin");
		String name="Api Testing1", isbn ="wd221",  aisle ="1221",  authorName="Bhagat1";
		String iD = RestAssured.given().log().all()
		.contentType(ContentType.JSON)
		.body(Utility.CreatePayload( name,  isbn,  aisle,  authorName))
		.when().post("http://216.10.245.166/Library/Addbook.php")
		.then().log().all().statusCode(200)
		.extract().path("ID");
		System.out.println("iD "+ iD);
		Thread.sleep(6000);
		String author = RestAssured.given().log().all()
		.queryParam("ID", iD)
		.when().get("http://216.10.245.166/Library/GetBook.php")
		.then().log().all()
		.statusCode(200)
		.body("[0].author", Matchers.equalTo(authorName),
				"[0].book_name", Matchers.equalTo(name))
		.extract().path("[0].author");
		System.out.println("author "+ author);
		
		RestAssured.given().log().all()
		.contentType(ContentType.JSON)
		.body(Utility.deletePayload(iD))
		.when().delete("http://216.10.245.166/Library/DeleteBook.php")
		.then().log().all()
		.body("msg", Matchers.equalTo("book is successfully deleted"));
		
		String getMsgAfterDelete =RestAssured.given().log().all()
		.queryParam("ID", iD)
		.when().get("http://216.10.245.166/Library/GetBook.php")
		.then().log().all()
		.statusCode(404)
		.body("msg", Matchers.equalTo("The book by requested bookid / author name does not exists!"))
		.extract().path("msg");
		
		System.out.println("getMsgAfterDelete "+ getMsgAfterDelete);
		
	}

}
