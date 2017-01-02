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
		char[] weeks= {'일','월','화','수','목','금','토'};
		String[] aps={"am","pm"};
		System.out.println(weeks[week-1]+"요일 입니다");
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
		System.out.println(cntDay+"일째 입니다");
		now.set(year, month-1, 4);
		int cntDay2 = now.get(Calendar.DAY_OF_YEAR);
		System.out.println(cntDay2+"일째 입니다");
		System.out.println("개강일로부터"+(cntDay-cntDay2)+"일 지났습니다");
//		System.out.println(week);
//		switch (week) {
//		case 1:
//			System.out.println("일요일");
//			break;
//		case 2:
//			System.out.println("월요일");
//			break;
//		case 3:
//			System.out.println("화요일");
//			break;
//		case 4:
//			System.out.println("수요일");
//			break;
//		case 5:
//			System.out.println("목요일");
//			break;
//		case 6:
//			System.out.println("금요일");
//			break;
//		case 7:
//			System.out.println("토요일");
//			break;
//
//		default:
//			break;
//		}
	}

}




















