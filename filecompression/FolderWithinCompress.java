package com.filecompression;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FolderWithinCompress {

	public static void compressfoldertozip(File folder, String Zipfilname) {
		try {
			FileOutputStream fos = new FileOutputStream(Zipfilname);
			ZipOutputStream zos = new ZipOutputStream(fos);
			addfolderZip(folder, folder.getName(), zos);
			System.out.println("Folder " + folder.getName() + " compressed into " + Zipfilname);

		} catch (IOException e) {
			System.out.println("error ");
			e.printStackTrace();
		}

	}

	public static void addfolderZip(File folder, String parentFolder, ZipOutputStream zos) throws IOException {
		if (folder.isDirectory()) {
			String folderName = parentFolder + "/";
			zos.putNextEntry(new ZipEntry(folderName));
			zos.closeEntry();
			File[] files = folder.listFiles();
			if (files != null) {
				for (File file : files) {
					addfolderZip(file, folderName + file.getName(), zos);
				}
			}
		} else {
			try (FileInputStream fis = new FileInputStream(folder)) {
				zos.putNextEntry(new ZipEntry(parentFolder));
				byte[] buffer = new byte[1024];
				int length;
				while ((length = fis.read(buffer)) > 0) {
					zos.write(buffer, 0, length);
				}
				zos.closeEntry();
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File folder = new File("D:\\New folder");
		compressfoldertozip(folder,
				"C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\com\\filecompression\\myFolder.zip");

	}

}
