package com.net.am;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Ex03Cl {

	public static void main(String[] args) {
		// 
		byte[] buf = "UDP통신입니다aaaaaaaaaaaaaaaaaaaaaaaaa".getBytes();
		try {
			DatagramSocket ds = new DatagramSocket();
			InetAddress addr = InetAddress.getByName("203.236.209.193");
			
			DatagramPacket dp = new DatagramPacket(buf, 0, buf.length, addr, 5050);
			
			ds.send(dp);
			
			System.out.println("전송성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
