package com.fileio;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ConvertStringintoInputStream {

    public static void main(String[] args) {
        String str = "Welcome to the java programming....";
        String filePath = "C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\bw.txt";

        InputStream in = new ByteArrayInputStream(str.getBytes());

        try (FileOutputStream out = new FileOutputStream(filePath)) {
            int data = in.read();
            while (data != -1) {
                char ch = (char) data;
                System.out.print(ch);
                out.write(data);
                data = in.read();
            }
        } catch (IOException e) {
            System.out.println("Error while reading from the InputStream or writing to the file: " + e.getMessage());
            e.printStackTrace();
        } 
    }
}
