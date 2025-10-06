package com.FileWriting;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWriting {

	public static void main(String[] args) throws IOException  {
		
		FileWriting Obj= new FileWriting();
		Obj.PathAppend();

	}
	
	public void StraightForward() throws IOException
	{
		String location="src/test/resources/File1.txt";
		String content="This is Test File";
		
		FileWriter wr=new FileWriter(location);
		wr.write(content);
		wr.close();
	}
	
	public void AppendFile() throws IOException
	{
		String location ="src/test/resources/File1.txt";
		String AppendingLine="This is appended Line";
		
		FileWriter wr=new FileWriter(location, true); // 'true' enables append mode
		wr.write(AppendingLine);
		wr.close();
			
	}
	public void AppendFile2() throws IOException
	{
		String location ="src/test/resources/File1.txt";
		String content="This is Test File";
		FileWriter wr=new FileWriter(location); 
		wr.write(content);
		wr.append("Appended Line no 2");
		wr.close();
			
	}
	public void BufferWriter() throws IOException
	{
		String location ="src/test/resources/File2.txt";
		String content="This is by using buffer writer File";
		
		FileWriter wr=new FileWriter(location); 
		BufferedWriter writer =new BufferedWriter(wr);
		writer.write(content);
		writer.newLine();
		writer.append("Appening in new Line");
		writer.close();
			
	}
	//BufferedWriter is better than FileWriter alone because it uses an internal buffer → fewer disk writes, better performance.
	
	public void Outputsteam() throws IOException
	{
		
		String location ="src/test/resources/File3.txt";
		String content="This is by using outputStream";
		
		
	    FileOutputStream writer=new FileOutputStream(location);
	    byte[] newcont =content.getBytes();
	   
	    writer.write(newcont);
	    writer.close();
	
		
	}
	//Unlike BufferedWriter, FileOutputStream writes bytes, not characters → so we must convert the string using .getBytes().
    //It works for both text and binary files (e.g., images, PDFs).
	
	
	public void Path() throws IOException
	{
		
		String location ="src/test/resources/File4.txt";
		String content="This is by using Path";
		
		byte[] newcont =content.getBytes();
		
	    Path writer = Paths.get(location);
	    Files.write(writer, newcont);
	       
	  	
	}
	
	//Path represents a file or directory location in a filesystem.
    //It’s part of NIO (New I/O) API (java.nio.file.Path).
    //Unlike File, it is more powerful → works better with symbolic links, relative paths, etc.
	
	public void Path2() throws IOException
	{
		
		String location ="src/test/resources/File4.txt";
		String content="This is by using Path, but not dealing with bytes";
		

	    Path writer = Paths.get(location);
	    Files.writeString(writer, content);
	    
	    
	  	
	}
	
	public void PathAppend() throws IOException
	{
		
		String location ="src/test/resources/File5.txt";
		String content="This is by using Path";
		String AppendCont=" This is by using Path but Append";
		
		byte[] newcont =content.getBytes();
		Path writer = Paths.get(location);
		Files.write(writer, newcont);

		byte[] newcontApp =AppendCont.getBytes();
	    Path writerApp = Paths.get(location);
	    Files.write(writerApp, newcontApp, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
	    
	}
	
	public void PathAppendlineseperator() throws IOException
	{
		
		String location ="src/test/resources/File6.txt";
		String content="This is by using Path";
		String AppendCont="This is by using Path but Append";
		
		
		
	    Path writerApp = Paths.get(location);
	    Files.writeString(writerApp, content+System.lineSeparator()+AppendCont);
	    
	}


}
