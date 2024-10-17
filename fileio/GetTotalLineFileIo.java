package com.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GetTotalLineFileIo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\bw.txt";
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		int i;
		int countline = 0;

		while ((i = br.read()) != -1) {
			// System.out.print((char)i);
			if ((char) i == '\n') {
				countline++;
			}

		}
		countline++;
		System.out.println("count Line:-" + countline);

	}

}
