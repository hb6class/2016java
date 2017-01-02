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
			System.out.println("���ϱ��̴�"+file.length());
			System.out.println("�бⰡ��������"+file.canRead());
			System.out.println("���Ⱑ��������"+file.canWrite());
			System.out.println("���డ��������"+file.canExecute());
			//������ �ֻ��� ���丮�������� ~ (c:\~~~~
			System.out.println("���������δ�"+file.getAbsolutePath());
			System.out.println("���������δ�"+file.getCanonicalPath());
			//�� ���丮�� �������� (./)(./..)(./���丮��)(���丮��)
			System.out.println("���ϻ���δ�"+file.getPath());
			
			System.out.println("------------------------");
			System.out.println("���ϻ�����δ�"+file2.getParent());
			System.out.println("���ϸ���"+file2.getName());
			System.out.println("���������δ�"+file2.getAbsolutePath());
			System.out.println("���������δ�"+file2.getCanonicalPath());
			System.out.println("���ϻ���δ�"+file2.getPath());
			System.out.println("------------------------");
			System.out.println("���ϻ�����δ�"+file3.getParent());
			System.out.println("���ϸ���"+file3.getName());
			System.out.println("���������δ�"+file3.getAbsolutePath());
			System.out.println("���������δ�"+file3.getCanonicalPath());
			System.out.println("���ϻ���δ�"+file3.getPath());
			System.out.println("------------------------");
			System.out.println(file4.exists());
			System.out.println("���ϸ���"+file4.getName());
			System.out.println("���ϻ�����δ�"+file4.getParent());
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










