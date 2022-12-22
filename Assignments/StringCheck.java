package stringMethods;

import java.util.Scanner;

public class StringCheck {

	public static void main(String[] args){
		
		    Scanner sc = new Scanner(System.in);
			
	        String str1 = sc.nextLine();
	        System.out.println("Enter the first string: "+ str1);
	        String str2 = sc.nextLine();
	        System.out.println("Enter the second string :"+ str2);
	        System.out.println(str2.contains(str2));
				

			}

	
	}