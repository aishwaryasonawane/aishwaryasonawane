package com.Arraylist;

import java.util.HashMap;
import java.util.Map;

public class BookHashMapEx {

	public static void main(String[] args) {
		//HashMap<Integer,String> map=new HashMap<Integer,String>();
		//map.put(101, "OOP");
		//map.put(102, "CSS");
		//map.put(103, "JAVA");
		//map.put(104, "PYTHON");
		HashMap<String,String> map1=new HashMap<String,String>();
		map1.put("OOP","982824483");
		map1.put("java","992824383");
		map1.put("core java","9702024568");
		map1.put("OOP","123456789");
		for(Map.Entry m:map1.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	}


