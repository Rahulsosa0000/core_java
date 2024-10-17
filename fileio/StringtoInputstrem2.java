package com.fileio;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class StringtoInputstrem2 {
    public static void main(String[] args) {
        String str = "Hello My name is Rahul Sosa.";
        String filePath = "C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\Stringtoinput.txt"; // Specify the file path where the data will be written

        // Create an InputStream from the string
        InputStream inputStream = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));

        // Write the contents of the InputStream to a file
        try (FileOutputStream out = new FileOutputStream(filePath)) {
            int byteData;
            while ((byteData = inputStream.read()) != -1) {  // Read until the end of the stream
                out.write(byteData);  // Write each byte to the file
            }
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
        
        
        try (InputStream fileInputStream = new FileInputStream(filePath);
                BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8))) {
               System.out.println("Reading from file:");
               String line;
               while ((line = reader.readLine()) != null) {
                   System.out.println(line);
               }
           } catch (IOException e) {
               System.out.println("Error occurred while reading from the file: " + e.getMessage());
               e.printStackTrace();
           }
    }
}
