package com.temproryfile;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class WriteDataTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File tempwrite=File.createTempFile("writetemp", ".tmp");
			List<String> lines= List.of("One","Two","Three","Four");
			System.out.println(tempwrite.getAbsolutePath());
			Files.write(tempwrite.toPath(), lines, StandardCharsets.UTF_8);
			System.out.println("TempFile in Write Successfully.......");
					
		} catch (IOException e) {
			System.out.println("due to some error.....");
			e.printStackTrace();
		}

	}

}
