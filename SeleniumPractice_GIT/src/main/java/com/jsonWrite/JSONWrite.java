package com.jsonWrite;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWrite {

	public static void main(String[] args) throws IOException {
		String location="src/test/resources/Example.json" ;
		
		JSONObject obj=new JSONObject();
		obj.put("UserName", "Admin");
		obj.put("Password", "Admin123");
		
		JSONArray JR=new JSONArray();
		JR.add("Cred1");
		JR.add("Cred2");
		
		obj.put("Credentials", JR);
		
		FileWriter writes=new FileWriter(location);
		writes.write(obj.toString());
		writes.close();

	}

}
