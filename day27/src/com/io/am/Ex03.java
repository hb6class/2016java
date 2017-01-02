package com.io.am;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		int input=0;
		
		File file = new File("./temp1.txt");
		File file2 = new File("./temp2.txt");
		char[] buff = new char[256];
		try {
			if(!file2.exists())file.createNewFile();
			
			fr=new FileReader(file);
			fw=new FileWriter(file2,true); // writer 두번째 인자 false -> true 뒤이어 작성
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			while((input=br.read(buff))!=-1){
				bw.write(buff,0,input);
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {}
		}
		
	}

}
























