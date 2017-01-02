package com.io.am;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Ex05 {

	public static void main(String[] args) {
		InputStream input = System.in;
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bos= null;
		PrintWriter pw = null;
		try {
			File file = new File("./temp1.txt");
			if(!file.exists())file.createNewFile();
			
			isr = new InputStreamReader(input);
			br = new BufferedReader(isr);
			
			fw = new FileWriter(file,false);
			bos = new BufferedWriter(fw);
			pw = new PrintWriter(bos);
			
			String st =null;
			
			while((st=br.readLine())!=null){
				if(st.equals(""))break;
				System.out.print("read-"+st);
				pw.println(st);
				System.out.println();
			}
			pw.flush();
//			pw.print("안녕하세요");
//			pw.print("반갑습니다");
//			pw.print("쓰기합니다");
//			pw.flush();
			
//			fw.write("안녕하세요");
//			fw.write("\n");
//			fw.write("반갑습니다");
//			fw.write("\n");
//			fw.write("쓰기합니다");
//			fw.flush();
		}catch(Exception ex){
		}finally{
			try {
//				fis.close();
				fw.close();
			} catch (Exception e) {
			}
		}
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
