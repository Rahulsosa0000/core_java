package com.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ByteArrayToFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\writearr.txt"; 
        byte[] dataToWrite = {65, 66, 67, 68, 69}; // byte array ASCII values for A, B, C.

        try {
            // Write byte array to the file
            Files.write(Paths.get(filePath), dataToWrite);

            System.out.println("Byte array written to file successfully.");

        } catch (IOException e) {
            System.err.println("An error occurred while writing the byte array to the file: " + e.getMessage());
        }
    }
}

