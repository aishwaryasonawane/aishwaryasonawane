package com.aish;

public class Calculation1 
{

	 public int add(int a,int b)
	{
		 try {
		   //a=5;
		   //b=5;
		  //c=a+b;
		   
		 }
		 catch(Exception e)
		 {
		
		 System.out.println(e);
		 System.out.println("this is a addtion method");
		 }
		 return(a+b);
	}
	
	
	
}
 class Calculation2 extends Calculation1 
{
	 public int add(int a,int b,int c)
	{
		 try {
		 //a=5;
		 //b=5;
		 
		 }
		 catch(Exception e)
		 {
		 
		 System.out.println(e);
		 System.out.println("This is add method with 3 parameters");
		 }
		 return(a+b+c);
		 
		 
	}
}
 class useCalculation1 
 {
	 public static void main(String args[])
	 {
		 Calculation1 c=new Calculation1();
		// c.add(5,5);
		 System.out.println(c.add(5,5));
		 Calculation2 c1=new Calculation2();
		 System.out.println(c1.add(2, 2, 2));
		 
	 }
	 
 }
 
	 
