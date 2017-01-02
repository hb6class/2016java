package com.hb.pm2;

import java.io.File;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		// 
		String url1 = "C:\\mtest\\day25\\abc.txt"; // 절대경로
		String url2 = "abc.txt";//상대경로
		String url3 = "./abc.txt";//상대경로
		File file = new File(url3);
		
		System.out.println(file.length());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getParent()+"\\"+file.getName());
		System.out.println("---------------------------------");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		try {
			System.out.println(file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------------------");
//		file.delete();
		System.out.println("---------------------------------");
		File file2 = new File("./");
		File[] files = file2.listFiles();
		for(int i=0; i<files.length; i++){
			System.out.print(files[i].getName());
			if(files[i].isDirectory())System.out.println("\t폴더");
			else {System.out.println("\t파일\t"+files[i].length());
			}
		}
		System.out.println("---------------------------------");
		try {
			File file3 = File.createTempFile("abc", ".bin");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(file3.getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			file3.deleteOnExit();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------------------");
		File file4 = new File(file2,"temp");
		//			file4.createNewFile();
		file4.mkdir();
		
	}

}











