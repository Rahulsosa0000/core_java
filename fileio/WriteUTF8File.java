package com.fileio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteUTF8File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path="C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\writeutf.txt";
		
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path),StandardCharsets.UTF_8)) {
			writer.write("this isLine 1");
            writer.newLine();
            writer.write("this is Line 2");
            writer.newLine();
            writer.write("this is Line 3");
            writer.newLine();

            System.out.println("Data written successfully.");

		} catch (IOException e) {
            System.out.println("Error occurred while writing to the file.");
			e.printStackTrace();
		}

	}

}
