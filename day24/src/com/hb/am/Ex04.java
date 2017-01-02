package com.hb.am;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {
		Map<String, String> map = System.getenv();
		Set<String> keys = map.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
			String key = ite.next();
			System.out.println(key+"="+map.get(key));
		}
		System.out.println("---------------------------------");
//		Properties pro = System.getProperties();
//		Set prokeys = pro.keySet();
//		for(Object key: prokeys){
//			System.out.print(key.toString()+":"+System.getProperty(key.toString()));
//			
//		}
		System.out.println("---------------------------------");
		System.out.println("java.version="+System.getProperty("java.version"));
		System.out.println("java.home="+System.getProperty("java.home"));
		System.out.println("java.vm.name="+System.getProperty("java.vm.name"));
		System.out.println("java.compiler="+System.getProperty("java.compiler"));
	}

}

















