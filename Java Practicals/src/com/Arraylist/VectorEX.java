package com.Arraylist;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEX 
{
	public static <E> void main(String args[])
	{
		Vector v=new Vector();
		//v.add(10);
		//System.out.println(v);
		System.out.println(v.capacity());
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		/*v.addElement(100);
		System.out.println(v);
		System.out.println(v.capacity());
		v.addElement(200);
		System.out.println(v);
		System.out.println(v.capacity());*/
		
		Enumeration<E> e=v.elements();
		while(e.hasMoreElements())
		{
			Integer i=(Integer)e.nextElement();
			if(i%2==0)
			{
				System.out.println(i);
			}
			else
			{
				v.remove(i);
				System.out.println(i);
			}
		}
		System.out.println(v);
		
	}
}
