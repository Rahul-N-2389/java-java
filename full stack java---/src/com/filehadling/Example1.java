package com.filehadling;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

public class Example1 {
	
//	public void addText(String )

	public static void main(String[] args) throws IOException {
		String Location = "C:\\Users\\rrahu\\OneDrive\\Desktop\\Robin.txt";
		File file = new File(Location);
		FileOutputStream fos = new FileOutputStream(Location);
		
		
		if(file.exists()) {
			System.out.println("file Exited ");
			
			String Data = "Eveything will change in one day";
			fos.write(null);
			
			
		}else if(!file.exists()){
			System.out.println("file not exited");
			Boolean newFile = file.createNewFile();
			System.out.println("file is created");
			
		}
		
		
	}

}
