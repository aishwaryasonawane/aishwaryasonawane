package com.Arraylist;
import java.util.ArrayList;


public class ArrayListEx2 
{	
	public static void main(String args[])
	{
		ArrayList l2=new ArrayList();
		l2.add("Bicycle");
		l2.add("car");
		l2.add("bus");
		l2.add("taxi");
		l2.add("train");
		l2.add("motorcycle");
		l2.add("Truck");
		l2.add("Rickshaw");
		System.out.println(l2);
		
		ArrayList l3=new ArrayList();
		l3.addAll(l2);
		System.out.println(l3);
		l3.set(6,"blue");
		System.out.println(l3);
		
	}

}
