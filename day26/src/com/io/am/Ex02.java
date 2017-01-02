package com.io.am;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		// C:\public
		String dir ="../../public/temp";
		File file = new File(dir);
		if(file.exists()){
			System.out.println(file.getCanonicalPath());
			System.out.println(file.getAbsolutePath());
			File[] list = file.listFiles();
			if(list.length==0){
				System.out.println("디렉토리가 비어서 하나 만들었습니다");
				File fileTemp = new File(dir,"abc.bin");
				boolean createfile = fileTemp.createNewFile();
				if(createfile)System.out.println("abc.bin생성완료");
			}
			for(int i=0; i<list.length; i++){
				System.out.print(list[i].getName()+"\t");
				if(list[i].isDirectory()){
					System.out.println("\tdir");
				}else{
					System.out.print("file\t");
					System.out.print(list[i].length()+"\t");
					Date date = new Date(list[i].lastModified());
					System.out.println((date.getMonth()+1)+"/"+date.getDate());
				}
			}
		}else{
			boolean result = file.mkdir();
			if(result){
				System.out.println("디렉토리가 생성되었습니다");
			}
		}

	}

}
