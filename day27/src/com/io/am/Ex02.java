package com.io.am;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Ex02 {


	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		int input=0;
		
		File file = new File("./temp1.txt");
		char[] buff = new char[10];
		char[] buff2 = new char[12];
		int cnt =0;
			try {
				if(!file.exists())
					file.createNewFile();
				
				fr = new FileReader(file);
				fw = new FileWriter(file);
				buff2[0]='a';
				buff2[1]='b';
				buff2[2]='c';
				buff2[3]='d';
				buff2[4]='e';
				buff2[5]='f';
				buff2[6]='g';
				
				fw.write(buff2,0,7);
				
				fw.flush(); // 
//				while((input=fr.read())!=-1){
//				System.out.println(input);
//				}
				while((cnt = fr.read(buff))!=-1){
					for(int i=0; i<cnt; i++){
					System.out.println(buff[i] +":"+i);
					}
				}
			} catch (Exception e) {
			} finally{
				try {
					fr.close();
					fw.close();
				} catch (IOException e) {}
			}

	}

}
