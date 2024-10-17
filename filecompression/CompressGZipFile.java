package com.filecompression;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class CompressGZipFile {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String gzipfile="C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\com\\filecompression\\gzipdgysg.gz";
		String destiFile= "D:\\New folder\\File Handling\\createfile.txt";
		
		byte[] buffer=new byte[1024];
		
		try {
			FileInputStream fis=new FileInputStream(destiFile);
			FileOutputStream fos= new FileOutputStream(gzipfile);
			GZIPOutputStream gis=new GZIPOutputStream(fos);
			
			int len;
			
			while((len=fis.read(buffer))>0) {
				gis.write(buffer,0,len);
			}
			gis.close();
			fos.close();
			fis.close();
			System.out.println("File compression successfully.....");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
