package com.Arraylist;

import java.util.LinkedList;
import java.util.ListIterator;

public class BookListEx {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList <String>();
		l.add("Java Programming");
		l.add("Python programming");
		l.add("OOP");
		l.add("Data Structure");
		l.add("clean code");
		l.add("Code complete");
		l.add("Programming pearls");
		l.add("Design Pattern");
		l.add("Coders at work");
		l.add("Inrtoduction to algorithms");
		System.out.println(l);
		ListIterator<String> itr=l.listIterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s.equals("Data Structure"))
			{
				itr.set("Soft Skills");
			}
			else
			{
				//System.out.println("not change");
			}
		}
		System.out.println(l);
		
		

	}

}
