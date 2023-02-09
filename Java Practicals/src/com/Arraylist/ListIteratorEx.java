package com.Arraylist;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("Aishwarya");
		l.add("Vaishnavi");
		l.add("Pooja");
		l.add("Akanksha");
		l.add("Sayali");
		System.out.println(l);
		ListIterator<String> itr=l.listIterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s.equals("Aishwarya"))
			{
				itr.remove();
			}
			else if(s.equals("Vaishnavi"))
			{
				itr.add("krishna");
				
			}
			else if(s.equals("Pooja"))
			{
				itr.set("xyz");
			}
		}
		System.out.println(l);
		
	}

}
