package com.fileio;

import java.io.File;

public class DeleteFileWithExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String extension=".txt";
		File fileditrectory=new File("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh");
		
		File files[]= fileditrectory.listFiles(); // all files store 
		
		if(files!=null) {
			for(File file: files) {
				
				if(file.isFile() && file.getName().endsWith(extension)) {
					if(file.delete()) {
                        System.out.println("Deleted file: " + file.getName());
					}else {
                        System.out.println("Failed to delete file: " + file.getName());
                    }
					
				}
			}
		}
		else {
            System.out.println("Directory is empty or does not exist.");

		}

	}

}
