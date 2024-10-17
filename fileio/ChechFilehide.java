package com.fileio;

import java.io.File;

public class ChechFilehide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\check.txt");

		if(f.isHidden()) {
			System.out.println("File is Hidden");
		}else {
			System.out.println("File is not hidden");
		}
		
	}

}
