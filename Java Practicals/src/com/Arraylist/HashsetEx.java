package com.Arraylist;

import java.util.HashSet;

public class HashsetEx {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add("ram");
		hs.add("krishna");
		hs.add(10);
		hs.add(20);
		System.out.println(hs);
		System.out.println(hs.add(100));// add for the first time
		System.out.println(hs.add(100)); // add the duplicate
		System.out.println(hs);
	}

}
