package com.io.am;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		char[] buff = new char[10];
		int input=0;
		InputStream consl = System.in;
		OutputStream cout = System.out;
		try {
			File file = new File("./temp1.txt");
			File file2 = new File("c:\\Setup.log");
			if(!file.exists())file.createNewFile();
			
			fis = new FileInputStream(file2);
			Scanner sc = new Scanner(fis); 
			isr = new InputStreamReader(consl);
			
//			fos = new FileOutputStream(file2);
			osw = new OutputStreamWriter(cout);
			
//			while((input=isr.read(buff))!=-1){
//				osw.write(buff,0,input);
//			}
//			osw.flush();
			while(sc.hasNext()){
				System.out.println(sc.nextLine());
			}
			
			
			
		}catch(Exception ex){
		}finally{
			try {
				fis.close();
//				fos.close();
			} catch (IOException e) {
			}
		}
		

	}

}
