package com.aish;
import java.util.*;

public class FruitToArray {

	public static void main(String[] args) 
	{
		  ArrayList<String> l=new ArrayList<String>();
		  l.add("Mango");
		  l.add("Apple");
		  l.add("Banana");
		  l.add("Watermelon");
		  
		  System.out.println(" the size of the array is :"+l.size());
		  
		  for(String value :l) 
		  {
			System.out.println("Fruit:"+value);
			
			
		  }
		  Object[] obj=l.toArray();
		  System.out.println("the element of fruit is:");
		  for(Object o:obj)
		  {
			  System.out.println("Fruits:"+o);
			  
		  }
	
	}

}
