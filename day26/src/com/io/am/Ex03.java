package com.io.am;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex03 {

	public static void main(String[] args) {
		String dir ="../../public/temp";
		File file = new File(dir,"abc.bin");
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream(file);
			fos.write(3);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		FileInputStream fis= null;
		try {
			fis = new FileInputStream(file);
			System.out.println(fis.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
