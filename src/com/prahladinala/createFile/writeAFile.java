package com.prahladinala.createFile;
import java.io.FileWriter;

public class writeAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "The Good, The Bad and The Ugly";
		try {
			// Create a Writer using FileWriter
			FileWriter output = new FileWriter("D:\\Java\\MyFileHandlingTxt\\MovieTitle.txt");
			
			// Write String to the File
			output.write(data);
			System.out.println("Data is written to the file.");
			
			//Close the Writer
			output.close();
		}catch(Exception e) {
			e.getStackTrace();
		}
	}

}
