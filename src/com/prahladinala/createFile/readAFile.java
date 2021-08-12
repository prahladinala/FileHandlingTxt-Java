package com.prahladinala.createFile;
import java.io.FileReader;
import java.io.FileWriter;

public class readAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array = new char[100];
		try {
			// Create a reader using the FileReader
			FileReader input = new FileReader("D:\\Java\\MyFileHandlingTxt\\MovieTitle.txt");
			
			// Reads Characters
			input.read(array);
			System.out.println("Data in the File is:");
			System.out.println(array);
			
			//Close the reader
			input.close();
			
			//Update Text
			// Create a Writer using FileWriter
			FileWriter output = new FileWriter("D:\\Java\\MyFileHandlingTxt\\MovieTitle.txt");
						
			// Write String to the File
			output.write("I, Me and Myself!");
			System.out.println("Data is written to the file.");
						
			//Close the Writer
			output.close();
		}catch(Exception e) {
			e.getStackTrace();
		}
	}

}
