package com.fileio;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamToString {

	public static void main(String[] args) {
		String str = "Welcome to the java programming....";
		String filePath = "C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\bw.txt";

		InputStream in = new ByteArrayInputStream(str.getBytes());
		StringBuilder stringBuilder = new StringBuilder(); // To store the input stream data

		try (FileOutputStream out = new FileOutputStream(filePath)) {
			int data = in.read();
			while (data != -1) {
				char ch = (char) data;
				System.out.print(ch); // Output the character to the console
				stringBuilder.append(ch); // Append to StringBuilder
				out.write(data); // Write the byte to the file
				data = in.read();
			}

			String convertedString = stringBuilder.toString(); // Convert StringBuilder to String
			System.out.println("\nConverted InputStream to String: " + convertedString);
			if (convertedString.equals(str)) {
				System.out.println("Conversion successful.");
			} else {
				System.out.println("Conversion failed.");
			}

		} catch (IOException e) {
			System.out.println("Error while reading from the InputStream or writing to the file: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
