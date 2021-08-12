package com.prahladinala.createFile;
import java.io.File;
public class deleteAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CREATE A FILE OBJECT
		File file = new File("D:\\Java\\MyFileHandlingTxt\\MovieTitle.txt");
		
		//DELETE THE FILE
		boolean value = file.delete();
		if(value) {
		   System.out.println("The File is deleted.");
		}
		else {
		   System.out.println("The File is not deleted.");
		}
	}

}
