package com.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetFileSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Path path = Paths.get("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\bw.txt");
			long size = Files.size(path);
			System.out.println("File Size:-" + size + "bytes");

		} catch (IOException e) {
			System.out.println("Unable to retrieve file size.");
			e.printStackTrace();
		}

	}

}
