package com.aish;

public class ExceptionHandEx {

	public static void main(String[] args) {
		int i=0;
		int j=20;
		
		//System.out.println("Code before calculation");
		try 
		{
			System.out.println("Code before calculation");
			System.out.println(j/i);
			System.out.println("code after calculation");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//System.out.println("code after calculation");

	}

}
