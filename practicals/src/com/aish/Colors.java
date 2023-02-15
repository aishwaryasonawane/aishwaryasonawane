package com.aish;

import java.util.*;

public class Colors {

	public static void main(String[] args) 
	{
		 ArrayList<String> l=new ArrayList<String>();
		  l.add("red");
		  l.add("blue");
		  l.add("yellow");
		  l.add("purple");
		  
		  System.out.println(" the size of the array is :"+l.size());
		  
		  for(String value :l) 
		  {
			System.out.println("Colors:"+value);
			
			
		  }
		  Object[] obj=l.toArray();
		  System.out.println("the element of color is:");
		  for(Object o:obj)
		  {
			  System.out.println("Colors:"+o);
			  
		  }
	

	}

}
