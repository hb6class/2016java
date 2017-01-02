package com.io.pm;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex04 {

	public static void main(String[] args) {
		File file = new File("./temp1.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		CharArrayReader car = null;
		CharArrayWriter caw = null;
		
		char[] buff = new char[12];
		int cnt =0;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file);
			
			caw = new CharArrayWriter();
			
			char[] ch = "abc«—±€".toCharArray();
			caw.write(ch, 0, ch.length);
			char[] arr = caw.toCharArray();
//			for(char a : arr){
//				System.out.println(a);
//			}
			car = new CharArrayReader(arr);
			while((cnt=car.read(buff))!=-1){
				System.out.println(buff);
			}
			
		}catch(Exception e){}

	}

}
