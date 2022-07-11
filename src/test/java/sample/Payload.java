package sample;

public class Payload {
	
public static String method(String a) {
	String b= "{\r\n"
			+ "    \"userId\": 1,\r\n"
			+ "    \"id\": 2,\r\n"
			+ "    \"title\": \""+a+"\",\r\n"
			+ "    \"body\": \"est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla\"\r\n"
			+ "  }";
	return b;
}
}