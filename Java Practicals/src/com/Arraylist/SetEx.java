package com.Arraylist;

import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		TreeSet<String>ts=new TreeSet<String>();
		ts.add("D");
		ts.add("F");
		ts.add("B");
		ts.add("E");
		ts.add("C");
		ts.add("A");
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet("D"));
		System.out.println(ts.tailSet("D"));
		
		
		
	}

}
