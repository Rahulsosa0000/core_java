package com.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;

public class CreateDateinFile {

    public static void main(String[] args) {
        Path p = Paths.get("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\bw.txt");

        // Check if the file exists before attempting to read its attributes
        if (!Files.exists(p)) {
            System.out.println("The file does not exist: " + p);
            return;
        }

        try {
            BasicFileAttributes bfa = Files.readAttributes(p, BasicFileAttributes.class);
            FileTime creationTime = bfa.creationTime();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            System.out.println("Creation time: " + df.format(creationTime.toMillis()));
        } catch (IOException e) {
            System.out.println("Unable to retrieve file attributes.");
            e.printStackTrace();
        }
    }
}
