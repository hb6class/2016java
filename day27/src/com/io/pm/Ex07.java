package com.io.pm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

class Student implements java.io.Serializable{
	transient int no;
	int kor, eng; 
	transient int math;
	public Student(int no, int kor, int eng, int math) {
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public String sum() {
		int sum = (kor+eng+math);
		return no+"학번의 성적 합계는 "+sum;
	}
}

public class Ex07 {

	public static void main(String[] args) throws Exception {
		File file = new File("./temp1.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(new Student(1, 90, 80, 70));
		arr.add(new Student(2, 50, 50, 50));
		arr.add(new Student(3, 60, 70, 80));
		
		oos.writeObject(arr);
		oos.reset();
		System.out.println("입력성공");
		oos.close();
		fos.close();
		
	}

}














