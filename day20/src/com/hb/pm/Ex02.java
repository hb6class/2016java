package com.hb.pm;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		Calendar now;
		now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int month = now.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		char[] weeks= {'��','��','ȭ','��','��','��','��'};
		String[] aps={"am","pm"};
		System.out.println(weeks[week-1]+"���� �Դϴ�");
		int ampm = now.get(Calendar.AM_PM);
		System.out.print(aps[ampm]+"\t");
		int hour = now.get(Calendar.HOUR);
		System.out.print(hour+":");
		int minute = now.get(Calendar.MINUTE);
		System.out.print(minute+":");
		int sec = now.get(Calendar.SECOND);
		System.out.println(sec);
		
		int hhour = now.get(Calendar.HOUR_OF_DAY);
		System.out.println(hhour+":"+minute+":"+sec);
		
		int cntDay = now.get(Calendar.DAY_OF_YEAR);
		System.out.println(cntDay+"��° �Դϴ�");
		now.set(year, month-1, 4);
		int cntDay2 = now.get(Calendar.DAY_OF_YEAR);
		System.out.println(cntDay2+"��° �Դϴ�");
		System.out.println("�����Ϸκ���"+(cntDay-cntDay2)+"�� �������ϴ�");
//		System.out.println(week);
//		switch (week) {
//		case 1:
//			System.out.println("�Ͽ���");
//			break;
//		case 2:
//			System.out.println("������");
//			break;
//		case 3:
//			System.out.println("ȭ����");
//			break;
//		case 4:
//			System.out.println("������");
//			break;
//		case 5:
//			System.out.println("�����");
//			break;
//		case 6:
//			System.out.println("�ݿ���");
//			break;
//		case 7:
//			System.out.println("�����");
//			break;
//
//		default:
//			break;
//		}
	}

}




















