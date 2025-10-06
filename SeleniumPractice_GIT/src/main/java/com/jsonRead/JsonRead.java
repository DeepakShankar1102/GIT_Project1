package com.jsonRead;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JsonRead {

	public static void main(String[] args) throws IOException, ParseException 

	{
		JsonRead rd=new JsonRead();
		rd.JSONParser();



	}
	
	

	public void JSONParser() throws IOException, ParseException {

		String loc="src/test/resources/Example.json" ;

		JSONParser JSParser=new JSONParser();
		FileReader read=new FileReader(loc);

		Object ParsedObj=  JSParser.parse(read);
		JSONObject JSObject=  (JSONObject)ParsedObj;

		String Uname =(String)JSObject.get("UserName");
		String Pwd   =(String)JSObject.get("Password");

		JSONArray array=(JSONArray) JSObject.get("Credentials");

		System.out.println(Uname);
		System.out.println(Pwd);



		Iterator it = array.iterator();
		while(it.hasNext()) {
			System.out.println("Credentials: " + it.next());
		}

		



		//1.Declare JsonParser
		//2.Read the file using file reader
		//3.Read the file using parser and store it in object
		//4.Change Parsed object to JSONObject
		//5.Change JSONObject to String

	}

}
