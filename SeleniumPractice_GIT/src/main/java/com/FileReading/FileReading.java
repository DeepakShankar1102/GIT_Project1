package com.FileReading;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) throws IOException {
		FileReading obj=new FileReading();
		obj.ConfigFileReadPath();

	}
	
	public void Read1() throws IOException
	{
		String Filepath="src/test/resources/File6.txt";
		
		FileReader read= new FileReader(Filepath);
		
		BufferedReader reader= new BufferedReader(read);
		
		String str;
		
		while((str=reader.readLine())!=null) 
		{
			System.out.println(str);
		}
		
        reader.close();
	}
	
	public void ReadPath() throws IOException
	{
		String Filepath="src/test/resources/File6.txt";
		
		Path read=Paths.get(Filepath);
		
		String Content=Files.readString(read);
		
		System.out.println(Content);
		
		
		
	}
	
	public void ConfigFileRead() throws IOException
	{
		
		String Filepath="src/test/resources/config.properties";
		
		FileInputStream reader= new FileInputStream(Filepath);
		
		Properties prop= new Properties();
		prop.load(reader);
		
		String Browser= prop.getProperty("browser");
		System.out.println(Browser);
		
		String Loc= prop.getProperty("Location");
		System.out.println(Loc);
		
	}
	
	public void ConfigFileReadPath() throws IOException
	{
		
		String Filepath="src/test/resources/config.properties";
		
	    Path read = Paths.get(Filepath);
	    Reader rd=Files.newBufferedReader(read);
		
	    
		Properties prop= new Properties();
		prop.load(rd);
	   
		
		String Browser= prop.getProperty("browser");
		System.out.println(Browser);
		
		String Loc= prop.getProperty("Location");
		System.out.println(Loc);
		
	}

}
