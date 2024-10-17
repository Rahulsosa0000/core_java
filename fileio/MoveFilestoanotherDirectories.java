package com.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveFilestoanotherDirectories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path AP = Paths.get("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\ac.txt");// actual path
		Path DP = Paths.get("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\th\\ac.txt"); // destination path

		try {
			Files.move(AP, DP, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File moved Successfully.....");
		} catch (IOException e) {
			System.out.println("Error occurred while moving the file.");
			e.printStackTrace();
		}

	}

}
