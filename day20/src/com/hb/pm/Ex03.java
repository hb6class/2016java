package com.hb.pm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03 {

	public static void main(String[] args) {
		// Date
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.toString());
		
		SimpleDateFormat sdf;
		sdf= new SimpleDateFormat("yy�� M�� dd�� h�� mm�� ss��");
		String kor = sdf.format(now);
		System.out.println(kor);
		System.out.println(now.toString());
		
		System.out.println(now.getMonth());
		System.out.println(now.getTime());
		Long tim = now.getTime();
		for(int i=0; i<1000; i++){
			System.out.print('*');
		}
		System.out.println();
		Date now2 = new Date();
		Long tim2 = now2.getTime();
		System.out.println(tim2-tim);
	}

}










