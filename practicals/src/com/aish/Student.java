package com.aish;
// to string method
public class Student {
		int id;
		String  name;
		Student(int i,String n)
		{
			this.id=i;
			this.name=n;
		}
		
		public String toString()
		{return id+" "+name;}
		
		public static void main(String args[])
		{
			Student c1=new Student(101,"shri");
			Student c2=new Student(102,"swami");
			Student c3=new Student(103,"samarth");
			
			
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
			
			
			
			
		}
		
	}


