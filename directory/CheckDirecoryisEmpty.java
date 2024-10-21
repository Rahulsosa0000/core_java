package com.directory;

import java.io.File;

public class CheckDirecoryisEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dirpath="D:\\checkdir";
		
		File dir=new File(dirpath);
		
		if(dir.exists() && dir.isDirectory()) {
			File[] files= dir.listFiles();
			
			if(files != null && files.length>0) {
				System.out.println("The Directory is not Empty....");
			}else {
				System.out.println("Directory is empty......");
			}
		}

	}

}
