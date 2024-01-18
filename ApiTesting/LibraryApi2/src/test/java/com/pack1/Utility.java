package com.pack1;

public class Utility {
	
	public static String CreatePayload(String name, String isbn, String aisle, String authorName) {
		return "{\r\n"
				+ "\"name\":\""+name+"\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\""+authorName+"\"\r\n"
				+ "}\r\n"
				+ "";
	}
	
	public static String deletePayload(String iD) {
		return "{\"ID\":\""+iD+"\"}";
	}

}
