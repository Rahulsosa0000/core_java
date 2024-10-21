package com.temproryfile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class GetTempFilePath {
    public static void main(String[] args) {
        try {
            Path tempFile = Files.createTempFile("myapp-", ".tmp");  // Prefix and suffix
            
            System.out.println("Temporary file path: " + tempFile.toAbsolutePath());

            //  Delete the file on exit (if you want to ensure it is cleaned up)
            //tempFile.toFile().deleteOnExit();
        } catch (IOException e) {
            System.out.println("Unable to create temporary file.");
            e.printStackTrace();
        }
    }
}
