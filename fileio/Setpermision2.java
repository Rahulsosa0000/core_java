package com.fileio;

import java.io.File;

public class Setpermision2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\abcd.txt"); 

        // Check if file exists
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        // Set file to be readable by all users
        boolean isReadable = file.setReadable(true, false);
        System.out.println("Set readable: " + isReadable);

        // Set file to be writable by all users
        boolean success = file.setWritable(false);
        if (success) {
            System.out.println("The file is now non-writable.");
        } else {
            System.out.println("Failed to change the file's writable status.");
        }
        

        // Set file to be executable by all users
        boolean isExecutable = file.setExecutable(true, false);
        System.out.println("Set executable: " + isExecutable);
    }
}

