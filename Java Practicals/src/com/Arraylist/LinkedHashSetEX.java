package com.Arraylist;

import java.util.LinkedHashSet;

public class LinkedHashSetEX {

	public static void main(String[] args) {
		LinkedHashSet hs=new LinkedHashSet();
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
