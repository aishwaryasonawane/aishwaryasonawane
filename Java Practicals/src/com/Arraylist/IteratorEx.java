package com.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next();
			if(i%2==0)
			{
				System.out.println(i);
			}
			else
			{
				itr.remove();
			}
			System.out.println(al);
		}
		
	}

}
