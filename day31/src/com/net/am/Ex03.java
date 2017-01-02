package com.net.am;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Ex03 {

	public static void main(String[] args) {
		// UDP≈ÎΩ≈
		byte[] buf = new byte[20];
		
		try {
			DatagramSocket ds = new DatagramSocket(5050);
			
			while(true){
				DatagramPacket dp = new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				byte[] data = dp.getData();
				String msg =new String(data);
				System.out.println(msg);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
