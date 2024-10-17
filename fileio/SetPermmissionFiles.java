package com.fileio;

import java.io.File;
import java.io.FilePermission;

public class SetPermmissionFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\abcd.txt";
		FilePermission fp = new FilePermission(path, "write");

		
		if (fp.implies(new FilePermission(path, "read"))) {

			System.out.println("Permission Granted for Read ");
		} else {
			System.out.println("Permission is not Granted for Read");
		}

		if (fp.implies(new FilePermission(path, "write"))) {
			System.out.println("Permission Granted for write ");

		} else {
			System.out.println("Permission is not Granted for Write");
		}

		if (fp.implies(new FilePermission(path, "execute"))) {
			System.out.println("Permission Granted for Execute");
		} else {
			System.out.println("Permission is not Granted for execute");
		}

		if (fp.implies(new FilePermission(path, "delete"))) {
			System.out.println("Permission Granted for Delete");
		} else {
			System.out.println("Permission is not Granted for delete");
		}
//
//		File file = new File(path);
//		System.out.println(file.setReadable(false));
//
//		System.out.println(file.setWritable(false));
//
//		System.out.println(file.setExecutable(false));
	}

}
