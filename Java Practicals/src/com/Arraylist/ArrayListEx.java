package com.Arraylist;
import java.util.ArrayList;


public class ArrayListEx 
{
	public static void main(String args[])
	{
		ArrayList list1=new ArrayList();
		list1.add("red");
		list1.add("blue");
		list1.add("Yellow");
		list1.add("white");
		list1.add("black");
		list1.add("orange");
		System.out.println(list1);
		list1.remove(4);
		System.out.println(list1);
		
		ArrayList list2=new ArrayList();
		list2.add("mango"); // ading data to the list
		list2.addAll(list1);// adding collection to the list
		System.out.println(list2);
		list2.set(2,"XYZ");// replacing data at index no 2
		list2.add(3,"300");// trying to  add data to the index 3
		System.out.println(list2); // printing the arraylst
	}
}
