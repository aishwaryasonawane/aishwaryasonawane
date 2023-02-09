package com.Arraylist;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(101, "Akanksha");
		map.put(102, "Sayali");
		map.put(103, "Vaishnavi");
		map.put(104, "Vaishnavi");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
