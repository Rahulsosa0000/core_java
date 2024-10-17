package com.filecompression;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class DecompressionGZipFIle {
	
	public static void main(String[] args) {
		
		String gzipFilePath ="C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\com\\filecompression\\gzipdgysg.gz";
		String decompressedFilePath ="D:\\New folder\\File Handling\\GzipDecompress.txt";
		
		byte[] buffer=new byte[1024];
		
		try {
			FileInputStream fis=new FileInputStream(gzipFilePath); // read
			GZIPInputStream gis= new GZIPInputStream(fis); //decompress
			FileOutputStream fos=new FileOutputStream(decompressedFilePath);
			
			int len;
			
			while((len=gis.read(buffer))>0) {
				fos.write(buffer,0,len);
			}
			fos.close();
			gis.close();
			fis.close();
            System.out.println("Decompression completed successfully.");

		} catch (IOException e) {
            System.err.println("Error occurred during decompression: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
