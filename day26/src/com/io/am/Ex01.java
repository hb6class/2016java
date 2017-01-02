package com.io.am;

import java.io.File;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		// file
		File file = new File("temp.txt");
		File file2 = new File("C:\\mtest\\day26\\temp.txt");
		File file3 = new File("./temp.txt");
		File file4 = new File("C:\\mtest\\day26\\dir");
//		System.out.println(file.exists());
		if(file.exists()){
			System.out.println("파일길이는"+file.length());
			System.out.println("읽기가능유무는"+file.canRead());
			System.out.println("쓰기가능유무는"+file.canWrite());
			System.out.println("실행가능유무는"+file.canExecute());
			//절대경로 최상위 디렉토리에서부터 ~ (c:\~~~~
			System.out.println("파일절대경로는"+file.getAbsolutePath());
			System.out.println("파일절대경로는"+file.getCanonicalPath());
			//현 디렉토리를 기준으로 (./)(./..)(./디렉토리명)(디렉토리명)
			System.out.println("파일상대경로는"+file.getPath());
			
			System.out.println("------------------------");
			System.out.println("파일상위경로는"+file2.getParent());
			System.out.println("파일명은"+file2.getName());
			System.out.println("파일절대경로는"+file2.getAbsolutePath());
			System.out.println("파일절대경로는"+file2.getCanonicalPath());
			System.out.println("파일상대경로는"+file2.getPath());
			System.out.println("------------------------");
			System.out.println("파일상위경로는"+file3.getParent());
			System.out.println("파일명은"+file3.getName());
			System.out.println("파일절대경로는"+file3.getAbsolutePath());
			System.out.println("파일절대경로는"+file3.getCanonicalPath());
			System.out.println("파일상대경로는"+file3.getPath());
			System.out.println("------------------------");
			System.out.println(file4.exists());
			System.out.println("파일명은"+file4.getName());
			System.out.println("파일상위경로는"+file4.getParent());
			System.out.println(file4.isDirectory());
			System.out.println(file4.isFile());
			System.out.println("------------------------");
		}
		boolean result1 = file3.delete();
		boolean result2 = file4.delete();
		
		System.out.println(result1);
		System.out.println(result2);
		
		
	}

}










