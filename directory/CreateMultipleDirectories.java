package com.directory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CreateMultipleDirectories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path multidir = Paths.get(
				"C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\com\\directory\\firstdir\\seconddir\\thirddir");

		try {
			Files.createDirectories(multidir);
			System.out.println("Create Multiple Directories Successfulyy......" + multidir);
			
			 Path filePath = multidir.resolve("newfile.txt");

	            List<String> lines = Arrays.asList("Hello, World!", "This is a new text file in SubDir2.");

	            Files.write(filePath, lines, StandardCharsets.UTF_8);
	            System.out.println("Text file created and written to successfully: " + filePath);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
