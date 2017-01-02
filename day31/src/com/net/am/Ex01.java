package com.net.am;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {

	public static void main(String[] args) {
		// 
		try {
			InetAddress addr1 = InetAddress.getByName("www.naver.com");
			System.out.println(addr1.getHostAddress());
			System.out.println(addr1.getHostName());
			InetAddress addr2 = InetAddress.getByName("125.209.222.141");
			System.out.println(addr2.getHostName());
			System.out.println(addr2.getHostAddress());
			System.out.println("---------------------------------------");
			InetAddress[] addr3 = InetAddress.getAllByName("www.naver.com");
			for(int i=0; i<addr3.length; i++){
				System.out.println("naver:"+addr3[i].getHostAddress());
			}
			
			System.out.println("---------------------------------------");
			InetAddress localhost = InetAddress.getLocalHost();
//			System.out.println(localhost.getHostAddress());
//			System.out.println(localhost.getHostName());
			InetAddress[] local = InetAddress.getAllByName(localhost.getHostName());
			for(int i=0; i<local.length; i++){
				System.out.println("me:"+local[i].getHostAddress());
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
