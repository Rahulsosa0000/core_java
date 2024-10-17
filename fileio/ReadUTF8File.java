package com.fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.List;

public class ReadUTF8File {
    public static void main(String[] args) {
        // Specify the path to the file
        Path path = Paths.get("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\bw.txt");

        try {
            // Read all lines from the file as UTF-8
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

            // Output the lines to the console
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file");
            e.printStackTrace();
        }
    }
}

