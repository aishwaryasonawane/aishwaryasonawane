//package stringMethods;

import java.util.Scanner;

public class StringCh {

	public static void main(String[] args){
		
		    Scanner sc = new Scanner(System.in);
			
	        String str1 = sc.nextLine();
	        System.out.println("Enter the first string: "+ str1);
	        String str2 = sc.nextLine();
	        System.out.println("Enter the second string :"+ str2);
	        if(str1.contains(str2))
			{
				System.out.println("first string exist in another");
			}
			else
			{
				System.out.println("first string is no exist in another");
				
			}
				

			}

	
	}