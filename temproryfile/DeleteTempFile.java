package com.temproryfile;

import java.io.File;
import java.io.IOException;

public class DeleteTempFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File tempfile = File.createTempFile("abc", ".tmp");
			System.out.println(tempfile);

			boolean result = tempfile.delete();
			if (result) {
				System.out.println(tempfile.getName() + " "+"is deleted");
			} else {
				System.out.println("Sorry, unable to delete the file.");

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
