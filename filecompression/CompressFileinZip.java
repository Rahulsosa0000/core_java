package com.filecompression;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressFileinZip {

    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\abcd.txt";
        String zipFile = "C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\com\\filecompression\\compression.zip";

        // Use try-with-resources for proper resource management
        try (FileOutputStream fos = new FileOutputStream(zipFile);
             ZipOutputStream zos = new ZipOutputStream(fos);
             FileInputStream fis = new FileInputStream(sourceFile)) {

            // Create a zip entry for the source file
            File fileToZip = new File(sourceFile);
            zos.putNextEntry(new ZipEntry(fileToZip.getName()));

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                zos.write(buffer, 0, length);
            }

            zos.closeEntry();
            System.out.println("Success");

        } catch (Exception e) {
            System.out.println("Error during compression: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
