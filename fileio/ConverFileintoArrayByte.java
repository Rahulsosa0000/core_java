package com.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ConverFileintoArrayByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path path=Paths.get("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\writearr.txt");
		
		try {
			byte[] b=Files.readAllBytes(path);
			System.out.println(Arrays.toString(b));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
