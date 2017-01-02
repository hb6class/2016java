package com.io.pm;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Ex03 {

	public static void main(String[] args) {
		File file1 = new File("test.txt");
		File file2 = new File("test2.txt");
		
		if(!file2.exists()){
			try {
				file2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileReader fr =null;
		FileWriter fw = null;
		BufferedReader bis = null;
		BufferedWriter bos = null;
//		int read=0;
//		char[] buf = new char[8192];
		try {
			fr = new FileReader(file1);
			fw = new FileWriter(file2);
			bis = new BufferedReader(fr); //« ≈Õ
			bos = new BufferedWriter(fw);
//			while((read = fr.read(buf,0,buf.length))!=-1){
//				fw.write(buf,0,read);
//				fw.write("\r\n");
//			}
			bos.write(bis.readLine());
			bos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	} // main end

}


















