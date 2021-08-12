package com.prahladinala.createFile;
import java.io.File;

public class createAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\Java\\MyFileHandlingTxt\\MovieTitle.txt");

        try{
            boolean value = file.createNewFile();
            if(value){
                System.out.println("The File Created Successfully");
            } else {
                System.out.println("File Already created with given name");
            }
        }catch (Exception e){
            System.out.println("ERROR Occurred While creating a File");
            e.getStackTrace();
        }
	}

}
