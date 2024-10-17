package com.filecompression;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.GZIPInputStream;


import com.serialization.Employee;

public class DeserializationDecompressfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String filePath = "C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\com\\filecompression\\SerializationObj.gz";

        try {
            // Set up streams to read from the GZIP file and deserialize objects
            FileInputStream fis = new FileInputStream(filePath);
            GZIPInputStream gis = new GZIPInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(gis);

            // Read the object (which we know is an ArrayList<Employee>)
            ArrayList<Employee> list = (ArrayList<Employee>) ois.readObject();

            Collections.sort(list, (o1,o2)->o1.getName().compareTo(o2.getName()));
            System.out.println(list);  //sort accordding name 
            
            
            Collections.sort(list,(l1,l2)->l1.getSalary()-l2.getSalary());
            System.out.println("sort accordding salary:-"+list);
            
            

            // Output the deserialized list to verify
            System.out.println("Deserialized list of employees:");
            for (Employee emp : list) {
                System.out.println(emp);
            }

        } catch (IOException e) {
            System.err.println("IO error occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found during deserialization: " + e.getMessage());
            e.printStackTrace();
        }
		
	}

}
